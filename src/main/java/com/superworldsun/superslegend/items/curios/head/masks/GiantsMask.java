package com.superworldsun.superslegend.items.curios.head.masks;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.apache.commons.lang3.tuple.ImmutableTriple;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.superworldsun.superslegend.SupersLegendMain;
import com.superworldsun.superslegend.client.model.armor.GiantsMaskModel;
import com.superworldsun.superslegend.interfaces.IEntityResizer;
import com.superworldsun.superslegend.items.custom.NonEnchantItem;
import com.superworldsun.superslegend.mana.ManaProvider;
import com.superworldsun.superslegend.registries.ItemInit;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

@EventBusSubscriber(bus = Bus.FORGE, modid = SupersLegendMain.MOD_ID)
public class GiantsMask extends NonEnchantItem implements IEntityResizer, ICurioItem {
	private static final ResourceLocation TEXTURE = new ResourceLocation(SupersLegendMain.MOD_ID, "textures/models/armor/giants_mask.png");
	private static final float PLAYER_SCALE_MULTIPLIER = 4.0F;
	private static final float SWIM_SPEED_BONUS = -0.5F;
	private static final float MOVEMENT_SPEED_BONUS = -0.1F;
	private static final float ATTACK_DAMAGE_BONUS = 2.0F;
	private static final float REACH_DISTANCE_BONUS = 4.0F;
	private static final float MANA_COST = 0.01F;
	private static final int FALL_DISTANCE_REDUCTION = 15;
	private Object cachedModel;

	public GiantsMask(Properties properties) {
		super(properties);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void appendHoverText(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag) {
		super.appendHoverText(stack, world, list, flag);
		// TODO: this should be in a lang file
		list.add(new StringTextComponent(TextFormatting.GRAY + "Within this mask lies the might of a giant"));
		list.add(new StringTextComponent(TextFormatting.GREEN + "Awaken the giants power and abilities"));
		list.add(new StringTextComponent(TextFormatting.GREEN + "at the cost of magic"));
	}

	@Override
	public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
		PlayerEntity player = (PlayerEntity) livingEntity;

		if (!player.isCreative()) {
			ManaProvider.get(player).spendMana(MANA_COST);
		}
	}

	@SubscribeEvent
	public static void onLivingFall(LivingFallEvent event) {
		if (event.getEntity().getType() != EntityType.PLAYER) {
			return;
		}

		PlayerEntity player = (PlayerEntity) event.getEntityLiving();

		if (!canPlayerUseMask(player)) {
			return;
		}

		CuriosApi.getCuriosHelper().findEquippedCurio(ItemInit.MASK_GIANTSMASK.get(), player).ifPresent(i -> {
			event.setDistance(event.getDistance() - FALL_DISTANCE_REDUCTION);
		});
	}

	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.START) {
			return;
		}

		boolean canUse = ManaProvider.get(event.player).getMana() >= MANA_COST || event.player.isCreative();

		if (!canUse) {
			removeMaskAttributeModifiers(event.player);
			return;
		}

		Optional<ImmutableTriple<String, Integer, ItemStack>> maskCurio = CuriosApi.getCuriosHelper().findEquippedCurio(ItemInit.MASK_GIANTSMASK.get(), event.player);

		if (maskCurio.isPresent()) {
			applyMaskAttributeModifiers(event.player);
		} else {
			removeMaskAttributeModifiers(event.player);
		}
	}

	private static void applyMaskAttributeModifiers(PlayerEntity player) {
		UUID modifiersId = UUID.fromString("82f70fa8-9791-48dd-8aef-f9ecaf5fab64");
		addOrReplaceModifier(player, ForgeMod.REACH_DISTANCE.get(), modifiersId, REACH_DISTANCE_BONUS, AttributeModifier.Operation.ADDITION);
		addOrReplaceModifier(player, Attributes.ATTACK_DAMAGE, modifiersId, ATTACK_DAMAGE_BONUS, AttributeModifier.Operation.ADDITION);
		addOrReplaceModifier(player, Attributes.MOVEMENT_SPEED, modifiersId, MOVEMENT_SPEED_BONUS, AttributeModifier.Operation.MULTIPLY_TOTAL);
		addOrReplaceModifier(player, ForgeMod.SWIM_SPEED.get(), modifiersId, SWIM_SPEED_BONUS, AttributeModifier.Operation.MULTIPLY_TOTAL);
	}

	private static void removeMaskAttributeModifiers(PlayerEntity player) {
		UUID modifiersId = UUID.fromString("82f70fa8-9791-48dd-8aef-f9ecaf5fab64");
		removeModifier(player, ForgeMod.REACH_DISTANCE.get(), modifiersId);
		removeModifier(player, Attributes.ATTACK_DAMAGE, modifiersId);
		removeModifier(player, Attributes.MOVEMENT_SPEED, modifiersId);
		removeModifier(player, ForgeMod.SWIM_SPEED.get(), modifiersId);
	}

	private static void removeModifier(PlayerEntity player, Attribute attribute, UUID id) {
		ModifiableAttributeInstance attributeInstance = player.getAttribute(attribute);
		AttributeModifier modifier = attributeInstance.getModifier(id);

		if (modifier != null) {
			attributeInstance.removeModifier(modifier);
		}
	}

	private static void addOrReplaceModifier(PlayerEntity player, Attribute attribute, UUID id, float amount, AttributeModifier.Operation operation) {
		ModifiableAttributeInstance attributeInstance = player.getAttribute(attribute);
		AttributeModifier modifier = attributeInstance.getModifier(id);

		if (modifier != null && modifier.getAmount() != amount) {
			attributeInstance.removeModifier(modifier);
			modifier = new AttributeModifier(id, id.toString(), amount, operation);
		} else if (modifier == null) {
			modifier = new AttributeModifier(id, id.toString(), amount, operation);
		}

		if (modifier != null && !attributeInstance.hasModifier(modifier)) {
			attributeInstance.addPermanentModifier(modifier);
		}
	}

	@Override
	public float getScale(PlayerEntity player) {
		return canPlayerUseMask(player) ? PLAYER_SCALE_MULTIPLIER : 1.0F;
	}

	private static boolean canPlayerUseMask(PlayerEntity player) {
		return ManaProvider.get(player).getMana() >= MANA_COST || player.isCreative();
	}

	@Override
	public boolean canRender(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
		return true;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void render(String identifier, int index, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int light, LivingEntity livingEntity, float limbSwing,
			float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, ItemStack stack) {
		if (cachedModel == null) {
			cachedModel = new GiantsMaskModel<>();
		}

		GiantsMaskModel<?> maskModel = (GiantsMaskModel<?>) cachedModel;
		ICurio.RenderHelper.followHeadRotations(livingEntity, maskModel.base);
		IVertexBuilder vertexBuilder = ItemRenderer.getArmorFoilBuffer(renderTypeBuffer, maskModel.renderType(TEXTURE), false, stack.hasFoil());
		maskModel.renderToBuffer(matrixStack, vertexBuilder, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
	}
}

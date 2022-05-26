package com.superworldsun.superslegend.util.events;

import com.superworldsun.superslegend.SupersLegendMain;
import com.superworldsun.superslegend.entities.projectiles.arrows.AncientArrowEntity;
import com.superworldsun.superslegend.network.NetworkDispatcher;
import com.superworldsun.superslegend.network.message.SelectInteractionMessage;
import com.superworldsun.superslegend.registries.ItemInit;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.client.gui.IGuiEventListener;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.inventory.InventoryScreen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.Entity;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MerchantOffer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.util.List;

@Mod.EventBusSubscriber(modid = SupersLegendMain.MOD_ID, value = Dist.CLIENT)
public class EntityEventHandler {

    /*@SubscribeEvent
    public void onpigjump(LivingEvent.LivingJumpEvent event)
    {
        if(event.getEntityLiving() instanceof PigEntity) {

                event.getEntityLiving().addEffect(new EffectInstance(Effects.LEVITATION, 1000, 5));
                event.getEntityLiving().playSound(SoundInit.PIGFLY.get(), 0.25F, 1.0F);
        }
    }*/

    //Dosent work yet
    /*@SubscribeEvent
    public static void interModEnqueue(InterModEnqueueEvent e){
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.MODIFY_TYPE, () -> new SlotTypeMessage.Builder("ring").size(1));
    }*/

    @SubscribeEvent
    public static void onFogColor(EntityViewRenderEvent.FogColors event)
    {
        Biome b = event.getInfo().getEntity().level.getBiome(event.getInfo().getEntity().blockPosition());
        if (event.getInfo().getEntity().level.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY).getKey(b).toString().equals("superslegend:dark_world_forest"))
        {
            event.setRed(0.92F);
            event.setGreen(0.95F);
            event.setBlue(0.95F);
        }
    }

    @SubscribeEvent
    public static void onFogDensity(EntityViewRenderEvent.FogDensity event)
    {
        Biome b = event.getInfo().getEntity().level.getBiome(event.getInfo().getEntity().blockPosition());
        if (event.getInfo().getEntity().level.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY).getKey(b).toString().equals("superslegend:dark_world_forest"))
        {
            event.setDensity(0.01f);
            event.setCanceled(true);
        }
    }

    //TODO MAKE A CONFIG TO TURN THIS OFF FOR PLAYERS UPON DEATH.
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event) {
        Entity sourceEntity = event.getSource().getDirectEntity();
        if (sourceEntity instanceof AncientArrowEntity) {
            event.getDrops().clear();
        }
    }



    @SubscribeEvent
    public void cooldown(LivingEntityUseItemEvent.Start event) {
        if (event.getEntityLiving() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getEntityLiving();
            //The above player-check is better than using Minecraft.getInstance().player, as it ensures multiplayer compatibility
            if (PotionUtils.getPotion(event.getItem()) == Potion.byName("minecraft:night_vision")) {
                            event.setCanceled(true);
                        }
                    }
    }

    @SubscribeEvent
    public void addToInventory(GuiScreenEvent event)
    {
        if(event.getGui() instanceof InventoryScreen)
        {
            Button openSelectButton = new Button((event.getGui().width - ((InventoryScreen) event.getGui()).getXSize()) / 2 + 2,
                    (event.getGui().height - ((InventoryScreen) event.getGui()).getYSize()) / 2 - 16, 16, 16,
                    new StringTextComponent("SL"), a ->
                    NetworkDispatcher.networkChannel.sendToServer(new SelectInteractionMessage(0, true)));

            ((List<Widget>) ObfuscationReflectionHelper.getPrivateValue(Screen.class, event.getGui(), "buttons"))
                    .add(openSelectButton);
            ((List<IGuiEventListener>) ObfuscationReflectionHelper.getPrivateValue(Screen.class, event.getGui(),
                    "children")).add(openSelectButton);
        }
    }
}

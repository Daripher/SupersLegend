package com.superworldsun.superslegend.items.curios.rings;

import com.superworldsun.superslegend.SupersLegendMain;
import com.superworldsun.superslegend.items.customclass.RingItem;
import com.superworldsun.superslegend.registries.ItemInit;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.commons.lang3.tuple.ImmutableTriple;
import top.theillusivec4.curios.api.CuriosApi;

import java.util.List;

@Mod.EventBusSubscriber(modid = SupersLegendMain.MOD_ID)
public class HeartRingL1 extends RingItem {
    public HeartRingL1(Properties properties) {
        super(new Properties());
    }

    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack)
    {
        if (!(livingEntity instanceof Player))
        {
            return;
        }

        Player player = (Player) livingEntity;
        // Get the Ring as an ItemStack
        ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ItemInit.HEART_RING_L1.get(), player).map(ImmutableTriple::getRight).orElse(ItemStack.EMPTY);

        // Check if player is wearing it.
        if (!ring.isEmpty())
        {
            if (player.getHealth() < player.getMaxHealth() && player.tickCount % 600 == 0)
            {
                player.heal(2.0f);
            }
        }
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(Component.literal("Slowly recover lost Hearts").withStyle(ChatFormatting.RED));
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }

}
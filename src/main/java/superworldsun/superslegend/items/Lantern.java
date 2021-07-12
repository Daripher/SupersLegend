package superworldsun.superslegend.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import superworldsun.superslegend.entities.projectiles.beam.EntityFireBeam;

import java.util.List;

import net.minecraft.item.Item.Properties;

public class Lantern extends Item
{

	public Lantern(Properties properties)
	{
		super(properties);
	}



	@Override
	public void appendHoverText(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.appendHoverText(stack, world, list, flag);
		list.add(new StringTextComponent(TextFormatting.RED + "Uses Stamina to create a beam Fire"));
		list.add(new StringTextComponent(TextFormatting.GREEN + "Right-click to use"));
	}

}
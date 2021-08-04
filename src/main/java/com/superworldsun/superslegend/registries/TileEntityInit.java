package com.superworldsun.superslegend.registries;

import java.util.function.Supplier;

import com.superworldsun.superslegend.SupersLegendMain;
import com.superworldsun.superslegend.blocks.tile.FanTileEntity;
import com.superworldsun.superslegend.blocks.tile.GossipStoneTileEntity;
import com.superworldsun.superslegend.blocks.tile.PedestalTileEntity;
import com.superworldsun.superslegend.blocks.tile.SwitchableFanTileEntity;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.tileentity.TileEntityType.Builder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityInit
{
	public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, SupersLegendMain.MOD_ID);
	
	public static final RegistryObject<TileEntityType<PedestalTileEntity>> PEDESTAL = register("pedestal", PedestalTileEntity::new, BlockInit.PEDESTAL);
	public static final RegistryObject<TileEntityType<FanTileEntity>> FAN = register("fan", FanTileEntity::new, BlockInit.FAN);
	public static final RegistryObject<TileEntityType<SwitchableFanTileEntity>> SWITCHABLE_FAN = register("switchable_fan", SwitchableFanTileEntity::new, BlockInit.SWITCHABLE_FAN);
	public static final RegistryObject<TileEntityType<GossipStoneTileEntity>> GOSSIP_STONE = register("gossip_stone", GossipStoneTileEntity::new, BlockInit.GOSSIP_STONE_BLOCK);

	private static <T extends TileEntity> RegistryObject<TileEntityType<T>> register(String name, Supplier<T> tileEntitySupplier, Supplier<Block> blockSupplier)
	{
		return TILES.register(name, () -> Builder.of(tileEntitySupplier, blockSupplier.get()).build(null));
	}
}

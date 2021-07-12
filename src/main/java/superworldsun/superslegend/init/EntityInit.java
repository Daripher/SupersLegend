package superworldsun.superslegend.init;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import superworldsun.superslegend.SupersLegend;
import superworldsun.superslegend.entities.mobs.fairy.FairyEntity;
import superworldsun.superslegend.entities.mobs.poe.PoeEntity;
import superworldsun.superslegend.entities.projectiles.arrows.*;
import superworldsun.superslegend.entities.projectiles.beam.EntityFireBeam;
import superworldsun.superslegend.entities.projectiles.beam.EntitySwordBeam;
import superworldsun.superslegend.entities.projectiles.items.bomb.BombEntity;
import superworldsun.superslegend.entities.projectiles.items.boomerang.RegularBoomerang;
import superworldsun.superslegend.entities.projectiles.items.boomerang.BoomerangEntity;
//import superworldsun.superslegend.entities.projectiles.items.dinsfire.EntityDinsFire;

import java.util.Random;


public class EntityInit {


	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, SupersLegend.modid);

	//Arrows
	public static final RegistryObject<EntityType<EntityArrowFire>> FIRE_ARROW = ENTITIES.register("fire_arrow",
			() -> EntityType.Builder.<EntityArrowFire>of(EntityArrowFire::new, EntityClassification.MISC).sized(0.5F, 0.5F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));

	public static final RegistryObject<EntityType<EntityArrowIce>> ICE_ARROW = ENTITIES.register("ice_arrow",
			() -> EntityType.Builder.<EntityArrowIce>of(EntityArrowIce::new, EntityClassification.MISC).sized(0.5F, 0.5F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));

	public static final RegistryObject<EntityType<EntityArrowShock>> SHOCK_ARROW = ENTITIES.register("shock_arrow",
			() -> EntityType.Builder.<EntityArrowShock>of(EntityArrowShock::new, EntityClassification.MISC).sized(0.5F, 0.5F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));

	public static final RegistryObject<EntityType<EntityArrowBomb>> BOMB_ARROW = ENTITIES.register("bomb_arrow",
			() -> EntityType.Builder.<EntityArrowBomb>of(EntityArrowBomb::new, EntityClassification.MISC).sized(0.5F, 0.5F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));

	public static final RegistryObject<EntityType<EntityArrowAncient>> ANCIENT_ARROW = ENTITIES.register("ancient_arrow",
			() -> EntityType.Builder.<EntityArrowAncient>of(EntityArrowAncient::new, EntityClassification.MISC).sized(0.5F, 0.5F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));

	public static final RegistryObject<EntityType<EntityArrowSilver>> SILVER_ARROW = ENTITIES.register("silver_arrow",
			() -> EntityType.Builder.<EntityArrowSilver>of(EntityArrowSilver::new, EntityClassification.MISC).sized(0.5F, 0.5F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));

	/*public static final RegistryObject<EntityType<EntityIceBeam>> ICE_BEAM = ENTITIES.register("ice_beam",
			() -> EntityType.Builder.<EntityIceBeam>create(EntityIceBeam::new, EntityClassification.MISC).size(0.2F, 0.2F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));*/

	public static final RegistryObject<EntityType<EntityFireBeam>> FIRE_BEAM = ENTITIES.register("fire_beam",
			() -> EntityType.Builder.<EntityFireBeam>of(EntityFireBeam::new, EntityClassification.MISC).sized(0.2F, 0.2F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));

	public static final RegistryObject<EntityType<EntitySwordBeam>> SWORD_BEAM = ENTITIES.register("sword_beam",
			() -> EntityType.Builder.<EntitySwordBeam>of(EntitySwordBeam::new, EntityClassification.MISC).sized(0.6F, 0.1F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));


	//public static final RegistryObject<EntityType<EntityDinsFire>> DINS_FIRE = ENTITIES.register("dins_fire",
	//		() -> EntityType.Builder.<EntityDinsFire>create(EntityDinsFire::new, EntityClassification.MISC).size(10.0F, 10.0F)
	//				.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));

	/*public static final RegistryObject<EntityType<EntityDinsFire>> DINS_FIRE =  ENTITIES.register("dins_fire",
			() -> EntityType.Builder.<EntityDinsFire>of(EntityDinsFire::new, EntityClassification.MISC).sized(0.5f, 0.5f)
					.build("dins_fire"));*/

	//public static final EntityType<FairyEntity> TYPE_FAIRYENTITY = EntityType.Builder.create(FairyEntity::new, EntityClassification.CREATURE).size(0.9F, 1.3F).build("superslegend:fairyentity");

	//public static final RegistryObject<EntityType<FairyEntity>> FAIRYENTITY = ENTITIES.register("fairyentity", () -> EntityType.Builder.<FairyEntity>create(FairyEntity::new, EntityClassification.CREATURE).size(0.9f, 1.3f).build(new ResourceLocation(SupersLegend.modid, "fairyentity").toString()));
	//public static final RegistryObject<EntityType<PoeEntity>> POEENTITY = ENTITIES.register("poeentity", () -> EntityType.Builder.<PoeEntity>create(PoeEntity::new, EntityClassification.MONSTER).size(.5f, .5f).build(new ResourceLocation(SupersLegend.modid, "poeentity").toString()));

	//public static final RegistryObject<EntityType<EntityIceBeam>> ICE_BEAM =  ENTITIES.register("ice_beam", () -> EntityType.Builder.<BoomerangEntity>create(EntityIceBeam::new, EntityClassification.MISC).size(0.5f, 0.5f).setTrackingRange(4).build("ice_beam"));

	public static final RegistryObject<EntityType<BombEntity>> BOMBENTITY = ENTITIES.register("bombentity",
			() -> EntityType.Builder.<BombEntity>of(BombEntity::new, EntityClassification.MISC).sized(.5f, .5f)
					.setTrackingRange(4).setUpdateInterval(5).build("bombentity"));

	public static final RegistryObject<EntityType<BoomerangEntity>> REGULAR_BOOMERANG =  ENTITIES.register("regular_boomerang",
			() -> EntityType.Builder.<BoomerangEntity>of(RegularBoomerang::new, EntityClassification.MISC).sized(0.5f, 0.5f)
					.setTrackingRange(32).setUpdateInterval(1).setShouldReceiveVelocityUpdates(true).build("regular_boomerang"));


	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(
				//registerEntitySpawnEgg(TYPE_FAIRYENTITY, 0xffffff, 0x121212, "fairyentity_spawn_egg")
		);
	}


	//OLD CODE

	/*public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, SupersLegend.modid);

	//Arrows
	public static final RegistryObject<EntityType<EntityArrowFire>> FIRE_ARROW = ENTITIES.register("fire_arrow",
			() -> EntityType.Builder.<EntityArrowFire>of(EntityArrowFire::new, EntityClassification.MISC).sized(0.5F, 0.5F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));
	public static final RegistryObject<EntityType<EntityArrowIce>> ICE_ARROW = ENTITIES.register("ice_arrow",
			() -> EntityType.Builder.<EntityArrowIce>of(EntityArrowIce::new, EntityClassification.MISC).sized(0.5F, 0.5F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));
	public static final RegistryObject<EntityType<EntityArrowShock>> SHOCK_ARROW = ENTITIES.register("shock_arrow",
			() -> EntityType.Builder.<EntityArrowShock>of(EntityArrowShock::new, EntityClassification.MISC).sized(0.5F, 0.5F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));
	public static final RegistryObject<EntityType<EntityArrowBomb>> BOMB_ARROW = ENTITIES.register("bomb_arrow",
			() -> EntityType.Builder.<EntityArrowBomb>of(EntityArrowBomb::new, EntityClassification.MISC).sized(0.5F, 0.5F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));
	public static final RegistryObject<EntityType<EntityArrowAncient>> ANCIENT_ARROW = ENTITIES.register("ancient_arrow",
			() -> EntityType.Builder.<EntityArrowAncient>of(EntityArrowAncient::new, EntityClassification.MISC).sized(0.5F, 0.5F)
					.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));

	//public static final RegistryObject<EntityType<EntityIceBeam>> ICE_BEAM = ENTITIES.register("ice_beam",
	//		() -> EntityType.Builder.<EntityIceBeam>create(EntityIceBeam::new, EntityClassification.MISC).size(0.5F, 0.5F)
	//				.build(new ResourceLocation(SupersLegend.modid, "textures/entity/arrows").toString()));

	//public static final EntityType<FairyEntity> TYPE_FAIRYENTITY = EntityType.Builder.create(FairyEntity::new, EntityClassification.CREATURE).size(0.9F, 1.3F).build("superslegend:fairyentity");

	//public static final RegistryObject<EntityType<FairyEntity>> FAIRYENTITY = ENTITIES.register("fairyentity", () -> EntityType.Builder.<FairyEntity>create(FairyEntity::new, EntityClassification.CREATURE).size(0.9f, 1.3f).build(new ResourceLocation(SupersLegend.modid, "fairyentity").toString()));
	//public static final RegistryObject<EntityType<PoeEntity>> POEENTITY = ENTITIES.register("poeentity", () -> EntityType.Builder.<PoeEntity>create(PoeEntity::new, EntityClassification.MONSTER).size(.5f, .5f).build(new ResourceLocation(SupersLegend.modid, "poeentity").toString()));

	public static final RegistryObject<EntityType<EntityIceBeam>> ICE_BEAM =  ENTITIES.register("ice_beam", () -> EntityType.Builder.<BoomerangEntity>create(EntityIceBeam::new, EntityClassification.MISC).size(0.5f, 0.5f).setTrackingRange(4).build("ice_beam"));

	public static final RegistryObject<EntityType<BombEntity>> BOMBENTITY = ENTITIES.register("bombentity", () -> EntityType.Builder.<BombEntity>of(BombEntity::new, EntityClassification.MISC).sized(.5f, .5f).clientTrackingRange(4).updateInterval(5).build("bombentity"));
	public static final RegistryObject<EntityType<BoomerangEntity>> REGULAR_BOOMERANG =  ENTITIES.register("regular_boomerang", () -> EntityType.Builder.<BoomerangEntity>of(RegularBoomerang::new, EntityClassification.MISC).sized(0.5f, 0.5f).setTrackingRange(32).setUpdateInterval(1).setShouldReceiveVelocityUpdates(true).build("regular_boomerang"));


	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(
				//registerEntitySpawnEgg(TYPE_FAIRYENTITY, 0xffffff, 0x121212, "fairyentity_spawn_egg")
		);
	}*/

	public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
	{
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().tab(ItemGroup.TAB_MISC));
		item.setRegistryName(name);
		return item;
	}

	public static boolean rollSpawn(int rolls, Random random, SpawnReason reason){
		if(reason == SpawnReason.SPAWNER){
			return true;
		}else{
			return rolls <= 0 || random.nextInt(rolls) == 0;
		}
	}
}
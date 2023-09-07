package com.superworldsun.superslegend.registries;

import com.superworldsun.superslegend.SupersLegendMain;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModTabsInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SupersLegendMain.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TABS.register("items_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.items_tab"))
                    .icon(() -> new ItemStack(ItemInit.TRIFORCE.get()))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ItemInit.RUPEE.get());
                        pOutput.accept(ItemInit.BLUE_RUPEE.get());
                        pOutput.accept(ItemInit.RED_RUPEE.get());
                        pOutput.accept(ItemInit.SILVER_RUPEE.get());
                        pOutput.accept(ItemInit.GOLD_RUPEE.get());
                        pOutput.accept(ItemInit.MEDALLION_LIGHT.get());
                        pOutput.accept(ItemInit.MEDALLION_FOREST.get());
                        pOutput.accept(ItemInit.MEDALLION_FIRE.get());
                        pOutput.accept(ItemInit.MEDALLION_WATER.get());
                        pOutput.accept(ItemInit.MEDALLION_SPIRIT.get());
                        pOutput.accept(ItemInit.MEDALLION_SHADOW.get());
                        pOutput.accept(ItemInit.SMALL_KEY.get());
                        pOutput.accept(ItemInit.BOSS_KEY.get());
                        pOutput.accept(ItemInit.MAGICAL_KEY.get());
                        pOutput.accept(ItemInit.ARROW_BUNDLE.get());
                        pOutput.accept(ItemInit.FIRE_ARROW_BUNDLE.get());
                        pOutput.accept(ItemInit.ICE_ARROW_BUNDLE.get());
                        pOutput.accept(ItemInit.SHOCK_ARROW_BUNDLE.get());
                        pOutput.accept(ItemInit.BOMB_ARROW_BUNDLE.get());
                        pOutput.accept(ItemInit.ANCIENT_ARROW_BUNDLE.get());
                        pOutput.accept(ItemInit.TRIFORCE_POWER_SHARD.get());
                        pOutput.accept(ItemInit.TRIFORCE_WISDOM_SHARD.get());
                        pOutput.accept(ItemInit.TRIFORCE_COURAGE_SHARD.get());
                        pOutput.accept(ItemInit.ODOLWAS_REMAINS.get());
                        pOutput.accept(ItemInit.GOHTS_REMAINS.get());
                        pOutput.accept(ItemInit.GYORGS_REMAINS.get());
                        pOutput.accept(ItemInit.TWINMOLDS_REMAINS.get());
                        pOutput.accept(ItemInit.ANCIENT_CORE.get());
                        pOutput.accept(ItemInit.ANCIENT_GEAR.get());
                        pOutput.accept(ItemInit.ANCIENT_CORE_GIANT.get());
                        pOutput.accept(ItemInit.ANCIENT_SCREW.get());
                        pOutput.accept(ItemInit.ANCIENT_SHAFT.get());
                        pOutput.accept(ItemInit.ANCIENT_SPRING.get());
                        pOutput.accept(ItemInit.MASTER_ORE.get());
                        pOutput.accept(ItemInit.MASTER_ORE_CHUNK.get());
                        pOutput.accept(ItemInit.HEART_PIECE.get());
                        pOutput.accept(ItemInit.HEART_CONTAINER.get());
                        pOutput.accept(ItemInit.VOID_CONTAINER.get());
                        pOutput.accept(ItemInit.UNAPPRAISED_RING.get());
                        pOutput.accept(ItemInit.APPRAISED_RING_BOX.get());
                        /*pOutput.accept(ItemInit.ZELDAS_LULLABY_SHEET.get());
                        pOutput.accept(ItemInit.EPONAS_SONG_SHEET.get());
                        pOutput.accept(ItemInit.SARIAS_SONG_SHEET.get());
                        pOutput.accept(ItemInit.SONG_OF_TIME_SHEET.get());
                        pOutput.accept(ItemInit.SUNS_SONG_SHEET.get());
                        pOutput.accept(ItemInit.SONG_OF_STORMS_SHEET.get());
                        pOutput.accept(ItemInit.MINUET_OF_FOREST_SHEET.get());
                        pOutput.accept(ItemInit.BOLERO_OF_FIRE_SHEET.get());
                        pOutput.accept(ItemInit.SERENADE_OF_WATER_SHEET.get());
                        pOutput.accept(ItemInit.NOCTURNE_OF_SHADOW_SHEET.get());
                        pOutput.accept(ItemInit.REQUIEM_OF_SPIRIT_SHEET.get());
                        pOutput.accept(ItemInit.SONG_OF_SOARING_SHEET.get());
                        pOutput.accept(ItemInit.INVERTED_SONG_OF_TIME_SHEET.get());
                        pOutput.accept(ItemInit.SONATA_OF_AWAKENING_SHEET.get());
                        pOutput.accept(ItemInit.SONG_OF_DOUBLE_TIME_SHEET.get());
                        pOutput.accept(ItemInit.PRELUDE_OF_LIGHT_SHEET.get());
                        pOutput.accept(ItemInit.GORON_LULLABY_SHEET.get());
                        pOutput.accept(ItemInit.OATH_TO_ORDER_SHEET.get());
                        pOutput.accept(ItemInit.NEW_WAVE_BOSSA_NOVA_SHEET.get());
                        pOutput.accept(ItemInit.ELEGY_OF_EMPTYNESS_SHEET.get());
                        pOutput.accept(ItemInit.SONG_OF_HEALING_SHEET.get());
                        pOutput.accept(ItemInit.ALL_SONGS_SHEET.get());
                        pOutput.accept(ItemInit.AMNEISA_SHEET.get());*/
                        pOutput.accept(ItemInit.HYRULE_BASS.get());
                        pOutput.accept(ItemInit.COOKED_HYRULE_BASS.get());
                        pOutput.accept(ItemInit.HYLIAN_LOACH.get());
                        pOutput.accept(ItemInit.COOKED_HYLIAN_LOACH.get());
                        pOutput.accept(ItemInit.KOKIRI_SWORD.get());
                        pOutput.accept(ItemInit.RAZOR_SWORD.get());
                        pOutput.accept(ItemInit.GILDED_SWORD.get());
                        pOutput.accept(ItemInit.GIANTS_KNIFE.get());
                        pOutput.accept(ItemInit.BROKEN_GIANTS_KNIFE.get());
                        pOutput.accept(ItemInit.BIGGORONS_SWORD.get());
                        pOutput.accept(ItemInit.GODDESS_SWORD.get());
                        pOutput.accept(ItemInit.GODDESS_LONGSWORD.get());
                        pOutput.accept(ItemInit.GODDESS_WHITE_SWORD.get());
                        pOutput.accept(ItemInit.MASTER_SWORD.get());
                        pOutput.accept(ItemInit.MASTER_SWORD_V2.get());
                        pOutput.accept(ItemInit.TRUE_MASTER_SWORD.get());
                        pOutput.accept(ItemInit.GUARDIAN_SWORD.get());
                        pOutput.accept(ItemInit.FAIRY_BOW.get());
                        pOutput.accept(ItemInit.HEROS_BOW.get());
                        pOutput.accept(ItemInit.BIT_BOW.get());
                        pOutput.accept(ItemInit.LYNEL_BOW_X3.get());
                        pOutput.accept(ItemInit.LYNEL_BOW_X5.get());
                        pOutput.accept(ItemInit.SLING_SHOT.get());
                        pOutput.accept(ItemInit.DEKU_SHIELD.get());
                        pOutput.accept(ItemInit.HYLIAN_SHIELD.get());
                        pOutput.accept(ItemInit.SACRED_SHIELD.get());
                        pOutput.accept(ItemInit.DEKU_SEEDS.get());
                        pOutput.accept(ItemInit.MAGIC_FIRE_ARROW.get());
                        pOutput.accept(ItemInit.MAGIC_ICE_ARROW.get());
                        pOutput.accept(ItemInit.MAGIC_LIGHT_ARROW.get());
                        pOutput.accept(ItemInit.FIRE_ARROW.get());
                        pOutput.accept(ItemInit.ICE_ARROW.get());
                        pOutput.accept(ItemInit.SHOCK_ARROW.get());
                        pOutput.accept(ItemInit.BOMB_ARROW.get());
                        pOutput.accept(ItemInit.ANCIENT_ARROW.get());
                        pOutput.accept(ItemInit.SILVER_ARROW.get());
                        pOutput.accept(ItemInit.SPOILS_BAG.get());
                        pOutput.accept(ItemInit.DELIVERY_BAG.get());
                        pOutput.accept(ItemInit.BAIT_BAG.get());
                        pOutput.accept(ItemInit.RING_BOX_L1.get());
                        pOutput.accept(ItemInit.RING_BOX_L2.get());
                        pOutput.accept(ItemInit.RING_BOX_L3.get());
                        pOutput.accept(ItemInit.LETTER.get());
                        pOutput.accept(ItemInit.RED_LETTER.get());
                        pOutput.accept(ItemInit.KOKIRI_SET.get());
                        pOutput.accept(ItemInit.GORON_SET.get());
                        pOutput.accept(ItemInit.ZORA_SET.get());
                        pOutput.accept(ItemInit.PURPLE_SET.get());
                        pOutput.accept(ItemInit.MAGIC_ARMOR_SET.get());
                        pOutput.accept(ItemInit.DARK_SET.get());
                        pOutput.accept(ItemInit.ZORA_ARMOR_SET.get());
                        /*pOutput.accept(ItemInit.LANTERN.get());
                        pOutput.accept(ItemInit.EXTINGUISHEDLANTERN.get());
                        pOutput.accept(ItemInit.OIL.get());*/
                        pOutput.accept(ItemInit.BLUE_CANDLE.get());
                        pOutput.accept(ItemInit.RED_CANDLE.get());
                        pOutput.accept(ItemInit.HEROS_SECRET_STASH.get());
                        pOutput.accept(ItemInit.BOOK_OF_MUDORA.get());
                        pOutput.accept(ItemInit.ROCS_FEATHER.get());
                        pOutput.accept(ItemInit.FISHING_ROD.get());
                        pOutput.accept(ItemInit.BUG_NET.get());
                        pOutput.accept(ItemInit.MAGIC_MIRROR.get());
                        pOutput.accept(ItemInit.MAGIC_CAPE.get());
                        //pOutput.accept(ItemInit.MAGIC_POWDER.get());
                        pOutput.accept(ItemInit.BOOMERANG.get());
                        pOutput.accept(ItemInit.MAGIC_BOOMERANG.get());
                        pOutput.accept(ItemInit.WW_BOOMERANG.get());
                        //pOutput.accept(ItemInit.GALE_BOOMERANG.get());
                        pOutput.accept(ItemInit.BOMB.get());
                        pOutput.accept(ItemInit.WATER_BOMB.get());
                        //pOutput.accept(ItemInit.BOMBCHU.get());
                        pOutput.accept(ItemInit.HOOKSHOT.get());
                        pOutput.accept(ItemInit.LONGSHOT.get());
                        //pOutput.accept(ItemInit.CLAWSHOT.get());
                        pOutput.accept(ItemInit.MAGIC_HAMMER.get());
                        pOutput.accept(ItemInit.MEGATON_HAMMER.get());
                        pOutput.accept(ItemInit.SKULL_HAMMER.get());
                        pOutput.accept(ItemInit.FIRE_ROD.get());
                        pOutput.accept(ItemInit.ICE_ROD.get());
                        pOutput.accept(ItemInit.DEKU_STICK.get());
                        pOutput.accept(ItemInit.DEKU_STICK_LIT.get());
                        pOutput.accept(ItemInit.EMPTY_CONTAINER.get());
                        pOutput.accept(ItemInit.DINS_FIRE.get());
                        pOutput.accept(ItemInit.FARORES_WIND.get());
                        pOutput.accept(ItemInit.NAYRUS_LOVE.get());
                        pOutput.accept(ItemInit.DEKU_LEAF.get());
                        pOutput.accept(ItemInit.LENS_OF_TRUTH.get());
                        pOutput.accept(ItemInit.FAIRY_OCARINA.get());
                        pOutput.accept(ItemInit.OCARINA_OF_TIME.get());
                        pOutput.accept(ItemInit.RED_JELLY.get());
                        pOutput.accept(ItemInit.GREEN_JELLY.get());
                        pOutput.accept(ItemInit.BLUE_JELLY.get());
                        pOutput.accept(ItemInit.RED_POTION_MIX.get());
                        pOutput.accept(ItemInit.GREEN_POTION_MIX.get());
                        pOutput.accept(ItemInit.BLUE_POTION_MIX.get());
                        pOutput.accept(ItemInit.RED_POTION.get());
                        pOutput.accept(ItemInit.GREEN_POTION.get());
                        pOutput.accept(ItemInit.BLUE_POTION.get());
                        pOutput.accept(ItemInit.BOTTLED_BEE.get());
                        pOutput.accept(ItemInit.BOTTLED_SILVERFISH.get());
                        pOutput.accept(ItemInit.BOTTLED_ENDERMITE.get());
                        pOutput.accept(ItemInit.MAGNETIC_GLOVE.get());
                        pOutput.accept(ItemInit.TRIFORCE.get());
                        pOutput.accept(ItemInit.TRIFORCE_POWER.get());
                        pOutput.accept(ItemInit.TRIFORCE_WISDOM.get());
                        pOutput.accept(ItemInit.TRIFORCE_COURAGE.get());
                        pOutput.accept(ItemInit.MASK_CLAY.get());
                    }))
                    .build());

    public static final RegistryObject<CreativeModeTab> APPAREL_TAB = CREATIVE_MODE_TABS.register("apparel_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.apparel_tab"))
                    .withTabsBefore(ITEMS_TAB.getId())
                    .icon(() -> new ItemStack(ItemInit.KOKIRI_TUNIC.get()))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ItemInit.MASK_POSTMANSHAT.get());
                        pOutput.accept(ItemInit.MASK_ALLNIGHTMASK.get());
                        pOutput.accept(ItemInit.MASK_BLASTMASK.get());
                        pOutput.accept(ItemInit.MASK_STONEMASK.get());
                        pOutput.accept(ItemInit.MASK_BREMANMASK.get());
                        pOutput.accept(ItemInit.MASK_GREATFAIRYMASK.get());
                        pOutput.accept(ItemInit.MASK_DEKUMASK.get());
                        pOutput.accept(ItemInit.MASK_KEATONMASK.get());
                        pOutput.accept(ItemInit.MASK_BUNNYHOOD.get());
                        pOutput.accept(ItemInit.MASK_DONGEROSMASK.get());
                        pOutput.accept(ItemInit.MASK_MASKOFSCENTS.get());
                        pOutput.accept(ItemInit.MASK_GORONMASK.get());
                        pOutput.accept(ItemInit.MASK_ROMANISMASK.get());
                        pOutput.accept(ItemInit.MASK_TROUPELEADERSMASK.get());
                        pOutput.accept(ItemInit.MASK_KAFEISMASK.get());
                        pOutput.accept(ItemInit.MASK_COUPLESMASK.get());
                        pOutput.accept(ItemInit.MASK_MASKOFTRUTH.get());
                        pOutput.accept(ItemInit.MASK_ZORAMASK.get());
                        pOutput.accept(ItemInit.MASK_KAMAROSMASK.get());
                        pOutput.accept(ItemInit.MASK_GIBDOMASK.get());
                        pOutput.accept(ItemInit.MASK_GAROSMASK.get());
                        pOutput.accept(ItemInit.MASK_CAPTAINSHAT.get());
                        pOutput.accept(ItemInit.MASK_GIANTSMASK.get());
                        pOutput.accept(ItemInit.MASK_FIERCEDEITYSMASK.get());
                        pOutput.accept(ItemInit.MASK_MAJORASMASK.get());
                        pOutput.accept(ItemInit.MASK_MOONMASK.get());
                        pOutput.accept(ItemInit.MASK_SUNMASK.get());
                        pOutput.accept(ItemInit.MASK_HAWKEYEMASK.get());
                        pOutput.accept(ItemInit.GNAT_HAT.get());
                        //pOutput.accept(ItemInit.MASK_HEROS_CHARM.get());
                        pOutput.accept(ItemInit.ROCS_CAPE.get());
                        pOutput.accept(ItemInit.KOKIRI_CAP.get());
                        pOutput.accept(ItemInit.KOKIRI_TUNIC.get());
                        pOutput.accept(ItemInit.KOKIRI_LEGGINGS.get());
                        pOutput.accept(ItemInit.KOKIRI_BOOTS.get());
                        pOutput.accept(ItemInit.ZORA_CAP.get());
                        pOutput.accept(ItemInit.ZORA_TUNIC.get());
                        pOutput.accept(ItemInit.ZORA_LEGGINGS.get());
                        pOutput.accept(ItemInit.IRON_BOOTS.get());
                        pOutput.accept(ItemInit.ZORA_FLIPPERS.get());
                        pOutput.accept(ItemInit.GORON_CAP.get());
                        pOutput.accept(ItemInit.GORON_TUNIC.get());
                        pOutput.accept(ItemInit.GORON_LEGGINGS.get());
                        pOutput.accept(ItemInit.HOVER_BOOTS.get());
                        pOutput.accept(ItemInit.PURPLE_CAP.get());
                        pOutput.accept(ItemInit.PURPLE_TUNIC.get());
                        pOutput.accept(ItemInit.PURPLE_LEGGINGS.get());
                        pOutput.accept(ItemInit.PEGASUS_BOOTS.get());
                        pOutput.accept(ItemInit.HEROS_NEW_CAP.get());
                        pOutput.accept(ItemInit.HEROS_NEW_TUNIC.get());
                        pOutput.accept(ItemInit.HEROS_NEW_LEGGINGS.get());
                        pOutput.accept(ItemInit.HEROS_NEW_BOOTS.get());
                        pOutput.accept(ItemInit.MAGIC_ARMOR_CAP.get());
                        pOutput.accept(ItemInit.MAGIC_ARMOR_TUNIC.get());
                        pOutput.accept(ItemInit.MAGIC_ARMOR_LEGGINGS.get());
                        pOutput.accept(ItemInit.MAGIC_ARMOR_BOOTS.get());
                        pOutput.accept(ItemInit.DARK_CAP.get());
                        pOutput.accept(ItemInit.DARK_TUNIC.get());
                        pOutput.accept(ItemInit.DARK_LEGGINGS.get());
                        pOutput.accept(ItemInit.DARK_BOOTS.get());
                        pOutput.accept(ItemInit.ZORA_ARMOR_CAP.get());
                        pOutput.accept(ItemInit.ZORA_ARMOR_TUNIC.get());
                        pOutput.accept(ItemInit.ZORA_ARMOR_LEGGINGS.get());
                        pOutput.accept(ItemInit.ZORA_ARMOR_BOOTS.get());
                        pOutput.accept(ItemInit.FLAMEBREAKER_HELMET.get());
                        pOutput.accept(ItemInit.FLAMEBREAKER_TUNIC.get());
                        pOutput.accept(ItemInit.FLAMEBREAKER_LEGGINGS.get());
                        pOutput.accept(ItemInit.FLAMEBREAKER_BOOTS.get());
                        pOutput.accept(ItemInit.ANCIENT_HELMET.get());
                        pOutput.accept(ItemInit.ANCIENT_CUIRASS.get());
                        pOutput.accept(ItemInit.ANCIENT_GREAVES.get());
                        pOutput.accept(ItemInit.ANCIENT_BOOTS.get());
                        pOutput.accept(ItemInit.BARBARIAN_HELMET.get());
                        pOutput.accept(ItemInit.BARBARIAN_ARMOR.get());
                        pOutput.accept(ItemInit.BARBARIAN_LEG_WRAPS.get());
                        pOutput.accept(ItemInit.BARBARIAN_BOOTS.get());
                        pOutput.accept(ItemInit.CLIMBERS_BANDANNA.get());
                        pOutput.accept(ItemInit.CLIMBING_GEAR.get());
                        pOutput.accept(ItemInit.CLIMBING_PANTS.get());
                        pOutput.accept(ItemInit.CLIMBING_BOOTS.get());
                        pOutput.accept(ItemInit.DESERT_VOE_HEADBAND.get());
                        pOutput.accept(ItemInit.DESERT_VOE_SPAULDER.get());
                        pOutput.accept(ItemInit.DESERT_VOE_TROUSERS.get());
                        pOutput.accept(ItemInit.DESERT_VOE_BOOTS.get());
                        pOutput.accept(ItemInit.SNOWQUILL_HEADDRESS.get());
                        pOutput.accept(ItemInit.SNOWQUILL_TUNIC.get());
                        pOutput.accept(ItemInit.SNOWQUILL_TROUSERS.get());
                        pOutput.accept(ItemInit.SNOWQUILL_BOOTS.get());
                        pOutput.accept(ItemInit.QUIVER.get());
                        pOutput.accept(ItemInit.BIG_QUIVER.get());
                        pOutput.accept(ItemInit.BIGGEST_QUIVER.get());
                        pOutput.accept(ItemInit.BULLET_BAG.get());
                        pOutput.accept(ItemInit.BIG_BULLET_BAG.get());
                        pOutput.accept(ItemInit.BIGGEST_BULLET_BAG.get());
                        pOutput.accept(ItemInit.BOMB_BAG.get());
                        pOutput.accept(ItemInit.BIG_BOMB_BAG.get());
                        pOutput.accept(ItemInit.BIGGEST_BOMB_BAG.get());
                        pOutput.accept(ItemInit.GORONS_BRACELET.get());
                        pOutput.accept(ItemInit.SILVER_GAUNTLETS.get());
                        pOutput.accept(ItemInit.GOLDEN_GAUNTLETS.get());
                        pOutput.accept(ItemInit.SILVER_SCALE.get());
                        pOutput.accept(ItemInit.GOLDEN_SCALE.get());
                        pOutput.accept(ItemInit.BLUE_RING.get());
                        pOutput.accept(ItemInit.RED_RING.get());
                        pOutput.accept(ItemInit.GREEN_RING.get());
                        pOutput.accept(ItemInit.POWER_RING_L1.get());
                        pOutput.accept(ItemInit.POWER_RING_L2.get());
                        pOutput.accept(ItemInit.POWER_RING_L3.get());
                        pOutput.accept(ItemInit.ARMOR_RING_L1.get());
                        pOutput.accept(ItemInit.ARMOR_RING_L2.get());
                        pOutput.accept(ItemInit.ARMOR_RING_L3.get());
                        pOutput.accept(ItemInit.CURSED_RING.get());
                        pOutput.accept(ItemInit.HEART_RING_L1.get());
                        pOutput.accept(ItemInit.HEART_RING_L2.get());
                        pOutput.accept(ItemInit.GREEN_LUCK_RING.get());
                        pOutput.accept(ItemInit.BLUE_LUCK_RING.get());
                        pOutput.accept(ItemInit.GOLD_LUCK_RING.get());
                        pOutput.accept(ItemInit.RED_LUCK_RING.get());
                        pOutput.accept(ItemInit.STEADFAST_RING.get());
                        pOutput.accept(ItemInit.GREEN_HOLY_RING.get());
                        //pOutput.accept(ItemInit.BLUE_HOLY_RING.get());
                        //pOutput.accept(ItemInit.RED_HOLY_RING.get());
                        pOutput.accept(ItemInit.SWIMMERS_RING.get());
                    }))
                    .build());

    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("blocks_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.blocks_tab"))
                    .withTabsBefore(ITEMS_TAB.getId())
                    .withTabsBefore(APPAREL_TAB.getId())
                    .icon(() -> new ItemStack(BlockInit.BLOCK_OF_TIME.get()))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(BlockInit.RUPEE_BLOCK.get());
                        pOutput.accept(BlockInit.BLUE_RUPEE_BLOCK.get());
                        pOutput.accept(BlockInit.RED_RUPEE_BLOCK.get());
                        pOutput.accept(BlockInit.SILVER_RUPEE_BLOCK.get());
                        pOutput.accept(BlockInit.GOLD_RUPEE_BLOCK.get());
                        pOutput.accept(BlockInit.SPIKES_BLOCK.get());
                        pOutput.accept(BlockInit.GOSSIP_STONE_BLOCK.get());
                        pOutput.accept(BlockInit.DUNGEON_DOOR.get());
                        pOutput.accept(BlockInit.LOCKED_DUNGEON_DOOR.get());
                        pOutput.accept(BlockInit.BOSS_DOOR.get());
                        pOutput.accept(BlockInit.LOCKED_BOSS_DOOR.get());
                        pOutput.accept(BlockInit.LOCKED_WOODEN_DOOR.get());
                        pOutput.accept(BlockInit.WOODEN_BOSS_DOOR.get());
                        pOutput.accept(BlockInit.BUSH_BLOCK.get());
                        pOutput.accept(BlockInit.CHAIN_LINK_FENCE_BLOCK.get());
                        pOutput.accept(BlockInit.GRAPPLE_BLOCK.get());
                        pOutput.accept(BlockInit.DEKU_FLOWER_BLOCK.get());
                        pOutput.accept(BlockInit.YELLOW_DEKU_FLOWER_BLOCK.get());
                        pOutput.accept(BlockInit.POT_BLOCK.get());
                        pOutput.accept(BlockInit.JAR_BLOCK.get());
                        pOutput.accept(BlockInit.POSTBOX_BLOCK.get());
                        pOutput.accept(BlockInit.GRATE_BLOCK.get());
                        pOutput.accept(BlockInit.CRATE_BLOCK.get());
                        pOutput.accept(BlockInit.PUSH_STONE.get());
                        pOutput.accept(BlockInit.SILVER_PUSH_STONE.get());
                        pOutput.accept(BlockInit.BLACK_PUSH_STONE.get());
                        pOutput.accept(BlockInit.GRASS_PATCH_BLOCK.get());
                        pOutput.accept(BlockInit.ODD_MUSHROOM.get());
                        pOutput.accept(BlockInit.MAGIC_MUSHROOM.get());
                        pOutput.accept(BlockInit.TORCH_TOWER.get());
                        pOutput.accept(BlockInit.MASTER_ORE_BLOCK.get());
                        pOutput.accept(BlockInit.DEEPSLATE_MASTER_ORE_BLOCK.get());
                        pOutput.accept(BlockInit.BLUE_FLOOR_SWITCH.get());
                        pOutput.accept(BlockInit.YELLOW_FLOOR_SWITCH.get());
                        pOutput.accept(BlockInit.RED_FLOOR_SWITCH.get());
                        pOutput.accept(BlockInit.RUSTED_FLOOR_SWITCH.get());
                        pOutput.accept(BlockInit.OAK_PEG_BLOCK.get());
                        pOutput.accept(BlockInit.SPRUCE_PEG_BLOCK.get());
                        pOutput.accept(BlockInit.BIRCH_PEG_BLOCK.get());
                        pOutput.accept(BlockInit.JUNGLE_PEG_BLOCK.get());
                        pOutput.accept(BlockInit.ACACIA_PEG_BLOCK.get());
                        pOutput.accept(BlockInit.DARK_OAK_PEG_BLOCK.get());
                        pOutput.accept(BlockInit.RUSTED_PEG_BLOCK.get());
                        pOutput.accept(BlockInit.SPIKED_PEG_BLOCK.get());
                        pOutput.accept(BlockInit.SHADOW_BLOCK.get());
                        pOutput.accept(BlockInit.FALSE_SHADOW_BLOCK.get());
                        pOutput.accept(BlockInit.HIDDEN_SHADOW_BLOCK.get());
                        pOutput.accept(BlockInit.TOMBSTONE_BLOCK.get());
                        pOutput.accept(BlockInit.STONE_PATH_BLOCK.get());
                        pOutput.accept(BlockInit.STONE_TILE_BLOCK.get());
                        pOutput.accept(BlockInit.DINS_FLAME.get());
                        pOutput.accept(BlockInit.FARORES_FLAME.get());
                        pOutput.accept(BlockInit.NAYRUS_FLAME.get());
                        pOutput.accept(BlockInit.DINS_SACRED_PEDESTAL.get());
                        pOutput.accept(BlockInit.FARORES_SACRED_PEDESTAL.get());
                        pOutput.accept(BlockInit.NAYRUS_SACRED_PEDESTAL.get());
                        pOutput.accept(BlockInit.PEDESTAL.get());
                        pOutput.accept(BlockInit.FAN.get());
                        pOutput.accept(BlockInit.SWITCHABLE_FAN.get());
                        //pOutput.accept(BlockInit.LIGHT_EMITTER.get());
                        //pOutput.accept(BlockInit.LIGHT_PRISM.get());
                        pOutput.accept(BlockInit.ROYAL_TILE.get());
                        pOutput.accept(BlockInit.BLOCK_OF_TIME.get());
                        pOutput.accept(BlockInit.OWL_STATUE.get());
                        pOutput.accept(BlockInit.SUN_SWITCH.get());
                        pOutput.accept(BlockInit.WARP_PAD.get());
                        pOutput.accept(BlockInit.WARP_PAD_LIGHT.get());
                        pOutput.accept(BlockInit.WARP_PAD_FOREST.get());
                        pOutput.accept(BlockInit.WARP_PAD_FIRE.get());
                        pOutput.accept(BlockInit.WARP_PAD_WATER.get());
                        pOutput.accept(BlockInit.WARP_PAD_SPIRIT.get());
                        pOutput.accept(BlockInit.WARP_PAD_SHADOW.get());
                    }))
                    .build());

    public static void resiter(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

package com.ax5.mccsj.block;

import com.ax5.mccsj.MetroDeCaracas;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static void initialize() {
    }

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        RegistryKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MetroDeCaracas.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MetroDeCaracas.MOD_ID, name));
    }

    // ----- ZOOLOGICO -----
    public static final Block ZOOLOGICO_BLOCK = register(
            "zoologico_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE),
            true
    );

    public static final Block ZOOLOGICO_BLOCK_SIMPLE = register(
            "simple_zoologico_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE),
            true
    );

    // ----- CARICUAO -----
    public static final Block CARICUAO_BLOCK = register(
            "caricuao_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE),
            true
    );

    public static final Block CARICUAO_BLOCK_SIMPLE = register(
            "simple_caricuao_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE),
            true
    );

    // ----- LAS ADJUNTAS -----
    public static final Block ADJUNTAS_BLOCK = register(
            "adjuntas_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE),
            true
    );

    public static final Block ADJUNTAS_VERTICAL_BLOCK = register(
            "adjuntas_vertical_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE),
            true
    );

    // ----- RUIZ PINEDA -----
    public static final Block RPINEDA_BLOCK = register(
            "rpineda_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE),
            true
    );

    public static final Block RPINEDA_BLOCK_SIMPLE = register(
            "simple_rpineda_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE),
            true
    );

    // ----- MAMERA -----
    public static final Block MAMERA_BLOCK = register(
            "mamera_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE),
            true
    );

    public static final Block MAMERA_BLOCK_SIMPLE = register(
            "simple_mamera_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE),
            true
    );

    // ----- ANTIMANO -----
    public static final Block ANTIMANO_BLOCK = register(
            "antimano_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE),
            true
    );

    // ----- CARAPITA -----
    public static final Block CARAPITA_BLOCK = register(
            "carapita_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE),
            true
    );

    public static final Block CARAPITA_BLOCK_SIMPLE = register(
            "simple_carapita_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE),
            true
    );

    // ----- LA YAGUARA -----
    public static final Block YAGUARA_BLOCK = register(
            "yaguara_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.RED_CONCRETE),
            true
    );

    public static final Block YAGUARA_BLOCK_SIMPLE = register(
            "simple_yaguara_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.RED_CONCRETE),
            true
    );

    // ----- LA PAZ -----
    public static final Block LAPAZ_BLOCK = register(
            "paz_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE),
            true
    );

    // ----- ARTIGAS -----
    public static final Block ARTIGAS_BLOCK = register(
            "artigas_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE),
            true
    );

    public static final Block ARTIGAS_BLOCK_SIMPLE = register(
            "simple_artigas_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE),
            true
    );

    // ----- MATERNIDAD -----
    public static final Block MATERNIDAD_BLOCK = register(
            "maternidad_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE),
            true
    );

    // ----- CAPUCHINOS -----
    public static final Block CAPUCHINOS_BLOCK = register(
            "capuchinos_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE),
            true
    );

    // ----- EL SILENCIO -----
    public static final Block SILENCIO_BLOCK = register(
            "silencio_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE),
            true
    );

    // ----- MISCELANEOS -----
    public static final Block BLACK_CERAMIC_BLOCK = register(
            "black_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE),
            true
    );
    public static final Block WHITE_CERAMIC_BLOCK = register(
            "white_ceramic",
            Block::new,
            AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE),
            true
    );
}

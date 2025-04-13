package com.ax5.mccsj.block;

import com.ax5.mccsj.CaracasMetroCeramics;
import com.ax5.mccsj.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlock {

    //ZOOLOGICO
    public static final Block ZOOLOGICO_BLOCK = registerBlock("zoologico_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), ModItemGroup.MCCSJ);

    public static final Block ZOOLOGICO_BLOCK_SIMPLE = registerBlock("simple_zoologico_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), ModItemGroup.MCCSJ);

    //CARICUAO
    public static final Block CARICUAO_BLOCK = registerBlock("caricuao_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), ModItemGroup.MCCSJ);

    public static final Block CARICUAO_BLOCK_SIMPLE = registerBlock("simple_caricuao_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), ModItemGroup.MCCSJ);

    //LAS ADJUNTAS
    public static final Block ADJUNTAS_BLOCK = registerBlock("adjuntas_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)), ModItemGroup.MCCSJ);

    public static final Block ADJUNTAS_VERTICAL_BLOCK = registerBlock("adjuntas_vertical_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)), ModItemGroup.MCCSJ);

    //RUIZ PINEDA
    public static final Block RPINEDA_BLOCK = registerBlock("rpineda_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)), ModItemGroup.MCCSJ);

    public static final Block RPINEDA_BLOCK_SIMPLE = registerBlock("simple_rpineda_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)), ModItemGroup.MCCSJ);

    //MAMERA
    public static final Block MAMERA_BLOCK = registerBlock("mamera_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)), ModItemGroup.MCCSJ);

    public static final Block MAMERA_BLOCK_SIMPLE = registerBlock("simple_mamera_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)), ModItemGroup.MCCSJ);

    //ANTIMANO
    public static final Block ANTIMANO_BLOCK = registerBlock("antimano_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)), ModItemGroup.MCCSJ);

    //CARAPITA
    public static final Block CARAPITA_BLOCK = registerBlock("carapita_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), ModItemGroup.MCCSJ);

    public static final Block CARAPITA_BLOCK_SIMPLE = registerBlock("simple_carapita_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)), ModItemGroup.MCCSJ);

    //LA YAGUARA
    public static final Block YAGUARA_BLOCK = registerBlock("yaguara_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)), ModItemGroup.MCCSJ);

    public static final Block YAGUARA_BLOCK_SIMPLE = registerBlock("simple_yaguara_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)), ModItemGroup.MCCSJ);

    //LA PAZ
    public static final Block LAPAZ_BLOCK = registerBlock("paz_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)), ModItemGroup.MCCSJ);

    //ARTIGAS
    public static final Block ARTIGAS_BLOCK = registerBlock("artigas_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), ModItemGroup.MCCSJ);

    public static final Block ARTIGAS_BLOCK_SIMPLE = registerBlock("simple_artigas_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)), ModItemGroup.MCCSJ);

    //MATERNIDAD
    public static final Block MATERNIDAD_BLOCK = registerBlock("maternidad_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)), ModItemGroup.MCCSJ);

    //CAPUCHINOS
    public static final Block CAPUCHINOS_BLOCK = registerBlock("capuchinos_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)), ModItemGroup.MCCSJ);

    //EL SILENCIO
    public static final Block SILENCIO_BLOCK = registerBlock("silencio_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)), ModItemGroup.MCCSJ);

    //MISCELANEOS
    public static final Block BLACK_CERAMIC_BLOCK = registerBlock("black_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)), ModItemGroup.MCCSJ);

    public static final Block WHITE_CERAMIC_BLOCK = registerBlock("white_ceramic",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)), ModItemGroup.MCCSJ);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(CaracasMetroCeramics.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register(Registries.ITEM, new Identifier(CaracasMetroCeramics.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks(){
        CaracasMetroCeramics.LOGGER.info("Loading blocks...");
    }
}

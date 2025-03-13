/*package com.ax5.mccsj.block;

import com.ax5.mccsj.MetroDeCaracas;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> {
            itemGroup.add(ModBlocks.CONDENSED_DIRT.asItem());
        });
    }

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MetroDeCaracas.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static Block registerBlock(String name, Block block) {
        Registry.register(Registries.BLOCK, Identifier.of(MetroDeCaracas.MOD_ID, name), block);
        return block;
    }

    public static final Block CONDENSED_DIRT = register(
            "condensed_dirt",
            Block::new,
            AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS),
            true
    );
}*/

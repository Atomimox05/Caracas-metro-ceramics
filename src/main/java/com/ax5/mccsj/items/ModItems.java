package com.ax5.mccsj.items;

import com.ax5.mccsj.MetroDeCaracas;
import com.ax5.mccsj.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static void init(){
        // Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.SUSPICIOUS_SUBSTANCE));

        // Register the group.
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

// Register items to the custom item group.
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.SUSPICIOUS_SUBSTANCE);
            itemGroup.add(ModBlocks.ADJUNTAS_BLOCK);
            itemGroup.add(ModBlocks.ADJUNTAS_VERTICAL_BLOCK);
            itemGroup.add(ModBlocks.RPINEDA_BLOCK);
            itemGroup.add(ModBlocks.RPINEDA_BLOCK_SIMPLE);
            itemGroup.add(ModBlocks.ZOOLOGICO_BLOCK);
            itemGroup.add(ModBlocks.ZOOLOGICO_BLOCK_SIMPLE);
            itemGroup.add(ModBlocks.CARICUAO_BLOCK);
            itemGroup.add(ModBlocks.CARICUAO_BLOCK_SIMPLE);
            itemGroup.add(ModBlocks.MAMERA_BLOCK);
            itemGroup.add(ModBlocks.MAMERA_BLOCK_SIMPLE);
            itemGroup.add(ModBlocks.ANTIMANO_BLOCK);
            itemGroup.add(ModBlocks.CARAPITA_BLOCK);
            itemGroup.add(ModBlocks.CARAPITA_BLOCK_SIMPLE);
            itemGroup.add(ModBlocks.YAGUARA_BLOCK);
            itemGroup.add(ModBlocks.YAGUARA_BLOCK_SIMPLE);
            itemGroup.add(ModBlocks.LAPAZ_BLOCK);
            itemGroup.add(ModBlocks.ARTIGAS_BLOCK);
            itemGroup.add(ModBlocks.ARTIGAS_BLOCK_SIMPLE);
            itemGroup.add(ModBlocks.MATERNIDAD_BLOCK);
            itemGroup.add(ModBlocks.CAPUCHINOS_BLOCK);
            itemGroup.add(ModBlocks.SILENCIO_BLOCK);
            itemGroup.add(ModBlocks.WHITE_CERAMIC_BLOCK);
            itemGroup.add(ModBlocks.BLACK_CERAMIC_BLOCK);
            // ...
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

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(MetroDeCaracas.MOD_ID, "item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.LAPAZ_BLOCK))
            .displayName(Text.translatable("itemGroup.mccsj"))
            .build();

    public static final Item SUSPICIOUS_SUBSTANCE = register("suspicious_substance", Item::new, new Item.Settings());
}

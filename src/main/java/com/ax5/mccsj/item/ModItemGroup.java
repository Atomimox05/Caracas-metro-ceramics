package com.ax5.mccsj.item;

import com.ax5.mccsj.CaracasMetroCeramics;
import com.ax5.mccsj.block.ModBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup MCCSJ;

    public static void registerItemGroups(){
        MCCSJ = FabricItemGroup.builder(new Identifier(CaracasMetroCeramics.MOD_ID, "mccsj"))
                .displayName(Text.translatable("itemGroup.mccsj"))
                .icon(() -> new ItemStack(ModBlock.LAPAZ_BLOCK)).build();
    }
}

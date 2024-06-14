package com.besson.tutorial.block;

import com.besson.tutorial.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block ICE_EHTER_BLOCK = registerBlocks("ice_ether_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block RAW_ICE_ETHER_BLOCK = registerBlocks("raw_ice_ether_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public  static final Block ICE_ETHER_ORE = registerBlocks("ice_ether_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5), FabricBlockSettings.copyOf(Blocks.STONE).strength(5f)));
    private static Block registerBlocks(String name,Block block){
        registerBlockItems(name,block);
        return  Registry.register(Registries.BLOCK,new Identifier(TutorialMod.MOD_ID,name),block);
    }
    private static Item registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(TutorialMod.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }
    public static void registerModBlocks(){

    }
}

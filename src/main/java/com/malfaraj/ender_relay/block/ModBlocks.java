package com.malfaraj.ender_relay.block;

import com.malfaraj.ender_relay.EnderRelay;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ENDER_RELAY_BLOCK = registerBlock("ender-relay-block",
            new Block(AbstractBlock.Settings.copy(Blocks.ENDER_CHEST).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(EnderRelay.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(EnderRelay.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        EnderRelay.LOGGER.info("Register Ender Relay blocks for " + EnderRelay.MOD_ID);

    }
}

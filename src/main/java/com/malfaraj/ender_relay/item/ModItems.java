package com.malfaraj.ender_relay.item;

import com.malfaraj.ender_relay.EnderRelay;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item ENDER_RELAY = registerItem("ender-relay", new Item(new Item.Settings()));

    private static void addItemsToBlocksItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENDER_RELAY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EnderRelay.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        EnderRelay.LOGGER.info("Registering mod items for " + EnderRelay.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBlocksItemGroup);
    }
}

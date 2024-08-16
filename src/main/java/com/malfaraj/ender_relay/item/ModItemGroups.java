package com.malfaraj.ender_relay.item;

import com.malfaraj.ender_relay.EnderRelay;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static ItemGroup ENDER_RELAY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EnderRelay.MOD_ID, "ender-relay"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ender-relay"))
                    .icon(() -> new ItemStack(ModItems.ENDER_RELAY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDER_RELAY);
                        // ADD ITEMS HERE  
                    }).build());
    public static void registerItemGroups() {
        EnderRelay.LOGGER.info("Register Ender Relay Item group for " + EnderRelay.MOD_ID);

    }
}

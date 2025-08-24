package com.cbjaxx.ecocreate.Item;

import com.cbjaxx.ecocreate.EcoCreate;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EcoCreate.MOD_ID);

    public static final DeferredItem<Item> ECOORE = ITEMS.registerSimpleItem(
            "ecoore",
            new Item.Properties() // The properties to use.
    );



public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

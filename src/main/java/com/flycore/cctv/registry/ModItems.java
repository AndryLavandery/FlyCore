package com.flycore.cctv.registry;

import com.flycore.cctv.FlyCoreCctvMod;
import com.flycore.cctv.item.SurveillanceTabletItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FlyCoreCctvMod.MOD_ID);

    public static final RegistryObject<Item> CAMERA_BLOCK_ITEM = ITEMS.register("camera",
            () -> new BlockItem(ModBlocks.CAMERA.get(), new Item.Properties()));

    public static final RegistryObject<Item> MONITOR_BLOCK_ITEM = ITEMS.register("monitor",
            () -> new BlockItem(ModBlocks.MONITOR.get(), new Item.Properties()));

    public static final RegistryObject<Item> SURVEILLANCE_TABLET = ITEMS.register("surveillance_tablet",
            () -> new SurveillanceTabletItem(new Item.Properties().stacksTo(1)));

    private ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

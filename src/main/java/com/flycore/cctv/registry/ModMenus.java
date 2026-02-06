package com.flycore.cctv.registry;

import com.flycore.cctv.FlyCoreCctvMod;
import com.flycore.cctv.menu.SurveillanceTabletMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FlyCoreCctvMod.MOD_ID);

    public static final RegistryObject<MenuType<SurveillanceTabletMenu>> SURVEILLANCE_TABLET_MENU = MENUS.register(
            "surveillance_tablet",
            () -> IForgeMenuType.create((windowId, inventory, data) -> new SurveillanceTabletMenu(SURVEILLANCE_TABLET_MENU.get(), windowId, inventory))
    );

    private ModMenus() {
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}

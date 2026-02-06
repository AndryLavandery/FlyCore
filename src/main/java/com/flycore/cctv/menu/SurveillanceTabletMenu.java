package com.flycore.cctv.menu;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import org.jetbrains.annotations.Nullable;

public class SurveillanceTabletMenu extends AbstractContainerMenu {
    public SurveillanceTabletMenu(@Nullable MenuType<?> menuType, int containerId, Inventory inventory) {
        super(menuType, containerId);
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }
}

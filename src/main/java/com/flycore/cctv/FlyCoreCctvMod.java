package com.flycore.cctv;

import com.flycore.cctv.client.ClientSetup;
import com.flycore.cctv.registry.ModBlockEntities;
import com.flycore.cctv.registry.ModBlocks;
import com.flycore.cctv.registry.ModItems;
import com.flycore.cctv.registry.ModMenus;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FlyCoreCctvMod.MOD_ID)
public class FlyCoreCctvMod {
    public static final String MOD_ID = "flycorecctv";

    public FlyCoreCctvMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModMenus.register(modEventBus);

        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> ClientSetup::register);
    }
}

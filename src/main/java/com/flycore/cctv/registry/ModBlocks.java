package com.flycore.cctv.registry;

import com.flycore.cctv.FlyCoreCctvMod;
import com.flycore.cctv.block.CameraBlock;
import com.flycore.cctv.block.MonitorBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FlyCoreCctvMod.MOD_ID);

    public static final RegistryObject<Block> CAMERA = BLOCKS.register("camera",
            () -> new CameraBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).strength(2.0f).sound(SoundType.METAL).noOcclusion()));

    public static final RegistryObject<Block> MONITOR = BLOCKS.register("monitor",
            () -> new MonitorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(2.5f).sound(SoundType.METAL).noOcclusion()));

    private ModBlocks() {
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

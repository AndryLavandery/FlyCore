package com.flycore.cctv.registry;

import com.flycore.cctv.FlyCoreCctvMod;
import com.flycore.cctv.block.entity.CameraBlockEntity;
import com.flycore.cctv.block.entity.MonitorBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FlyCoreCctvMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<CameraBlockEntity>> CAMERA_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register(
            "camera",
            () -> BlockEntityType.Builder.of(CameraBlockEntity::new, ModBlocks.CAMERA.get()).build(null)
    );

    public static final RegistryObject<BlockEntityType<MonitorBlockEntity>> MONITOR_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register(
            "monitor",
            () -> BlockEntityType.Builder.of(MonitorBlockEntity::new, ModBlocks.MONITOR.get()).build(null)
    );

    private ModBlockEntities() {
    }

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}

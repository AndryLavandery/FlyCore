package com.flycore.cctv.block.entity;

import com.flycore.cctv.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MonitorBlockEntity extends BlockEntity {
    private int ticks;

    public MonitorBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MONITOR_BLOCK_ENTITY.get(), pos, state);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, MonitorBlockEntity monitorBlockEntity) {
        monitorBlockEntity.ticks++;
    }
}

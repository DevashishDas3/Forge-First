package net.dev.tutorialmod.blockentities;

import com.mojang.logging.LogUtils;
import net.dev.tutorialmod.init.BlockEntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.slf4j.Logger;


public class ClockBlockEntity extends BlockEntity{
    private int ticks;
    private static final Logger LOGGER = LogUtils.getLogger();
    public ClockBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(BlockEntityInit.CLOCK.get(), pWorldPosition, pBlockState);
    }

    public void tick(){
        ticks++;
        LOGGER.info("Ticks passed: " + ticks);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        this.ticks = pTag.getInt("Ticks");
    }

    /*
    @Override
    protected void saveAdditional(CompoundTag pTag){
        super.saveAdditional(pTag);
        pTag.putInt("Ticks", this.ticks);
    }
     */
}

package net.dev.tutorialmod.init;

import net.dev.tutorialmod.TutorialMod;
import net.dev.tutorialmod.blockentities.ClockBlockEntity;
import net.dev.tutorialmod.clockBlock.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TutorialMod.MODID);
    public static final RegistryObject<BlockEntityType<ClockBlockEntity>> CLOCK = BLOCK_ENTITIES.register("clock",
            () -> BlockEntityType.Builder.of(ClockBlockEntity::new, ModBlocks.CLOCK.get()).build(null));

}

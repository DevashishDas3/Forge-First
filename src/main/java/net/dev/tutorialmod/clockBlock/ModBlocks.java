package net.dev.tutorialmod.clockBlock;

import net.dev.tutorialmod.TutorialMod;
import net.dev.tutorialmod.clockItem.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MODID);

    public static final RegistryObject<Block> CLOCK = BLOCKS.register("clock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEACON)
            .color(MaterialColor.COLOR_BLACK)
    ));
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

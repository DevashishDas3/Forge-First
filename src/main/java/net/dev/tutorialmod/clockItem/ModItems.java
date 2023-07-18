package net.dev.tutorialmod.clockItem;

import net.dev.tutorialmod.TutorialMod;
import net.dev.tutorialmod.clockBlock.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static final RegistryObject<Item> CLOCK = ITEMS.register("clock",
            () -> new BlockItem(ModBlocks.CLOCK.get(), new Item.Properties().rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

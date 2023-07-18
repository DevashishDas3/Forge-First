package net.dev.tutorialmod.event;

import net.dev.tutorialmod.TutorialMod;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.World;

import java.awt.*;
@Mod.EventBusSubscriber(modid = TutorialMod.MODID)
public class ModEvents {
        @SubscribeEvent
        public static void onBonemealUseByPlayer(LivingEntityUseItemEvent event) {
            if (event.getItem().getItem() == Items.BONE_MEAL) {
                event.setCanceled(true);
                event.getEntity().getLevel().playSound(null, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), SoundEvents.NOTE_BLOCK_BASS.get(), SoundSource.PLAYERS, 1f, 1f);
            }
    }
}

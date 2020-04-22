package com.github.shaneyu.tutorialmod;

import com.github.shaneyu.tutorialmod.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TutorialMod.MOD_ID)
public class TutorialMod
{
    public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public TutorialMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
    }
}

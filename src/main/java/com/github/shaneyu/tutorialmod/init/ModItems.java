package com.github.shaneyu.tutorialmod.init;

import com.github.shaneyu.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> DUST_NAQUADAH = ITEMS.register(
            "dust_naquadah", () -> new Item(new Item.Properties().group(ModItemGroups.MATERIALS_GROUP)));

    public static final RegistryObject<Item> INGOT_NAQUADAH = ITEMS.register(
            "ingot_naquadah", () -> new Item(new Item.Properties().group(ModItemGroups.MATERIALS_GROUP)));
}

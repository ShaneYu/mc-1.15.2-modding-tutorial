package com.github.shaneyu.tutorialmod.init;

import com.github.shaneyu.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public final class ModItemGroups {
    public static final ItemGroup MATERIALS_GROUP = new MaterialsItemGroup(
            TutorialMod.MOD_ID + "_materials", () -> new ItemStack(ModItems.INGOT_NAQUADAH.get()));

    public static final class MaterialsItemGroup extends ItemGroup {
        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        public MaterialsItemGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}

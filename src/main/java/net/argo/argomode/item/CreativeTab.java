package net.argo.argomode.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {

    public static final CreativeModeTab ARGOMOD_TAB = new CreativeModeTab("ArgoMod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };



}

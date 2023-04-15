package net.argo.argomode.item;

import net.argo.argomod.ArgoMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArgoMod.MOD_ID);


    public static final RegistryObject<Item> RUBY =
            ITEMS.register("ruby", ()-> new Item(new Item.Properties().tab(CreativeTab.ARGOMOD_TAB)));
    public static final RegistryObject<Item> RAW_RUBY =
            ITEMS.register("raw_ruby", ()-> new Item(new Item.Properties().tab(CreativeTab.ARGOMOD_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

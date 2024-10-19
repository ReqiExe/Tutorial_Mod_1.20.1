package net.reqi.tutmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.reqi.tutmod.TutorialMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MOD_TABS.register("tutorial_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.URANIUM.get()))
                        .title(Component.translatable("creativetab.tutorial_tab"))
                        .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(ModItems.URANIUM.get());
                            pOutput.accept(ModItems.RAW_URANIUM.get());

                            pOutput.accept(Items.DIAMOND);


                        })
                        .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}

package net.reqi.tutmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.reqi.tutmod.TutorialMod;

import java.util.List;
import java.util.function.Supplier;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> URANIUM_TAB = CREATIVE_TABS.register("uranium_tab",() -> CreativeModeTab.builder()
            .icon(ItemInit.RAW_URANIUM.get()::getDefaultInstance)
            .title(Component.translatable("creativetab.uranium_tab"))
            .displayItems((parameters, output) -> {
                output.accept(ItemInit.RAW_URANIUM.get());
                output.accept(ItemInit.URANIUM_INGOT.get());
                output.accept(BlockInit.URANIUM_ORE.get());
                output.accept(BlockInit.URANIUM_BLOCK.get());
            })
            .build()
    );
}

package net.reqi.tutmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.reqi.tutmod.TutorialMod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> URANIUM_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> URANIUM_TAB = TABS.register("uranium_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.uranium_tab"))
                    .icon(BlockInit.URANIUM_ORE_ITEM.get()::getDefaultInstance)
                    .displayItems((displayParams,output) -> {
                        URANIUM_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build());

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        URANIUM_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ItemInit.URANIUM);
        }
        if (event.getTab() == URANIUM_TAB.get()) {
            event.accept(Blocks.GRASS_BLOCK);
        }
    }
}

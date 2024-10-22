package net.reqi.tutmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.reqi.tutmod.TutorialMod;

import static net.reqi.tutmod.item.CreativeTabInit.addToTab;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> URANIUM = addToTab(ITEMS.register("uranium",
             () -> new Item(new Item.Properties()
                     .stacksTo(16)
                     .food(new FoodProperties.Builder()
                             .nutrition(30)
                             .saturationMod(60)
                             .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST,6000,64),1)

                             .build())
                     .rarity(Rarity.EPIC)

             )));
}

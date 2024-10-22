package net.reqi.tutmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.reqi.tutmod.TutorialMod;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
             () -> new Item(new Item.Properties()
                     .stacksTo(63)
                     .food(new FoodProperties.Builder()
                             .nutrition(30)
                             .saturationMod(60)
                             .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST,6000,64),1)
                             .build())
                     .rarity(Rarity.EPIC)

             ));

    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties()
                    .stacksTo(63)
                    .food(new FoodProperties.Builder()
                            .nutrition(60)
                            .saturationMod(120)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST,60000,90000),1)
                            .build())
                    .rarity(Rarity.EPIC)

            ));
}

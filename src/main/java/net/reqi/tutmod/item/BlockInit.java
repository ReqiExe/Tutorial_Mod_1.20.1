package net.reqi.tutmod.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.reqi.tutmod.TutorialMod;

import static net.reqi.tutmod.item.CreativeTabInit.addToTab;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);


    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore", () -> new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(4f, 100f)
                    .instrument(NoteBlockInstrument.DRAGON)
                    .lightLevel(state -> 10)
                    .requiresCorrectToolForDrops()
    ));

    public static final RegistryObject<Item> URANIUM_ORE_ITEM = addToTab(ItemInit.ITEMS.register("uranium_ore_item",
            () -> new BlockItem(URANIUM_ORE.get(),new Item.Properties()
                    .rarity(Rarity.EPIC)
            )));

}

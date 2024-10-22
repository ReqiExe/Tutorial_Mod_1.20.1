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

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);


    //Add uranium ore and its blockitem
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore", () -> new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(4f, 100f)
                    .instrument(NoteBlockInstrument.DRAGON)
                    .lightLevel(state -> 10)
                    .requiresCorrectToolForDrops()
    ));

    public static final RegistryObject<Item> URANIUM_ORE_ITEM = ItemInit.ITEMS.register("uranium_ore_item",
            () -> new BlockItem(URANIUM_ORE.get(),new Item.Properties()
                    .rarity(Rarity.EPIC)
            ));

    //Add uranium block and its blockitem
    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(6f, 1000f)
                    .instrument(NoteBlockInstrument.DRAGON)
                    .lightLevel(state -> 1000)
                    .requiresCorrectToolForDrops()
    ));

    public static final RegistryObject<Item> URANIUM_BLOCK_ITEM = ItemInit.ITEMS.register("uranium_block_item",
            () -> new BlockItem(URANIUM_BLOCK.get(),new Item.Properties()
                    .rarity(Rarity.EPIC)
            ));

}

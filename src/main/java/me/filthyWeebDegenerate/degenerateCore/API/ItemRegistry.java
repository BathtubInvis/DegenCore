package me.filthyWeebDegenerate.degenerateCore.API;

import me.filthyWeebDegenerate.degenerateCore.DegenCore;
import net.minecraft.block.Block;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ItemRegistry {
    protected static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DegenCore.ID);
    protected static final List<String> oreBlockIdentifiers = new ArrayList<>();

    protected void registerRegistry(String modID) {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, modID);
    }

    protected <I extends Item> RegistryObject<Item> registerCustomizedItem(String name, Supplier<I> supplier) {
        return ITEMS.register(name, supplier);
    }

    protected RegistryObject<Item> registerItem(String name, Supplier<Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    protected RegistryObject<Item> registerBlockItem(String name, Supplier<BlockItem> supplier) {
        return ITEMS.register(name, supplier);
    }

    protected <I extends ArmorItem> RegistryObject<ArmorItem> registerArmorItem(String name, Supplier<I> supplier) {
        return ITEMS.register(name, supplier);
    }

    protected void registerAllBlocksAsItems(DeferredRegister<Block> BLOCKS, ItemGroup oreBlockGroup, ItemGroup otherBlockGroup) {
        BLOCKS.getEntries().forEach((E) -> {
            if (oreBlockIdentifiers.contains(E.getId().getPath())) {
                ITEMS.register(E.getId().getPath(), () -> new BlockItem(E.get(), new Item.Properties().group(oreBlockGroup)));
            } else {
                ITEMS.register(E.getId().getPath(), () -> new BlockItem(E.get(), new Item.Properties().group(otherBlockGroup)));
            }
        });
    }

    public void register() {}
}

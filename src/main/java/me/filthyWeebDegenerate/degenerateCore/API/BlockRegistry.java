package me.filthyWeebDegenerate.degenerateCore.API;

import me.filthyWeebDegenerate.degenerateCore.DegenCore;
import net.minecraft.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockRegistry {
    protected static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DegenCore.ID);

    protected void registerRegistry(String modID) {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, modID);
    }

    protected <I extends Block> RegistryObject<I> registerCustomizedBlock(String name, Supplier<I> supplier) {
        return BLOCKS.register(name, supplier);
    }

    protected RegistryObject<Block> registerBlock(String name, Supplier<Block> supplier) {
        return BLOCKS.register(name, supplier);
    }

    public void register(IEventBus bus) {;
        BLOCKS.register(bus);
    }
}

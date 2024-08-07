
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sgozzati.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.sgozzati.block.CapasquartatadiakiraBlock;
import net.mcreator.sgozzati.SgozzatiMod;

public class SgozzatiModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SgozzatiMod.MODID);
	public static final RegistryObject<Block> CAPASQUARTATADIAKIRA = REGISTRY.register("capasquartatadiakira", () -> new CapasquartatadiakiraBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

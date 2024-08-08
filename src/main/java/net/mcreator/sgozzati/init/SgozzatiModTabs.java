
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sgozzati.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.sgozzati.SgozzatiMod;

public class SgozzatiModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SgozzatiMod.MODID);
	public static final RegistryObject<CreativeModeTab> SGOZZATIPT_2 = REGISTRY.register("sgozzatipt_2",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sgozzati.sgozzatipt_2")).icon(() -> new ItemStack(SgozzatiModBlocks.CAPASQUARTATADIAKIRA.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SgozzatiModBlocks.CAPASQUARTATADIAKIRA.get().asItem());
			}).withSearchBar().build());
}

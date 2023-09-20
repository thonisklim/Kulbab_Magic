package net.kulbab.mynicemod;

import net.fabricmc.api.ModInitializer;

import net.kulbab.mynicemod.block.ModBlocks;
import net.kulbab.mynicemod.enchantment.ModEnchantments;
import net.kulbab.mynicemod.item.ModItemGroup;
import net.kulbab.mynicemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyNiceMod implements ModInitializer {
	public static final String MOD_ID = "mynicemod";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();

		ModEnchantments.registerModEnchantments();
	}
}
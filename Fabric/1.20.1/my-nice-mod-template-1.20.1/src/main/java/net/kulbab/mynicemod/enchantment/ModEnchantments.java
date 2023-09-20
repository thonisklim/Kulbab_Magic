package net.kulbab.mynicemod.enchantment;

import net.kulbab.mynicemod.MyNiceMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static Enchantment HIT_AND_RUN = registerEnchantment("hit_and_run",
            new HitAndRunEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.MAINHAND));

    public static Enchantment LIGHTNING_STRIKE = registerEnchantment("lightning_strike",
            new LightningStrikeEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.BOW, EquipmentSlot.MAINHAND));

    private static Enchantment registerEnchantment(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(MyNiceMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        MyNiceMod.LOGGER.info("Registering Mod Enchantments for: " + MyNiceMod.MOD_ID);
    }
}

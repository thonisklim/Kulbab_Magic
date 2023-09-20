package net.kulbab.mynicemod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class HitAndRunEnchantment
        extends Enchantment {
    int counter = 0;
    protected HitAndRunEnchantment(Enchantment.Rarity weight, EquipmentSlot... slots) {
        super(weight, EnchantmentTarget.WEAPON, slots);
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(this.counter == 0 && target instanceof LivingEntity){
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,
                    10*(2+level), level - 1));
            this.counter++;
        }
        else {
            this.counter = 0;
        }
        super.onTargetDamaged(user, target, level);
    }

}

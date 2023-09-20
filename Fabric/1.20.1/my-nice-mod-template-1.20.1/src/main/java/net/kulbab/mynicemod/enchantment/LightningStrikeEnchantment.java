package net.kulbab.mynicemod.enchantment;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class LightningStrikeEnchantment
        extends Enchantment {
    int counter = 0;
    protected LightningStrikeEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return !(other instanceof LightningStrikeEnchantment);
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(this.counter == 0 && !user.getWorld().isClient){
            ServerWorld world = (ServerWorld) user.getWorld();
            BlockPos position = target.getBlockPos();
            for (int i = 0; i < level; i++){
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
            }
            this.counter++;
        }
        else {
            this.counter = 0;
        }
        super.onTargetDamaged(user, target, level);
    }

}

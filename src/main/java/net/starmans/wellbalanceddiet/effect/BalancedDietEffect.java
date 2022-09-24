package net.starmans.wellbalanceddiet.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class BalancedDietEffect extends StatusEffect {

    public BalancedDietEffect(StatusEffectCategory statusEffectCategory, int color) {

        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity pLivingEntity, int pAmplifier) {
       if (!pLivingEntity.world.isClient()) {
           double x = pLivingEntity.getX();
       }

       super.applyUpdateEffect(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}

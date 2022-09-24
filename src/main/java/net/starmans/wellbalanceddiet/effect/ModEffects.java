package net.starmans.wellbalanceddiet.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.starmans.wellbalanceddiet.StarmansWellBalancedDiet;

public class ModEffects {
    public static StatusEffect BALANCED_DIET;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(StarmansWellBalancedDiet.MOD_ID, name),
                new BalancedDietEffect(StatusEffectCategory.BENEFICIAL, 3124687));
    }

    public static void registerEffects() {
        BALANCED_DIET = registerStatusEffect("balanced_diet");
    }
}

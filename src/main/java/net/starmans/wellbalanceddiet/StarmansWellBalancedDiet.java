package net.starmans.wellbalanceddiet;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StarmansWellBalancedDiet implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("starmanswbd");
	public static final String MOD_ID = "starmanswbd";

	//PROTEIN
	public static final Item BURGER = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(9.6f).meat().build()));
	public static final Item COOKED_BURGER = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(16f).meat().build()));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//PROTEIN
		Registry.register(Registry.ITEM, new Identifier("starmanswbd", "burger"), BURGER);
		Registry.register(Registry.ITEM, new Identifier("starmanswbd", "cooked_burger"), COOKED_BURGER);

		LOGGER.info("Eat Your Veggies!");
	}
}
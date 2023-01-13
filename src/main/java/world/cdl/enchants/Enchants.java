package world.cdl.enchants;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import world.cdl.enchants.enchantments.Frost;
import world.cdl.enchants.enchantments.InfForCrossbow;

public class Enchants implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("<CDL MOD> More Enchantments mod loading...");

        // register enchantments
        register_enchant("inf4crossbow", new InfForCrossbow());
        register_enchant("frost", new Frost());
    }
    private static void register_enchant(String name, Enchantment enchantment ) {
        Registry.register(Registry.ENCHANTMENT, new Identifier("enchants", name), enchantment);
    }
}

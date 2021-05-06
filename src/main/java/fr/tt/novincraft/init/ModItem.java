package fr.tt.novincraft.init;

import fr.tt.novincraft.NV;
import fr.tt.novincraft.utils.CustomItemTiers;
import fr.tt.novincraft.utils.ModItemGroups;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NV.MODID);

    // Création d'objets de type INGOT

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'un nouvel item dans minecraft -> nom="copper_ingot"

    // Création d'objets de type OUTILS

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'une épée en cuivre
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'une hache en cuivre
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'une pioche en cuivre
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'une pelle en cuivre
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'une houe en cuivre

}

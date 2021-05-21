package fr.tt.novincraft.init;

import fr.tt.novincraft.NV;
import fr.tt.novincraft.utils.CustomArmorMaterials;
import fr.tt.novincraft.utils.CustomItemTiers;
import fr.tt.novincraft.utils.ModItemGroups;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NV.MODID);

    // Création des Items en COPPER

        // Création d'objets de type INGOT

            public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'un nouvel item dans minecraft -> nom="copper_ingot"
            public static final RegistryObject<Item> DIMERITIUM_RAW_ORE = ITEMS.register("dimeritium_raw_ore", () -> new Item(new Item.Properties().group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'un nouvel item dans minecraft -> nom="dimeritium_raw_ore"
        // Création d'objets de type OUTILS

            public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'une épée en cuivre
            public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'une hache en cuivre
            public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'une pioche en cuivre
            public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'une pelle en cuivre
            public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ModItemGroups.NOVINCRAFT_TAB))); // Création d'une houe en cuivre

        // Création d'objets de type ARMURE

            public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.NOVINCRAFT_TAB)));
            public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.NOVINCRAFT_TAB)));
            public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.NOVINCRAFT_TAB)));
            public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.NOVINCRAFT_TAB)));

}

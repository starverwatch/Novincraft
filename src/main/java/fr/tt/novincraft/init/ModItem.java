package fr.tt.novincraft.init;

import fr.tt.novincraft.NV;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NV.MODID);

    // Création d'objet de type INGOT

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties())); // Création d'un nouvel item dans minecraft -> nom="copper_ingot"

}

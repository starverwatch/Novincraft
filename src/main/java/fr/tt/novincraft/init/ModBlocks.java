package fr.tt.novincraft.init;

import fr.tt.novincraft.NV;
import fr.tt.novincraft.utils.ModItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NV.MODID);

    public static final RegistryObject<Block> COPPER_BLOCK = createBlock("copper_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 15f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2))); // Création d'un nouveau block : nom="copper_block" résistance aux éxplosions ="3" Résistance ="15" Type d'outils ="pioche" Niveau de minage ="3 - fer"

    public static final RegistryObject<Block> COPPER_ORE = createBlock("copper_ore", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3f, 15f).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(2))); // Création d'un nouveau block : nom="copper_ore" résistance aux éxplosition ="3" Résistance ="15" Type d'outils ="pioche" Niveau de minage ="3 - fer"

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {

        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroups.NOVINCRAFT_TAB)));
        return block;

    }

}

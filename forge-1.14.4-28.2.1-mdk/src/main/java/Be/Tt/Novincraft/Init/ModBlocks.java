package Be.Tt.Novincraft.Init;

import Be.Tt.Novincraft.ModNv;
import Be.Tt.Novincraft.blocks.BlockModNv;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.swing.event.ListDataEvent;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = ModNv.MODID)
public class ModBlocks
{

    public static final ModBlocks INSTANCE = new ModBlocks();

    public static List<Block> blocks;
    public static List<BlockItem> blockItems;

    public static Block saphire_block;

    private static void init()
    {
        blocks = Lists.newArrayList();
        blockItems = Lists.newArrayList();

        saphire_block = new BlockModNv("saphire_block", Block.Properties.create(Material.IRON).hardnessAndResistance(5f, 30f));



    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e)
    {

        init();

        for (Block b : blocks)
        {
            e.getRegistry().register(b);
        }
    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> e)
    {
        for (Item bi : blockItems)
        {
            e.getRegistry().register(bi);
        }
    }

}

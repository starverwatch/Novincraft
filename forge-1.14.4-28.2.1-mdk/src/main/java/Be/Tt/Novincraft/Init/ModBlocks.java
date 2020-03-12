package Be.Tt.Novincraft.Init;

import Be.Tt.Novincraft.ModNv;
import Be.Tt.Novincraft.blocks.BlockNovincraft;
import Be.Tt.Novincraft.items.ItemNovincraft;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Properties;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = ModNv.MODID)
public class ModBlocks
{

    public static final ModBlocks INSTANCE = new ModBlocks();

    public static List<Block> blocks;

    public static Block block_de_cuivre;


    private static void init()

    {
       blocks = Lists.newArrayList();

        block_de_cuivre = new BlockNovincraft("block_de_cuivre", Block.Properties.create(Material.IRON));

    }


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e)

    {




    }



}

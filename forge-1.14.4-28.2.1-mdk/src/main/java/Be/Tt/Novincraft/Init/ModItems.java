package Be.Tt.Novincraft.Init;

import Be.Tt.Novincraft.ModNv;
import Be.Tt.Novincraft.items.ItemNovincraft;
import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = ModNv.MODID)
public class ModItems
{

    public static final ModItems INSTANCE = new ModItems();

    public List<Item> items;

    public static Item Hache_fer;

    private void init()
    {
        items = Lists.newArrayList();


        Hache_fer = new ItemNovincraft();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e)
    {

    }


}

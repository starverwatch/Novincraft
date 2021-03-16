package Be.Tt.Novincraft.Init;


import Be.Tt.Novincraft.ModNv;
import Be.Tt.Novincraft.items.ItemNovincraft;
import Be.Tt.Novincraft.items.ToolAxe;
import Be.Tt.Novincraft.lists.ToolMaterialList;
import com.google.common.collect.Lists;
import javafx.geometry.Side;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import javax.swing.*;
import javax.tools.Tool;
import java.util.List;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = ModNv.MODID)
public class ModItems {

    public static final ModItems INSTANCE = new ModItems();
    public static List<Item> items;

    public static final ItemGroup modecreative = new ModeCreative();

    public static Item hache_saphire;
    public static Item saphire;
    public static Item hache_fer;
    public static Item iron_ingot;
    public static Item hache_diamond;
    public static Item diamond;

    private static void init() {
        items = Lists.newArrayList();

        hache_saphire = new ToolAxe("hache_saphire",ToolMaterialList.iron, 12, -3.2f, new Item.Properties().group(modecreative));
        hache_fer = new ToolAxe("hache_fer", ToolMaterialList.iron, 10, -3.2f, new Item.Properties().group(modecreative));
        hache_diamond = new ToolAxe("hache_diamond", ToolMaterialList.diamond, 11, -3f, new Item.Properties().group(modecreative));
        saphire = new ItemNovincraft("saphire");
        

    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        init();

        for (Item item : items)
        {
            e.getRegistry().register(item);
        }


    }


}

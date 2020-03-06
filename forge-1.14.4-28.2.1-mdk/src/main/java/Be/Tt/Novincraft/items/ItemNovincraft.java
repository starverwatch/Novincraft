package Be.Tt.Novincraft.items;

import Be.Tt.Novincraft.Init.ModItems;
import net.minecraft.item.Item;

public class ItemNovincraft extends Item
{
    public ItemNovincraft(String name)
    {
        super(new Properties());

        setRegistryName(name);


        ModItems.INSTANCE.items.add(this);
    }
}

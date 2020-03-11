package Be.Tt.Novincraft.items;

import Be.Tt.Novincraft.Init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

public class ToolAxe extends AxeItem
{
    public ToolAxe(String name , IItemTier tier, float attackDamage, float attackSpeedIn, Properties builder)
    {
        super(tier, attackDamage, attackSpeedIn, builder);

        setRegistryName(name);


        ModItems.INSTANCE.items.add(this);


    }
}


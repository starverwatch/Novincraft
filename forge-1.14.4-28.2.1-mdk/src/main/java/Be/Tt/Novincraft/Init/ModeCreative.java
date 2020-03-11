package Be.Tt.Novincraft.Init;

import net.minecraft.data.BlockListReport;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModeCreative extends ItemGroup
{
    public ModeCreative() {
        super("modecreative");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Item.BLOCK_TO_ITEM.get(BlockListReport.HASH_FUNCTION));
    }
}

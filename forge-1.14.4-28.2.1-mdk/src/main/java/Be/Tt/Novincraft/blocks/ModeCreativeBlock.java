package Be.Tt.Novincraft.blocks;

import Be.Tt.Novincraft.Init.ModBlocks;
import Be.Tt.Novincraft.Init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ModeCreativeBlock extends ItemGroup
{
    public ModeCreativeBlock() {
        super("modecreativeblock");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.saphire_block);
    }
}

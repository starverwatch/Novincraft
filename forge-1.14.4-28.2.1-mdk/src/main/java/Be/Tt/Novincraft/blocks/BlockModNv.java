package Be.Tt.Novincraft.blocks;

import Be.Tt.Novincraft.Init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockModNv extends Block
{
    public static final ItemGroup modecreativeblock = new ModeCreativeBlock();

    public BlockModNv(String name, Properties properties)
    {

        super(properties);
        setRegistryName(name);

        ModBlocks.blocks.add(this);
        ModBlocks.blockItems.add((BlockItem) new BlockItem(this, new Item.Properties().group(modecreativeblock)).setRegistryName(getRegistryName()));
    }
}

package Be.Tt.Novincraft.blocks;

import Be.Tt.Novincraft.Init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockModNv extends Block
{
    public BlockModNv(String name, Properties properties)
    {

        super(properties);
        setRegistryName(name);

        ModBlocks.blocks.add(this);
        ModBlocks.blockItems.add((BlockItem) new BlockItem(this, new Item.Properties()).setRegistryName(getRegistryName()));
    }
}

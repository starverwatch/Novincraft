package Be.Tt.Novincraft.blocks;

import Be.Tt.Novincraft.Init.ModBlocks;
import net.minecraft.block.Block;

public class BlockNovincraft extends Block {

    public BlockNovincraft(String name,Properties p_i48440_1_) {
        super(p_i48440_1_);
        setRegistryName(name);

        ModBlocks.blocks.add(this);
    }
}

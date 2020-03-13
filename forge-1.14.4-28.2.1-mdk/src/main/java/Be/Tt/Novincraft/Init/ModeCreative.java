package Be.Tt.Novincraft.Init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ModeCreative extends ItemGroup
{
    public ModeCreative() {
        super("modecreative");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.hache_fer);
    }
}

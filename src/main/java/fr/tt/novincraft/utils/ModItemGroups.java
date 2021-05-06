package fr.tt.novincraft.utils;

import fr.tt.novincraft.init.ModItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {

    public static final ItemGroup NOVINCRAFT_TAB = new ItemGroup("novincraft") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItem.COPPER_INGOT.get());
        }
    };

}

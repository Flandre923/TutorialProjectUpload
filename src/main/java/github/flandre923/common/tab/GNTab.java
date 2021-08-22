package github.flandre923.common.tab;

import github.flandre923.init.GNItemInit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GNTab extends ItemGroup {
    // 名字
    public GNTab() {
        super("grace_note.item_group");
    }
    // 图标
    @Override
    public ItemStack createIcon() {
        return new ItemStack(GNItemInit.CIGAR.get());
    }
}



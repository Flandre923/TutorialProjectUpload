package github.flandre923.init;

import github.flandre923.GraceNote;
import github.flandre923.common.item.Cigar;
import github.flandre923.common.item.PocketKnife;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class GNItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GraceNote.MOD_ID);

    public static final RegistryObject<Item> CIGAR = ITEMS.register("cigar", Cigar::new);
    public static final RegistryObject<Item> POCKET_KNIFE= ITEMS.register("pocket_knife", PocketKnife::new);
}

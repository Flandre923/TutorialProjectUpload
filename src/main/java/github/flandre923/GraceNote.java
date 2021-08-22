package github.flandre923;

import github.flandre923.common.tab.GNTab;
import github.flandre923.init.GNEffectsInit;
import github.flandre923.init.GNItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(GraceNote.MOD_ID)
public class GraceNote {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "grace_note";
    public static final GNTab GN_ItemGroup = new GNTab();//分类


    public GraceNote(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        GNEffectsInit.EFFECTS.register(modEventBus);
        GNItemInit.ITEMS.register(modEventBus);

    }


}

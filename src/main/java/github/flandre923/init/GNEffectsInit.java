package github.flandre923.init;

import github.flandre923.GraceNote;
import github.flandre923.common.potion.GNModEffect;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class GNEffectsInit {
    public static final DeferredRegister EFFECTS =DeferredRegister.create(ForgeRegistries.POTIONS, GraceNote.MOD_ID);

    // 精神稳定
    public static final RegistryObject<Effect> STABLE_SPIRIT = EFFECTS.register("stable_spirit",()->new GNModEffect(EffectType.BENEFICIAL,5797459));
    // 结界
    public static final RegistryObject<Effect> BORDER = EFFECTS.register("border",()->new GNModEffect(EffectType.BENEFICIAL,5797459));
    //

}

package github.flandre923.common.item;

import github.flandre923.GraceNote;
import github.flandre923.init.GNEffectsInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Cigar extends Item {
    //雪茄
    public Cigar() {
        super(new Properties().group(GraceNote.GN_ItemGroup));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);
        // 设置冷却
        playerIn.getCooldownTracker().setCooldown(this,20*60);
        if(!worldIn.isRemote){
            // 给要药水效果
            playerIn.addPotionEffect(new EffectInstance(GNEffectsInit.BORDER.get(),20*60));
            playerIn.addPotionEffect(new EffectInstance(GNEffectsInit.STABLE_SPIRIT.get(),20*60));
            playerIn.addPotionEffect(new EffectInstance(Effects.RESISTANCE,20*60));
        }
        if(!playerIn.abilities.isCreativeMode){
            itemStack.shrink(1);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}

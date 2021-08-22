package github.flandre923.common.item;

import github.flandre923.GraceNote;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

// 小刀
public class PocketKnife extends Item {

    public PocketKnife() {
        super(new Properties().group(GraceNote.GN_ItemGroup).maxDamage(100));
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        if(!worldIn.isRemote && !state.getBlock().isIn(BlockTags.FIRE)){
            stack.damageItem(1,entityLiving,(entity)->{
                entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
            });
        }
        return state.isIn(BlockTags.LEAVES) || state.isIn(Blocks.COBWEB) || state.isIn(Blocks.GRASS) || state.isIn(Blocks.FERN) || state.isIn(Blocks.DEAD_BUSH) || state.isIn(Blocks.VINE) || state.isIn(Blocks.TRIPWIRE) || state.isIn(BlockTags.WOOL) || super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
    }


    @Override
    public boolean canHarvestBlock(BlockState blockIn) {
        return blockIn.isIn(Blocks.COBWEB)||blockIn.isIn(Blocks.REDSTONE_WIRE)||blockIn.isIn(Blocks.TRIPWIRE);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.getHeldItem(handIn).damageItem(1,playerIn,e->e.sendBreakAnimation(handIn));
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }


    public float getDestroySpeed(ItemStack stack, BlockState state) {
        if (!state.isIn(Blocks.COBWEB) && !state.isIn(BlockTags.LEAVES)) {
            return state.isIn(BlockTags.WOOL) ? 5.0F : super.getDestroySpeed(stack, state);
        } else {
            return 15.0F;
        }
    }


}

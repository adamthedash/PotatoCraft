package com.adam.potatocraft.init.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoCraftPickaxe  extends ItemPickaxe{

    boolean alwaysEdible = false;
    int healAmount = 4;
    float saturationModifier = 0.5F;


    public PotatoCraftPickaxe(Item.ToolMaterial material){
        super(material);
    }


    //    Make the pickaxe edible - all methods below
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.EAT;
    }

    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        if (playerIn.canEat(this.alwaysEdible))
        {
            playerIn.setActiveHand(hand);
            return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
        }
        else
        {
            return new ActionResult(EnumActionResult.FAIL, itemStackIn);
        }
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        stack.damageItem(50, entityLiving);

        if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            entityplayer.getFoodStats().addStats(healAmount, saturationModifier);
            worldIn.playSound(null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
//            this.onFoodEaten(stack, worldIn, entityplayer);
            entityplayer.addStat(StatList.getObjectUseStats(this)); // TODO: Check if correct
        }

        return stack;
    }

    /*void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {

    }*/

    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 32;
    }


}

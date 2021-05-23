package warhammermod.Items.ranged;


import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import warhammermod.Entities.Projectile.WarpBulletEntity;
import warhammermod.Items.AutogunBase;
import warhammermod.Items.ItemsInit;
import warhammermod.Items.Render.RenderRatlingGun;


public class RatlingGun extends AutogunBase {

    public RatlingGun(Properties properties, int MagSize, int time) {
        super(properties, ItemsInit.Warpstone,time,MagSize,64, 6);
    }


    public void fire(Player player, Level world, ItemStack stack){
        if(!world.isClientSide()) {
            WarpBulletEntity bullet = new WarpBulletEntity(player,world, 11);
            bullet.setPos(player.getX(), player.getEyeY() - 0.26, player.getZ());
            bullet.shootFromRotation(player,player.xRot, player.yRot, 0, 3.5F, 6F);

            int i = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, stack);
            if (i > 0) {
                bullet.setpowerDamage(i);
            }
            int k = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PUNCH_ARROWS, stack) + 1;
            if (k > 0) {
                bullet.setknockbacklevel(k);
            }

            world.addFreshEntity(bullet);
        }else {
            RenderRatlingGun.setrotationangle();
        }
        PlayaSound(world, player);
    }

    public void PlayaSound(Level world, Player player){
        world.playSound(null,player.blockPosition(), SoundEvents.GENERIC_EXPLODE, SoundSource.PLAYERS,0.6F,1.55F/(rand.nextFloat()*0.4F+1.2F)+0.5F);
    }

    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment)
    {
        return true;
    }

}

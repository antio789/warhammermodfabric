package warhammermod.Items.ranged;


import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import warhammermod.Entities.Projectile.GrenadeEntity;
import warhammermod.Items.GunBase;



public class GrenadeTemplate extends GunBase {


    public GrenadeTemplate(Properties properties, Item ammotype, int time, int magsize){
        super(properties, ammotype, time, magsize);
    }


    public void fire(Player player, Level world, ItemStack stack){
         if(world.isClientSide()) {
            for (int k = 0; k < 40; ++k) {

                double d2 = this.rand.nextGaussian() * 0.02D;
                double d0 = this.rand.nextGaussian() * 0.02D;
                double d1 = this.rand.nextGaussian() * 0.02D;
                world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, player.getX() + player.getLookAngle().x * 2 + (double) (this.rand.nextFloat() * this.width * 2) - (double) this.width, player.getY() + 0.4 + (double) (this.rand.nextFloat() * this.height), player.getZ() + player.getLookAngle().z * 2 + (double) (this.rand.nextFloat() * this.width * 2) - (double) this.width, d2, d0, d1);
            }
        }
        if(!world.isClientSide()) {
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.GENERIC_EXPLODE, SoundSource.PLAYERS, 1.0F, 1.35F / (rand.nextFloat() * 0.4F + 1.2F) + 0.5F);

            GrenadeEntity bullet = new GrenadeEntity(player, world);


            int i = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, stack);
            bullet.shootFromRotation(player,player.xRot, player.yRot, 0, 0.8F + 0.13F * i, 0.6F);

            int k = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PUNCH_ARROWS, stack) + 1;
            if (k > 0) {
                bullet.setknockbacklevel(k);
            }

            world.addFreshEntity(bullet);

            stack.hurtAndBreak(1, player, (p_220009_1_) -> {
                p_220009_1_.broadcastBreakEvent(player.getUsedItemHand());
            });
        }
    }

    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment)
    {
        for(Enchantment type:types){
            if(type==enchantment)return true;
        }return false;

    }

    private final Enchantment[] types={Enchantments.POWER_ARROWS, Enchantments.PUNCH_ARROWS, Enchantments.UNBREAKING, Enchantments.MENDING};


}

package warhammermod.Items.ranged;


import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import warhammermod.Entities.Projectile.FlameEntity;
import warhammermod.Items.AutogunBase;
import warhammermod.utils.Registry.WHRegistry;


public class DrakeGunTemplate extends AutogunBase {

    public DrakeGunTemplate(Properties properties, int MagSize, int time) {
        //super(properties,MagSize,1,time, Items.BLAZE_ROD.getName().toString(),5);
        super(properties, Items.BLAZE_ROD, time, MagSize,1,4);
    }

    public void fire(Player player, Level world, ItemStack stack){
        world.playSound(null, player.getX(), player.getY(), player.getZ(), WHRegistry.flame, SoundSource.PLAYERS, 0.3F, 1.05F+(rand.nextFloat()+rand.nextFloat())*0.1F);

        if(!world.isClientSide()){
            FlameEntity smallfireballentity = new FlameEntity(world, player, player.getLookAngle().x*5 + rand.nextGaussian() * 0.1, player.getLookAngle().y*5, player.getLookAngle().z*5 + rand.nextGaussian() * 0.1);
            smallfireballentity.setPos(player.getX(), (int)(player.getEyeY()- 0.35F), player.getZ());
            world.addFreshEntity(smallfireballentity);
        }

    }

    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment)
    {
        for(Enchantment type:types){
            if(type==enchantment)return true;
        }return false;

    }
    private final Enchantment[] types={Enchantments.UNBREAKING, Enchantments.MENDING};
}

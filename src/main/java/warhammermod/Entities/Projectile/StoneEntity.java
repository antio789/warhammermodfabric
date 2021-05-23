package warhammermod.Entities.Projectile;



import net.fabricmc.api.EnvType;
import net.fabricmc.api.EnvironmentInterface;
import net.fabricmc.api.EnvironmentInterfaces;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import warhammermod.utils.Registry.Entityinit;


@EnvironmentInterfaces({@EnvironmentInterface(
        value = EnvType.CLIENT,
        itf = ItemSupplier.class
)})
public class StoneEntity extends ProjectileBase implements ItemSupplier{
    public StoneEntity(Level world){
        super(Entityinit.STONEENTITY,world);
    }

    public StoneEntity(EntityType<? extends StoneEntity> p_i50148_1_, Level p_i50148_2_) {
        super(p_i50148_1_, p_i50148_2_);
    }

    public StoneEntity(Level worldin, LivingEntity shooter, float damageIn, EntityType<? extends ProjectileBase> type) {
        super(worldin, shooter,damageIn, type);
    }
    public StoneEntity(Level world, EntityType<? extends ProjectileBase> entity, double x, double y, double z) {
        super( world,entity, x, y, z);
    }

    public StoneEntity(LivingEntity shooter, Level world, float damage) {
        this(world, shooter, damage, Entityinit.STONEENTITY);
    }






    public ItemStack getItem() {
        return new ItemStack(Items.COBBLESTONE);
    }

    public void setTotaldamage(float sum) {
        this.totaldamage = sum;
    }

    protected void onHitEntity(EntityHitResult p_213868_1_) {
        float f = (float)this.getDeltaMovement().length();
        double damageSum = projectiledamage+extradamage;
        int i = Mth.ceil(Mth.clamp((double)f * damageSum, 0.0D, 2.147483647E9D));
        if (this.isCritArrow()) {
            long j = this.random.nextInt(i / 2 + 2);
            i = (int)Math.min(j + (long)i, 2147483647L);
        }
        setTotaldamage(i);
        super.onHitEntity(p_213868_1_);

    }

    @Override
    public float getTotalDamage(){
        return totaldamage;
    }









}

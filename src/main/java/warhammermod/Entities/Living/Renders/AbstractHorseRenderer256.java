package warhammermod.Entities.Living.Renders;


import com.mojang.blaze3d.vertex.PoseStack;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.MobRenderer;
import warhammermod.Entities.Living.PegasusEntity;
import warhammermod.Entities.Living.Renders.Models.HorseModelx;

@Environment(EnvType.CLIENT)
public abstract class AbstractHorseRenderer256<T extends PegasusEntity, M extends HorseModelx<T>> extends MobRenderer<T, M> {
   private final float scale;

   public AbstractHorseRenderer256(EntityRenderDispatcher p_i50975_1_, M p_i50975_2_, float p_i50975_3_) {
      super(p_i50975_1_, p_i50975_2_, 0.75F);
      this.scale = p_i50975_3_;
   }

   protected void scale(T p_225620_1_, PoseStack poseStack, float p_225620_3_) {
      poseStack.scale(this.scale, this.scale, this.scale);
      super.scale(p_225620_1_, poseStack, p_225620_3_);
   }
}
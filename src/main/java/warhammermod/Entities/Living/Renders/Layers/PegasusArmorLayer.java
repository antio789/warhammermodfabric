package warhammermod.Entities.Living.Renders.Layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.HorseModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.item.DyeableHorseArmorItem;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.ItemStack;
import warhammermod.Entities.Living.PegasusEntity;
import warhammermod.Entities.Living.Renders.Models.Pegasusmodel;

@Environment(EnvType.CLIENT)
public class PegasusArmorLayer extends RenderLayer<PegasusEntity, Pegasusmodel<PegasusEntity>> {
   private final Pegasusmodel<PegasusEntity> model = new Pegasusmodel<>(0.1F);

   public PegasusArmorLayer(RenderLayerParent<PegasusEntity, Pegasusmodel<PegasusEntity>> renderLayerParent) {
      super(renderLayerParent);
   }

   public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int i, PegasusEntity horse, float f, float g, float h, float j, float k, float l) {
      ItemStack itemStack = horse.getArmor();
      if (itemStack.getItem() instanceof HorseArmorItem) {
         HorseArmorItem horseArmorItem = (HorseArmorItem)itemStack.getItem();
         (this.getParentModel()).copyPropertiesTo(this.model);
         this.model.prepareMobModel(horse, f, g, h);
         this.model.setupAnim(horse, f, g, j, k, l);
         float q;
         float r;
         float s;
         if (horseArmorItem instanceof DyeableHorseArmorItem) {
            int m = ((DyeableHorseArmorItem)horseArmorItem).getColor(itemStack);
            q = (float)(m >> 16 & 255) / 255.0F;
            r = (float)(m >> 8 & 255) / 255.0F;
            s = (float)(m & 255) / 255.0F;
         } else {
            q = 1.0F;
            r = 1.0F;
            s = 1.0F;
         }

         VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(horseArmorItem.getTexture()));
         this.model.renderToBuffer(poseStack, vertexConsumer, i, OverlayTexture.NO_OVERLAY, q, r, s, 1.0F);
      }
   }
}

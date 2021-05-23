package warhammermod.Entities.Projectile.Render;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import warhammermod.Entities.Projectile.GrenadeEntity;
import warhammermod.Entities.Projectile.Render.Model.model_grenade;
import warhammermod.utils.reference;

@Environment(EnvType.CLIENT)
public class GrenadeRender extends EntityRenderer<GrenadeEntity> {
    private final model_grenade model= new model_grenade();
    private static final ResourceLocation grenade_texture = new ResourceLocation(reference.modid,"textures/entity/grenade.png");

    public GrenadeRender(EntityRenderDispatcher renderManagerIn) {
        super(renderManagerIn);
    }

    public void render(GrenadeEntity p_225623_1_, float p_225623_2_, float p_225623_3_, PoseStack p_225623_4_, MultiBufferSource p_225623_5_, int p_225623_6_) {
        p_225623_4_.pushPose();
        p_225623_4_.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(p_225623_3_, p_225623_1_.yRotO, p_225623_1_.yRot) - 90.0F));
        p_225623_4_.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(p_225623_3_, p_225623_1_.xRotO, p_225623_1_.xRot) + 90.0F));
        VertexConsumer ivertexbuilder = ItemRenderer.getFoilBufferDirect(p_225623_5_, this.model.renderType(grenade_texture), false, false);
        this.model.renderToBuffer(p_225623_4_, ivertexbuilder, p_225623_6_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        p_225623_4_.popPose();
        super.render(p_225623_1_, p_225623_2_, p_225623_3_, p_225623_4_, p_225623_5_, p_225623_6_);
    }

    @Override
    public ResourceLocation getTextureLocation(GrenadeEntity p_110775_1_) {
        return grenade_texture;
    }
}

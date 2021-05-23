package warhammermod.Items.Render;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import warhammermod.Items.Render.Model.repeaterhandgunmodel;


public class RenderRepeater extends BlockEntityWithoutLevelRenderer {
    private static final String resource_location="warhammermod:textures/items/repeater.png";
    static final ResourceLocation TEXTURE = new ResourceLocation(resource_location);
    private final repeaterhandgunmodel model = new repeaterhandgunmodel();
    private static int rotation;


    public void renderByItem(ItemStack p_239207_1_, ItemTransforms.TransformType p_239207_2_, PoseStack p_239207_3_, MultiBufferSource p_239207_4_, int p_239207_5_, int p_239207_6_) {
        p_239207_3_.pushPose();
        p_239207_3_.scale(1.0F, -1.0F, -1.0F);
        this.model.barrel_holder1.zRot=rotation;
        VertexConsumer ivertexbuilder1 = ItemRenderer.getFoilBufferDirect(p_239207_4_, this.model.renderType(TEXTURE), false, p_239207_1_.hasFoil());
        this.model.renderToBuffer(p_239207_3_, ivertexbuilder1, p_239207_5_, p_239207_6_, 1.0F, 1.0F, 1.0F, 1.0F);
        p_239207_3_.popPose();
    }

    public static void setrotationangle(){
        if(rotation==300){
            rotation=0;
        }else rotation+=60;
    }
}

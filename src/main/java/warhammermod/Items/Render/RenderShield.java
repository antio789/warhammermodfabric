package warhammermod.Items.Render;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import warhammermod.utils.reference;

public class RenderShield extends BlockEntityWithoutLevelRenderer {
    private final ResourceLocation SHIELD_TEXTURE;

    private final Model modelShield;

    public RenderShield(String pathin, Model modelin){
        SHIELD_TEXTURE = new ResourceLocation(reference.modid,pathin);
        modelShield=modelin;
    }


    public void renderByItem(ItemStack p_239207_1_, ItemTransforms.TransformType p_239207_2_, PoseStack p_239207_3_, MultiBufferSource p_239207_4_, int p_239207_5_, int p_239207_6_) {
        p_239207_3_.pushPose();
        p_239207_3_.scale(1.0F, -1.0F, -1.0F);
        VertexConsumer ivertexbuilder1 = ItemRenderer.getFoilBufferDirect(p_239207_4_, this.modelShield.renderType(SHIELD_TEXTURE), false, p_239207_1_.hasFoil());
        this.modelShield.renderToBuffer(p_239207_3_, ivertexbuilder1, p_239207_5_, p_239207_6_, 1.0F, 1.0F, 1.0F, 1.0F);
        p_239207_3_.popPose();
    }


}

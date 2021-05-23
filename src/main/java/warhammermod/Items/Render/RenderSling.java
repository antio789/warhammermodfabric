package warhammermod.Items.Render;



import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import warhammermod.Items.Render.Model.ModelSling;
import warhammermod.Items.ranged.SlingTemplate;
import warhammermod.utils.reference;

public class RenderSling extends BlockEntityWithoutLevelRenderer {

    private static final ResourceLocation resource_location=new ResourceLocation(reference.modid,"textures/items/sling.png");
    private final ModelSling model = new ModelSling();


    public void renderByItem(ItemStack stack, ItemTransforms.TransformType p_239207_2_, PoseStack p_239207_3_, MultiBufferSource p_239207_4_, int p_239207_5_, int p_239207_6_) {
        SlingTemplate item = (SlingTemplate) stack.getItem();
        p_239207_3_.pushPose();
        p_239207_3_.scale(1.0F, -1.0F, -1.0F);
        Boolean used = Minecraft.getInstance().player.getUseItem()==stack;
        VertexConsumer ivertexbuilder1 = ItemRenderer.getFoilBufferDirect(p_239207_4_, this.model.renderType(resource_location), false, stack.hasFoil());
        this.model.render(p_239207_3_, ivertexbuilder1, p_239207_5_, p_239207_6_, 1.0F, 1.0F, 1.0F, 1.0F,item,used);
        p_239207_3_.popPose();
    }




}

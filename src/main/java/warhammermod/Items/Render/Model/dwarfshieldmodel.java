package warhammermod.Items.Render.Model;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.RenderType;

public class dwarfshieldmodel extends Model {
    public ModelPart plate1;
    public ModelPart plate2;
    public ModelPart plate3;
    public ModelPart plate4;
    public ModelPart plate5;
    public ModelPart plate6;
    public ModelPart plate7;
    public ModelPart plate8;
    public ModelPart plate9;
    public ModelPart handle;

    public dwarfshieldmodel(){
        super(RenderType::entitySolid);
        this.texWidth = 64;
        this.texHeight = 64;
        this.plate1 = new ModelPart(this,0,0);
        this.plate1.addBox(-3F,-11F,-2.0F,6,1,1,0.0F);
        this.plate2 = new ModelPart(this,0,2);
        this.plate2.addBox(-5F,-10F,-2.0F,10,1,1,0.0F);
        this.plate3 = new ModelPart(this,0,4);
        this.plate3.addBox(-6F,-9F,-2.0F,12,1,1,0.0F);
        this.plate4 = new ModelPart(this,0,6);
        this.plate4.addBox(-7F,-8F,-2.0F,14,2,1,0.0F);
        this.plate5 = new ModelPart(this,0,9);
        this.plate5.addBox(-8F,-6F,-2.0F,16,6,1,0.0F);
        this.plate6 = new ModelPart(this,0,16);
        this.plate6.addBox(-7F,0F,-2.0F,14,2,1,0.0F);
        this.plate7 = new ModelPart(this,0,19);
        this.plate7.addBox(-6F,2F,-2.0F,12,1,1,0.0F);
        this.plate8 = new ModelPart(this,0,21);
        this.plate8.addBox(-5F,3F,-2.0F,10,1,1,0.0F);
        this.plate9 = new ModelPart(this,0,23);
        this.plate9.addBox(-3F,4F,-2.0F,6,1,1,0.0F);
        this.handle = new ModelPart(this, 48, 0);
        this.handle.addBox(-1.0F, -4.0F, -1.0F, 2, 6, 6, 0.0F);
    }


    public void renderToBuffer(PoseStack p_225598_1_, VertexConsumer p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
        this.plate1.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.plate2.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.plate3.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.plate4.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.plate5.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.plate6.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.plate7.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.plate8.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.plate9.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.handle.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
    }

}

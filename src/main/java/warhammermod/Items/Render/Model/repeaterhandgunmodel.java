package warhammermod.Items.Render.Model;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.RenderType;

/**
 * nuln repeater handgun.json - Undefined
 * Created using Tabula 7.0.1
 */
public class repeaterhandgunmodel extends Model {
    public ModelPart stock1;
    public ModelPart handle1;
    public ModelPart handle2;
    public ModelPart stockbase;
    public ModelPart flint;
    public ModelPart stock;
    public ModelPart barrel_holder1;
    public ModelPart barrel1;
    public ModelPart barrel_holder2;
    public ModelPart barrel4;
    public ModelPart barrel2;
    public ModelPart barrel3;
    public ModelPart barrel5;
    public ModelPart barrel6;


    public repeaterhandgunmodel() {
        super(RenderType::entitySolid);
        this.texWidth = 64;
        this.texHeight = 32;
        this.barrel6 = new ModelPart(this, 0, 0);
        this.barrel6.setPos(1.2F, -0.7F, -3F);
        this.barrel6.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F);
        this.setRotateAngle(barrel6, 0.0F, 0.0F, -0.5235987755982988F);
        this.handle2 = new ModelPart(this, 0, 25);
        this.handle2.setPos(0.0F, -1.0F, 1.0F);
        this.handle2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.barrel_holder1 = new ModelPart(this, 35, 25);
        this.barrel_holder1.setPos(0.5F, -2.0F, 8.0F);
        this.barrel_holder1.addBox(-2, -2F, 0.0F, 4, 4, 1, 0.0F);
        this.handle1 = new ModelPart(this, 0, 22);
        this.handle1.setPos(0.0F, 0.0F, 0.0F);
        this.handle1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        this.stockbase = new ModelPart(this, 0, 25);
        this.stockbase.setPos(0.0F, -1.0F, 2.0F);
        this.stockbase.addBox(-1.0F, -2.0F, 0.0F, 3, 3, 1, 0.0F);
        this.stock1 = new ModelPart(this, 0, 25);
        this.stock1.setPos(0.0F, 0.0F, -2.0F);
        this.stock1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.barrel2 = new ModelPart(this, 0, 0);
        this.barrel2.setPos(-1.2F, -0.7F, -3F);
        this.barrel2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F);
        this.setRotateAngle(barrel2, 0.0F, 0.0F, 0.5235987755982988F);
        this.barrel1 = new ModelPart(this, 0, 0);
        this.barrel1.setPos(-0.5F, -1.9F, -3F);
        this.barrel1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.barrel5 = new ModelPart(this, 0, 0);
        this.barrel5.setPos(1.2F, 0.7F, -3F);
        this.barrel5.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F);
        this.setRotateAngle(barrel5, 0.0F, 0.0F, 0.5235987755982988F);
        this.barrel_holder2 = new ModelPart(this, 35, 25);
        this.barrel_holder2.setPos(-0.5F, -2F, 4.0F);
        this.barrel_holder2.addBox(-1.5F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.barrel4 = new ModelPart(this, 0, 0);
        this.barrel4.setPos(-0.5F, 0.9F, -3F);
        this.barrel4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.barrel3 = new ModelPart(this, 0, 0);
        this.barrel3.setPos(-1.2F, 0.7F, -3F);
        this.barrel3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F);
        this.setRotateAngle(barrel3, 0.0F, 0.0F, -0.5235987755982988F);
        this.flint = new ModelPart(this, 57, 20);
        this.flint.setPos(0.0F, -4.0F, 2.0F);
        this.flint.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.stock = new ModelPart(this, 45, 0);
        this.stock.setPos(0.0F, -4.0F, 3.0F);
        this.stock.addBox(-1.5F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        barrel_holder1.addChild(barrel1);
        barrel_holder1.addChild(barrel2);
        barrel_holder1.addChild(barrel3);
        barrel_holder1.addChild(barrel4);
        barrel_holder1.addChild(barrel5);
        barrel_holder1.addChild(barrel6);
        barrel_holder1.addChild(barrel_holder2);

    }

    public void renderToBuffer(PoseStack p_225598_1_, VertexConsumer p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
        this.stock.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.stock1.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.barrel_holder1.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.flint.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.handle1.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.handle2.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.stockbase.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
    }



    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}

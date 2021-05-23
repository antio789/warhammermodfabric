package warhammermod.Items.Render.Model;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.RenderType;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.0.1
 */
public class RatlingGunModel extends Model {
    public ModelPart core1;
    public ModelPart recipient;
    public ModelPart cannon1;
    public ModelPart cannon6;
    public ModelPart cannon2;
    public ModelPart cannon4;
    public ModelPart cannon5;
    public ModelPart cannon3;
    public ModelPart cannonback;
    public ModelPart core2;
    public ModelPart core3;
    public ModelPart tube2;
    public ModelPart tube1;
    public ModelPart handle1;
    public ModelPart handle2;
    public ModelPart handlebar;
    public ModelPart cannonfront;
    public ModelPart container;
    public ModelPart tube3;
    public ModelPart tube4;
    public ModelPart tube5;
    public ModelPart handleback;

    public RatlingGunModel() {
        super(RenderType::entitySolid);
        this.texWidth = 64;
        this.texHeight = 64;
        this.handle2 = new ModelPart(this,0, 50);
        this.handle2.setPos(-1.5F, 7.5F, -13.5F);
        this.handle2.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.cannon2 = new ModelPart(this, 35, 0);
        this.cannon2.setPos(1.4F, -0.9F, -8.0F);
        this.cannon2.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 13, 0.1F);
        this.setRotateAngle(cannon2, 0.0F, 0.0F, -0.5235987755982988F);
        this.cannon1 = new ModelPart(this, 35, 0);
        this.cannon1.setPos(0.0F, -1.7F, -8.0F);
        this.cannon1.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 13, 0.1F);
        this.cannonback = new ModelPart(this, 45, 16);
        this.cannonback.setPos(0.0F, 10.8F, -15.0F);
        this.cannonback.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 1, 0.3F);
        this.handlebar = new ModelPart(this, 0, 50);
        this.handlebar.setPos(0.0F, 5.5F, -14.0F);
        this.handlebar.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.core2 = new ModelPart(this, 0, 12);
        this.core2.setPos(0.5F, 10.0F, -12.0F);
        this.core2.addBox(-2.5F, -2.5F, -2.0F, 4, 5, 1, 0.0F);
        this.core1 = new ModelPart(this, 0, 0);
        this.core1.setPos(0.0F, 10.0F, -5.0F);
        this.core1.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 6, 0.0F);
        this.tube2 = new ModelPart(this, 25, 37);
        this.tube2.setPos(-0.5F, 7.5F, -13.0F);
        this.tube2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.tube1 = new ModelPart(this, 25, 35);
        this.tube1.setPos(-0.5F, 8.5F, -10.0F);
        this.tube1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cannon4 = new ModelPart(this, 35, 0);
        this.cannon4.setPos(0.0F, 1.5F, -8.0F);
        this.cannon4.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 13, 0.1F);
        this.cannon5 = new ModelPart(this, 35, 0);
        this.cannon5.setPos(-1.4F, 0.7F, -8.0F);
        this.cannon5.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 13, 0.1F);
        this.setRotateAngle(cannon5, 0.0F, 0.0F, -0.5235987755982988F);
        this.core3 = new ModelPart(this, 0, 19);
        this.core3.setPos(0.0F, 10.2F, -12.0F);
        this.core3.addBox(-1.5F, -1.5F, -1.0F, 3, 4, 2, 0.0F);
        this.cannon3 = new ModelPart(this, 35, 0);
        this.cannon3.setPos(1.4F, 0.7F, -8.0F);
        this.cannon3.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 13, 0.1F);
        this.setRotateAngle(cannon3, 0.0F, 0.0F, 0.5235987755982988F);
        this.tube4 = new ModelPart(this, 25, 35);
        this.tube4.setPos(-3.7F, 10.4F, -5.0F);
        this.tube4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.2F);
        this.tube5 = new ModelPart(this, 25, 35);
        this.tube5.setPos(-3.7F, 10.4F, 0.0F);
        this.tube5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.2F);
        this.handle1 = new ModelPart(this, 0, 50);
        this.handle1.setPos(1.5F, 7.5F, -13.5F);
        this.handle1.addBox(-0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F);
        this.container = new ModelPart(this, 0, 35);
        this.container.setPos(0.0F, 14.0F, 0.5F);
        this.container.addBox(-2.5F, -4.0F, -2.5F, 5, 8, 5, 0.0F);
        this.recipient = new ModelPart(this, 0, 26);
        this.recipient.setPos(0.0F, 12.0F, -9.5F);
        this.recipient.addBox(-1.5F, -2.5F, -1.5F, 3, 5, 3, 0.0F);
        this.cannonfront = new ModelPart(this, 45, 16);
        this.cannonfront.setPos(0.0F, -0.1F, -10.0F);
        this.cannonfront.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 1, 0.3F);
        this.tube3 = new ModelPart(this, 23, 45);
        this.tube3.setPos(-5.1F, 10.4F, -3.0F);
        this.tube3.addBox(0.0F, 0.0F, -2.0F, 1, 1, 6, 0.2F);
        this.cannon6 = new ModelPart(this, 35, 0);
        this.cannon6.setPos(-1.4F, -0.9F, -8.0F);
        this.cannon6.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 13, 0.1F);
        this.setRotateAngle(cannon6, 0.0F, 0.0F, 0.5235987755982988F);
        this.handleback=new ModelPart(this,14,12);
        this.handleback.setPos(-1,13,3);
        this.handleback.addBox(0,0,0,2,2,4,0);
        this.cannonback.addChild(cannon1);
        this.cannonback.addChild(cannon2);
        this.cannonback.addChild(cannon3);
        this.cannonback.addChild(cannon4);
        this.cannonback.addChild(cannon5);
        this.cannonback.addChild(cannon6);
        this.cannonback.addChild(cannonfront);
    }

    public void renderToBuffer(PoseStack p_225598_1_, VertexConsumer p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {

        this.cannonback.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.core1.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.core2.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.core3.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.recipient.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.tube1.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.tube2.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.tube3.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.tube4.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.tube5.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.container.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.handle1.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.handle2.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.handleback.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.handlebar.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
    }
    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    private void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}

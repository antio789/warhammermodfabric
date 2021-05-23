package warhammermod.Entities.Projectile.Render.Model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.Entity;

@Environment(EnvType.CLIENT)
public class grapeshotModel<T extends Entity> extends Model {
    public ModelPart bullet;
    public ModelPart bullet1;
    public ModelPart bullet2;
    public ModelPart bullet3;
    public ModelPart bullet4;
    public ModelPart bullet5;

    public grapeshotModel(int yoff) {
        super(RenderType::entitySolid);
        this.texWidth = 64;
        this.texHeight = 32;
        this.bullet = new ModelPart(this);
        this.bullet1 = new ModelPart(this);
        this.bullet2 = new ModelPart(this);
        this.bullet3 = new ModelPart(this);
        this.bullet4 = new ModelPart(this);
        this.bullet5 = new ModelPart(this);
        this.bullet.texOffs(0,yoff).setPos(0.0F, 0.0F, 0.0F);
        this.bullet1.texOffs(0,yoff).setPos(0.0F, 0.0F, 0.0F);
        this.bullet2.texOffs(0,yoff).setPos(0.0F, 0.0F, 0.0F);
        this.bullet3.texOffs(0,yoff).setPos(0.0F, 0.0F, 0.0F);
        this.bullet4.texOffs(0,yoff).setPos(0.0F, 0.0F, 0.0F);
        this.bullet5.texOffs(0,yoff).setPos(0.0F, 0.0F, 0.0F);
        this.bullet1.addBox(0F, 0F, 0F, 1, 1, 1, 0.1F);
        this.bullet2.addBox(-1.0F, -1.0F, -1.0F, 1, 1, 1, 0.1F);
        this.bullet3.addBox(0.5F, 1F, -2F, 1, 1, 1, 0.1F);
        this.bullet4.addBox(1.5F, -1F, 1F, 1, 1, 1, 0.1F);
        this.bullet5.addBox(-1.5F, 1F, -1.5F, 1, 1, 1, 0.1F);
        this.bullet.addBox(2F, 0.5F, 0F, 1, 1, 1, 0.1F);
    }


    public void setRotationAngles(T p_225597_1_, float partialticks, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
System.out.println(p_225597_1_.tickCount);
        bullet.x=p_225597_1_.tickCount*3F +2;
        bullet2.y=-p_225597_1_.tickCount*3F -1;
        bullet3.z=-p_225597_1_.tickCount*3F -2;
        bullet4.x=p_225597_1_.tickCount*3F +1.5F;
        bullet5.z=-p_225597_1_.tickCount*3F -1.5F;
    }

    public Iterable<ModelPart> getParts() {
        return ImmutableList.of(this.bullet,bullet1,bullet2,bullet3,bullet4,bullet5);
    }

    public void renderToBuffer(PoseStack p_225598_1_, VertexConsumer p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
        this.bullet.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.bullet1.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.bullet2.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.bullet3.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.bullet5.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.bullet4.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
    }


}

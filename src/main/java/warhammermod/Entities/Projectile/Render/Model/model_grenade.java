package warhammermod.Entities.Projectile.Render.Model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.Entity;

public class model_grenade<T extends Entity> extends Model {
    public ModelPart grenadepart1;
    public ModelPart grenadetop;

    public model_grenade() {
        super(RenderType::entitySolid);
        this.texWidth = 64;
        this.texHeight = 32;
        this.grenadepart1 = new ModelPart(this, 3, 0);
        this.grenadepart1.setPos(0.0F, 0.0F, 0.0F);
        this.grenadepart1.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.grenadetop = new ModelPart(this, 0, 0);
        this.grenadetop.setPos(0.0F, 0.0F, 0.0F);
        this.grenadetop.addBox(-0.5F, 1.5F, -0.5F, 1, 1, 1, 0.0F);
    }

    public void renderToBuffer(PoseStack p_225598_1_, VertexConsumer p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
        this.grenadetop.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
        this.grenadepart1.render(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);
    }


}

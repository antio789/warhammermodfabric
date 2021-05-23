package warhammermod.Entities.Living.Renders.Models;

import com.google.common.collect.ImmutableList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.AgeableListModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.horse.AbstractHorse;

@Environment(EnvType.CLIENT)
public class HorseModelx<T extends AbstractHorse> extends AgeableListModel<T> {
   protected final ModelPart body;
   protected final ModelPart headParts;
   private final ModelPart leg1;
   private final ModelPart leg2;
   private final ModelPart leg3;
   private final ModelPart leg4;
   private final ModelPart babyLeg1;
   private final ModelPart babyLeg2;
   private final ModelPart babyLeg3;
   private final ModelPart babyLeg4;
   private final ModelPart tail;
   private final ModelPart[] saddleParts;
   private final ModelPart[] ridingParts;

   public HorseModelx(float f) {
      super(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F);
      this.texWidth = 128;
      this.texHeight = 128;
      this.body = new ModelPart(this, 0, 32);
      this.body.addBox(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, 0.05F);
      this.body.setPos(0.0F, 11.0F, 5.0F);
      this.headParts = new ModelPart(this, 0, 35);
      this.headParts.addBox(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F);
      this.headParts.xRot = 0.5235988F;
      ModelPart modelPart = new ModelPart(this, 0, 13);
      modelPart.addBox(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, f);
      ModelPart modelPart2 = new ModelPart(this, 56, 36);
      modelPart2.addBox(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, f);
      ModelPart modelPart3 = new ModelPart(this, 0, 25);
      modelPart3.addBox(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, f);
      this.headParts.addChild(modelPart);
      this.headParts.addChild(modelPart2);
      this.headParts.addChild(modelPart3);
      this.addEarModels(this.headParts);
      this.leg1 = new ModelPart(this, 48, 21);
      this.leg1.mirror = true;
      this.leg1.addBox(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, f);
      this.leg1.setPos(4.0F, 14.0F, 7.0F);
      this.leg2 = new ModelPart(this, 48, 21);
      this.leg2.addBox(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, f);
      this.leg2.setPos(-4.0F, 14.0F, 7.0F);
      this.leg3 = new ModelPart(this, 48, 21);
      this.leg3.mirror = true;
      this.leg3.addBox(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, f);
      this.leg3.setPos(4.0F, 6.0F, -12.0F);
      this.leg4 = new ModelPart(this, 48, 21);
      this.leg4.addBox(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, f);
      this.leg4.setPos(-4.0F, 6.0F, -12.0F);
      float g = 5.5F;
      this.babyLeg1 = new ModelPart(this, 48, 21);
      this.babyLeg1.mirror = true;
      this.babyLeg1.addBox(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, f, f + 5.5F, f);
      this.babyLeg1.setPos(4.0F, 14.0F, 7.0F);
      this.babyLeg2 = new ModelPart(this, 48, 21);
      this.babyLeg2.addBox(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, f, f + 5.5F, f);
      this.babyLeg2.setPos(-4.0F, 14.0F, 7.0F);
      this.babyLeg3 = new ModelPart(this, 48, 21);
      this.babyLeg3.mirror = true;
      this.babyLeg3.addBox(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, f, f + 5.5F, f);
      this.babyLeg3.setPos(4.0F, 6.0F, -12.0F);
      this.babyLeg4 = new ModelPart(this, 48, 21);
      this.babyLeg4.addBox(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, f, f + 5.5F, f);
      this.babyLeg4.setPos(-4.0F, 6.0F, -12.0F);
      this.tail = new ModelPart(this, 42, 36);
      this.tail.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, f);
      this.tail.setPos(0.0F, -5.0F, 2.0F);
      this.tail.xRot = 0.5235988F;
      this.body.addChild(this.tail);
      ModelPart modelPart4 = new ModelPart(this, 26, 0);
      modelPart4.addBox(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, 0.5F);
      this.body.addChild(modelPart4);
      ModelPart modelPart5 = new ModelPart(this, 29, 5);
      modelPart5.addBox(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, f);
      this.headParts.addChild(modelPart5);
      ModelPart modelPart6 = new ModelPart(this, 29, 5);
      modelPart6.addBox(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, f);
      this.headParts.addChild(modelPart6);
      ModelPart modelPart7 = new ModelPart(this, 32, 2);
      modelPart7.addBox(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, f);
      modelPart7.xRot = -0.5235988F;
      this.headParts.addChild(modelPart7);
      ModelPart modelPart8 = new ModelPart(this, 32, 2);
      modelPart8.addBox(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, f);
      modelPart8.xRot = -0.5235988F;
      this.headParts.addChild(modelPart8);
      ModelPart modelPart9 = new ModelPart(this, 1, 1);
      modelPart9.addBox(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, 0.2F);
      this.headParts.addChild(modelPart9);
      ModelPart modelPart10 = new ModelPart(this, 19, 0);
      modelPart10.addBox(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, 0.2F);
      this.headParts.addChild(modelPart10);
      this.saddleParts = new ModelPart[]{modelPart4, modelPart5, modelPart6, modelPart9, modelPart10};
      this.ridingParts = new ModelPart[]{modelPart7, modelPart8};
   }

   protected void addEarModels(ModelPart modelPart) {
      ModelPart modelPart2 = new ModelPart(this, 19, 16);
      modelPart2.addBox(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, -0.001F);
      ModelPart modelPart3 = new ModelPart(this, 19, 16);
      modelPart3.addBox(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, -0.001F);
      modelPart.addChild(modelPart2);
      modelPart.addChild(modelPart3);
   }

   public void setupAnim(T abstractHorse, float f, float g, float h, float i, float j) {
      boolean bl = abstractHorse.isSaddled();
      boolean bl2 = abstractHorse.isVehicle();
      ModelPart[] var9 = this.saddleParts;
      int var10 = var9.length;

      int var11;
      ModelPart modelPart2;
      for(var11 = 0; var11 < var10; ++var11) {
         modelPart2 = var9[var11];
         modelPart2.visible = bl;
      }

      var9 = this.ridingParts;
      var10 = var9.length;

      for(var11 = 0; var11 < var10; ++var11) {
         modelPart2 = var9[var11];
         modelPart2.visible = bl2 && bl;
      }

      this.body.y = 11.0F;
   }

   public Iterable<ModelPart> headParts() {
      return ImmutableList.of(this.headParts);
   }

   protected Iterable<ModelPart> bodyParts() {
      return ImmutableList.of(this.body, this.leg1, this.leg2, this.leg3, this.leg4, this.babyLeg1, this.babyLeg2, this.babyLeg3, this.babyLeg4);
   }

   public void prepareMobModel(T abstractHorse, float f, float g, float h) {
      super.prepareMobModel(abstractHorse, f, g, h);
      float i = Mth.rotlerp(abstractHorse.yBodyRotO, abstractHorse.yBodyRot, h);
      float j = Mth.rotlerp(abstractHorse.yHeadRotO, abstractHorse.yHeadRot, h);
      float k = Mth.lerp(h, abstractHorse.xRotO, abstractHorse.xRot);
      float l = j - i;
      float m = k * 0.017453292F;
      if (l > 20.0F) {
         l = 20.0F;
      }

      if (l < -20.0F) {
         l = -20.0F;
      }

      if (g > 0.2F) {
         m += Mth.cos(f * 0.4F) * 0.15F * g;
      }

      float n = abstractHorse.getEatAnim(h);
      float o = abstractHorse.getStandAnim(h);
      float p = 1.0F - o;
      float q = abstractHorse.getMouthAnim(h);
      boolean bl = abstractHorse.tailCounter != 0;
      float r = (float)abstractHorse.tickCount + h;
      this.headParts.y = 4.0F;
      this.headParts.z = -12.0F;
      this.body.xRot = 0.0F;
      this.headParts.xRot = 0.5235988F + m;
      this.headParts.yRot = l * 0.017453292F;
      float s = abstractHorse.isInWater() ? 0.2F : 1.0F;
      float t = Mth.cos(s * f * 0.6662F + 3.1415927F);
      float u = t * 0.8F * g;
      float v = (1.0F - Math.max(o, n)) * (0.5235988F + m + q * Mth.sin(r) * 0.05F);
      this.headParts.xRot = o * (0.2617994F + m) + n * (2.1816616F + Mth.sin(r) * 0.05F) + v;
      this.headParts.yRot = o * l * 0.017453292F + (1.0F - Math.max(o, n)) * this.headParts.yRot;
      this.headParts.y = o * -4.0F + n * 11.0F + (1.0F - Math.max(o, n)) * this.headParts.y;
      this.headParts.z = o * -4.0F + n * -12.0F + (1.0F - Math.max(o, n)) * this.headParts.z;
      this.body.xRot = o * -0.7853982F + p * this.body.xRot;
      float w = 0.2617994F * o;
      float x = Mth.cos(r * 0.6F + 3.1415927F);
      this.leg3.y = 2.0F * o + 14.0F * p;
      this.leg3.z = -6.0F * o - 10.0F * p;
      this.leg4.y = this.leg3.y;
      this.leg4.z = this.leg3.z;
      float y = (-1.0471976F + x) * o + u * p;
      float z = (-1.0471976F - x) * o - u * p;
      this.leg1.xRot = w - t * 0.5F * g * p;
      this.leg2.xRot = w + t * 0.5F * g * p;
      this.leg3.xRot = y;
      this.leg4.xRot = z;
      this.tail.xRot = 0.5235988F + g * 0.75F;
      this.tail.y = -5.0F + g;
      this.tail.z = 2.0F + g * 2.0F;
      if (bl) {
         this.tail.yRot = Mth.cos(r * 0.7F);
      } else {
         this.tail.yRot = 0.0F;
      }

      this.babyLeg1.y = this.leg1.y;
      this.babyLeg1.z = this.leg1.z;
      this.babyLeg1.xRot = this.leg1.xRot;
      this.babyLeg2.y = this.leg2.y;
      this.babyLeg2.z = this.leg2.z;
      this.babyLeg2.xRot = this.leg2.xRot;
      this.babyLeg3.y = this.leg3.y;
      this.babyLeg3.z = this.leg3.z;
      this.babyLeg3.xRot = this.leg3.xRot;
      this.babyLeg4.y = this.leg4.y;
      this.babyLeg4.z = this.leg4.z;
      this.babyLeg4.xRot = this.leg4.xRot;
      boolean bl2 = abstractHorse.isBaby();
      this.leg1.visible = !bl2;
      this.leg2.visible = !bl2;
      this.leg3.visible = !bl2;
      this.leg4.visible = !bl2;
      this.babyLeg1.visible = bl2;
      this.babyLeg2.visible = bl2;
      this.babyLeg3.visible = bl2;
      this.babyLeg4.visible = bl2;
      this.body.y = bl2 ? 10.8F : 0.0F;
   }
}

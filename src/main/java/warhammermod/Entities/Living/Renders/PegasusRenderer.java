package warhammermod.Entities.Living.Renders;

import com.google.common.collect.Maps;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.Util;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Variant;
import warhammermod.Entities.Living.PegasusEntity;
import warhammermod.Entities.Living.Renders.Models.Pegasusmodel;
import warhammermod.utils.reference;
import warhammermod.Entities.Living.Renders.Layers.*;

import java.util.Map;

@Environment(EnvType.CLIENT)
public final class PegasusRenderer extends AbstractHorseRenderer256<PegasusEntity, Pegasusmodel<PegasusEntity>> {
   private static final Map<Variant, ResourceLocation> COAT_COLORS_RESOURCE_LOCATION_MAP = Util.make(Maps.newEnumMap(Variant.class), (p_239384_0_) -> {
      p_239384_0_.put(Variant.WHITE, new ResourceLocation(reference.modid,"textures/entity/pegasus/pegasus_white.png"));
      p_239384_0_.put(Variant.CREAMY, new ResourceLocation(reference.modid,"textures/entity/pegasus/pegasus_creamy.png"));
      p_239384_0_.put(Variant.CHESTNUT, new ResourceLocation(reference.modid,"textures/entity/pegasus/pegasus_chestnut.png"));
      p_239384_0_.put(Variant.BROWN, new ResourceLocation(reference.modid,"textures/entity/pegasus/pegasus_brown.png"));
      p_239384_0_.put(Variant.BLACK, new ResourceLocation(reference.modid,"textures/entity/pegasus/pegasus_black.png"));
      p_239384_0_.put(Variant.GRAY, new ResourceLocation(reference.modid,"textures/entity/pegasus/pegasus_gray.png"));
      p_239384_0_.put(Variant.DARKBROWN, new ResourceLocation(reference.modid,"textures/entity/pegasus/pegasus_darkbrown.png"));
   });


   private static final ResourceLocation PEGASUS_TEXTURE = new ResourceLocation(reference.modid,"textures/entity/pegasus.png");

   public PegasusRenderer(EntityRenderDispatcher renderManagerIn) {
      super(renderManagerIn, new Pegasusmodel<>(0.0F), 1.1F);
      this.addLayer( new PegasusArmorLayer(this));
      this.addLayer(new PegasusMarkingsLayer(this));
   }

   public ResourceLocation getTextureLocation(PegasusEntity entity)
   {

      if(entity.ismixblood()) {
         return COAT_COLORS_RESOURCE_LOCATION_MAP.get(entity.getVariant());
      }
      return PEGASUS_TEXTURE;
   }
}
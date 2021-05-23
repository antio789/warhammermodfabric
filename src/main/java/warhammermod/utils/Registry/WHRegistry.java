package warhammermod.utils.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.animal.horse.Horse;
import warhammermod.Entities.Living.PegasusEntity;
import warhammermod.utils.reference;

public class WHRegistry {
    public static void registerattributes(){
        FabricDefaultAttributeRegistry.register(Entityinit.Pegasus, Horse.createBaseHorseAttributes());
    }

    public static SoundEvent flame;
    public static void registersounds(){
        Registry.register(Registry.SOUND_EVENT,new ResourceLocation(reference.modid,"entity.skaven.ambient"),flame);
    }

}

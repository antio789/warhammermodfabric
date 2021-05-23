package warhammermod.utils;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class reference {
    public static final String modid = "warhammermod";

    public static final CreativeModeTab warhammer = FabricItemGroupBuilder.build(new ResourceLocation(reference.modid,"warhammer"),()-> new ItemStack(Items.SWEET_BERRIES));



}

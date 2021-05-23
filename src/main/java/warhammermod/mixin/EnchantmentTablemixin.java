package warhammermod.mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import warhammermod.Items.WHEnchantmentsHelper;
import warhammermod.Items.WHCustomenchantements;

import java.util.List;

@Mixin(EnchantmentHelper.class)
public class EnchantmentTablemixin {
    @Inject(at = @At("RETURN"), method = "getAvailableEnchantmentResults", cancellable = true)
    private static void selectEnchantment(int i, ItemStack itemStack, boolean bl, CallbackInfoReturnable<List<EnchantmentInstance>> cir) {
        if(itemStack.getItem() instanceof WHCustomenchantements){
            WHCustomenchantements item = (WHCustomenchantements)itemStack.getItem();
            List<EnchantmentInstance> list =  WHEnchantmentsHelper.getAvailableEnchantmentResults(i,item,bl);
            cir.setReturnValue(list);
        }
    }
}

/*
@Mixin(TitleScreen.class)
public class EnchantmentTablemixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo ci) {
        System.out.println("This line is printed by an example mod mixin!");
    }
}
*/

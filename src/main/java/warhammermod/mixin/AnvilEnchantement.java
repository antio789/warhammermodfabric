package warhammermod.mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import warhammermod.Items.WHCustomenchantements;

@Mixin(Enchantment.class)
public class AnvilEnchantement {
    @Shadow @Nullable protected String descriptionId;

    @Shadow @Final public EnchantmentCategory category;

    @Inject(at = @At("RETURN"), method = "canEnchant", cancellable = true)
    private void selectEnchantment(ItemStack stack, CallbackInfoReturnable<Boolean> cis){
        System.out.println(this.descriptionId);
        if(stack.getItem() instanceof WHCustomenchantements){
            Boolean canEnchant = ((WHCustomenchantements) stack.getItem()).isCorrectEnchantement(this.category);
            cis.setReturnValue(canEnchant);
        }
    }
}

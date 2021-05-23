package warhammermod.Items;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import warhammermod.mixin.AnvilEnchantement;

public interface WHCustomenchantements {
    Boolean isCorrectEnchantement( Enchantment enchantment);
    Boolean isCorrectEnchantement( EnchantmentCategory enchantment);

}

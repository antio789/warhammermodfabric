package warhammermod.Items;

import com.google.common.collect.Lists;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentInstance;


import java.util.Iterator;
import java.util.List;

public class WHEnchantmentsHelper {


    public static List<EnchantmentInstance> getAvailableEnchantmentResults(int i, WHCustomenchantements item, boolean bl) {
        List<EnchantmentInstance> list = Lists.newArrayList();
        Iterator var6 = Registry.ENCHANTMENT.iterator();

        while(true) {
            while(true) {
                Enchantment enchantment;
                do {
                    do {
                        do {
                            if (!var6.hasNext()) {
                                return list;
                            }

                            enchantment = (Enchantment)var6.next();
                        } while(enchantment.isTreasureOnly() && !bl);
                    } while(!enchantment.isDiscoverable());
                } while(!item.isCorrectEnchantement(enchantment));

                for(int j = enchantment.getMaxLevel(); j > enchantment.getMinLevel() - 1; --j) {
                    if (i >= enchantment.getMinCost(j) && i <= enchantment.getMaxCost(j)) {
                        list.add(new EnchantmentInstance(enchantment, j));
                        break;
                    }
                }
            }
        }
    }


}

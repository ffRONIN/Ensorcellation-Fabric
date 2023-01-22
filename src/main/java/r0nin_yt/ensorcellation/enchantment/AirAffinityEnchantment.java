package r0nin_yt.ensorcellation.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
//import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class AirAffinityEnchantment extends Enchantment {

    public AirAffinityEnchantment() {

        super(Rarity.RARE, EnchantmentCategory.ARMOR_HEAD, new EquipmentSlot[]{EquipmentSlot.HEAD});
    }

    @Override
    public int getMinCost(int level) {

        return 1;
    }

    @Override
    protected int maxDelegate(int level) {

        return getMinCost(level) + 40;
    }

}

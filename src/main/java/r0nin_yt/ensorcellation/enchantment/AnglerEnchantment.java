package r0nin_yt.ensorcellation.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;

public class AnglerEnchantment extends Enchantment {

    public static int chance = 50;

    public AnglerEnchantment() {

        super(Rarity.VERY_RARE, EnchantmentCategory.FISHING_ROD, new EquipmentSlot[]{EquipmentSlot.MAINHAND});


    }

    @Override
    public int getMinCost(int level) {

        return 10 + (level - 1) * 9;
    }

    @Override
    protected int maxDelegate(int level) {

        return getMinCost(level) + 15;
    }
    @Override
    public int getMaxLevel() {
        return 2;
    }
    @Override
    public boolean isTreasure(){
        return true;
    }
}

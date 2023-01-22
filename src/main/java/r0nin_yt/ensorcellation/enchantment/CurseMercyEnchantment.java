package r0nin_yt.ensorcellation.enchantment;

import r0nin_yt.core.init.CoreEnchantments;
import r0nin_yt.lib.enchantment.EnchantmentCoFH;
import net.minecraft.world.entity.EquipmentSlot;

public class CurseMercyEnchantment extends EnchantmentCoFH {

    public CurseMercyEnchantment() {

        super(Rarity.VERY_RARE, CoreEnchantments.Types.SWORD_OR_AXE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        treasureEnchantment = true;
    }

    @Override
    public int getMinCost(int level) {

        return 25;
    }

    @Override
    protected int maxDelegate(int level) {

        return 50;
    }

    @Override
    public boolean isCurse() {

        return true;
    }

}

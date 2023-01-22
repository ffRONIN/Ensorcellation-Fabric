package r0nin_yt.ensorcellation.enchantment;

import r0nin_yt.core.init.CoreEnchantments;
import r0nin_yt.lib.enchantment.EnchantmentCoFH;
import net.minecraft.world.entity.EquipmentSlot;

public class WeedingEnchantment extends EnchantmentCoFH {

    public WeedingEnchantment() {

        super(Rarity.UNCOMMON, CoreEnchantments.Types.HOE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    protected int maxDelegate(int level) {

        return getMinCost(level) + 50;
    }

}
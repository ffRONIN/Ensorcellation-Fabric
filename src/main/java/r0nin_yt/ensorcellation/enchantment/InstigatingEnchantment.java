package r0nin_yt.ensorcellation.enchantment;

import r0nin_yt.core.init.CoreEnchantments;
import r0nin_yt.lib.enchantment.DamageEnchantmentCoFH;
import net.minecraft.world.entity.EquipmentSlot;

public class InstigatingEnchantment extends DamageEnchantmentCoFH {

    public InstigatingEnchantment() {

        super(Rarity.UNCOMMON, CoreEnchantments.Types.SWORD_OR_AXE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        maxLevel = 1;
        treasureEnchantment = true;
    }

    @Override
    public int getMinCost(int level) {

        return level * 25;
    }

    @Override
    protected int maxDelegate(int level) {

        return getMinCost(level) + 50;
    }

}

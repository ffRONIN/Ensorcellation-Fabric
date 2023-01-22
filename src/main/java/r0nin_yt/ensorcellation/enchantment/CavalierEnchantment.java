package r0nin_yt.ensorcellation.enchantment;

import r0nin_yt.core.init.CoreEnchantments;
import r0nin_yt.lib.enchantment.EnchantmentCoFH;
import net.minecraft.world.entity.EquipmentSlot;

public class CavalierEnchantment extends EnchantmentCoFH {

    public static float damageMult = 0.5F;

    public CavalierEnchantment() {

        super(Rarity.UNCOMMON, CoreEnchantments.Types.SWORD_OR_AXE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        maxLevel = 4;
    }

    @Override
    public int getMinCost(int level) {

        return 5 + (level - 1) * 10;
    }

    @Override
    protected int maxDelegate(int level) {

        return getMinCost(level) + 50;
    }

}

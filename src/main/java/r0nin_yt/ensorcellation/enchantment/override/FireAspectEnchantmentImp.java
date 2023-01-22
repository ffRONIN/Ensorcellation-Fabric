package r0nin_yt.ensorcellation.enchantment.override;

import r0nin_yt.core.init.CoreEnchantments;
import r0nin_yt.lib.enchantment.EnchantmentOverride;
import net.minecraft.world.entity.EquipmentSlot;

public class FireAspectEnchantmentImp extends EnchantmentOverride {

    public FireAspectEnchantmentImp() {

        super(Rarity.RARE, CoreEnchantments.Types.SWORD_OR_AXE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        maxLevel = 2;
    }

    @Override
    public int getMinCost(int level) {

        return 10 + 20 * (level - 1);
    }

    @Override
    public int getMaxCost(int level) {

        return super.getMinCost(level) + 50;
    }

}

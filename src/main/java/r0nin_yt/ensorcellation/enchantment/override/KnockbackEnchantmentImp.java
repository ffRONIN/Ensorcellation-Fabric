package r0nin_yt.ensorcellation.enchantment.override;

import r0nin_yt.core.init.CoreEnchantments;
import r0nin_yt.lib.enchantment.EnchantmentOverride;
import net.minecraft.world.entity.EquipmentSlot;

public class KnockbackEnchantmentImp extends EnchantmentOverride {

    public KnockbackEnchantmentImp() {

        super(Rarity.UNCOMMON, CoreEnchantments.Types.SWORD_OR_AXE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        maxLevel = 2;
    }

    @Override
    public int getMinCost(int level) {

        return 5 + 20 * (level - 1);
    }

}

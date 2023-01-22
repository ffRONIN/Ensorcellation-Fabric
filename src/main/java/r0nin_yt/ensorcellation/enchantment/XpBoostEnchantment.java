package r0nin_yt.ensorcellation.enchantment;

import r0nin_yt.lib.enchantment.EnchantmentCoFH;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.util.Random;

public class XpBoostEnchantment extends EnchantmentCoFH {

    public static int xp = 4;

    public XpBoostEnchantment() {

        super(Rarity.UNCOMMON, EnchantmentCategory.ARMOR_HEAD, new EquipmentSlot[]{EquipmentSlot.HEAD});
        maxLevel = 3;
    }

    @Override
    public int getMinCost(int level) {

        return 10 + (level - 1) * 9;
    }

    @Override
    protected int maxDelegate(int level) {

        return getMinCost(level) + 50;
    }

    // region HELPERS
    public static int getExp(int baseExp, int level, Random rand) {

        return baseExp + level + rand.nextInt(1 + level * xp);
    }
    // endregion
}

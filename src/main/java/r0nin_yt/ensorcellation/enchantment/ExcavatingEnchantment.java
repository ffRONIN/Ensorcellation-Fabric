package r0nin_yt.ensorcellation.enchantment;

import r0nin_yt.core.init.CoreEnchantments;
import r0nin_yt.lib.enchantment.EnchantmentCoFH;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

public class ExcavatingEnchantment extends EnchantmentCoFH {

    public ExcavatingEnchantment() {

        super(Rarity.RARE, CoreEnchantments.Types.PICKAXE_OR_SHOVEL, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
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

    @Override
    public boolean checkCompatibility(Enchantment ench) {

        return super.checkCompatibility(ench) && ench != Enchantments.MOB_LOOTING;
    }

}
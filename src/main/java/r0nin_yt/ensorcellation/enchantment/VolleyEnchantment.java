package r0nin_yt.ensorcellation.enchantment;

import r0nin_yt.lib.enchantment.EnchantmentCoFH;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import static r0nin_yt.core.util.helpers.ArcheryHelper.validBow;
import static r0nin_yt.core.util.references.EnsorcIDs.ID_TRUESHOT;
import static r0nin_yt.ensorcellation.Ensorcellation.ENCHANTMENTS;

public class VolleyEnchantment extends EnchantmentCoFH {

    public VolleyEnchantment() {

        super(Rarity.RARE, EnchantmentCategory.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinCost(int level) {

        return 20;
    }

    @Override
    protected int maxDelegate(int level) {

        return getMinCost(level) + 50;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {

        return enable && (validBow(stack));
    }

    @Override
    public boolean checkCompatibility(Enchantment ench) {

        return super.checkCompatibility(ench) && ench != ENCHANTMENTS.get(ID_TRUESHOT);
    }

}

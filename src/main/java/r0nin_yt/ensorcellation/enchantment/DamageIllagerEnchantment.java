package r0nin_yt.ensorcellation.enchantment;

import r0nin_yt.core.init.CoreEnchantments;
import r0nin_yt.lib.enchantment.DamageEnchantmentCoFH;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.AbstractIllager;
import net.minecraft.world.entity.monster.Ravager;

public class DamageIllagerEnchantment extends DamageEnchantmentCoFH {

    public DamageIllagerEnchantment() {

        super(Rarity.UNCOMMON, CoreEnchantments.Types.SWORD_OR_AXE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        maxLevel = 5;
    }

    // TODO: Revisit if Ravagers and Witches are reclassified in future.
    //    @Override
    //    public float calcDamageByCreature(int level, CreatureAttribute creatureType) {
    //
    //        return creatureType == CreatureAttribute.ILLAGER ? getExtraDamage(level) : 0.0F;
    //    }

    public static boolean validTarget(Entity entity) {

        return entity instanceof AbstractIllager || entity instanceof Ravager;
    }

}

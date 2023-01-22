package r0nin_yt.ensorcellation.init;

import r0nin_yt.ensorcellation.Ensorcellation;
import r0nin_yt.ensorcellation.enchantment.*;
import r0nin_yt.ensorcellation.enchantment.override.*;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import static r0nin_yt.ensorcellation.enchantment.override.ProtectionEnchantmentImp.Type.*;

public class EnsorcEnchantments {

    private EnsorcEnchantments() {

    }

    public static void register() {

        OVERRIDES.register(ID_PROTECTION, () -> new ProtectionEnchantmentImp(COMMON, ALL, ARMOR_SLOTS));
        OVERRIDES.register(ID_PROTECTION_BLAST, () -> new ProtectionEnchantmentImp(RARE, EXPLOSION, ARMOR_SLOTS));
        OVERRIDES.register(ID_PROTECTION_FALL, () -> new ProtectionEnchantmentImp(UNCOMMON, FALL, ARMOR_SLOTS));
        OVERRIDES.register(ID_PROTECTION_FIRE, () -> new ProtectionEnchantmentImp(UNCOMMON, FIRE, ARMOR_SLOTS));
        OVERRIDES.register(ID_PROTECTION_PROJECTILE, () -> new ProtectionEnchantmentImp(UNCOMMON, PROJECTILE, ARMOR_SLOTS));

        OVERRIDES.register(ID_FIRE_ASPECT, FireAspectEnchantmentImp::new);
        OVERRIDES.register(ID_FROST_WALKER, FrostWalkerEnchantmentImp::new);
        OVERRIDES.register(ID_KNOCKBACK, KnockbackEnchantmentImp::new);
        OVERRIDES.register(ID_LOOTING, LootingEnchantmentImp::new);
        OVERRIDES.register(ID_THORNS, ThornsEnchantmentImp::new);

        OVERRIDES.register(ID_MENDING, MendingEnchantmentAlt::new);

    }
   // public static Enchantment PROTECTION_MAGIC = create("lightning_striker", new LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static final RegistryObject<EnchantmentCoFH> PROTECTION_MAGIC = ENCHANTMENTS.create(ID_PROTECTION_MAGIC, () -> new ProtectionEnchantmentImp(UNCOMMON, MAGIC, ARMOR_SLOTS));
    public static final RegistryObject<EnchantmentCoFH> DISPLACEMENT = ENCHANTMENTS.create(ID_DISPLACEMENT, DisplacementEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> FIRE_REBUKE = ENCHANTMENTS.create(ID_FIRE_REBUKE, FireRebukeEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> FROST_REBUKE = ENCHANTMENTS.create(ID_FROST_REBUKE, FrostRebukeEnchantment::new);

    public static final RegistryObject<EnchantmentCoFH> AIR_AFFINITY = ENCHANTMENTS.create(ID_AIR_AFFINITY, AirAffinityEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> XP_BOOST = ENCHANTMENTS.create(ID_XP_BOOST, XpBoostEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> GOURMAND = ENCHANTMENTS.create(ID_GOURMAND, GourmandEnchantment::new);

    public static final RegistryObject<EnchantmentCoFH> REACH = ENCHANTMENTS.create(ID_REACH, ReachEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> VITALITY = ENCHANTMENTS.create(ID_VITALITY, VitalityEnchantment::new);

    public static final RegistryObject<EnchantmentCoFH> DAMAGE_ENDER = ENCHANTMENTS.create(ID_DAMAGE_ENDER, DamageEnderEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> DAMAGE_ILLAGER = ENCHANTMENTS.create(ID_DAMAGE_ILLAGER, DamageIllagerEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> DAMAGE_VILLAGER = ENCHANTMENTS.create(ID_DAMAGE_VILLAGER, DamageVillagerEnchantment::new);

    public static final RegistryObject<EnchantmentCoFH> CAVALIER = ENCHANTMENTS.create(ID_CAVALIER, CavalierEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> FROST_ASPECT = ENCHANTMENTS.create(ID_FROST_ASPECT, FrostAspectEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> INSTIGATING = ENCHANTMENTS.register(ID_INSTIGATING, InstigatingEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> LEECH = ENCHANTMENTS.create(ID_LEECH, LeechEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> MAGIC_EDGE = ENCHANTMENTS.create(ID_MAGIC_EDGE, MagicEdgeEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> VORPAL = ENCHANTMENTS.create(ID_VORPAL, VorpalEnchantment::new);

    public static final RegistryObject<EnchantmentCoFH> EXCAVATING = ENCHANTMENTS.create(ID_EXCAVATING, ExcavatingEnchantment::new);

    public static final RegistryObject<EnchantmentCoFH> HUNTER = ENCHANTMENTS.create(ID_HUNTER, HunterEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> QUICK_DRAW = ENCHANTMENTS.create(ID_QUICK_DRAW, QuickdrawEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> TRUESHOT = ENCHANTMENTS.create(ID_TRUESHOT, TrueshotEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> VOLLEY = ENCHANTMENTS.create(ID_VOLLEY, VolleyEnchantment::new);

    public static final RegistryObject<EnchantmentCoFH> ANGLER = ENCHANTMENTS.create(ID_ANGLER, AnglerEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> PILFERING = ENCHANTMENTS.create(ID_PILFERING, PilferingEnchantment::new);

    public static final RegistryObject<EnchantmentCoFH> BULWARK = ENCHANTMENTS.create(ID_BULWARK, BulwarkEnchantment::new);
    public static final RegistryObject<EnchantmentCoFH> PHALANX = ENCHANTMENTS.create(ID_PHALANX, PhalanxEnchantment::new);

    public static final RegistryObject<EnchantmentCoFH> SOULBOUND = ENCHANTMENTS.create(ID_SOULBOUND, SoulboundEnchantment::new);

    public static final RegistryObject<Enchantments> CURSE_FOOL = ENCHANTMENTS.create(ID_CURSE_FOOL, CurseFoolEnchant::new);
    public static final RegistryObject<EnchantmentCoFH> CURSE_MERCY = ENCHANTMENTS.create(ID_CURSE_MERCY, CurseMercyEnchantment::new);


    private static Enchantment create(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Ensorcellation.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + Ensorcellation.MOD_ID);
    }
}
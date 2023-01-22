package r0nin_yt.ensorcellation.event;

import dev.architectury.event.events.common.TickEvent;
import it.unimi.dsi.fastutil.PriorityQueues;
import r0nin_yt.ensorcellation.Ensorcellation;
import r0nin_yt.ensorcellation.enchantment.SoulboundEnchantment;


import java.util.PriorityQueue;

import static r0nin_yt.ensorcellation.init.EnsorcEnchantments.SOULBOUND;



public class SoulboundEvents {

    private SoulboundEvents() {

    }

    @Override(priority = PriorityQueues.HIGH_QUEUE)
    public static void handlePlayerDropsEvent(LivingDropsEvent event) {

        if (event.getEntity() instanceof TickEvent.Player player) {
            if (Utils.isFakePlayer(player) || player.level.getGameRules().getBoolean(RULE_KEEPINVENTORY)) {
                return;
            }
            Iterator<ItemEntity> iter = event.getDrops().iterator();
            while (iter.hasNext()) {
                ItemStack stack = iter.next().getItem();
                if (getItemEnchantmentLevel(SOULBOUND.get(), stack) > 0) {
                    if (addToPlayerInventory(player, stack)) {
                        iter.remove();
                    }
                }
            }
        }
    }

    @SubscribeEvent (priority = EventPriority.HIGH)
    public static void handlePlayerCloneEvent(PlayerEvent.Clone event) {

        if (!event.isWasDeath()) {
            return;
        }
        Player player = event.getPlayer();
        Player oldPlayer = event.getOriginal();
        if (Utils.isFakePlayer(player) || player.level.getGameRules().getBoolean(RULE_KEEPINVENTORY)) {
            return;
        }
        EnchantmentCoFH soulbound = SOULBOUND.get();

        for (int i = 0; i < oldPlayer.inventory.armor.size(); ++i) {
            ItemStack stack = oldPlayer.inventory.armor.get(i);
            int encSoulbound = getItemEnchantmentLevel(soulbound, stack);
            if (encSoulbound > 0) {
                if (SoulboundEnchantment.permanent) {
                    if (encSoulbound > 1) {
                        removeEnchantment(stack, soulbound);
                        addEnchantment(stack, soulbound, 1);
                    }
                } else if (player.level.random.nextInt(1 + encSoulbound) == 0) {
                    removeEnchantment(stack, soulbound);
                    if (encSoulbound > 1) {
                        addEnchantment(stack, soulbound, encSoulbound - 1);
                    }
                }
                if (addToPlayerInventory(player, stack)) {
                    oldPlayer.inventory.armor.set(i, ItemStack.EMPTY);
                }
            }
        }
        for (int i = 0; i < oldPlayer.inventory.items.size(); ++i) {
            ItemStack stack = oldPlayer.inventory.items.get(i);
            int encSoulbound = getItemEnchantmentLevel(soulbound, stack);
            if (encSoulbound > 0) {
                if (SoulboundEnchantment.permanent) {
                    if (encSoulbound > 1) {
                        removeEnchantment(stack, soulbound);
                        addEnchantment(stack, soulbound, 1);
                    }
                } else if (player.level.random.nextInt(1 + encSoulbound) == 0) {
                    removeEnchantment(stack, soulbound);
                    if (encSoulbound > 1) {
                        addEnchantment(stack, soulbound, encSoulbound - 1);
                    }
                }
                if (addToPlayerInventory(player, stack)) {
                    oldPlayer.inventory.items.set(i, ItemStack.EMPTY);
                }
            }
        }
    }
    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + Ensorcellation.MOD_ID);
    }
}


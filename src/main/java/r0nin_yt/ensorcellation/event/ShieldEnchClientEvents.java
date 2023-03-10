package r0nin_yt.ensorcellation.event;

import r0nin_yt.ensorcellation.enchantment.PhalanxEnchantment;
import r0nin_yt.lib.util.helpers.MathHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.FOVModifierEvent;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static r0nin_yt.ensorcellation.init.EnsorcEnchantments.PHALANX;
import static r0nin_yt.lib.util.Utils.getItemEnchantmentLevel;
import static r0nin_yt.lib.util.constants.ModIds.ID_ENSORCELLATION;

@Mod.EventBusSubscriber (value = Dist.CLIENT, modid = ID_ENSORCELLATION)
public class ShieldEnchClientEvents {

    private ShieldEnchClientEvents() {

    }

    private static boolean hadPhalanx;
    private static double modPhalanx;
    private static long timePhalanx;

    @SubscribeEvent
    public static void handleFOVUpdateEvent(FOVModifierEvent event) {

        Player entity = event.getEntity();
        ItemStack stack = event.getEntity().getUseItem();

        if (stack.getItem().canPerformAction(stack, ToolActions.SHIELD_BLOCK)) {
            int encPhalanx = getItemEnchantmentLevel(PHALANX.get(), stack);
            if (encPhalanx > 0) {
                modPhalanx = encPhalanx * PhalanxEnchantment.SPEED / 2D;
                hadPhalanx = true;
                timePhalanx = entity.level.getGameTime();
            }
            event.setNewfov((float) MathHelper.clamp(event.getNewfov() - modPhalanx, 1.0D, 2.5D));
        } else if (hadPhalanx) {
            if (entity.level.getGameTime() - 20 > timePhalanx) {
                hadPhalanx = false;
                modPhalanx = 0;
            }
            event.setNewfov((float) MathHelper.clamp(event.getNewfov() - modPhalanx, 1.0D, 2.5D));
        }
    }

}

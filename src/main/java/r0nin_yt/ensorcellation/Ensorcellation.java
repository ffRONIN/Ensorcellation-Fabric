package r0nin_yt.ensorcellation;

//import r0nin_yt.ensorcellation.config.BaseEnchantmentConfig;
//import r0nin_yt.ensorcellation.config.OverrideEnchantmentConfig;
import blue.endless.jankson.JsonArray;
import com.google.common.eventbus.EventBus;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.util.registry.Registry;
import r0nin_yt.ensorcellation.init.EnsorcEnchantments;

import me.shedaniel.rei.api.client.config.ConfigManager;
import me.shedaniel.rei.api.client.config.ConfigObject;
import net.minecraft.client.gui.screen.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Ensorcellation {

    public static final String MOD_ID = "ensorcellation";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ConfigManager CONFIG_MANAGER = new ConfigManager() {
        @Override
        public void startReload() {

        }

        @Override
        public void saveConfig() {

        }

        @Override
        public boolean isCraftableOnlyEnabled() {
            return false;
        }

        @Override
        public void toggleCraftableOnly() {

        }

        @Override
        public Screen getConfigScreen(Screen parent) {
            return null;
        }

        @Override
        public ConfigObject getConfig() {
            return null;
        }
    };

   public static final Registry<Enchantment> ENCHANTMENTS = Registry.register(, Ensorcellation.MOD_ID);
  // public static final Registry<Enchantment> OVERRIDES = Registry.register(Enchantments, MINECRAFT_ID);
    private JsonArray FMLJavaModLoadingContext;

    public Ensorcellation() {

        final EventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.register(ENCHANTMENTS);
   //     modEventBus.register(OVERRIDES);

  //      CONFIG_MANAGER.register(modEventBus)
  //              .addServerConfig(new BaseEnchantmentConfig())
  //              .addServerConfig(new OverrideEnchantmentConfig());
   //     CONFIG_MANAGER.setupServer();

        EnsorcEnchantments.register();

    }

}

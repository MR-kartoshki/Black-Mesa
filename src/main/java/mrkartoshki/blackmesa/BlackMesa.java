package mrkartoshki.blackmesa;

import mrkartoshki.blackmesa.world.BlackBandlandsRuleSource;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adds the Black Mesa biome: a vanilla Mesa (Badlands) clone whose plain and red terracotta —
 * including the red bands produced by the clay-band generator — is replaced with black terracotta.
 *
 * <p>The biome and its surface are data-driven (see {@code data/black-mesa/worldgen/biome/black_mesa.json}
 * and the {@code data/minecraft/worldgen/noise_settings} overrides). Placement into the overworld
 * climate is handled by {@code OverworldBiomeBuilderMixin}. The only thing that must be registered in
 * code is the custom {@code black_bandlands} surface rule.
 */
public class BlackMesa implements ModInitializer {
	public static final String MOD_ID = "black-mesa";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		BlackBandlandsRuleSource.register();
	}
}

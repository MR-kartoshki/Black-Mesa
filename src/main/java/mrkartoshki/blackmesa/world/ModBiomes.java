package mrkartoshki.blackmesa.world;

import mrkartoshki.blackmesa.BlackMesa;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public final class ModBiomes {
	/**
	 * A Mesa (Badlands) clone whose plain and red terracotta is replaced with black terracotta.
	 * The biome itself is defined by data ({@code data/black-mesa/worldgen/biome/black_mesa.json},
	 * a verbatim copy of vanilla badlands). Placement into the overworld climate and the
	 * black-terracotta surface are handled by a mixin and the noise-settings overrides, since this
	 * Fabric version exposes no overworld add-biome or surface-rule API.
	 */
	public static final ResourceKey<Biome> BLACK_MESA = ResourceKey.create(Registries.BIOME, BlackMesa.id("black_mesa"));

	private ModBiomes() {
	}
}

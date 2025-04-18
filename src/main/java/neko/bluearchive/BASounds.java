package neko.bluearchive;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class BASounds {
    public static final RegistryEntry<SoundEvent> BLUEARCHIVER_MUSIC = Registry.registerReference(
            Registries.SOUND_EVENT,
            Identifier.of("bluearchive", "music.bluearchiver"),
            SoundEvent.of(Identifier.of("bluearchive", "music.bluearchiver"))
    );

    public static void init() {}
}

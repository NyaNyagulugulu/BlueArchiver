package neko.bluearchive;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class BASounds {
    public static final RegistryEntry<SoundEvent> BLUEARCHIVER_MUSIC = Registry.registerReference(
            Registries.SOUND_EVENT,
            Identifier.of("bluearchive", "music.bluearchiver"),
            SoundEvent.of(Identifier.of("bluearchive", "music.bluearchiver"))
    );

    public static final RegistryKey<JukeboxSong> BLUEARCHIVER_MUSIC_SONG = createSong("bluearchiver");



    private static RegistryKey<JukeboxSong> createSong(String name) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of("bluearchive",name));
    }

    public static void init() {}
}

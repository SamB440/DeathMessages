package dev.mrshawn.deathmessages.converted.files;

import dev.mrshawn.deathmessages.DeathMessages;
import dev.mrshawn.deathmessages.files.Config;
import dev.mrshawn.deathmessages.files.FileSettings;

public class FileStore {

    public static final FileSettings<Config> CONFIG = new FileSettings<Config>(DeathMessages.getInstance(), "Settings.yml").loadSettings(Config.class);
}

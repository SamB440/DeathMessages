package dev.mrshawn.deathmessages.converted;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PlayerUtils {

    public static boolean isPlayer(String name) {
        return Bukkit.getPlayer(name) != null;
    }

    public static Player getPlayer(String name) {
        return Bukkit.getPlayer(name);
    }
}

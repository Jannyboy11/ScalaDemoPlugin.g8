package $package$

import org.bukkit.ChatColor
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.{EventHandler, Listener}

object PlayerJoinListener extends Listener {

    @EventHandler
    def onJoin(event: PlayerJoinEvent): Unit =
        event.setJoinMessage(ChatColor.GREEN + "Howdy " + event.getPlayer.getName + "!")

}

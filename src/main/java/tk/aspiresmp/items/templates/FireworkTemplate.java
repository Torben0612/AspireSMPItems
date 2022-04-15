package tk.aspiresmp.items.templates;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireworkTemplate implements Listener {

    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e){

        //change fireworkname to name of firework (ex. starfirework)
        //change fireworknamemeta to the name of the firework with meta at the end (ex. starfireworkmeta)

        Firework fireworkname = e.getPlayer().getWorld().spawn(e.getPlayer().getLocation(), Firework.class);
        FireworkMeta fireworknamemeta = (FireworkMeta) fireworkname.getFireworkMeta();
        fireworknamemeta.addEffect(FireworkEffect.builder()
                .withColor(Color.RED).withColor(Color.LIME) //pick color of the firework max 2 colors
                .with(FireworkEffect.Type.CREEPER) // firework shape
                .withFlicker() //firework effect
                .build());
        fireworknamemeta.setPower(1); //sets the power of the firework (range 1-3)
        fireworkname.setFireworkMeta(fireworknamemeta);
    }

}

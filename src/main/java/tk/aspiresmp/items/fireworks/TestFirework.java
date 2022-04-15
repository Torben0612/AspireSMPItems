package tk.aspiresmp.items.fireworks;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class TestFirework implements Listener {

    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e){

        Firework testfirework = e.getPlayer().getWorld().spawn(e.getPlayer().getLocation(), Firework.class);
        FireworkMeta testfireworkmeta = (FireworkMeta) testfirework.getFireworkMeta();
        testfireworkmeta.addEffect(FireworkEffect.builder().withColor(Color.GREEN).withColor(Color.LIME).with(Type.CREEPER).withFlicker().build());
        testfireworkmeta.setPower(1);
        testfirework.setFireworkMeta(testfireworkmeta);
    }


}
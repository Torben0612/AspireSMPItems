package tk.aspiresmp.items;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import tk.aspiresmp.items.fireworks.TestFirework;
import tk.aspiresmp.items.tropi_fish.TestFIsh;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new TestFirework(), this);
        getCommand("give-test-fish").setExecutor(new TestFIsh());
    }
}

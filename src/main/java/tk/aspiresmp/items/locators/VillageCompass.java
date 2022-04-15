/*package tk.aspiresmp.items.locators;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.CompassMeta;

public class VillageCompass implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            World world = Bukkit.getWorld("world")
            ItemStack villagecompass = new ItemStack(Material.COMPASS);
            CompassMeta villagecompassmeta = (CompassMeta) villagecompass.getItemMeta();
            villagecompassmeta.setLodestone(world, 56, 100, 296);
        }

        return false;
    }
}
*/
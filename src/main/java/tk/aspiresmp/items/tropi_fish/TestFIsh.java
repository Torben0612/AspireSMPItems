package tk.aspiresmp.items.tropi_fish;

import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.TropicalFish;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.TropicalFishBucketMeta;

public class TestFIsh implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            ItemStack testfish = new ItemStack(Material.TROPICAL_FISH_BUCKET);
            TropicalFishBucketMeta testfishmeta = (TropicalFishBucketMeta) testfish.getItemMeta();
            testfishmeta.setBodyColor(DyeColor.BLACK);
            testfishmeta.setPattern(TropicalFish.Pattern.STRIPEY);
            testfishmeta.setPatternColor(DyeColor.WHITE);
            testfishmeta.setDisplayName(ChatColor.AQUA + "Test Tropical Fish");

            testfish.setItemMeta(testfishmeta);
            ((Player) sender).getInventory().addItem(testfish);

        }

        return false;
    }
}

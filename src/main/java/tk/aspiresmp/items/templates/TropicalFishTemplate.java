package tk.aspiresmp.items.templates;

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

public class TropicalFishTemplate implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            //set fishname and fishmeta to the name of your fish

            ItemStack fishname = new ItemStack(Material.TROPICAL_FISH_BUCKET);
            TropicalFishBucketMeta fishmeta = (TropicalFishBucketMeta) fishname.getItemMeta();
            fishmeta.setBodyColor(DyeColor.BLACK); //select the body color
            fishmeta.setPattern(TropicalFish.Pattern.STRIPEY); //select the pattern
            fishmeta.setPatternColor(DyeColor.WHITE); //pick the pattern color
            fishmeta.setDisplayName(ChatColor.AQUA + "name of the item");

            fishname.setItemMeta(fishmeta);
            ((Player) sender).getInventory().addItem(fishname);

        }


        return false;
    }
}

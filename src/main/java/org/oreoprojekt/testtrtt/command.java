package org.oreoprojekt.testtrtt;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.UUID;

public class command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("&f낡은나무도끼");
        list.add("&a낡은소방도끼");
        list.add("&b일반소방도끼");
        list.add("&d피묻은소방도끼");
        list.add("&5피묻은소방도끼");
        list.add("&4금도끼");

        Player player = (Player) sender;
        ItemStack axe1 = new ItemStack(Material.WOODEN_AXE);
        ItemStack axe2 = new ItemStack(Material.STONE_AXE);
        ItemStack axe3 = new ItemStack(Material.GOLDEN_AXE);
        ItemMeta ax1 = axe1.getItemMeta();
        ItemMeta ax2 = axe2.getItemMeta();
        ItemMeta ax3 = axe3.getItemMeta();

        ax1.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ax2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ax3.addItemFlags(ItemFlag.HIDE_ENCHANTS);


        for (int cnt = 0; cnt < 6; cnt++) {
            if (list.get(cnt).contains("낡은나무")) {
                ax1.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&0[" + list.get(cnt) + "&0]"));
                axe1.setItemMeta(ax1);
                axe1.addUnsafeEnchantment(Enchantment.LUCK, 1);
                player.getInventory().addItem(axe1);
            }
            else if (list.get(cnt).contains("피묻은")) {
                ax2.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&0[" + list.get(cnt) + "&0]"));
                axe2.setItemMeta(ax2);
                axe2.addUnsafeEnchantment(Enchantment.LUCK, 1);
                player.getInventory().addItem(axe2);
            }
            else if (list.get(cnt).contains("피묻은")) {
                ax2.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&0[" + list.get(cnt) + "&0]"));
                axe2.setItemMeta(ax2);
                axe2.addUnsafeEnchantment(Enchantment.LUCK, 1);
                player.getInventory().addItem(axe2);
            }
            else if (list.get(cnt).contains("금")) {
                ax3.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&0[" + list.get(cnt) + "&0]"));
                axe3.setItemMeta(ax3);
                axe3.addUnsafeEnchantment(Enchantment.LUCK, 1);
                player.getInventory().addItem(axe3);
            }

        }

        return false;
    }
}

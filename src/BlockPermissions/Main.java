package BlockPermissions;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	

	public void onEnable()
	{
		this.getServer().getPluginManager().registerEvents(this, this);
		getConfig().options().copyDefaults(true);
		saveConfig();
	
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void STONE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.STONE)
	        return;
	   
	    if(player.hasPermission("bp.stone")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void GRASS(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.GRASS)
	        return;
	   
	    if(player.hasPermission("bp.grass")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void DIRT(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.DIRT)
	        return;
	   
	    if(player.hasPermission("bp.dirt")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void COBBLE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.COBBLESTONE)
	        return;
	   
	    if(player.hasPermission("bp.cobble")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void WOOD(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.WOOD)
	        return;
	   
	    if(player.hasPermission("bp.wood")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void SAPLING(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.SAPLING)
	        return;
	   
	    if(player.hasPermission("bp.sapling")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void BEDROCK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.BEDROCK)
	        return;
	   
	    if(player.hasPermission("bp.bedrock")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void WATER(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.WATER)
	        return;
	   
	    if(player.hasPermission("bp.water")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void LAVA(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.LAVA)
	        return;
	   
	    if(player.hasPermission("bp.lava")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void SAND(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.SAND)
	        return;
	   
	    if(player.hasPermission("bp.sand")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void GRAVEL(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.GRAVEL)
	        return;
	   
	    if(player.hasPermission("bp.gravel")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void GOLDORE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.GOLD_ORE)
	        return;
	   
	    if(player.hasPermission("bp.goldore")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void IRONORE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.IRON_ORE)
	        return;
	   
	    if(player.hasPermission("bp.ironore")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void COALORE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.COAL_ORE)
	        return;
	   
	    if(player.hasPermission("bp.coalore")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void LOG(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.LOG)
	        return;
	   
	    if(player.hasPermission("bp.log")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void LEAVES(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.LEAVES)
	        return;
	   
	    if(player.hasPermission("bp.leaves")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void SPONGE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.SPONGE)
	        return;
	   
	    if(player.hasPermission("bp.sponge")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void GLASS(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.GLASS)
	        return;
	   
	    if(player.hasPermission("bp.glass")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void LAPISORE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.LAPIS_ORE)
	        return;
	   
	    if(player.hasPermission("bp.lapisore")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void LAPISBLOCK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.LAPIS_BLOCK)
	        return;
	   
	    if(player.hasPermission("bp.lapisblock")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void DISPENSER(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.DISPENSER)
	        return;
	   
	    if(player.hasPermission("bp.dispenser")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void SANDSTONE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.SANDSTONE)
	        return;
	   
	    if(player.hasPermission("bp.sandstone")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void NOTEBLOCK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.NOTE_BLOCK)
	        return;
	   
	    if(player.hasPermission("bp.noteblock")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void RAILS(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.RAILS)
	        return;
	   
	    if(player.hasPermission("bp.rails")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void STICKYPISTON(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.PISTON_STICKY_BASE)
	        return;
	   
	    if(player.hasPermission("bp.stickypiston")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void WEB(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.WEB)
	        return;
	   
	    if(player.hasPermission("bp.web")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void TALLGRASS(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.LONG_GRASS)
	        return;
	   
	    if(player.hasPermission("bp.tallgrass")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void PISTON(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.PISTON_BASE)
	        return;
	   
	    if(player.hasPermission("bp.piston")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void WOOL(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.WOOL)
	        return;
	    
	    if(player.hasPermission("bp.wool") ) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	   }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void YELLOWFLOWER(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.YELLOW_FLOWER)
	        return;
	   
	    if(player.hasPermission("bp.yellowflower")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void REDROSE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.RED_ROSE)
	        return;
	   
	    if(player.hasPermission("bp.rose")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void BROWNMUSHROOM(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.BROWN_MUSHROOM)
	        return;
	   
	    if(player.hasPermission("bp.brownmushroom")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void REDMUSHROOM(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.RED_MUSHROOM)
	        return;
	   
	    if(player.hasPermission("bp.redmushroom")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void GOLDBLOCK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.GOLD_BLOCK)
	        return;
	   
	    if(player.hasPermission("bp.goldblock")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void IRONBLOCK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.IRON_BLOCK)
	        return;
	   
	    if(player.hasPermission("bp.ironblock")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void DOUBLESTEP(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.DOUBLE_STEP)
	        return;
	   
	    if(player.hasPermission("bp.doublestep")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void STEP(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.STEP)
	        return;
	   
	    if(player.hasPermission("bp.step")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void REDBRICKBLOCK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.BRICK)
	        return;
	   
	    if(player.hasPermission("bp.brickblock")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void TNT(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.TNT)
	        return;
	   
	    if(player.hasPermission("bp.tnt")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void BOOKSHELF(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.BOOKSHELF)
	        return;
	   
	    if(player.hasPermission("bp.bookshelf")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void MOSSYCOBBLE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.MOSSY_COBBLESTONE)
	        return;
	   
	    if(player.hasPermission("bp.mossycobble")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void OBSIDIAN(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.OBSIDIAN)
	        return;
	   
	    if(player.hasPermission("bp.obsidian")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void TORCH(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.TORCH)
	        return;
	   
	    if(player.hasPermission("bp.torch")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void FIRE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.FIRE)
	        return;
	   
	    if(player.hasPermission("bp.fire")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void MOBSPAWNER(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.MOB_SPAWNER)
	        return;
	   
	    if(player.hasPermission("bp.mobspawner")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void WOODENSTAIRS(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.WOOD_STAIRS)
	        return;
	   
	    if(player.hasPermission("bp.woodstairs")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void CHEST(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.CHEST)
	        return;
	   
	    if(player.hasPermission("bp.chest")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void DIAMONDORE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.DIAMOND_ORE)
	        return;
	   
	    if(player.hasPermission("bp.diamondore")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void DIAMONDBLOCK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.DIAMOND_BLOCK)
	        return;
	   
	    if(player.hasPermission("bp.diamondblock")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void WORKBENCH(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.WORKBENCH)
	        return;
	   
	    if(player.hasPermission("bp.workbench")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void SEEDS(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.SEEDS)
	        return;
	   
	    if(player.hasPermission("bp.seeds")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void FURNACE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.FURNACE)
	        return;
	   
	    if(player.hasPermission("bp.furnace")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void LADDER(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.LADDER)
	        return;
	   
	    if(player.hasPermission("bp.ladder")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void COBBLESTAIRS(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.COBBLESTONE_STAIRS)
	        return;
	   
	    if(player.hasPermission("bp.cobblestairs")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void WOODPLATE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.WOOD_PLATE)
	        return;
	   
	    if(player.hasPermission("bp.woodplate")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void LEVER(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.LEVER)
	        return;
	   
	    if(player.hasPermission("bp.lever")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void STONEPLATE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.STONE_PLATE)
	        return;
	   
	    if(player.hasPermission("bp.stoneplate")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void REDSTONEORE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.REDSTONE_ORE)
	        return;
	   
	    if(player.hasPermission("bp.redstoneore")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void REDSTONETORCH(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.REDSTONE_TORCH_ON)
	        return;
	   
	    if(player.hasPermission("bp.redstonetorch")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void BUTTON(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.STONE_BUTTON)
	        return;
	   
	    if(player.hasPermission("bp.button")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void SNOWK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.SNOW)
	        return;
	   
	    if(player.hasPermission("bp.snow")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void SNOWBLOCK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.SNOW_BLOCK)
	        return;
	   
	    if(player.hasPermission("bp.snowblock")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void ICE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.ICE)
	        return;
	   
	    if(player.hasPermission("bp.ice")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void CACTUS(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.CACTUS)
	        return;
	   
	    if(player.hasPermission("bp.cactus")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void CLAY(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.CLAY_BRICK)
	        return;
	   
	    if(player.hasPermission("bp.clayblock")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void SUGARCANE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.SUGAR_CANE_BLOCK)
	        return;
	   
	    if(player.hasPermission("bp.sugarcane")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void PORTAL(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.PORTAL)
	        return;
	   
	    if(player.hasPermission("bp.portal")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void JUKEBOX(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.JUKEBOX)
	        return;
	   
	    if(player.hasPermission("bp.jukebox")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void FENCE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.FENCE)
	        return;
	   
	    if(player.hasPermission("bp.fence")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void PUMPKIN(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.PUMPKIN)
	        return;
	   
	    if(player.hasPermission("bp.pumpkin")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void NETHERRACK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.NETHERRACK)
	        return;
	   
	    if(player.hasPermission("bp.netherrack")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void SOULSAND(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.SOUL_SAND)
	        return;
	   
	    if(player.hasPermission("bp.soulsand")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void GLOWSTONE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.GLOWSTONE)
	        return;
	   
	    if(player.hasPermission("bp.glowstone")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void CAKE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.CAKE_BLOCK)
	        return;
	   
	    if(player.hasPermission("bp.cake")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void TRAPDOOR(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.TRAP_DOOR)
	        return;
	   
	    if(player.hasPermission("bp.trapdoor")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void SMOOTHSTONEBRICK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.SMOOTH_BRICK)
	        return;
	   
	    if(player.hasPermission("bp.smoothbrick")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void MELON(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.MELON)
	        return;
	   
	    if(player.hasPermission("bp.melon")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void GATE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.FENCE_GATE)
	        return;
	   
	    if(player.hasPermission("bp.gate")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void BRICKSTAIRS(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.BRICK_STAIRS)
	        return;
	   
	    if(player.hasPermission("bp.brickstairs")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void VINES(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.VINE)
	        return;
	   
	    if(player.hasPermission("bp.vine")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void LILYPAD(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.WATER_LILY)
	        return;
	   
	    if(player.hasPermission("bp.lilypad")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void NETHERBRICK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.NETHER_BRICK)
	        return;
	   
	    if(player.hasPermission("bp.netherbrick")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void NETHERFENCE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.NETHER_FENCE)
	        return;
	   
	    if(player.hasPermission("bp.netherfence")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void NETHERSTAIRS(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.NETHER_BRICK_STAIRS)
	        return;
	   
	    if(player.hasPermission("bp.netherstairs")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void ENDPORTALFRAME(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.ENDER_PORTAL_FRAME)
	        return;
	   
	    if(player.hasPermission("bp.endportalframe")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void ENCHANTMENTTABLE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.ENCHANTMENT_TABLE)
	        return;
	   
	    if(player.hasPermission("bp.enchantmenttable")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void BREWINGSTAND(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.BREWING_STAND)
	        return;
	   
	    if(player.hasPermission("bp.brewingstand")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void ENDERSTONE(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.ENDER_STONE)
	        return;
	   
	    if(player.hasPermission("bp.enderstone")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void NETHERSTALK(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.NETHER_STALK)
	        return;
	   
	    if(player.hasPermission("bp.netherstalk")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void DRAGONEGG(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.DRAGON_EGG)
	        return;
	   
	    if(player.hasPermission("bp.dragonegg")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}
	@EventHandler(priority = EventPriority.HIGH)
	public void REDSTONELAMP(BlockPlaceEvent event){
	    Player player = event.getPlayer();
	    Block block = event.getBlockPlaced();
	    if(player.isOp() || block.getType() != Material.REDSTONE_LAMP_OFF)
	        return;
	   
	    if(player.hasPermission("bp.redstonelamp")) {
	        player.sendMessage(ChatColor.GOLD + getConfig().getString("BlockPermissionsMessage"));
	        event.setCancelled(true);
	    }
	}

}
	
package compressedCobble;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import compressedCobble.block.compressedCobble;
import compressedCobble.utils.Creative_Tab;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Main.modid, name = Main.name, version = Main.version)
public class Main {

	public static Creative_Tab tabRoadBlock = new Creative_Tab();
	public static final String modid = "compressedCobble";
	public static final String name = "Compressed Cobblestone";
	public static final String version = "1.0.0";
	public static Block compressedCobblestone;

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		compressedCobblestone = new compressedCobble();
		GameRegistry.addRecipe(new ItemStack(compressedCobblestone),
				new Object[] { "###", "###", "###", '#', Blocks.cobblestone });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 9),
				new Object[] { compressedCobblestone });
	}
}

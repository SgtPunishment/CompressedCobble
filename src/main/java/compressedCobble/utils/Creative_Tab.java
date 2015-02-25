package compressedCobble.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import compressedCobble.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Creative_Tab extends CreativeTabs {

	public Creative_Tab() {
		super("compressed_cobblestone");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Item.getItemFromBlock(Main.compressedCobblestone);
	}

}

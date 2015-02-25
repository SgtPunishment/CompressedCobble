package compressedCobble.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import compressedCobble.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class compressedCobble extends Block {
	private static String name = "compressedCobble";

	public compressedCobble() {
		super(Material.rock);
		GameRegistry.registerBlock(this, name).setStepSound(Block.soundTypeStone);
		setBlockName(name);
		setCreativeTab(Main.tabRoadBlock);
		setHardness(3.5F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return blockIcon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		this.blockIcon = register.registerIcon("furnace_top");
	}
}

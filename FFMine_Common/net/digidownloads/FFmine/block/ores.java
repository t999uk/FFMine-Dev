package net.digidownloads.FFmine.block;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.*;
import net.digidownloads.FFmine.lib.*;

public class ores  {
	
	public static void init(){
	
	final Block oreSilverDragonite = (new BlockOre (Reference.oreSilverDragoniteID)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreSilverDragonite");
	final Block oreGoldDragonite = (new BlockOre (Reference.oreGoldDragoniteID)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreGoldDragonite");
	final Block oreRubyDragonite = (new BlockOre (Reference.oreRubyDragoniteID)).setHardness(50.0F).setResistance(5.0F).setUnlocalizedName("oreRubyDragonite");
	final Block ThunderStone = (new BlockOre (Reference.oreThunderStoneID)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("ThunderStone");
	final Block WaterStone = (new BlockOre (Reference.oreWaterStoneID)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("WaterStone");
	final Block FireStone = (new BlockOre (Reference.oreFireStoneID)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("FireStone");
	final Block LightStone = (new BlockOre (Reference.oreLightStoneID)).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("LightStone");
	
	GameRegistry.registerBlock(oreSilverDragonite,Strings.oreSilverDragonite_Name);
	GameRegistry.registerBlock(oreGoldDragonite,Strings.oreGoldDragonite_Name);
	GameRegistry.registerBlock(oreRubyDragonite,Strings.oreRubyDragonite_Name);
	GameRegistry.registerBlock(ThunderStone,Strings.ThunderStone_Name);
	GameRegistry.registerBlock(WaterStone,Strings.WaterStone_Name);
	GameRegistry.registerBlock(FireStone,Strings.FireStone_Name);
	GameRegistry.registerBlock(LightStone,Strings.LightStone_Name);
	
	
	}
}

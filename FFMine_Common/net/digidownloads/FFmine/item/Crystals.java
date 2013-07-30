package net.digidownloads.FFmine.item;

import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import net.digidownloads.FFmine.lib.Reference;
import net.digidownloads.FFmine.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;






public class Crystals {
	
	public static void Item (){
	    
	        
       //elemental Shard 
        final Item ShardofDarkness = (new Item((Reference.ShardofDarknessID)-256)).setUnlocalizedName("ShardofDarkness").setCreativeTab(CreativeTabs.tabMaterials);
        final Item ShardofFire = (new Item((Reference.ShardofFireID)-256)).setUnlocalizedName("ShardofFire").setCreativeTab(CreativeTabs.tabMaterials);
        final Item ShardofIce = (new Item ((Reference.ShardofIceID)-256)).setUnlocalizedName("ShardofIce").setCreativeTab(CreativeTabs.tabMaterials);
        final Item ShardofLight = (new Item ((Reference.ShardofLightID)-256)).setUnlocalizedName("ShardofLight").setCreativeTab(CreativeTabs.tabMaterials);
        final Item ShardofLightning =(new Item ((Reference.ShardofLightningID)-256)).setUnlocalizedName("ShardofLightning").setCreativeTab(CreativeTabs.tabMaterials);
        final Item ShardofWater = (new Item ((Reference.ShardofWaterID)-256)).setUnlocalizedName("ShardofWater").setCreativeTab(CreativeTabs.tabMaterials);
        final Item ShardofEarth = (new Item ((Reference.ShardofEarthID)-256)).setUnlocalizedName("ShardofEarth").setCreativeTab(CreativeTabs.tabMaterials);
        final Item ShardofAir = (new Item ((Reference.ShardofAirID)-256)).setUnlocalizedName("ShardofAir").setCreativeTab(CreativeTabs.tabMisc);
        
        
        
        //crystals item form
        
        final Item EarthCrystal = (new Item((Reference.EarthCrystalID)-256)).setUnlocalizedName("EarthCrystal").setCreativeTab(CreativeTabs.tabMaterials);
        final Item FireCrystal = (new Item((Reference.FireCrystalID)-256)).setUnlocalizedName("FireCrystal").setCreativeTab(CreativeTabs.tabMaterials);
        final Item WaterCrystal = (new Item ((Reference.WaterCrystalID)-256)).setUnlocalizedName("WaterCrystal").setCreativeTab(CreativeTabs.tabMaterials);
        final Item ThunderCrystal = (new Item (Reference.ThunderCrystalID-256)).setUnlocalizedName("ThunderCrystal").setCreativeTab(CreativeTabs.tabMaterials);
        final Item IceCrystal = (new Item (Reference.IceCrystalID-256)).setUnlocalizedName("IceCrystal").setCreativeTab(CreativeTabs.tabMaterials);
        final Item CrystalofHope = (new Item ((Reference.CrystalofHopeID)-256)).setUnlocalizedName("CrystalofHope").setCreativeTab(CreativeTabs.tabMaterials);
        final Item CrystalofDespair = (new Item ((Reference.CrystalofDespairID)-256)).setUnlocalizedName("CrystalofDesPair").setCreativeTab(CreativeTabs.tabMaterials);
        final Item AirCrystal = (new Item ((Reference.AirCrystalID)-256)).setUnlocalizedName("Air Crystal").setCreativeTab(CreativeTabs.tabMaterials);
        
        
		// Elemental Crystals
		GameRegistry.registerItem(ShardofDarkness, Strings.ShardofDarkness_name);
		GameRegistry.registerItem(ShardofEarth, Strings.ShardofEarth_name);
		GameRegistry.registerItem(ShardofFire,Strings.ShardofFire_name);
		GameRegistry.registerItem(ShardofIce, Strings.ShardofIce_name);
		GameRegistry.registerItem(ShardofLight, Strings.ShardofLight_name);
		GameRegistry.registerItem(ShardofLightning, Strings.ShardofLightning_name);
		GameRegistry.registerItem(ShardofWater, Strings.ShardofWater_name);
		GameRegistry.registerItem(ShardofAir, Strings.ShardofAir_name);
		
		
		GameData.newItemAdded(ShardofDarkness);
		GameData.newItemAdded(ShardofEarth);
		GameData.newItemAdded(ShardofFire);
		GameData.newItemAdded(ShardofIce);
		GameData.newItemAdded(ShardofLight);
		GameData.newItemAdded(ShardofLightning);
		GameData.newItemAdded(ShardofWater);
		GameData.newItemAdded(ShardofAir);
		
		GameRegistry.addShapedRecipe(new ItemStack(EarthCrystal), new Object[] { "EEE","EEE","EEE",Character.valueOf('E'),ShardofEarth });
		GameRegistry.addShapedRecipe(new ItemStack(CrystalofHope), new Object[]{ "LLL","LLL","LLL",Character.valueOf('L'),ShardofLight});
		GameRegistry.addShapedRecipe(new ItemStack(CrystalofDespair), new Object[]{"DDD","DDD","DDD",Character.valueOf('D'),ShardofDarkness});
		GameRegistry.addShapedRecipe(new ItemStack(FireCrystal), new Object[]{"FFF","FFF","FFF",Character.valueOf('F'),ShardofFire});
		GameRegistry.addShapedRecipe(new ItemStack(IceCrystal), new Object[]{"III","III","III",Character.valueOf('I'),ShardofIce});
		GameRegistry.addShapedRecipe(new ItemStack(WaterCrystal), new Object[]{"WWW","WWW","WWW",Character.valueOf('W'),ShardofWater});		
		GameRegistry.addShapedRecipe(new ItemStack(AirCrystal), new Object[]{"AAA","AAA","AAA",Character.valueOf('A'),ShardofAir});
		GameRegistry.addShapedRecipe(new ItemStack(ThunderCrystal), new Object[]{"TTT","TTT","TTT",Character.valueOf('T'),ShardofLightning});

		
		
		
	}
	
	
}
	
	

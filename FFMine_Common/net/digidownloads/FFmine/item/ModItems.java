package net.digidownloads.FFmine.item;

import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import net.digidownloads.FFmine.lib.Strings;
import net.digidownloads.FFmine.item.item;
import net.minecraft.item.ItemStack;






public class ModItems {
	
	public static void init (){
		
		GameRegistry.registerItem(item.ShardofDarkness, Strings.ShardofDarkness_name);
		GameRegistry.registerItem(item.ShardofEarth, Strings.ShardofEarth_name);
		GameRegistry.registerItem(item.ShardofFire,Strings.ShardofFire_name);
		GameRegistry.registerItem(item.ShardofIce, Strings.ShardofIce_name);
		GameRegistry.registerItem(item.ShardofLight, Strings.ShardofLight_name);
		GameRegistry.registerItem(item.ShardofLightning, Strings.ShardofLightning_name);
		GameRegistry.registerItem(item.ShardofWater, Strings.ShardofWater_name);
		
		GameData.newItemAdded(item.ShardofDarkness);
		GameData.newItemAdded(item.ShardofEarth);
		GameData.newItemAdded(item.ShardofFire);
		GameData.newItemAdded(item.ShardofIce);
		GameData.newItemAdded(item.ShardofLight);
		GameData.newItemAdded(item.ShardofLightning);
		GameData.newItemAdded(item.ShardofWater);
		
		GameRegistry.addShapedRecipe(new ItemStack(item.EarthCrystal), new Object[] { "EEE","EEE","EEE",Character.valueOf('E'),item.ShardofEarth });
		GameRegistry.addShapedRecipe(new ItemStack(item.CrystalofHope), new Object[]{ "LLL","LLL","LLL",Character.valueOf('L'),item.ShardofLight});
		GameRegistry.addShapedRecipe(new ItemStack(item.CrystalofDespair), new Object[]{"DDD","DDD","DDD",Character.valueOf('D'),item.ShardofDarkness});
		GameRegistry.addShapedRecipe(new ItemStack(item.FireCrystal), new Object[]{"FFF","FFF","FFF",Character.valueOf('F'),item.ShardofFire});
		GameRegistry.addShapedRecipe(new ItemStack(item.IceCrystal), new Object[]{"III","III","III",Character.valueOf('I'),item.ShardofIce});
		GameRegistry.addShapedRecipe(new ItemStack(item.WaterCrystal), new Object[]{"WWW","WWW","WWW",Character.valueOf('W'),item.ShardofWater});		
		GameRegistry.addShapedRecipe(new ItemStack(item.ThunderCrystal), new Object[]{"TTT","TTT","TTT",Character.valueOf('T'),item.ShardofLightning});
		
		
		
	}
	
	
}
	
	

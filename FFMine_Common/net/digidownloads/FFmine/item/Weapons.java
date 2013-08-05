package net.digidownloads.FFmine.item;

import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import net.digidownloads.FFmine.lib.Reference;
import net.minecraft.item.ItemBow;

public class Weapons {
    
    
    
    
    
    public static void Weapon(){
        
        
        //swords
        
        
        
        
        
        //bows
        
        final ItemBow Ironbow = (ItemBow)(new ItemBow(Reference.IronBowID-256)).setUnlocalizedName("Iron Bow").func_111206_d("Iron Bow");
        final ItemBow Goldbow = (ItemBow)(new ItemBow(Reference.GoldBowID-256)).setUnlocalizedName("Gold Bow").func_111206_d("Gold Bow");
        final ItemBow Diamondbow = (ItemBow)(new ItemBow(Reference.DiamondBowID-256)).setUnlocalizedName("Diamond Bow").func_111206_d("Diamond Bow");
        
        
        GameRegistry.registerItem(Ironbow,"Iron Bow");
        GameRegistry.registerItem(Goldbow,"Gold Bow");
        GameRegistry.registerItem(Diamondbow,"Diamond Bow");
        
        GameData.newItemAdded(Ironbow);
        GameData.newItemAdded(Goldbow);
        GameData.newItemAdded(Diamondbow);
        
        

        //maces
        
        
        
        
        //axes
        
        
        
        
        
    }
    
    
    
    
    
    
    
    public static void Armor() {
        
        
        
        
    }
    

}

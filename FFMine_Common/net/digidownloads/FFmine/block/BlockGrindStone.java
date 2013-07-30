package net.digidownloads.FFmine.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGrindStone extends BlockContainer {
    
    public BlockGrindStone (int id, Material material){
        
        super(id,material);
        
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        // TODO Auto-generated method stub
        return null;
    }
    

}

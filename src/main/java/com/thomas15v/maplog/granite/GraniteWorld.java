package com.thomas15v.maplog.granite;

import com.thomas15v.maplog.plugin.world.World;
import org.granitemc.granite.api.block.BlockTypes;

/**
 * Created by thomas on 10/19/2014.
 */
public class GraniteWorld implements World {

    private org.granitemc.granite.api.world.World world;

    public GraniteWorld(org.granitemc.granite.api.world.World world){
        this.world = world;
    }

    @Override
    public void breakBlock(int x, int y, int z) {
        world.setBlockTypeAtPosition(x, y, z, BlockTypes.air);
    }

    @Override
    public void placeBlock(int x, int y, int z, String block) {
        world.setBlockTypeAtPosition(x, y, z, BlockTypes.getByTechnicalName(block));
    }
}

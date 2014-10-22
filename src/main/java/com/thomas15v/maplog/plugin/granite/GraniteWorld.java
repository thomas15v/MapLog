package com.thomas15v.maplog.plugin.granite;

import com.thomas15v.maplog.plugin.world.Location;
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
    public void setBlock(Location loc, String block) {
        world.setBlockTypeAtPosition(loc.getX(), loc.getY(), loc.getZ(), BlockTypes.getByTechnicalName(block));
    }

    @Override
    public String getBlock(Location location) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}

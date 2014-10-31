package com.thomas15v.maplog.granite;

import com.thomas15v.maplog.plugin.world.Location;
import com.thomas15v.maplog.plugin.world.World;
import org.granitemc.granite.api.block.BlockTypes;

import java.util.UUID;

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
    public String getBlock(Location loc) {
        return world.getBlock(loc.getX(), loc.getY(), loc.getZ()).getBlockType().getTechnicalName();
    }

    @Override
    public String getName() {
        return world.getLevelName();
    }

    @Override
    public UUID getUUID() {
        return null;
    }
}

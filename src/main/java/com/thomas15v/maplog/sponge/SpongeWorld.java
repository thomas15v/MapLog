package com.thomas15v.maplog.sponge;

import com.thomas15v.maplog.plugin.world.Location;
import com.thomas15v.maplog.plugin.world.World;
import org.spongepowered.api.entity.Player;

/**
 * Created by thomas on 18/10/14.
 */
public class SpongeWorld implements World {

    private org.spongepowered.api.world.World world;

    public SpongeWorld(org.spongepowered.api.world.World world){
        this.world = world;
    }

    @Override
    public void setBlock(Location location, String block) {

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

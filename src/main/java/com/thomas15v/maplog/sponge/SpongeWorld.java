package com.thomas15v.maplog.sponge;

import com.thomas15v.maplog.plugin.world.Location;
import com.thomas15v.maplog.plugin.world.World;
import org.spongepowered.api.entity.Player;

import java.util.UUID;

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
        world.setBlock(null, null); //todo dangit sponge
    }

    @Override
    public String getBlock(Location location) {
        return world.getBlock(null).getId(); //todo dangit sponge
    }

    @Override
    public String getName() {
        return world.getName();
    }

    @Override
    public UUID getUUID() {
        return null;
    }
}

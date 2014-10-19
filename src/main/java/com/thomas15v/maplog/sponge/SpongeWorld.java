package com.thomas15v.maplog.sponge;

import com.thomas15v.maplog.plugin.world.World;

/**
 * Created by thomas on 18/10/14.
 */
public class SpongeWorld implements World {

    private org.spongepowered.api.world.World world;

    public SpongeWorld(org.spongepowered.api.world.World world){
        this.world = world;
    }

    @Override
    public void breakBlock(int x, int y, int z) {
        world.setBlock(null, null);
    }

    @Override
    public void placeBlock(int x, int y, int z) {
        world.setBlock(null, null);
    }
}

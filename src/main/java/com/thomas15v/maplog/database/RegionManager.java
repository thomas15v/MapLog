package com.thomas15v.maplog.database;

import org.spongepowered.api.math.Vector3i;

/**
 * Created by thomas on 05/10/14.
 */
public abstract class RegionManager {


    public void loadChunk(String world, Vector3i location){
        loadChunk(world, location.getX(), location.getZ());
    }

    public void loadChunk(String world, int x, int z){
        calculate(x, z);
        loadRegion(world, x, z);
    }

    public void unloadChunk(String world, int x, int z){
        calculate(x, z);
        unloadRegion(world, x, z);
    }

    public void loadLocation(String world, int x, int z){
        calculate(x,z);
        loadChunk(world, x, z);
    }

    public void unloadLocation(String world, int x, int z){
        calculate(x,z);
        unloadChunk(world, x, z);
    }


    protected void calculate(int x, int z){
        x /= 16;
        z /= 16;
    }

    protected abstract void loadRegion(String world, int x, int z);

    protected abstract void unloadRegion(String world, int x, int z);

}

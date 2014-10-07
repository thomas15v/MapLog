package com.thomas15v.maplog.database;

import org.spongepowered.api.math.Vector3i;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by thomas on 05/10/14.
 */
public abstract class RegionLoadManager {

    private Map<RegionInfo, Integer> loadedChunks = new HashMap<RegionInfo, Integer>();

    public void loadChunk(String world, Vector3i location){
        loadChunk(world, location.getX(), location.getZ());
    }

    public void loadChunk(String world, int x, int z){
        calculate(x, z);
        loadChunk(RegionInfo.getRegion(world, x, z));
    }

    private void loadChunk(RegionInfo regionInfo){
        if (!loadedChunks.containsKey(regionInfo)){
            loadRegion(regionInfo);
            loadedChunks.put(regionInfo , 1);
        }
        else
            loadedChunks.put(regionInfo ,loadedChunks.get(regionInfo) + 1);
    }

    public void unLoadChunk(String world, Vector3i location){
        unLoadChunk(world, location.getX(),  location.getZ());
    }

    public void unLoadChunk(String world, int x, int z){
        calculate(x, z);
        unLoadChunk(RegionInfo.getRegion(world, x, z));
    }

    public void unLoadChunk(RegionInfo location){
        if (loadedChunks.containsKey(location)){
            int loaded = loadedChunks.get(location) - 1;
            if (loaded == 0){
                unloadRegion(location);
                loadedChunks.remove(location);
            }
            else
                loadedChunks.put(location, loaded - 1);
        }
    }

    private void calculate(int x, int z){
        x /= 16;
        z /= 16;
    }

    protected abstract void loadRegion(RegionInfo regionInfo);

    protected abstract void unloadRegion(RegionInfo regionInfo);

}

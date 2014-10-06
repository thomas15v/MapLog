package com.thomas15v.maplog.database;

import org.spongepowered.api.math.Vector3i;

import java.util.Objects;

/**
 * Created by thomas on 10/5/2014.
 */
public class RegionInfo {

    private int x;
    private int z;
    private String world;

    public static RegionInfo getRegionForBlock(String world, Vector3i location){
        return getRegionForBlock(world, location.getX(), location.getZ());
    }

    public static RegionInfo getRegionForBlock(String world, int x, int z){
        return getRegion(world, x/256, z/256);
    }

    public static RegionInfo getRegion(String world, int x, int z){
        return new RegionInfo(world, x, z);
    }

    private RegionInfo(String world, int x, int z){
        this.world = world;
        this.x = x;
        this.z = z;
    }

    public String getWorld() {
        return world;
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RegionInfo)
            return this.getWorld() == ((RegionInfo) obj).getWorld() && this.getX() == ((RegionInfo) obj).getX()
                    && this.getZ() == ((RegionInfo) obj).getZ();
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,z,world);
    }

    @Override
    public String toString() {
        return "RegionInfo( x:"+ x + " z: " + z + " world: " + world  + " )";
    }
}

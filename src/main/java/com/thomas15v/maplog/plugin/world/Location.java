package com.thomas15v.maplog.plugin.world;

/**
 * Created by thomas on 10/19/2014.
 */
public class Location {

    private String world;
    private int x;
    private int y;
    private int z;

    public Location(String world, int x, int y, int z){
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getWorld() {
        return world;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}

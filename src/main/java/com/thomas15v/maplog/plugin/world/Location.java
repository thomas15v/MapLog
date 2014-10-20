package com.thomas15v.maplog.plugin.world;

import java.util.Objects;

/**
 * Created by thomas on 10/19/2014.
 */
public class Location {

    private World world;
    private int x;
    private int y;
    private int z;

    public Location(World world, int x, int y, int z){
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
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

    public void setBlock(String block){
        world.setBlock(this, block);
    }

    @Override
    public String toString() {
      return new StringBuilder()
                .append("Location(x: ").append(x)
                .append(" y: ").append(y)
                .append(" z: ").append(z)
                .append(" world: ").append(world.getName())
                .append(" )")
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, world.getName());
    }
}

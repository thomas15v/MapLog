package com.thomas15v.maplog.database;

/**
 * Created by thomas on 10/5/2014.
 */
public class BlockInfoKey {

    private String world;
    private int x;
    private int y;
    private int z;

    public BlockInfoKey(String world, int x, int y , int z){
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BlockInfoKey)
            return this.getWorld() == ((BlockInfoKey) obj).getWorld() && this.getX() == ((BlockInfoKey) obj).getX() &&
                   this.getY() == ((BlockInfoKey) obj).getY() && this.getZ() == ((BlockInfoKey) obj).getZ();
        return false;
    }

    @Override
    public int hashCode() {
        System.out.print("Somehow this has been called investigate tom");
        return new Object[]{x,y,z,world}.hashCode();

    }
}

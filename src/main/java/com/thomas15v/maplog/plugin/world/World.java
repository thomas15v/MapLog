package com.thomas15v.maplog.plugin.world;

/**
 * Created by thomas on 18/10/14.
 */
public interface World {

    void breakBlock(int x, int y, int z);

    void placeBlock(int x, int y, int z, String block);

}

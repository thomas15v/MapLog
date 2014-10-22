package com.thomas15v.maplog.plugin.world;

import com.thomas15v.maplog.plugin.world.Location;
import com.thomas15v.maplog.plugin.world.World;
import com.thomas15v.maplog.testimpl.FakeWorld;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by thomas on 20/10/14.
 */
public class TestWorld {

    private static World world;

    @BeforeClass
    public static void init(){
        world = new FakeWorld("test world");
    }

    @Test
    public void testSetGet(){
        world.setBlock(new Location(world, 0,0,0), "minecraft:air");
        Assert.assertTrue(world.getBlock(new Location(world, 0, 0, 0)).equals("minecraft:air"));
    }
}

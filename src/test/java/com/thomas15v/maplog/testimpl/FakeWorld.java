package com.thomas15v.maplog.testimpl;

import com.thomas15v.maplog.plugin.world.Location;
import com.thomas15v.maplog.plugin.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by thomas on 20/10/14.
 */
public class FakeWorld implements World {

    Map<Location, String> blocks = new HashMap<Location, String>();
    private String name;

    public FakeWorld(String name){
        this.name = name;
    }

    @Override
    public void setBlock(Location location, String block) {
        blocks.put(location, block);
    }

    @Override
    public String getBlock(Location location) {
        if (blocks.containsKey(location))
            return blocks.get(location);
        else
            return "minecraft:air";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public UUID getUUID() {
        return UUID.fromString("e30da058-6063-11e4-928e-b870f466edab");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Location location : blocks.keySet()){
            builder.append(location);
            builder.append(" : ");
            builder.append(blocks.get(location));
            builder.append("\n");
        }
        return builder.toString();
    }
}

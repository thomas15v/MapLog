package com.thomas15v.maplog.plugin.world;

import java.util.UUID;

/**
 * Created by thomas on 18/10/14.
 */
public interface World {

    void setBlock(Location location, String block);

    String getBlock(Location location);

    String getName();

    UUID getUUID();
}

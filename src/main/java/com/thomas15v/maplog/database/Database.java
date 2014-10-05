package com.thomas15v.maplog.database;

import com.thomas15v.maplog.info.BlockInfo;
import org.spongepowered.api.math.Vector3i;
import org.spongepowered.api.world.*;
import org.spongepowered.api.world.World;

/**
 * Created by thomas on 10/4/2014.
 */
public abstract class Database extends ChunkManager {

    public abstract void storeBlockInfo(String world, Vector3i location, BlockInfo blockInfo);

    public abstract BlockInfo getBlockInfo(String world, Vector3i location);

    public abstract void save();
}

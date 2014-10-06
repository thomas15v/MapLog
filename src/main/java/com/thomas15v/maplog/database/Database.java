package com.thomas15v.maplog.database;

import com.thomas15v.maplog.info.BlockInfo;
import org.spongepowered.api.math.Vector3i;

/**
 * Created by thomas on 10/4/2014.
 */
public abstract class Database extends RegionLoadManager {

    public abstract void storeBlockInfo(String world, Vector3i location, BlockInfo blockInfo);

    public abstract BlockInfo getBlockInfo(String world, Vector3i location);

    /**
     * Flushed the not unloaded data to disk/database
     */
    public abstract void save();
}

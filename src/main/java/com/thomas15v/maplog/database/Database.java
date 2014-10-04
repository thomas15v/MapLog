package com.thomas15v.maplog.database;

import com.thomas15v.maplog.info.BlockInfo;
import org.spongepowered.api.math.Vector3i;

/**
 * Created by thomas on 10/4/2014.
 */
public interface Database {

    void storeBlockInfo(String world, Vector3i location, BlockInfo blockInfo);

    BlockInfo getBlockInfo(String world, Vector3i location);

    void save();

}

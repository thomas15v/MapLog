package com.thomas15v.maplog.database.sql;

import com.thomas15v.maplog.database.Database;
import com.thomas15v.maplog.info.BlockInfo;
import org.spongepowered.api.math.Vector3i;

/**
 * Created by thomas on 10/4/2014.
 */
public class SQLdatabase extends Database {

    @Override
    public void storeBlockInfo(String world, Vector3i location, BlockInfo blockInfo) {

    }

    @Override
    public BlockInfo getBlockInfo(String world, Vector3i location) {
        return null;
    }

    @Override
    public void save() {

    }

    @Override
    protected void loadRegion(String world, int x, int z) {

    }

    @Override
    protected void unloadRegion(String world, int x, int z) {

    }
}

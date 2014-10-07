package com.thomas15v.maplog.database;

import com.thomas15v.maplog.info.BlockInfo;
import org.spongepowered.api.math.Vector3i;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thomas on 05/10/14.
 */
public class Region {
    private Map<Vector3i, Object> information;

    public Region(){
        this.information = new HashMap<Vector3i, Object>();
    }

    public void storeBlockInfo(Vector3i location, BlockInfo blockInfo) {
        information.put(location, blockInfo);
    }

    public BlockInfo getBlockInfo(Vector3i location) {
        return (BlockInfo) information.get(location);
    }

    public int getRegionRecordSize(){
        return information.values().size();
    }
}

package com.thomas15v.maplog.database.flatfile;

import com.thomas15v.maplog.database.RegionInfo;
import com.thomas15v.maplog.database.Database;
import com.thomas15v.maplog.database.Region;
import com.thomas15v.maplog.info.BlockInfo;
import org.spongepowered.api.math.Vector3i;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by thomas on 10/4/2014.
 */
public class FlatFileDatabase extends Database {

    Map<RegionInfo, RegionFile> database = new HashMap<RegionInfo, RegionFile>();
    File folder;

    public FlatFileDatabase(File folder) throws Exception {
        if (!folder.exists())
            folder.mkdirs();
        this.folder = folder;
    }


    @Override
    public void storeBlockInfo(String world, Vector3i location, BlockInfo blockInfo) {
        RegionInfo key = RegionInfo.getRegionForBlock(world, location);
        checkKey(key);
        System.out.println(database.get(key) + " " + key);
        database.get(key).getRegion().storeBlockInfo(location, blockInfo);
    }

    @Override
    public BlockInfo getBlockInfo(String world, Vector3i location) {
        RegionInfo key = RegionInfo.getRegionForBlock(world, location);
        checkKey(key);
        return database.get(key).getRegion().getBlockInfo(location);
    }

    private void checkKey(RegionInfo key){
        System.out.println(key);
        if (!database.containsKey(key))
            database.put(key, new RegionFile(folder, key.getWorld(), key.getX(), key.getZ()));
    }

    public void save() {
       for (RegionFile regionFile : database.values())
           regionFile.save();
    }

    @Override
    protected void loadRegion(String world, int x, int z) {
        RegionInfo key = RegionInfo.getRegionForBlock(world, x ,z);
        database.put(key, new RegionFile(folder, key));
    }

    @Override
    protected void unloadRegion(String world, int x, int z) {
        RegionInfo key = RegionInfo.getRegionForBlock(world, x ,z);
        database.get(key).save();
        database.remove(key);
    }
}

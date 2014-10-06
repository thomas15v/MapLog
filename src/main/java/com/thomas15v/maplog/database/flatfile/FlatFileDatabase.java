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

    public FlatFileDatabase(String folder) throws Exception {
        this(new File(folder));
    }

    public FlatFileDatabase(File folder) throws Exception {
        if (!folder.exists())
            folder.mkdirs();
        this.folder = folder;
    }


    @Override
    public void storeBlockInfo(String world, Vector3i location, BlockInfo blockInfo) {
        RegionInfo key = RegionInfo.getRegionForBlock(world, location);
        loadRegion(key);
        database.get(key).getRegion().storeBlockInfo(location, blockInfo);
    }

    @Override
    public BlockInfo getBlockInfo(String world, Vector3i location) {
        RegionInfo key = RegionInfo.getRegionForBlock(world, location);
        loadRegion(key);
        return database.get(key).getRegion().getBlockInfo(location);
    }

    public void save() {
       for (RegionFile regionFile : database.values())
           regionFile.save();
    }

    @Override
    protected void loadRegion(RegionInfo regionInfo) {
        if (!database.containsKey(regionInfo)){
            System.out.println("loaded " + regionInfo);
            database.put(regionInfo, new RegionFile(folder, regionInfo));
        }
    }

    @Override
    protected void unloadRegion(RegionInfo regionInfo) {
        System.out.println("unloaded " + regionInfo);
        if (database.containsKey(regionInfo)){
            database.get(regionInfo).save();
            database.remove(regionInfo);
        }
    }
}

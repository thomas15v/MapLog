package com.thomas15v.maplog.database.flatfile;

import com.thomas15v.maplog.database.BlockInfoKey;
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

    Map<BlockInfoKey, Region> database = new HashMap<BlockInfoKey, Region>();
    File folder;

    public FlatFileDatabase(File folder) throws Exception {
        if (!folder.exists())
            folder.mkdirs();
        this.folder = folder;
    }


    @Override
    public void storeBlockInfo(String world, Vector3i location, BlockInfo blockInfo) {
        BlockInfoKey key = new BlockInfoKey(world, location.getX(), location.getZ(), location.getY());
        if (!database.containsKey(key))
            database.put(key, new Region());
        database.get(key).storeBlockInfo(location, blockInfo);
    }

    @Override
    public BlockInfo getBlockInfo(String world, Vector3i location) {
        BlockInfoKey key = new BlockInfoKey(world, location.getX(), location.getZ(), location.getY());
        if (!database.containsKey(key))
            database.put(key, new Region());
        database.get(key).getBlockInfo(location);
        return null;
    }

    public void save() {
       /* try {
            for (String world : database.keySet()){
                FileOutputStream file = new FileOutputStream(getFileForWorld(world));
                Output output = new Output(file);
                Kryo kryo = new Kryo();
                kryo.writeObject(output, database.get(world));
                output.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }

    private File getFileForWorldRegion(String world, int x, int z){
        return new File(folder, "world"+ File.separator + x + "_" + z +".bin");
    }


    @Override
    protected void loadRegion(String world, int x, int z) {

    }

    @Override
    protected void unloadRegion(String world, int x, int z) {

    }
}

package com.thomas15v.maplog.database.flatfile;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.thomas15v.maplog.database.Region;
import com.thomas15v.maplog.database.RegionInfo;

import java.io.*;

/**
 * Created by thomas on 06/10/14.
 */
public class RegionFile {

    private Region region;
    private File file;
    private final Kryo kryo = new Kryo();

    public RegionFile(File folder,String world, int x, int z) {
        this.file = new File(folder, world + File.separator + x + "_" + z +".bin");
        try {
            if (file.exists()){
                Input input = new Input(new FileInputStream(file));
                this.region = kryo.readObject(input, Region.class);
                input.close();
            }else {
                region = new Region();
                new File(folder, world).mkdirs();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void save(){
        try {
            if (!file.exists())
                file.createNewFile();
            Output output = new Output(new FileOutputStream(file));
            kryo.writeObject(output, this.region);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public RegionFile(File folder, RegionInfo key){
        this(folder,key.getWorld(), key.getX(), key.getZ());
    }

    public Region getRegion() {
        return region;
    }

    public File getFile() {
        return file;
    }
}

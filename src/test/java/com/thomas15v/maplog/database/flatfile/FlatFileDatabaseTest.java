package com.thomas15v.maplog.database.flatfile;

import com.thomas15v.maplog.database.Database;
import com.thomas15v.maplog.info.BlockAction;
import com.thomas15v.maplog.info.BlockInfo;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.spongepowered.api.block.Block;
import org.spongepowered.api.math.Vector3i;

import java.io.File;

/**
 * Created by thomas on 04/10/14.
 */

public class FlatFileDatabaseTest {

    private static Database database;
    private static File testfolder = new File("testsave");

    private static Block dirt = new Block() {
        @Override
        public String getId() {
            return "minecraft:dirt";
        }
    };

    private static Block air = new Block() {
        @Override
        public String getId() {
            return "minecraft:air";
        }
    };

    @BeforeClass
    public static void setupdatabase() throws Exception {
        database = new FlatFileDatabase(testfolder);
        database.loadChunk("testRead", 0 , 0);
        database.storeBlockInfo("testRead", new FakeVector3i(0,0,0), new BlockInfo().addAction(new BlockAction("thomas", dirt)));
        database.unLoadChunk("testRead", 0 , 0);
    }

    @Test
    public void testRead() throws Exception {
        Assert.assertTrue(dirt.getId().equals(database.getBlockInfo("testRead", new FakeVector3i(0, 0, 0)).getBlockInformation().get(0).getBlock().getId()));
    }

    @Test(expected = NullPointerException.class)
    public void testNotExistRead(){
        Assert.assertTrue(dirt.getId().equals(database.getBlockInfo("testRead", new FakeVector3i(0, 0, 1)).getBlockInformation().get(0).getBlock().getId()));
    }

    @AfterClass
    public static void cleanup(){
        testfolder.delete();
    }

    @Test
    public void testNoUpdateBreak() throws Exception {
        Database database1 =  new FlatFileDatabase("currentdatabase");
        if (database1.getBlockInfo("dontdeleteme", new FakeVector3i(0, 0, 0)) == null){
            database1.storeBlockInfo("dontdeleteme", new FakeVector3i(0,0,0), new BlockInfo());
            database1.save();
        }
    }
}

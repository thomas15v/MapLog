package com.thomas15v.maplog.database.flatfile;

import com.thomas15v.maplog.database.Database;
import com.thomas15v.maplog.info.BlockAction;
import com.thomas15v.maplog.info.BlockInfo;
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
    private Block dirt = new Block() {
        @Override
        public String getId() {
            return "minecraft:dirt";
        }
    };

    private Block air = new Block() {
        @Override
        public String getId() {
            return "minecraft:air";
        }
    };
    @Test
    public void testSave() throws Exception {
        Database database = new FlatFileDatabase(new File("testsave"));
        for (int i = 0; i < 8000; i++)
            database.storeBlockInfo("testworld", new FakeVector3i(0,0,i), new BlockInfo());
        database.save();
    }
}

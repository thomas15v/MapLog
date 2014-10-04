package com.thomas15v.maplog.database.flatfile;

import com.thomas15v.maplog.database.Database;
import com.thomas15v.maplog.info.BlockInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.spongepowered.api.math.Vector3i;

import java.io.File;

/**
 * Created by thomas on 04/10/14.
 */

public class FlatFileDatabaseTest {
    @Test
    public void testSave() throws Exception {
        Database database = new FlatFileDatabase(new File("testsave"));
        Vector3i location = new FakeVector3i(0,0,0);
        BlockInfo blockInfo = new BlockInfo();
        database.storeBlockInfo("testworld", location, blockInfo);
        database.save();
    }
}

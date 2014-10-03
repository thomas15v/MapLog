package com.thomas15v.maplog.info;

import com.thomas15v.maplog.util.Time;
import junit.framework.Assert;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.junit.Test;
import org.spongepowered.api.block.Block;

/**
 * Created by thomas on 02/10/14.
 */
public class BlockInfoTest extends BlockInfo {

    @Test
    public void getInformationTest() throws InterruptedException {
        BlockInfo blockInfo = new BlockInfo();
        int time = 59999; //1m in ms - 1

        for (int i = 0; i < 10; i++)
            blockInfo.addAction(new BlockAction(null), DateTime.now().minus(time + i*time));

        int value = blockInfo.getBlockInformationFromPeriod("3m").size();

        Assert.assertTrue(value + " != 3",value == 3);
    }

    @Test
    public void testRollbackForBlock(){

        Block dirt = new Block() {
            @Override
            public String getId() {
                return "minecraft:dirt";
            }
        };

        Block air = new Block() {
            @Override
            public String getId() {
                return "minecraft:air";
            }
        };

        BlockInfo blockInfo = new BlockInfo();
        int time = 59999; //1m in ms - 1

        blockInfo.addAction(new BlockAction(air), DateTime.now().minus(time));
        blockInfo.addAction(new BlockAction(dirt), DateTime.now().minus(time*2));

        blockInfo.getRollBackAction()



    }

}

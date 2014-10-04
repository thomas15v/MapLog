package com.thomas15v.maplog.info;

import junit.framework.Assert;
import org.joda.time.DateTime;
import org.junit.Test;
import org.spongepowered.api.block.Block;

/**
 * Created by thomas on 02/10/14.
 */
public class BlockInfoTest extends BlockInfo {


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
    public void getInformationTest() throws InterruptedException {
        BlockInfo blockInfo = new BlockInfo();
        int time = 59999; //1m in ms - 1

        for (int i = 10; i >= 0; i--)
            blockInfo.addAction(new BlockAction("thomas15v", dirt, DateTime.now().minus(time + i*time)));

        int value = blockInfo.getBlockInformationFromPeriod("3m").size();

        Assert.assertTrue(value + " != 3",value == 3);
    }

    @Test
    public void testRollbackForBlock(){


        BlockInfo blockInfo = new BlockInfo();
        int time = 59999; //1m in ms - 1

        blockInfo.addAction(new BlockAction("thomas15v",air, DateTime.now().minus(time*8)));
        blockInfo.addAction(new BlockAction("thomas15v",dirt, DateTime.now().minus(time*2)));
        blockInfo.addAction(new BlockAction("thomas15v",air, DateTime.now().minus(time)));

        System.out.println(blockInfo.getRollBackAction("1m20s").getBlock().getId());
    }


}

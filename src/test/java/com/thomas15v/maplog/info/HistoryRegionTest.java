package com.thomas15v.maplog.info;

import com.thomas15v.maplog.command.Arguments;
import junit.framework.Assert;
import org.junit.Test;
import org.spongepowered.api.block.Block;

/**
 * Created by thomas on 07/10/14.
 */
public class HistoryRegionTest {

    @Test
    public void testlocation() throws IllegalAccessException {
        Arguments arguments = new Arguments(new String[]{"t:20m","r:40"});
        Point point = new Point(0,50,0);
        HistoryRegion region = new HistoryRegion(arguments, "thomas15v", null, point , null);
        Assert.assertTrue(region.locationInRegion(point));
        Assert.assertFalse(region.locationInRegion(new Point(0,50 + 50,0)));
        Assert.assertFalse(region.locationInRegion(new Point(50,50, 0)));
        Assert.assertFalse(region.locationInRegion(new Point(0,50,50)));

        Assert.assertTrue(region.locationInRegion(new Point(40, 50, 0)));
        Assert.assertTrue(region.locationInRegion(new Point(0,50 + 40,0)));
        Assert.assertTrue(region.locationInRegion(new Point(0,50,40)));
    }

    @Test
    public void testRollBack() throws IllegalAccessException {
        Arguments arguments = new Arguments(new String[]{"t:20m","r:40"});
        Point point = new Point(0,50,0);
        HistoryRegion region = new HistoryRegion(arguments, "thomas15v", null, point , null);
        region.rollback();
    }

}

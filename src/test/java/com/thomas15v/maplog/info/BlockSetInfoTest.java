package com.thomas15v.maplog.info;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by thomas on 01/10/14.
 */
public class BlockSetInfoTest {

    @Test
    public void testdate(){
        Assert.assertSame(new BlockSetInfo(null, null, null).getDate().getDay(), new Date().getDay());
    }

    @Test
    public void hadtile(){
        Assert.assertFalse(new BlockSetInfo(null, null, null).hadTile());
    }
}

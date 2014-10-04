package com.thomas15v.maplog.info;

import org.joda.time.DateTimeComparator;

import java.util.Comparator;

/**
 * Created by thomas on 10/3/2014.
 */
public class BlockActionComperator implements Comparator<BlockAction> {


    @Override
    public int compare(BlockAction o1, BlockAction o2) {
        return DateTimeComparator.getInstance().compare(o1.getDateTime(), o2.getDateTime());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BlockAction)
           return DateTimeComparator.getInstance().equals(((BlockAction) obj).getDateTime());
        return false;
    }
}

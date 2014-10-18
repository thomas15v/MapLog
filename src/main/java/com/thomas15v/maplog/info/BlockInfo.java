package com.thomas15v.maplog.info;

import com.thomas15v.maplog.util.Time;
import org.joda.time.DateTime;
import org.joda.time.Period;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by thomas on 02/10/14.
 */
public class BlockInfo {

    private List<BlockAction> blockInformation;
    private static final BlockActionComperator BLOCK_ACTION_COMPERATOR = new BlockActionComperator();

    public BlockInfo()
    {
        this.blockInformation = new ArrayList<BlockAction>();
    }

    public BlockInfo addAction(BlockAction blockAction){
        this.blockInformation.add(blockAction);
        return this;
    }

    public BlockAction getRollBackAction(Period period){
        return getLastInformationFromPeriod(period);
    }

    public BlockAction getRollBackAction(String period){
        return getLastInformationFromPeriod(Time.getPeriodFromArguments(period));
    }

    //I keep this depricated until I know how NBT tags are stored. Than we can talk about NBT compressions using the same system git works.
    private List<BlockAction> getBlockInformationFromPeriod(String period){
        return getBlockInformationFromPeriod(Time.getPeriodFromArguments(period));
    }

    private List<BlockAction> getBlockInformationFromPeriod(Period period){
        DateTime dateTime = DateTime.now().minus(period);
        List<BlockAction> information = new ArrayList<BlockAction>();
        for (BlockAction action : getBlockInformation()){
            if (action.getDateTime().isAfter(dateTime))
                information.add(action);
        }
        return information;
    }

    private void merge(BlockAction blockAction, List<BlockAction> blockActions){
        /*for (BlockAction b : blockActions)
            blockAction.merge(b);*/
    }

    private BlockAction getLastInformationFromPeriod(Period period){
        DateTime dateTime = DateTime.now().minus(period);
        for (BlockAction action : getBlockInformation()){
            System.out.println(action.getBlock().getId());
            if (action.getDateTime().isAfter(dateTime)){
                return action;
            }
        }
        System.out.println();
        return null;
    }

    public List<BlockAction> getBlockInformation() {
        Collections.sort(blockInformation, BLOCK_ACTION_COMPERATOR);
        return blockInformation;
    }
}

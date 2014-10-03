package com.thomas15v.maplog.info;

import com.thomas15v.maplog.util.Time;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.spongepowered.api.Game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by thomas on 02/10/14.
 */
public class BlockInfo {

    private Map<DateTime, BlockAction> blockInformation;

    public BlockInfo()
    {
        this.blockInformation = new HashMap<DateTime, BlockAction>();
    }

    public void addAction(BlockAction blockAction){
        this.addAction(blockAction, new DateTime());
    }

    public void addAction(BlockAction blockAction, DateTime time){
        this.blockInformation.put(time, blockAction);
    }

    public BlockAction getRollBackAction(Period period){
        return getLastInformationFromPeriod(period);
    }

    public BlockAction getRollBackAction(String period){
        return getLastInformationFromPeriod(Time.getPeriodFromArguments(period));
    }

    protected List<BlockAction> getBlockInformationFromPeriod(String period){
        return getBlockInformationFromPeriod(Time.getPeriodFromArguments(period));
    }

    protected List<BlockAction> getBlockInformationFromPeriod(Period period){
        DateTime dateTime = DateTime.now().minus(period);
        List<BlockAction> information = new ArrayList<BlockAction>();
        for (DateTime date : blockInformation.keySet()){
            if (date.isAfter(dateTime))
                information.add(blockInformation.get(date));
        }
        return information;
    }

    private BlockAction getLastInformationFromPeriod(Period period){
        DateTime dateTime = DateTime.now().minus(period);
        BlockAction blockAction = null;
        for (DateTime date : blockInformation.keySet()){
            if (date.isAfter(dateTime))
                blockAction = blockInformation.get(date);
            else
                break;
        }
        return blockAction;
    }
}

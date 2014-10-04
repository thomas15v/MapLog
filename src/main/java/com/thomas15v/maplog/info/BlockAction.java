package com.thomas15v.maplog.info;

import org.joda.time.DateTime;
import org.spongepowered.api.block.Block;

/**
 * Created by thomas on 02/10/14.
 */
public class BlockAction {

    private Block block;
    private Object tile;
    private DateTime dateTime;
    private String player;


    public BlockAction(String player, Block block){
       this("player", block, new DateTime(), null);
    }

    public BlockAction(String player, Block block, DateTime dateTime){
        this(player, block, dateTime, null);
    }

    public BlockAction(String player, Block block, DateTime dateTime, Object tile){
        this.block = block;
        this.dateTime = dateTime;
        this.tile = tile;
    }

    public void undo(BlockAction blockAction){
        blockAction.block = block;
        blockAction.tile = tile;
    }

    public Block getBlock(){
        return this.block;
    }

    public DateTime getDateTime() {
        return dateTime;
    }
}

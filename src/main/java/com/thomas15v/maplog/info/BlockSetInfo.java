package com.thomas15v.maplog.info;

import org.spongepowered.api.block.Block;

import java.util.Date;

/**
 * Created by thomas on 01/10/14.
 */
public class BlockSetInfo implements Info {
    private Date date;
    private Block oldBlock;
    private Object oldTile;
    private Block newBlock;

    public BlockSetInfo(Block oldBlock, Object oldTile, Block newBlock){
        this.oldBlock = oldBlock;
        this.oldTile = oldTile;
        this.newBlock = newBlock;
        date = new Date();
    }

    public boolean hadTile(){
        return oldTile != null;
    }

    public Date getDate() {
        return date;
    }

    public Block getOldBlock() {
        return oldBlock;
    }

    public Object getOldTile() {
        return oldTile;
    }

    public Block getNewBlock() {
        return newBlock;
    }

    @Override
    public Boolean isReady() {
        return true;
    }
}
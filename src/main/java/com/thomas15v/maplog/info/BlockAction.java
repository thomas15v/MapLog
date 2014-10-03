package com.thomas15v.maplog.info;

import org.spongepowered.api.GameRegistry;
import org.spongepowered.api.block.Block;

/**
 * Created by thomas on 02/10/14.
 */
public class BlockAction {

    private Block block;
    private Object tile;

    public BlockAction(Block block){
       this(block, null);
    }

    public BlockAction(Block block, Object tile){
        this.block = block;
        this.tile = tile;
    }

    public void undo(BlockAction blockAction){
        blockAction.block = block;
        blockAction.tile = tile;
    }

}

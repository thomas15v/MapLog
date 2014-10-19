package com.thomas15v.maplog.plugin.actions;

import com.thomas15v.maplog.plugin.world.Location;

/**
 * Created by thomas on 18/10/14.
 */
public class BlockAction implements Action {
    private String block;
    private Location location;
    private

    protected void setBlock(String block) {
        this.block = block;
    }

    public String getBlock() {
        return block;
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}

package com.thomas15v.maplog.plugin.actions;

/**
 * Created by thomas on 18/10/14.
 */
public abstract class BlockAction implements Action {
    private String block;

    protected void setBlock(String block) {
        this.block = block;
    }

    public String getBlock() {
        return block;
    }
}

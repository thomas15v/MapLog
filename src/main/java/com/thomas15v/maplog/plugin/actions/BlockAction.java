package com.thomas15v.maplog.plugin.actions;

import com.thomas15v.maplog.plugin.world.Location;

/**
 * Created by thomas on 18/10/14.
 */
public class BlockAction extends Action {
    private String block;
    private Location location;

    public BlockAction(String player, String block, Location location) {
        super(player);
        this.block = block;
        this.location = location;
    }


    public String getBlock() {
        return block;
    }

    @Override
    public void undo() {

    }
}

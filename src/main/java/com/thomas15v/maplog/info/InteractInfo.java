package com.thomas15v.maplog.info;

import org.spongepowered.api.entity.Player;
import org.spongepowered.api.world.Location;

/**
 * Created by thomas on 01/10/14.
 */
public class InteractInfo implements Info {
    private Object InventoryBefore;
    private Object InventoryAfter;
    private Player player;
    private Location container;

    public InteractInfo(Player player, Location container){
        //todo player.getinventory();
        this.InventoryBefore = null;
        this.player = player;
        this.container = container;
    }

    @Override
    public Boolean isReady() {
        return false;
    }
}

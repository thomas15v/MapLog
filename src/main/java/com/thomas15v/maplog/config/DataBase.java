package com.thomas15v.maplog.config;

import com.thomas15v.maplog.info.BlockSetInfo;
import com.thomas15v.maplog.info.InteractInfo;
import org.spongepowered.api.block.Block;
import org.spongepowered.api.entity.Player;
import org.spongepowered.api.world.Location;

/**
 * Created by thomas on 01/10/14.
 */
public interface DataBase {

    /**
     * Logs an interaction
     *
     * @param info
     */
    void logInteract(InteractInfo info);

    /**
     * Logs a block change
     *
     * @param info
     */
    void logSet(BlockSetInfo info);
}

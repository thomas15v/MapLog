package com.thomas15v.maplog.plugin;

import com.thomas15v.maplog.plugin.world.World;

/**
 * Created by thomas on 20/10/14.
 */
public interface MapLogPlugin {

    Database getDatabase();

    World getWorldFor(String worldName);

    void setDisabled(boolean value);
}

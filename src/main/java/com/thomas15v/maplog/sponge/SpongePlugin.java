package com.thomas15v.maplog.sponge;

import com.thomas15v.maplog.plugin.Database;
import com.thomas15v.maplog.plugin.MapLogPlugin;
import com.thomas15v.maplog.plugin.world.World;
import org.spongepowered.api.plugin.Plugin;

/**
 * Created by thomas on 10/19/2014.
 */
@Plugin(id = "com.thomas15v.com.thomas15v.maplog", name = "MapLog" , version = "0.1-SNAPSHOT")
public class SpongePlugin implements MapLogPlugin {

    @Override
    public Database getDatabase() {
        return null;
    }

    @Override
    public World getWorldFor(String worldName) {
        return null;
    }
}

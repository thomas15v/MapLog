package com.thomas15v.maplog.granite;

import com.thomas15v.maplog.plugin.Database;
import com.thomas15v.maplog.plugin.MapLogPlugin;
import com.thomas15v.maplog.plugin.world.World;
import org.granitemc.granite.api.plugin.Plugin;

/**
 * Created by thomas on 10/19/2014.
 */

@Plugin(id = "maplog", name = "MapLog" , version = "0.1-SNAPSHOT")
public class GranitePlugin implements MapLogPlugin {

    @Override
    public Database getDatabase() {
        return null;
    }

    @Override
    public World getWorldFor(String worldName) {
        return null;
    }

    @Override
    public void setDisabled(boolean value) {

    }
}

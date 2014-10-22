package com.thomas15v.maplog.granite;

import com.thomas15v.maplog.plugin.sql.Database;
import com.thomas15v.maplog.plugin.MapLogPlugin;
import com.thomas15v.maplog.plugin.world.World;
import org.granitemc.granite.api.plugin.Plugin;

/**
 * Created by thomas on 10/19/2014.
 */

@Plugin(id = "com.thomas15v.com.thomas15v.maplog", name = "MapLog" , version = "0.1-SNAPSHOT")
public class GranitePlugin implements MapLogPlugin {

    @Override
    public Database getDatabase() {
        return null;
    }

    @Override
    public World getWorldFor(String worldName) {
        return null;
    }
}

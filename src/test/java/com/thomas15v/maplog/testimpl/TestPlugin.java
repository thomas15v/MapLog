package com.thomas15v.maplog.testimpl;

import com.thomas15v.maplog.plugin.Database;
import com.thomas15v.maplog.plugin.MapLogPlugin;
import com.thomas15v.maplog.plugin.world.World;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thomas on 20/10/14.
 */
public class TestPlugin implements MapLogPlugin {

    private Database database;
    private Map<String, World> worlds;

    public TestPlugin(){
        this.database = new Database(null, null, null, null); //todo idk
        this.worlds = new HashMap<String, World>();
    }

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

package com.thomas15v.maplog;

import com.thomas15v.maplog.database.Database;
import com.thomas15v.maplog.database.flatfile.FlatFileDatabase;
import org.spongepowered.api.event.SpongeEventHandler;
import org.spongepowered.api.event.state.ServerStartingEvent;
import org.spongepowered.api.event.world.ChunkLoadEvent;
import org.spongepowered.api.plugin.Plugin;

import java.io.File;

@Plugin(id="MapLogPlugin", name="MapLog", version="0.1-beta")
public class MapLog {
    private Database database;

    @SpongeEventHandler
    public void onStart(ServerStartingEvent event){
        try {
            database = new FlatFileDatabase(new File("config/MapLog/"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SpongeEventHandler
    public void OnChunkLoad(ChunkLoadEvent event){
        database.loadChunk( /*event.getWorld().getName(),*/ "world", event.getChunk().getPosition()  );
    }

}

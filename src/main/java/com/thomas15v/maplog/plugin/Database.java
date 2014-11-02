package com.thomas15v.maplog.plugin;

import static com.thomas15v.maplog.plugin.database.Tables.PLAYERS;
import static com.thomas15v.maplog.plugin.database.Tables.WORLDS;

import com.googlecode.flyway.core.Flyway;
import com.thomas15v.maplog.plugin.world.Location;
import com.thomas15v.maplog.plugin.world.Player;
import com.thomas15v.maplog.plugin.world.World;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

;

/**
 * Created by thomas on 10/19/2014.
 */
public class Database {

    private Connection conn = null;
    private String username;
    private String password;
    private String url;
    private MapLogPlugin plugin;
    private DSLContext create = null;

    private Map<UUID, Integer> playeridcache = new HashMap<UUID, Integer>();
    private Map<UUID, Integer> worldidcache = new HashMap<UUID, Integer>();

    public Database(String username, String password, String url, MapLogPlugin plugin){
        this.username = username;
        this.password = password;
        this.url = url;
        this.plugin = plugin;
        checkConnect();
        checkDatabaseSetup();
    }

    private void checkDatabaseSetup() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(url, username, password);
        flyway.migrate();
        this.create = DSL.using(conn, SQLDialect.MYSQL);
    }

    public void checkConnect(){
        try {
            if (conn == null || conn.isClosed()){
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                this.conn = DriverManager.getConnection(url, username, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
            plugin.setDisabled(true);
        }
    }

    public void updateWorldList(World... worlds){
        System.out.println(create.newRecord(WORLDS, worlds[0]).getName());
        //todo look for a jooq way to solve this, loops are so juk!!
        for (World world : worlds) {
            create.insertInto(WORLDS).
                    set(create.newRecord(WORLDS, world)).
                    onDuplicateKeyUpdate()
                    .set(WORLDS.NAME, world.getName()).
                    execute();
        }
    }

    public void logBlock(Player player, Location location, String block){


    }

    public void onPlayerJoin(Player player){
        checkConnect();
        create.insertInto(PLAYERS).
                set(create.newRecord(PLAYERS, player)).//This is jooq POJO google it :)
                onDuplicateKeyUpdate().
                set(PLAYERS.USERNAME, player.getUserName()).
                execute();

    }

    public int getPlayerIdFor(UUID player){
        if (!playeridcache.containsKey(player)) {
            checkConnect();
            int playerid = create.select(PLAYERS.ID).
                    from(PLAYERS).
                    where(PLAYERS.UUID.eq(player)).
                    execute();
            if (playerid != 0)
                playeridcache.put(player, playerid);
        }
        return playeridcache.get(player);
    }

    public int getWorldIdFor(UUID world){
        if (!worldidcache.containsKey(world)) {
            checkConnect();
            int worldid = create.select(WORLDS.ID).
                    from(WORLDS).
                    where(WORLDS.UUID.eq(world)).
                    execute();
            if (worldid != 0)
                worldidcache.put(world, worldid);
        }
        return worldidcache.get(world);
    }

    pr
}

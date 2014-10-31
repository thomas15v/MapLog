package com.thomas15v.maplog.plugin;

import com.googlecode.flyway.core.Flyway;
import com.thomas15v.maplog.plugin.MapLogPlugin;
import com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord;
import com.thomas15v.maplog.plugin.world.Location;
import com.thomas15v.maplog.plugin.world.Player;
import com.thomas15v.maplog.plugin.world.World;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;
import java.util.List;

import static com.thomas15v.maplog.plugin.database.Tables.*;

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
        //todo look for a jooq way to solve this loops are so juk!!
        for (World world : worlds)
            create.insertInto(WORLDS).
                    set(create.newRecord(WORLDS, world)).
                    onDuplicateKeyUpdate()
                    .set(WORLDS.NAME, world.getName()).
                    execute();
    }

    public void logBreakBlock(Player Player, Location location, String Block){
        create.insertInto(BLOCKS).values()
    }

    public void onPlayerJoin(Player player){
        checkConnect();
        create.insertInto(PLAYERS).
                set(create.newRecord(PLAYERS, player)).//This is jooq POJO google it :)
                onDuplicateKeyUpdate().
                set(PLAYERS.LASTSEEN, player.getLastSeen()).
                set(PLAYERS.USERNAME, player.getUserName()).
                execute();
    }
}

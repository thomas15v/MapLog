package com.thomas15v.maplog.plugin;

import com.googlecode.flyway.core.Flyway;
import com.thomas15v.maplog.plugin.MapLogPlugin;
import com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord;
import com.thomas15v.maplog.plugin.world.Location;
import com.thomas15v.maplog.plugin.world.Player;
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

    private final String PLAYER_SCHEME = "CREATE TABLE players (\n" +
            "\tid BIGINT NOT NULL AUTO_INCREMENT UNIQUE,\n" +
            "\tUUID VARCHAR(36) NOT NULL UNIQUE,\n" +
            "\tUserName CHAR(16) NOT NULL,\n" +
            "\tLastSeen DATETIME NOT NULL,\n" +
            "\tPRIMARY KEY(id),\n" +
            "\tKEY uuidname(UUID)\n" +
            ");";


    public Database(String username, String password, String url, MapLogPlugin plugin){
        this.username = username;
        this.password = password;
        this.url = url;
        this.plugin = plugin;
        checkConnect();
        checkDatabaseSetup();
    }

    private void checkDatabaseSetup() {
        /*
        List<String> tables = create.fetch("SHOW TABLES").getValues(0, String.class);
        if (!tables.contains("players"))
            create.fetch(PLAYER_SCHEME);*/

        Flyway flyway = new Flyway();
        flyway.setDataSource(url, username, password);
        flyway.migrate();


    }

    public void checkConnect(){
        try {
            if (conn == null || conn.isClosed()){
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                this.conn = DriverManager.getConnection(url, username, password);
                this.create = DSL.using(conn, SQLDialect.MYSQL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            plugin.setDisabled(true);
        }
    }


    public void logBreakBlock(String Player, Location location, String Block){

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

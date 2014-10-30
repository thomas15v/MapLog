package com.thomas15v.maplog.plugin;

import com.thomas15v.maplog.plugin.MapLogPlugin;
import com.thomas15v.maplog.plugin.world.Location;
import com.thomas15v.maplog.plugin.world.Player;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;;

import java.sql.Connection;
import java.sql.DriverManager;
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

  /*  private final String PLAYERS = "CREATE TABLE players (\n" +
            "\tid BIGINT NOT NULL AUTO_INCREMENT,\n" +
            "\tUUID BINARY(16) NOT NULL,\n" +
            "\tusername CHAR(16) NOT NULL,\n" +
            "\tlastseen DATETIME NOT NULL,\n" +
            "\tPRIMARY KEY(id)\n" +
            ");";
*/
    public Database(String username, String password, String url, MapLogPlugin plugin){
        this.username = username;
        this.password = password;
        this.url = url;
        this.plugin = plugin;
        checkConnect();
        checkDatabaseSetup();
    }

    private void checkDatabaseSetup() {
        create = DSL.using(conn, SQLDialect.MYSQL);
        List<String> tables = create.fetch("SHOW TABLES").getValues(0, String.class);
       /* if (!tables.contains("players"))
            create.fetch(PLAYERS);*/
    }

    public void checkConnect(){
        try {
            if (conn == null || conn.isClosed()){
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection(url, username, password);
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

    }

    public void testshit(){
        Player player = create.select(PLAYERS.USERNAME, PLAYERS.UUID, PLAYERS.LASTSEEN).from(PLAYERS).fetchInto(Player.class).get(0);
        System.out.println(player.getUserName());
        System.out.println(player.getUUID());
        System.out.println(player.getLastSeen());
    }
}

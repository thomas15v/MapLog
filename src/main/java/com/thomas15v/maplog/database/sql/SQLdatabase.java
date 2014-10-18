package com.thomas15v.maplog.database.sql;

import com.thomas15v.maplog.database.Database;
import com.thomas15v.maplog.database.RegionInfo;
import com.thomas15v.maplog.info.BlockInfo;
import org.spongepowered.api.math.Vector3i;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by thomas on 10/4/2014.
 */
public class SQLdatabase extends Database {

    private String url;
    private String username;
    private String password;

    private Connection connection;

    public SQLdatabase(){

    }

    public SQLdatabase(String host, int port, String database, String Username, String password) throws Exception {
        this.url = getURL(host, port, database);
        this.username = Username;
        this.password = password;
        connect();
    }

    @Override
    public void storeBlockInfo(String world, Vector3i location, BlockInfo blockInfo) {

    }

    @Override
    public BlockInfo getBlockInfo(String world, Vector3i location) {
        return null;
    }

    @Override
    public void save() {

    }

    @Override
    protected void loadRegion(RegionInfo regionInfo) {

    }

    @Override
    protected void unloadRegion(RegionInfo regionInfo) {

    }

    private void connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        if (connection == null || connection.isClosed())
            connection = DriverManager.getConnection(url, username, password);
    }

    private String getURL(String host, int port, String database){
        return "jdbc:mysql://" + host + ":" + port + "/" + database;
    }
}

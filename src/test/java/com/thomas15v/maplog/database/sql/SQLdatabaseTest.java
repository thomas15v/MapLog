package com.thomas15v.maplog.database.sql;

import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by thomas on 08/10/14.
 */
public class SQLdatabaseTest {

    @Test
    public void TestDatabaseConnection() throws Exception {
        new SQLdatabase("localhost", 3306, "maplog", "root", "" );
    }
}

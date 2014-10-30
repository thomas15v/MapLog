package com.thomas15v.maplog.plugin;

import org.junit.Test;

/**
 * Created by thomas on 30/10/14.
 */
public class DatabaseTest {

    @Test
    public void testInit(){
        new Database("root", "", "jdbc:mysql://localhost:3306/maplog", null).testshit();
    }

}

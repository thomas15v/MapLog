package com.thomas15v.maplog;

import org.junit.Test;

/**
 * Created by thomas on 14/10/14.
 */
public class numbertest {

    public Integer getNumber(){
        int number = 8;
        return number;
    }

    @Test
    public void testthiscrap(){
        getNumber().toString();
    }

    public int getNumbernative(){
        return 8;
    }

}

package com.thomas15v.maplog.command;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by thomas on 02/10/14.
 */
public class ArgumentsTest {

    @Test
    public void working() throws IllegalAccessException {
        Arguments arguments = new Arguments(new String[]{"u:thomas15v", "t:8h", "r:20"});
        Assert.assertTrue("Username is wrong: " + arguments.getUsername(), arguments.getUsername().equals("thomas15v"));
        Assert.assertTrue("Radius is wrong: " + arguments.getRadius() , arguments.getRadius() == 20);
        Assert.assertTrue("Time is wrong " + arguments.getPeriod(), arguments.getPeriod().getHours() == 8);
    }

    @Test(expected=IllegalArgumentException.class)
    public void wrongTypes() throws IllegalAccessException {
        new Arguments(new String[]{"b:thomas15v", "k:8h", "z:20"});
    }

    @Test(expected=IllegalArgumentException.class)
    public void notEnoughArguments() throws IllegalAccessException {
        new Arguments(new String[]{"u:thomas15v", "t:8h"});
    }

    @Test(expected=IllegalArgumentException.class)
    public void notAnInteger() throws IllegalAccessException {
        new Arguments(new String[]{"u:thomas15v", "t:8h", "r:Nooooooooooooooooooooooooooooooooooooo"});
    }
}

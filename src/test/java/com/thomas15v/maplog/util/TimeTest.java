package com.thomas15v.maplog.util;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by thomas on 02/10/14.
 */
public class TimeTest {

    @Test
    public void seconds(){
        Assert.assertTrue(Time.getPeriodFromArguments("1s").getSeconds() == 1);
    }

    @Test
    public void minutes(){
        Assert.assertTrue(Time.getPeriodFromArguments("1m").getMinutes() == 1);
    }

    @Test
    public void hours(){
        Assert.assertTrue(Time.getPeriodFromArguments("1h").getHours() == 1);
    }

    @Test
    public void days(){
        Assert.assertTrue(Time.getPeriodFromArguments("1d").getDays() == 1);
    }

    @Test
    public void weeks(){
        Assert.assertTrue(Time.getPeriodFromArguments("1w").getWeeks() == 1);
    }

}

package com.thomas15v.maplog.plugin.info;

import java.util.Calendar;

/**
 * Created by thomas15v on 21/10/14.
 */
public class Time {
    public String time;

    //SQL time format M/D/Y/H/M/S

    public Time(){
        System.out.print(Calendar.getInstance().toString());
    }

}

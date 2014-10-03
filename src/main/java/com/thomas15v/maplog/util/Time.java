package com.thomas15v.maplog.util;

import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

/**
 * Created by thomas on 02/10/14.
 */
public class Time {

    public static final String SECOND = "s";
    public static final String MINUTE = "m";
    public static final String HOUR = "h";
    public static final String DAY = "d";
    public static final String WEEK = "w";

    private static final PeriodFormatter PERIOD_FORMATTER = new PeriodFormatterBuilder().
            appendWeeks().
            appendSuffix(WEEK).
            appendDays().
            appendSuffix(DAY).
            appendMinutes().
            appendSuffix(MINUTE).
            appendHours().
            appendSuffix(HOUR).
            appendSeconds().
            appendSuffix(SECOND).
            toFormatter();


    public static Period getPeriodFromArguments(String string){
        return PERIOD_FORMATTER.parsePeriod(string);
    }
}

package com.thomas15v.maplog.command;

import com.thomas15v.maplog.util.Time;
import org.joda.time.Period;

/**
 * Created by thomas on 02/10/14.
 */
public class Arguments {

    public final char USER = 'u';
    public final char TIME = 't';
    public final char RADIUS = 'r';
    public final char BLOCK = 'b';
    public final String INSERT = ":";

    private String username;
    private int radius;
    private Period period;

    public Arguments(String[] args) throws IllegalAccessException {
        for (String parameter : args){
            String[] instruction = parameter.split(INSERT);
            char type = instruction[0].toLowerCase().charAt(0);
            String value = instruction[1];

            switch (type){
                case USER:
                    this.username = value;
                    break;
                case TIME:
                    try {
                        this.period = Time.getPeriodFromArguments(value);
                    }
                    catch (Exception e){
                        throw new IllegalArgumentException(value + " is not a valid time format");
                    }
                    break;
                case RADIUS:
                    try {
                        this.radius = Integer.parseInt(value);
                    }catch (NumberFormatException e){
                        throw new IllegalArgumentException(value + " is not a valid radius!");
                    }

                    break;
                default:
                    throw new IllegalArgumentException("Unknow type: " + type);
            }
        }
        validate();
    }

    private void validate() throws IllegalAccessException {
        if (getUsername() == null)
            throw new IllegalArgumentException("An username is required!");
        if (getPeriod() == null)
            throw  new IllegalArgumentException("We need a time to function");
        if (getRadius() == 0)
            throw new IllegalArgumentException("A radius of 0 is not valid");
    }

    public String getUsername() {
        return username;
    }

    public int getRadius() {
        return radius;
    }

    public Period getPeriod() {
        return period;
    }
}

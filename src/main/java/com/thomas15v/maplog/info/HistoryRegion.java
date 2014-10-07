package com.thomas15v.maplog.info;

import com.thomas15v.maplog.command.Arguments;
import com.thomas15v.maplog.database.Database;
import org.spongepowered.api.math.Vector3i;

/**
 * Created by thomas on 07/10/14.
 */

/**
 * This class defines all the history what happened in a region. And can be rollback or redone (using restore).
 */
public class HistoryRegion {

    private Vector3i point1;
    private Vector3i point2;
    private String executer;
    private Database database;


    public HistoryRegion(Arguments arguments, String executer , Vector3i location, Database database){
        //todo clean this up noob!!!
        this.executer = executer;
        this.database = database;

        int x1 = location.getX() + arguments.getRadius();
        int y1 = location.getY() + arguments.getRadius();
        int z1 = location.getZ() + arguments.getRadius();
        int x2 = location.getX() - arguments.getRadius();
        int y2 = location.getY() - arguments.getRadius();
        int z2 = location.getZ() - arguments.getRadius();

        validateHeight(y1);
        validateHeight(y2);

        point1 = new /*SpongeVector3i*/Point(x1 > x2 ? x1 : x2, y1 > y2 ? y1 : y2  , z1 > z2 ? z1 : z2 );
        point2 = new /*SpongeVector3i*/Point(x1 < x2 ? x1 : x2, y1 < y2 ? y1 : y2  , z1 < z2 ? z1 : z2 );
    }

    public void restore(){

    }

    public void rollback(){

    }

    private void validateHeight(int y){
        if (y > 256)
            y = 256;
        if (y <= 0)
            y = 0;
    }

    public boolean locationInRegion(Vector3i location){
        return      point1.getX() >= location.getX() && location.getX() >= point2.getX()
                &&  point1.getY() >= location.getY() && location.getY() >= point2.getY()
                &&  point1.getZ() >= location.getZ() && location.getZ() >= point2.getZ();
    }

}

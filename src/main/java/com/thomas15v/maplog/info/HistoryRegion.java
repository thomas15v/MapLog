package com.thomas15v.maplog.info;

import com.thomas15v.maplog.command.Arguments;
import com.thomas15v.maplog.database.Database;
import org.spongepowered.api.entity.Player;
import org.spongepowered.api.math.Vector3i;

/**
 * Created by thomas on 07/10/14.
 */

/**
 * This class defines all the history what happened in a region. And can be rollback or redone (using restore).
 */
public class HistoryRegion {

    Vector3i point1;
    Vector3i point2;

    public HistoryRegion(Arguments arguments, Player player, Database database){
        point1 = new SpongeVector3i(player.getPosition().getX() + arguments.getRadius(), 0 , player.getPosition().getZ() + arguments.getRadius());
        point2 = new SpongeVector3i(player.getPosition().getX() - arguments.getRadius(), 0 , player.getPosition().getZ() + arguments.getRadius());
    }

    public void restore(){

    }

    public void rollback(){

    }

}

package com.thomas15v.maplog.plugin;

import com.thomas15v.maplog.plugin.world.Location;
import com.thomas15v.maplog.plugin.world.Player;
import com.thomas15v.maplog.testimpl.FakeWorld;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by thomas on 30/10/14.
 */
public class DatabaseTest {

    @Test
    public void testInit(){
        Database database =  new Database("root", "", "jdbc:mysql://localhost:3306/maplog", null);
       // database.testshit();
        database.onPlayerJoin(new Player() {
            @Override
            public UUID getUUID() {
                return UUID.fromString("e30da058-6063-11e4-928e-b870f466edab");
            }


            @Override
            public String getUserName() {
                return "MrBigNoob";
            }


            @Override
            public Timestamp getLastSeen() {
                return new Timestamp(System.currentTimeMillis());
            }

        });
        database.updateWorldList(new FakeWorld("FakeWorld"));
        database.logBlock(new Player() {
            @Override
            public UUID getUUID() {
                return UUID.fromString("e30da058-6063-11e4-928e-b870f466edab");
            }

            @Override
            public String getUserName() {
                return "MrBigNoob";
            }


            @Override
            public Timestamp getLastSeen() {
                return new Timestamp(System.currentTimeMillis());
            }

        }, new Location(new FakeWorld("FakeWorld"), 0, 0, 0), "minecraft.stone");
        System.out.println(database.getPlayerIdFor(UUID.fromString("e30da058-6063-11e4-928e-b870f466edab")));
    }

}

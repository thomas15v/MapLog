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

            //@Override
            public void setUUID(UUID uuid) {

            }

            @Override
            public String getUserName() {
                return "MrBigNoob";
            }

            //@Override
            public void setUserName(String name) {

            }

            @Override
            public Timestamp getLastSeen() {
                return new Timestamp(System.currentTimeMillis());
            }

            //@Override
            public void setLastSeen(Timestamp lastSeen) {

            }
        });
        database.updateWorldList(new FakeWorld("FakeWorld"));
        database.logBreakBlock(new Player() {
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

        }, new Location(new FakeWorld("FakeWorld"), 0,0,0), "minecraft.stone");
    }

}

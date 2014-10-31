package com.thomas15v.maplog.plugin.world;

import org.jooq.impl.SQLDataType;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by thomas on 30/10/14.
 */
public interface Player {

    UUID getUUID();
    //void setUUID(UUID uuid);

    String getUserName();
    //void setUserName(String name);

    Timestamp getLastSeen();
    //void setLastSeen(Timestamp lastSeen);
}

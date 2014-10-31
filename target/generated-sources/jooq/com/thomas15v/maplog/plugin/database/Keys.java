/**
 * This class is generated by jOOQ
 */
package com.thomas15v.maplog.plugin.database;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>maplog</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, java.lang.Integer> IDENTITY_BLOCKS = Identities0.IDENTITY_BLOCKS;
	public static final org.jooq.Identity<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord, java.lang.Long> IDENTITY_PLAYERS = Identities0.IDENTITY_PLAYERS;
	public static final org.jooq.Identity<com.thomas15v.maplog.plugin.database.tables.records.WorldsRecord, java.lang.Integer> IDENTITY_WORLDS = Identities0.IDENTITY_WORLDS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord> KEY_BLOCKS_PRIMARY = UniqueKeys0.KEY_BLOCKS_PRIMARY;
	public static final org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord> KEY_PLAYERS_PRIMARY = UniqueKeys0.KEY_PLAYERS_PRIMARY;
	public static final org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord> KEY_PLAYERS_ID = UniqueKeys0.KEY_PLAYERS_ID;
	public static final org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord> KEY_PLAYERS_UUID = UniqueKeys0.KEY_PLAYERS_UUID;
	public static final org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.WorldsRecord> KEY_WORLDS_PRIMARY = UniqueKeys0.KEY_WORLDS_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, java.lang.Integer> IDENTITY_BLOCKS = createIdentity(com.thomas15v.maplog.plugin.database.tables.Blocks.BLOCKS, com.thomas15v.maplog.plugin.database.tables.Blocks.BLOCKS.ID);
		public static org.jooq.Identity<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord, java.lang.Long> IDENTITY_PLAYERS = createIdentity(com.thomas15v.maplog.plugin.database.tables.Players.PLAYERS, com.thomas15v.maplog.plugin.database.tables.Players.PLAYERS.ID);
		public static org.jooq.Identity<com.thomas15v.maplog.plugin.database.tables.records.WorldsRecord, java.lang.Integer> IDENTITY_WORLDS = createIdentity(com.thomas15v.maplog.plugin.database.tables.Worlds.WORLDS, com.thomas15v.maplog.plugin.database.tables.Worlds.WORLDS.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord> KEY_BLOCKS_PRIMARY = createUniqueKey(com.thomas15v.maplog.plugin.database.tables.Blocks.BLOCKS, com.thomas15v.maplog.plugin.database.tables.Blocks.BLOCKS.ID);
		public static final org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord> KEY_PLAYERS_PRIMARY = createUniqueKey(com.thomas15v.maplog.plugin.database.tables.Players.PLAYERS, com.thomas15v.maplog.plugin.database.tables.Players.PLAYERS.ID);
		public static final org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord> KEY_PLAYERS_ID = createUniqueKey(com.thomas15v.maplog.plugin.database.tables.Players.PLAYERS, com.thomas15v.maplog.plugin.database.tables.Players.PLAYERS.ID);
		public static final org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord> KEY_PLAYERS_UUID = createUniqueKey(com.thomas15v.maplog.plugin.database.tables.Players.PLAYERS, com.thomas15v.maplog.plugin.database.tables.Players.PLAYERS.UUID);
		public static final org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.WorldsRecord> KEY_WORLDS_PRIMARY = createUniqueKey(com.thomas15v.maplog.plugin.database.tables.Worlds.WORLDS, com.thomas15v.maplog.plugin.database.tables.Worlds.WORLDS.ID);
	}
}

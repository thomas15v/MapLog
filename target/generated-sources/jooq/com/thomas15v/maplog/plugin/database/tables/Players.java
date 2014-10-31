/**
 * This class is generated by jOOQ
 */
package com.thomas15v.maplog.plugin.database.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Players extends org.jooq.impl.TableImpl<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord> {

	private static final long serialVersionUID = 57005482;

	/**
	 * The singleton instance of <code>maplog.players</code>
	 */
	public static final com.thomas15v.maplog.plugin.database.tables.Players PLAYERS = new com.thomas15v.maplog.plugin.database.tables.Players();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord> getRecordType() {
		return com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord.class;
	}

	/**
	 * The column <code>maplog.players.id</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>maplog.players.UUID</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord, java.util.UUID> UUID = createField("UUID", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>maplog.players.UserName</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord, java.lang.String> USERNAME = createField("UserName", org.jooq.impl.SQLDataType.CHAR.length(16).nullable(false), this, "");

	/**
	 * The column <code>maplog.players.LastSeen</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord, java.sql.Timestamp> LASTSEEN = createField("LastSeen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * Create a <code>maplog.players</code> table reference
	 */
	public Players() {
		this("players", null);
	}

	/**
	 * Create an aliased <code>maplog.players</code> table reference
	 */
	public Players(java.lang.String alias) {
		this(alias, com.thomas15v.maplog.plugin.database.tables.Players.PLAYERS);
	}

	private Players(java.lang.String alias, org.jooq.Table<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Players(java.lang.String alias, org.jooq.Table<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.thomas15v.maplog.plugin.database.Maplog.MAPLOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord, java.lang.Long> getIdentity() {
		return com.thomas15v.maplog.plugin.database.Keys.IDENTITY_PLAYERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord> getPrimaryKey() {
		return com.thomas15v.maplog.plugin.database.Keys.KEY_PLAYERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.PlayersRecord>>asList(com.thomas15v.maplog.plugin.database.Keys.KEY_PLAYERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.thomas15v.maplog.plugin.database.tables.Players as(java.lang.String alias) {
		return new com.thomas15v.maplog.plugin.database.tables.Players(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.thomas15v.maplog.plugin.database.tables.Players rename(java.lang.String name) {
		return new com.thomas15v.maplog.plugin.database.tables.Players(name, null);
	}
}

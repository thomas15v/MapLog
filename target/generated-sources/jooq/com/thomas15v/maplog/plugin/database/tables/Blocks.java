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
public class Blocks extends org.jooq.impl.TableImpl<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord> {

	private static final long serialVersionUID = -1005258029;

	/**
	 * The singleton instance of <code>maplog.blocks</code>
	 */
	public static final com.thomas15v.maplog.plugin.database.tables.Blocks BLOCKS = new com.thomas15v.maplog.plugin.database.tables.Blocks();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord> getRecordType() {
		return com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord.class;
	}

	/**
	 * The column <code>maplog.blocks.id</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>maplog.blocks.X</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, java.lang.Integer> X = createField("X", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>maplog.blocks.Y</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, java.lang.Integer> Y = createField("Y", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>maplog.blocks.z</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, java.lang.Integer> Z = createField("z", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>maplog.blocks.worldid</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, java.lang.Integer> WORLDID = createField("worldid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>maplog.blocks.playerid</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, java.lang.Integer> PLAYERID = createField("playerid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>maplog.blocks.placed</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, java.sql.Timestamp> PLACED = createField("placed", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>maplog.blocks.blockid</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, java.lang.String> BLOCKID = createField("blockid", org.jooq.impl.SQLDataType.CHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>maplog.blocks.DATA</code>.
	 */
	public final org.jooq.TableField<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, byte[]> DATA = createField("DATA", org.jooq.impl.SQLDataType.BLOB.length(65535), this, "");

	/**
	 * Create a <code>maplog.blocks</code> table reference
	 */
	public Blocks() {
		this("blocks", null);
	}

	/**
	 * Create an aliased <code>maplog.blocks</code> table reference
	 */
	public Blocks(java.lang.String alias) {
		this(alias, com.thomas15v.maplog.plugin.database.tables.Blocks.BLOCKS);
	}

	private Blocks(java.lang.String alias, org.jooq.Table<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord> aliased) {
		this(alias, aliased, null);
	}

	private Blocks(java.lang.String alias, org.jooq.Table<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.thomas15v.maplog.plugin.database.Maplog.MAPLOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord, java.lang.Integer> getIdentity() {
		return com.thomas15v.maplog.plugin.database.Keys.IDENTITY_BLOCKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord> getPrimaryKey() {
		return com.thomas15v.maplog.plugin.database.Keys.KEY_BLOCKS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.thomas15v.maplog.plugin.database.tables.records.BlocksRecord>>asList(com.thomas15v.maplog.plugin.database.Keys.KEY_BLOCKS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.thomas15v.maplog.plugin.database.tables.Blocks as(java.lang.String alias) {
		return new com.thomas15v.maplog.plugin.database.tables.Blocks(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.thomas15v.maplog.plugin.database.tables.Blocks rename(java.lang.String name) {
		return new com.thomas15v.maplog.plugin.database.tables.Blocks(name, null);
	}
}

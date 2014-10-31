/**
 * This class is generated by jOOQ
 */
package com.thomas15v.maplog.plugin.database.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorldsRecord extends org.jooq.impl.UpdatableRecordImpl<com.thomas15v.maplog.plugin.database.tables.records.WorldsRecord> implements org.jooq.Record3<java.lang.Integer, java.util.UUID, java.lang.String> {

	private static final long serialVersionUID = 1222377349;

	/**
	 * Setter for <code>maplog.worlds.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>maplog.worlds.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>maplog.worlds.UUID</code>.
	 */
	public void setUuid(java.util.UUID value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>maplog.worlds.UUID</code>.
	 */
	public java.util.UUID getUuid() {
		return (java.util.UUID) getValue(1);
	}

	/**
	 * Setter for <code>maplog.worlds.worldname</code>.
	 */
	public void setWorldname(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>maplog.worlds.worldname</code>.
	 */
	public java.lang.String getWorldname() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.util.UUID, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.util.UUID, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.thomas15v.maplog.plugin.database.tables.Worlds.WORLDS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field2() {
		return com.thomas15v.maplog.plugin.database.tables.Worlds.WORLDS.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.thomas15v.maplog.plugin.database.tables.Worlds.WORLDS.WORLDNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.UUID value2() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getWorldname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorldsRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorldsRecord value2(java.util.UUID value) {
		setUuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorldsRecord value3(java.lang.String value) {
		setWorldname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WorldsRecord values(java.lang.Integer value1, java.util.UUID value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WorldsRecord
	 */
	public WorldsRecord() {
		super(com.thomas15v.maplog.plugin.database.tables.Worlds.WORLDS);
	}

	/**
	 * Create a detached, initialised WorldsRecord
	 */
	public WorldsRecord(java.lang.Integer id, java.util.UUID uuid, java.lang.String worldname) {
		super(com.thomas15v.maplog.plugin.database.tables.Worlds.WORLDS);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, worldname);
	}
}

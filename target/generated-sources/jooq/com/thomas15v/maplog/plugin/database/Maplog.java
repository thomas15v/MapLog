/**
 * This class is generated by jOOQ
 */
package com.thomas15v.maplog.plugin.database;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Maplog extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1361501145;

	/**
	 * The singleton instance of <code>maplog</code>
	 */
	public static final Maplog MAPLOG = new Maplog();

	/**
	 * No further instances allowed
	 */
	private Maplog() {
		super("maplog");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			com.thomas15v.maplog.plugin.database.tables.Blocks.BLOCKS,
			com.thomas15v.maplog.plugin.database.tables.Players.PLAYERS,
			com.thomas15v.maplog.plugin.database.tables.SchemaVersion.SCHEMA_VERSION,
			com.thomas15v.maplog.plugin.database.tables.Worlds.WORLDS);
	}
}

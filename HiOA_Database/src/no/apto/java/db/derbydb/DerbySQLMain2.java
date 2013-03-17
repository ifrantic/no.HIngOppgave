package no.apto.java.db.derbydb;

import java.sql.Connection;
import java.sql.SQLException;

import no.apto.java.db.ConnectionManager;
import no.apto.java.db.DBType;
import no.apto.java.db.derbydb.table.HRS500_HOURS_TAB_Manager;

public class DerbySQLMain2 {

	private static Connection conn=null;
	public DerbySQLMain2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionManager.getInstance().setDBType(DBType.DERBYDB);
		conn=ConnectionManager.getInstance().getConnection();
		HRS500_HOURS_TAB_Manager.displayAllRows();

	}

}

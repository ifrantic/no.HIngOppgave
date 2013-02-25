package no.apto.java.db.hypersqldb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import no.apto.java.db.DBType;
import no.apto.java.db.DBUtil;
import no.apto.java.db.hypersqldb.table.Tours;

public class HyperSQLMain {

	//Denne strengen er kun for hypersqldb
	private static final String hq1="Select * from tours";
	
	
	public static void main(String[] args) throws SQLException {
		
		
		
		//try with resources, nytt i java 7
		//trenger ikke å lukke ressursene etter try catch, de lukkes automatisk
		try(
				//deklarerer og initialiserer oppkobling mot hypersqldb
				Connection conn=DBUtil.getConnection(DBType.HYPERSQLDB); 
				Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet rs=stmt.executeQuery(hq1);
				) {
		
		Tours.displayData(rs);//bruker klassen Tours til å hente data fra tabellen tours 
			
			
		} catch (SQLException e) {
			DBUtil.workingException(e);//Errorhandling fra DBUtil
			
			
		}
	

	}

}

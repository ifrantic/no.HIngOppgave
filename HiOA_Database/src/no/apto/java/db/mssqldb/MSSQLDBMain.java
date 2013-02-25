package no.apto.java.db.mssqldb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import no.apto.java.db.DBType;
import no.apto.java.db.DBUtil;
import no.apto.java.db.mssqldb.table.PersonManager;

public class MSSQLDBMain {

	private static final String msq1="SELECT TOP 100 * FROM [AdventureWorks2012].[Person].[Person]";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//try with resources, nytt i java 7
				//trenger ikke å lukke ressursene etter try catch, de lukkes automatisk
				try(
						//deklarerer og initialiserer oppkobling mot hypersqldb
						Connection conn=DBUtil.getConnection(DBType.MSSQLDB); 
						Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
						ResultSet rs=stmt.executeQuery(msq1);
						) {
				
			//	PersonManager.displayData(rs);//bruker klassen Tours til å hente data fra tabellen tours 
					//Har endret class Person, denne funker ikke nå
					
				} catch (SQLException e) {
					DBUtil.workingException(e);//Errorhandling fra DBUtil
					
					
				}
	}

}

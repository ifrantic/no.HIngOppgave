package no.apto.java.db;
//Denne brukes ikke lengre.
//ConnectionManager har tatt over funksjonen, den er mer objektorientert :-)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String USERNAME = "dbuser";
	private static final String PASSWORD = "dbpassword";
	
	private static final String HYPER_CONN_STRING =
			"jdbc:hsqldb:data/hypersqldbTest1";//ligger i mappen "data"
	
	private static final String MSSQL_CONN_STRING="jdbc:sqlserver://localhost;databaseName=Personlig;integratedSecurity=true";
	
	private static final String DERBY_CONN_STRING="jdbc:derby:data/DerbyDB;create=true";
	
	
	public static Connection getConnection(DBType dbType) throws SQLException{
		
		switch (dbType) {
		case MSSQLDB:
			return DriverManager.getConnection(MSSQL_CONN_STRING);
			
			
case HYPERSQLDB:
			return DriverManager.getConnection(HYPER_CONN_STRING, USERNAME, PASSWORD);
			
case DERBYDB:
	return DriverManager.getConnection(DERBY_CONN_STRING, USERNAME, PASSWORD);
	

		default:
			return null;
		}
		
	
	}
	
	public static void workingException(SQLException e){
		System.err.println("Error message: " + e.getMessage());
		System.err.println("Error code: " + e.getErrorCode());
		System.err.println("SQL state: " + e.getSQLState());
	}
}

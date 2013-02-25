import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//les dagbok fra 16.02 og 17.02 angående tilkobling av mssqldb2012 problematikk


public class SqlServer2012MainClass {

//	private static final String USERNAME="Kingel2\\KnutInge";
//	private static final String PASSWORD="***";
//	private static final String CONN_STRING=
//			"jdbc:sqlserver://localhost;databaseName=AdventureWorks2012;";
	//Dette er driveren som trengs for å koble til 
	//windows 2012 database.
	// private static final String  connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=AdventureWorks2012;user=KnutInge;password=***";
	 
	// private static final String connectionUrl2="jdbc:sqlserver://localhost:1143;instance=KINGEL2;databaseName=AdventureWorks2012;";
	
	 private static final String connectionUrl3="jdbc:sqlserver://localhost;databaseName=AdventureWorks2012;integratedSecurity=true";
	
	 public static void main(String[] args) throws SQLException {
		System.setProperty("java.net.preferIPv6Addresses", "true");
		//initialiserer tilkobling
Connection conn=null;

//kobler til db
try {
	conn=DriverManager.getConnection(connectionUrl3);

	System.out.println("connected!");
} catch (SQLException e) {
	System.err.println(e);
}finally{
	if(conn!=null){
		conn.close();
	}
}

	}

}

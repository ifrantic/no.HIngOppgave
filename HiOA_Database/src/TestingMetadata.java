import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import no.apto.java.db.ConnectionManager;


public class TestingMetadata {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		Connection conn= ConnectionManager.getInstance().getConnection();
		
		ResultSet rsTables=null;
		
		try {
			DatabaseMetaData metadata=conn.getMetaData();
			String[] tableTypes={"TABLE"};
			rsTables=metadata.getTables(null, "%", "%", tableTypes);
			while (rsTables.next()) {
				System.out.println(rsTables.getString("TABLE_NAME"));
				
			}
			
		} catch (SQLException e) {


		System.err.println(e.getMessage());
		}
		finally{
			rsTables.close();
		}
		
		
		
		ConnectionManager.getInstance().closeConnection();

	}

}

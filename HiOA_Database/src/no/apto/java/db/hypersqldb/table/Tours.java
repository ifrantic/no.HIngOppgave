package no.apto.java.db.hypersqldb.table;
//Klasse for å lese data fra en gitt tabell. klassen heter det samme som tabellen.
import java.sql.ResultSet;
import java.sql.SQLException;

public class Tours {

	public static void displayData(ResultSet rs) throws SQLException{
		while (rs.next()) {
			
			StringBuffer buffer =new StringBuffer();
			buffer.append("Tour " + rs.getInt("tourId")+":");
			
			System.out.println(buffer.toString());
			
		}
		
	}
}

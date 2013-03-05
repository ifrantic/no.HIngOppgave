import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import no.apto.java.db.ConnectionManager;
import no.apto.java.util.ReadFileToString;


public class TestingOppretteTabellHvisIkkeFinnes {

//Denne funker, men feiler når jeg forsøker å legge til en tabell til her. Blir rotete??
	
	private static String[] tableTypes={"TABLE"};//Tabell av String, brukes når man skal finne type tabeller som er opprettet
	private static String MAS120_EMPLOYEE_TAB="MAS120_EMPLOYEE_TAB";
	//private static String MAS010_CODE_VALUES_TAB="MAS010_CODE_VALUES_TAB";

		
		private static String createMAS120_EMPLOYEE_TAB="";//lagre query for å opprette denne tabellen
	//	private static String createMAS010_CODE_VALUES_TAB="";//lagre query for å opprette denne tabellen
		

	public static void main(String[] args) {
		
		Path scriptCreateMAS120_EMPLOYEE_TAB=Paths.get("schema/DerbyPerson.sql");//finner sti til scrip for opprettelse av tabellen

	//	Path scriptCreateMAS010_CODE_VALUES_TAB=Paths.get("schema/MAS010_CODE_VALUES_TAB.sql");//finner sti til scrip for opprettelse av tabellen
		
		
		createMAS120_EMPLOYEE_TAB=ReadFileToString.returnString(scriptCreateMAS120_EMPLOYEE_TAB);//henter tekst fra filen
	//	createMAS010_CODE_VALUES_TAB=ReadFileToString.returnString(scriptCreateMAS010_CODE_VALUES_TAB);//henter tekst fra filen
		System.out.println(createMAS120_EMPLOYEE_TAB);
	//	System.out.println(createMAS010_CODE_VALUES_TAB);
		Connection conn= ConnectionManager.getInstance().getConnection();
		
		ResultSet rsTables=null;
		
		try(
				PreparedStatement stmt = conn.prepareStatement(createMAS120_EMPLOYEE_TAB);
			//	PreparedStatement stmt2= conn.prepareStatement(createMAS010_CODE_VALUES_TAB);
					) {
				DatabaseMetaData dbmd = conn.getMetaData();//Finner metadata fra databasen, 
				
				
			rsTables = dbmd.getTables(null, "%", "%", tableTypes);//ser hvilke tabeller som er opprettet
				int x=10;
			//	int y=10;
			while (rsTables.next()) {
					 x= rsTables.getString("TABLE_NAME").compareTo(MAS120_EMPLOYEE_TAB);//sjekker om MAS120_EMPLOYEE_TAB er opprettet
			//		 y= rsTables.getString("TABLE_NAME").compareTo(MAS010_CODE_VALUES_TAB);//sjekker om MAS010_CODE_VALUES_TAB er opprettet
				
				}
		
				 if(x!=0)//Hvis tabellen ikke finnes fra før
				{

					System.out.println(createMAS120_EMPLOYEE_TAB);
					int oppdatert=3;//setter et tilfeldig tall, ikke 0
				oppdatert = stmt.executeUpdate();//oppretter tabellen MAS120_EMPLOYEE_TAB
				
				if (oppdatert==0) {//0 rader affisert; tabellen er jo bare opprettet..
					System.out.println("opprettet tabell MAS120_EMPLOYEE_TAB");//Eksekvert query for å opprette tabellen MAS120_EMPLOYEE_TAB
				
				}
				}
					else if(x==0){
						System.out.println("Intet opprettet");
				}
				
				}
			
				
				 catch (Exception e) {
				System.err.println("Feilet " + e.getMessage() + " " + e.getCause());
			}finally{
				try {
					rsTables.close();
					conn.close();
				} catch (Exception e) {
					System.err.println("rsTables "+ e.getMessage());
				}
			}
		
		
		//////////////
		
	}

}

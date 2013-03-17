package no.apto.java.db.derbydb;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import no.apto.java.db.ConnectionManager;
import no.apto.java.util.ReadFileToString;

public class OpprettAlleTabeller {

	

		private static String[] tableTypes={"TABLE"};//Tabell av String, brukes når man skal finne type tabeller som er opprettet
		private static String MAS120_EMPLOYEE_TAB="MAS120_EMPLOYEE_TAB";
		private static String MAS010_CODE_VALUES_TAB="MAS010_CODE_VALUES_TAB";
		private static String MAS121_EMPLOYEE_PERIODIC_TAB="MAS121_EMPLOYEE_PERIODIC_TAB";
		private static String MAS240_COST_UNIT_TAB="MAS240_COST_UNIT_TAB";
		private static String HRS200_ROTATION_PLAN_TAB="HRS200_ROTATION_PLAN_TAB";
		private static String HRS100_HOURS_TYPE_TAB="HRS100_HOURS_TYPE_TAB";
		private static String HRS500_HOURS_TAB="HRS500_HOURS_TAB";

			
			private static String createTables="";//lagre query for å opprette denne tabellen
			

		public static void main(String[] args) {
			
			//Path scriptForTables=Paths.get("schema/cleanScript2.sql");//finner sti til scrip for opprettelse av tabellen

		//	Path scriptCreateMAS010_CODE_VALUES_TAB=Paths.get("schema/MAS010_CODE_VALUES_TAB.sql");//finner sti til scrip for opprettelse av tabellen
			
			
		//	createTables=ReadFileToString.returnString(scriptForTables);//henter tekst fra filen
		//	createMAS010_CODE_VALUES_TAB=ReadFileToString.returnString(scriptCreateMAS010_CODE_VALUES_TAB);//henter tekst fra filen
		//	System.out.println(createTables);
		//	System.out.println(createMAS010_CODE_VALUES_TAB);
			Connection conn= ConnectionManager.getInstance().getConnection();
			
			ResultSet rsTables=null;
			
			try//(
				//	PreparedStatement stmt = conn.prepareStatement(createTables);
				//	PreparedStatement stmt2= conn.prepareStatement(createMAS010_CODE_VALUES_TAB);
					//	)
			{
					DatabaseMetaData dbmd = conn.getMetaData();//Finner metadata fra databasen, 
					
					
				rsTables = dbmd.getTables(null, "%", "%", tableTypes);//ser hvilke tabeller som er opprettet
				
				while (rsTables.next()) {
					String tabell=rsTables.getString("TABLE_NAME");
					System.out.println(tabell);
			
					}
			
				

					//	System.out.println(createTables);
					//	int oppdatert=3;//setter et tilfeldig tall, ikke 0
				//	oppdatert = stmt.executeUpdate();//oppretter tabellene
					
					//if (oppdatert==0) {//0 rader affisert; tabellene er jo bare opprettet..
					//	System.out.println("opprettet tabellene");//Eksekvert query for å opprette tabellene
					
					
				//	}
					
					
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

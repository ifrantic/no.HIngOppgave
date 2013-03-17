package no.apto.java.db.derbydb.table;
//TODO denne må gås gjennom og endres, virker ikke slik den er nå
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import no.apto.java.db.ConnectionManager;
import no.apto.java.db.beans.HRS100_HOURS_TYPE_TAB;

public class HRS100_HOURS_TYPE_TAB_Manager {
	
	
private static Connection conn= ConnectionManager.getInstance().getConnection();//referanse til databasetilkobling
	
	//Bruker ikke denne
	public static void displayAllRows() throws SQLException{//Lister ut alle rader i tabellen 
	/*	
		String sql="select * FROM Example_Tab"; //oppretter en query string som skal brukes for å hente alle data
		try(
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
			System.out.println("Tabellen  :");
			while (rs.next()) {
				StringBuffer bf=new StringBuffer();
				bf.append(rs.getInt(0));
				
				
				System.out.println(bf.toString());
			}
			
		}
		*/
	}

	//Henter en rad fra tabellen, med gitt id, skal legge denne raden i bean HRS100_HOURS_TYPE_TAB
	//Denne er ikke laget ferdig, men tror den bør / kan brukes?
	//TODO lag ferdig bean
	public static HRS100_HOURS_TYPE_TAB getHRS100_HOURS_TYPE_TAB(String clientId, String companyId, String hoursTypeCode) throws SQLException{
		
		String sql="select * from HRS100_HOURS_TYPE_TAB where CLIENT_ID=?,	COMPANY_ID=?, HOURS_TYPE_CODE=?";//query for å hente alle data for gitt id fra denne tabellen
		ResultSet rs=null;
		
		try(
				PreparedStatement stmt=conn.prepareStatement(sql);//deklarerer og initialiserer spørring
			
				
				){
			
			stmt.setString(1, clientId);//setter inn angitt recordId i spørringen
			stmt.setString(2, companyId);//setter inn angitt recordId i spørringen
			stmt.setString(3, hoursTypeCode);//setter inn angitt recordId i spørringen
			rs=stmt.executeQuery();//kjører query, legger resultatet i Resultset rs
			
			if(rs.next()){//hvis det er noe resultat
				
				HRS100_HOURS_TYPE_TAB hrs100 = new HRS100_HOURS_TYPE_TAB(); //oppretter ny forekomst av tabellen
				
				hrs100.setCLIENT_ID(clientId);
				hrs100.setCOMPANY_ID(companyId);
				hrs100.setHOURS_TYPE_CODE(hoursTypeCode);
				//osv

				
				return hrs100; //returner bean med data fra hrs500 tabellen, med gitt id
				
				
			}else{
			
			}
			
			return null;
			
		} catch(SQLException e){
			System.err.println(e);
			return null;
		}finally {
			if(rs !=null){
				rs.close(); //lukker resultset
			}
		}
	
	
	
}

	//Denne skal vi nok ikke ha med tror jeg
	//IKKE BRUKENES SLIK DEN ER NÅ
	public static boolean insertHRS100_HOURS_TYPE_TAB(HRS100_HOURS_TYPE_TAB hrs100) throws SQLException{ //for å sette inn en hrs100 rad i tabellen

		
		String sql="INSERT INTO HRS100_HOURS_TYPE_TAB(CLIENT_ID, COMPANY_ID.............." +
				"VALUES(?,?)";
	
		ResultSet rs=null; //initialiserer resultset for bruk til å sjekke om insert er gått riktig
		try (
			PreparedStatement stmt = conn.prepareStatement(sql);
				)
		{
			//her settes data fra tabellen inn i statement; hvert felt settes til et gitt tall, tallet representerer variabelnummer i rekken ved insert
			stmt.setString(1, hrs100.getCLIENT_ID());
			stmt.setString(2, hrs100.getCOMPANY_ID());

			
			int antall=stmt.executeUpdate();//returner antall rader som ble affisert
			if (antall==1) {//vellykket innsetting
				System.out.println(antall +" rader innsatt");
		
				
			}else{ //insert feilet
				System.err.println("ingen rader innsatt");
				return false;
			}
			
		} catch (Exception e) {
			System.err.println("message " + e.getMessage()+"årsak " + e.getCause()); //skriver ut feilmeldingen
		}finally{
			if(rs!=null)rs.close(); //lukker resultset
		}
		return true;
		
	}

	//For å endre oppføringer på denne raden i denne tabellen i databasen
	//TROR IKKE VI SKAL BRUKE DENNE NEI, IKKE LAGET FERDIG / VIRKER IKKE
	public static boolean updateHRS100_HOURS_TYPE_TAB(HRS100_HOURS_TYPE_TAB hrs100) throws SQLException{
		
		
		String sql="UPDATE HRS100_HOURS_TYPE_TAB SET CLIENT_ID =?, COMPANY_ID =?..........." +
				"WHERE kløjølkj=?";//DEN SISTE HER ER ID, PRIMÆRNØKKEL, ER UNIK
		
		try (
				PreparedStatement stmt = conn.prepareStatement(sql); //forbereder kall til databasen
				){
			
			//henter data fra gitt hrs500, setter det inn i statement mot databaesn
			stmt.setString(1, hrs100.getCLIENT_ID());
			stmt.setString(2, hrs100.getCOMPANY_ID());
			
			//obs obs!!
			//stmt.setString(3, hrs100.getCLIENT_ID());  //primærnøkkelen, brukes i where claus
			//brukes i WHERE
	
			
			int antall = stmt.executeUpdate();//utfører kall til databasen, setter antall affiserte rader inn i tallet "antall"
			
			if (antall == 1) {//hvis 1 rad er affisert / update er utført
				System.out.println("1 rad oppdatert");
				return true;
				
			}else{
				return false; //ingen rader oppdatert
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
		
	
		
	}

	
	//SLETTER GITT OPPFØRING I tabellen, TAR ID som argument
	public static boolean deleteHRS100_HOURS_TYPE_TAB(String clientId, String companyId, String hoursTypeCode){
		String sql = "delete from HRS100_HOURS_TYPE_TAB where CLIENT_ID=? AND	COMPANY_ID=? AND HOURS_TYPE_CODE=? ";
	
		try(
			PreparedStatement stmt=conn.prepareStatement(sql);	
				) {
			stmt.setString(1, clientId);
			stmt.setString(2, companyId);
			stmt.setString(3, hoursTypeCode);
			int slettet=stmt.executeUpdate();
			if (slettet==1) {//hvis slettet
				
				return true;
			}else{
				return false;
			}
			
			
		} catch (Exception e) {
		System.err.println(e.getMessage());
		return false;
		}
	}


	//Her kan man sette inn en egen spørring mot denne tabellen,
	//returnerer ResultSet fra spørringen
	public static ResultSet customQuery(String query) throws SQLException{
 
		
		//oppretter en query string som skal brukes for å hente alle data
		String sql=query; 
	
		try(
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
			
			if (rs.next()) {//hvis det er noe resultat
				//System.out.println("jupp " + rs.getString("USER_ID"));
				//utskrivft var for testing, er testet og fungerer
			return rs;
		
			}
			else{
				//System.err.println("nope");
				return null;
			}
			
		}
		
	}
}

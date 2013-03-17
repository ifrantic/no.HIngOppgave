package no.apto.java.db.derbydb.table;
//TODO denne må gås gjennom og eventuelt lages, virker ikke slik den er nå
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import no.apto.java.db.ConnectionManager;
import no.apto.java.db.beans.MAS240_COST_UNIT_TAB;

public class MAS240_COST_UNIT_TAB_Manager {
	
	
private static Connection conn= ConnectionManager.getInstance().getConnection();//referanse til databasetilkobling
	
	//IKKE I BRUK
	public static void displayAllRows() throws SQLException{//Lister ut alle rader i tabellen 
		
		String sql="select * FROM MAS240_COST_UNIT_TAB"; //oppretter en query string som skal brukes for å hente alle data
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
	}


	public static MAS240_COST_UNIT_TAB getMAS240_COST_UNIT_TAB(int recordId) throws SQLException{//Henter en rad fra tabellen, med gitt id
		
		String sql="select * from MAS240_COST_UNIT_TAB where RECORD_ID =?";//query for å hente alle data for gitt id fra denne tabellen
		ResultSet rs=null;
		
		try(
				PreparedStatement stmt=conn.prepareStatement(sql);//deklarerer og initialiserer spørring
				
				){
			
			stmt.setInt(1, recordId);//setter inn angitt recordId i spørringen
			rs=stmt.executeQuery();//kjører query, legger resultatet i Resultset rs
			
			if(rs.next()){//hvis det er noe resultat
				
				MAS240_COST_UNIT_TAB mas240 = new MAS240_COST_UNIT_TAB(); //oppretter ny forekomst av tabellen
				//mas240.setRECORD_ID(recordId); //fyller inn data fra databasen til bean 

				
				return mas240; //returner bean med data fra hrs500 tabellen, med gitt id
				
				
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

	//for å sette inn en rad av denne bean i denne tabellen
	public static boolean insertMAS240_COST_UNIT_TAB(MAS240_COST_UNIT_TAB mas240) throws SQLException{ 
		
		
		String sql="INSERT INTO MAS240_COST_UNIT_TAB(CLIENT_ID, COMPANY_ID" +
				"VALUES(?,?)";
	
		ResultSet rs=null; //initialiserer resultset for bruk til å sjekke om insert er gått riktig
		try (
			PreparedStatement stmt = conn.prepareStatement(sql);
				)
		{
			//her settes data fra tabellen inn i statement; hvert felt settes til et gitt tall, tallet representerer variabelnummer i rekken ved insert
			stmt.setString(1, mas240.getCLIENT_ID());
			stmt.setString(2, mas240.getCOMPANY_ID());

			
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
	public static boolean updateMAS240_COST_UNIT_TAB(MAS240_COST_UNIT_TAB mas240) throws SQLException{
		
		
		String sql="UPDATE MAS240_COST_UNIT_TAB SET CLIENT_ID =?, COMPANY_ID =?" +
				"WHERE RECORD_ID=?";//DEN SISTE HER ER ID, PRIMÆRNØKKEL, ER UNIK
		
		try (
				PreparedStatement stmt = conn.prepareStatement(sql); //forbereder kall til databasen
				){
			
			//henter data fra gitt hrs500, setter det inn i statement mot databaesn
			stmt.setString(1, mas240.getCLIENT_ID());
			stmt.setString(2, mas240.getCOMPANY_ID());
			
			//obs obs!!
		//	stmt.setInt(3, mas240.getRECORD_ID());  //primærnøkkelen, brukes i where claus
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
	public static boolean deleteMAS240_COST_UNIT_TAB(int recordId){
		String sql = "delete from MAS240_COST_UNIT_TAB where RECORD_ID=? ";
	
		try(
			PreparedStatement stmt=conn.prepareStatement(sql);	
				) {
			stmt.setInt(1, recordId);
			int slettet=stmt.executeUpdate();
			if (slettet==1) {
				
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

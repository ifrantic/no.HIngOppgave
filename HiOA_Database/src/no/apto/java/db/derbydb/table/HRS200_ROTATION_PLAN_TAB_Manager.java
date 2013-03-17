package no.apto.java.db.derbydb.table;
//TODO denne m� g�s gjennom og endres, virker ikke slik den er n�
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import no.apto.java.db.ConnectionManager;
import no.apto.java.db.beans.HRS200_ROTATION_PLAN_TAB;

public class HRS200_ROTATION_PLAN_TAB_Manager {
	
	
	
private static Connection conn= ConnectionManager.getInstance().getConnection();//referanse til databasetilkobling
	
	//DENNE ER IKKE I BRUK / VIRKER IKKE
	public static void displayAllRows() throws SQLException{//Lister ut alle rader i tabellen 
		
		String sql="select * FROM HRS200_ROTATION_PLAN_TAB"; //oppretter en query string som skal brukes for � hente alle data
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

//TODO lage denne
	public static HRS200_ROTATION_PLAN_TAB getHRS200_ROTATION_PLAN_TAB(int recordId) throws SQLException{//Henter en rad fra tabellen, med gitt id
		
		String sql="select * from Example_Tab where RECORD_ID =?";//query for � hente alle data for gitt id fra denne tabellen
		ResultSet rs=null;
		
		try(
				PreparedStatement stmt=conn.prepareStatement(sql);//deklarerer og initialiserer sp�rring
				
				){
			
			stmt.setInt(1, recordId);//setter inn angitt recordId i sp�rringen
			rs=stmt.executeQuery();//kj�rer query, legger resultatet i Resultset rs
			
			if(rs.next()){//hvis det er noe resultat
				
				HRS200_ROTATION_PLAN_TAB hrs200 = new HRS200_ROTATION_PLAN_TAB(); //oppretter ny forekomst av tabellen
				//hrs200.setRECORD_ID(recordId); //fyller inn data fra databasen til bean 

				
				return hrs200; //returner bean med data fra hrs200 tabellen, med gitt id
				
				
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

	//TODO lage denne
	public static boolean insertHRS200_ROTATION_PLAN_TAB(HRS200_ROTATION_PLAN_TAB example) throws SQLException{ //for � sette inn en person i databasen

		
		//String sql = "{call Personlig.dbo.sp_InsertPerson (?, ?, ?, ?, ?)}";
		//denne bruker en prosedyre som er laget i databasen. prosedyren tar seg av innsetting i databasen
		//Har ikke laget prosedyre for innsetting av data i hrs500 tabellen enn�
		//TAR IKKE MED RECORD_ID, DA DENNE ER AUTOINCREMENT
		
		String sql="INSERT INTO HRS200_ROTATION_PLAN_TAB(CLIENT_ID, COMPANY_ID" +
				"VALUES(?,?)";
	
		ResultSet rs=null; //initialiserer resultset for bruk til � sjekke om insert er g�tt riktig
		try (
			PreparedStatement stmt = conn.prepareStatement(sql);
				)
		{
			//her settes data fra tabellen inn i statement; hvert felt settes til et gitt tall, tallet representerer variabelnummer i rekken ved insert
			stmt.setString(1, example.getCLIENT_ID());
			stmt.setString(2, example.getCOMPANY_ID());

			
			int antall=stmt.executeUpdate();//returner antall rader som ble affisert
			if (antall==1) {//vellykket innsetting
				System.out.println(antall +" rader innsatt");
		
				
			}else{ //insert feilet
				System.err.println("ingen rader innsatt");
				return false;
			}
			
		} catch (Exception e) {
			System.err.println("message " + e.getMessage()+"�rsak " + e.getCause()); //skriver ut feilmeldingen
		}finally{
			if(rs!=null)rs.close(); //lukker resultset
		}
		return true;
		
	}

	//TODO lage denne
	public static boolean updateHRS200_ROTATION_PLAN_TAB(HRS200_ROTATION_PLAN_TAB hrs200) throws SQLException{//For � endre oppf�ringer p� denne tabellen i databasen
		
		String sql="UPDATE Example_Tab SET CLIENT_ID =?, COMPANY_ID =?" +
				"WHERE RECORD_ID=?";//DEN SISTE HER ER ID, PRIM�RN�KKEL, ER UNIK
		
		try (
				PreparedStatement stmt = conn.prepareStatement(sql); //forbereder kall til databasen
				){
			
			//henter data fra gitt hrs500, setter det inn i statement mot databaesn
			stmt.setString(1, hrs200.getCLIENT_ID());
			stmt.setString(2, hrs200.getCOMPANY_ID());
			
			//obs obs!!
			//stmt.setInt(3, hrs200.getRECORD_ID());  //prim�rn�kkelen, brukes i where claus
			//brukes i WHERE
	
			
			int antall = stmt.executeUpdate();//utf�rer kall til databasen, setter antall affiserte rader inn i tallet "antall"
			
			if (antall == 1) {//hvis 1 rad er affisert / update er utf�rt
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

	
	//TODO lage denne
	public static boolean deleteHRS200_ROTATION_PLAN_TAB(int recordId){
		String sql = "delete from HRS200_ROTATION_PLAN_TAB where RECORD_ID=? ";
	
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


	//Her kan man sette inn en egen sp�rring mot denne tabellen,
	//returnerer ResultSet fra sp�rringen
	public static ResultSet customQuery(String query) throws SQLException{
 
		
		//oppretter en query string som skal brukes for � hente alle data
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

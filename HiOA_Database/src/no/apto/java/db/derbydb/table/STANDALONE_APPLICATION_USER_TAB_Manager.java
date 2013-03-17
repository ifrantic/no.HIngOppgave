package no.apto.java.db.derbydb.table;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import no.apto.java.db.ConnectionManager;
import no.apto.java.db.beans.STANDALONE_APPLICATION_USER_TAB;

public class STANDALONE_APPLICATION_USER_TAB_Manager {

	
private static Connection conn= ConnectionManager.getInstance().getConnection();//referanse til databasetilkobling
	
//Lister ut alle rader i tabellen, er ikke i bruk ennå
	public static void displayAllRows() throws SQLException{ 
		
		//oppretter en query string som skal brukes for å hente alle data
		String sql="select * FROM STANDALONE_APPLICATION_USER_TAB"; 
	
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


	//RETURNERER BRUKER FRA TABELLEN , TAR USER_ID SOM ARGUMENT
	public  STANDALONE_APPLICATION_USER_TAB getSTANDALONE_APPLICATION_USER_TAB(int userId) throws SQLException{//Henter en rad fra tabellen, med gitt id
		
		String sql="select * from STANDALONE_APPLICATION_USER_TAB where USER_ID =?";//query for å hente alle data for gitt id fra denne tabellen
		ResultSet rs=null;
		
		try(
				PreparedStatement stmt=conn.prepareStatement(sql);//deklarerer og initialiserer spørring
				
				){
			
			stmt.setInt(1, userId);//setter inn  i spørringen
	
			rs=stmt.executeQuery();//kjører query, legger resultatet i Resultset rs
			
			if(rs.next()){//hvis det er noe resultat
				
				STANDALONE_APPLICATION_USER_TAB user = new STANDALONE_APPLICATION_USER_TAB(); //oppretter ny forekomst av tabellen
				user.setUSER_ID(userId); //fyller inn data fra databasen til bean 
				user.setLAST_ATTEMPT_SEND_TO_APTO_DATE(rs.getTimestamp("LAST_ATTEMPT_SEND_TO_APTO_DATE"));
				user.setLAST_LOGIN_STANDALONE_DATE(rs.getTimestamp("LAST_LOGIN_STANDALONE_DATE"));
				user.setLAST_SUCCEED_SEND_TO_APTO_DATE(rs.getTimestamp("LAST_SUCCEED_SEND_TO_APTO_DATE"));
				user.setLAST_SYNC_WITH_APTO_DATE(rs.getTimestamp("LAST_SYNC_WITH_APTO_DATE"));
				user.setPASSWORD_HASH(rs.getString("PASSWORD_HASH"));
				user.setLOGIN_USERNAME(rs.getString("LOGIN_USERNAME"));
				user.setSTANDALONE_USER_CREATED_DATE(rs.getTimestamp("STANDALONE_USER_CREATED_DATE"));

				
				return user; //returner bean med data fra hrs500 tabellen, med gitt id
				
				
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

	//SETTER INN NY BRUKER I tabellen, TAR USER SOM ARGUMENT
	public static boolean insertSTANDALONE_APPLICATION_USER_TAB(STANDALONE_APPLICATION_USER_TAB user) throws SQLException{ //for å sette inn en person i databasen

		
		//String sql = "{call Personlig.dbo.sp_InsertPerson (?, ?, ?, ?, ?)}";
		//denne bruker en prosedyre som er laget i databasen. prosedyren tar seg av innsetting i databasen
		//Har ikke laget prosedyre for innsetting av data i hrs500 tabellen ennå
		//TAR IKKE MED RECORD_ID, DA DENNE ER AUTOINCREMENT
		
		String sql="INSERT INTO STANDALONE_APPLICATION_USER_TAB(STANDALONE_USER_CREATED_DATE, LAST_SYNC_WITH_APTO_DATE, LAST_LOGIN_STANDALONE_DATE, LAST_ATTEMPT_SEND_TO_APTO_DATE, LAST_SUCCEED_SEND_TO_APTO_DATE, LOGIN_USERNAME, PASSWORD_HASH) "+
				" VALUES(?,?,?,?,?,?,?)";
	
		ResultSet rs=null; //initialiserer resultset for bruk til å sjekke om insert er gått riktig
		try (
			PreparedStatement stmt = conn.prepareStatement(sql);
				)
		{
			//her settes data fra tabellen inn i statement; hvert felt settes til et gitt tall, tallet representerer variabelnummer i rekken ved insert
			//stmt.setInt(1, user.getUSER_ID()); DETTE SETTES AUTOMATISK

			stmt.setTimestamp(1, user.getSTANDALONE_USER_CREATED_DATE());
			stmt.setTimestamp(2, user.getLAST_SYNC_WITH_APTO_DATE());
			stmt.setTimestamp(3, user.getLAST_LOGIN_STANDALONE_DATE());
			stmt.setTimestamp(4, user.getLAST_ATTEMPT_SEND_TO_APTO_DATE());
			stmt.setTimestamp(5, user.getLAST_SUCCEED_SEND_TO_APTO_DATE());
			stmt.setString(6, user.getLOGIN_USERNAME());
			stmt.setString(7, user.getPASSWORD_HASH());

			
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

	//OPPDATERER GITT OPPFØRING I tabellen, TAR USER SOM ARGUMENT
	public static boolean updateSTANDALONE_APPLICATION_USER_TAB(STANDALONE_APPLICATION_USER_TAB user) throws SQLException{//For å endre oppføringer på denne tabellen i databasen
		
		String sql="UPDATE STANDALONE_APPLICATION_USER_TAB SET STANDALONE_USER_CREATED_DATE=?, LAST_SYNC_WITH_APTO_DATE=?, LAST_LOGIN_STANDALONE_DATE=?, LAST_ATTEMPT_SEND_TO_APTO_DATE=?, LAST_SUCCEED_SEND_TO_APTO_DATE=?, LOGIN_USERNAME=?, PASSWORD_HASH=? "+
				"WHERE USER_ID=?";//DEN SISTE HER ER ID, PRIMÆRNØKKEL, ER UNIK

		
		try (
				PreparedStatement stmt = conn.prepareStatement(sql); //forbereder kall til databasen
				){
			
			//henter data fra gitt tabell, setter det inn i statement mot databaesn
			stmt.setInt(8, user.getUSER_ID());//den første brukes i where 
	
			stmt.setTimestamp(1, user.getSTANDALONE_USER_CREATED_DATE());
			stmt.setTimestamp(2, user.getLAST_SYNC_WITH_APTO_DATE());
			stmt.setTimestamp(3, user.getLAST_LOGIN_STANDALONE_DATE());
			stmt.setTimestamp(4, user.getLAST_ATTEMPT_SEND_TO_APTO_DATE());
			stmt.setTimestamp(5, user.getLAST_SUCCEED_SEND_TO_APTO_DATE());
			stmt.setString(6, user.getLOGIN_USERNAME());
			stmt.setString(7, user.getPASSWORD_HASH());

			
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
	public static boolean deleteSTANDALONE_APPLICATION_USER_TAB(int userId){
		String sql = "delete from STANDALONE_APPLICATION_USER_TAB where USER_ID=?";
	
		try(
			PreparedStatement stmt=conn.prepareStatement(sql);	
				) {
			stmt.setInt(1, userId);//setter inn  i spørringen

			int slettet=stmt.executeUpdate();//returnerer 1 hvis gikk bra
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

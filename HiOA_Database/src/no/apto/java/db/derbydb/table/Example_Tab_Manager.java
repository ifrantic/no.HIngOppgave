package no.apto.java.db.derbydb.table;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import no.apto.java.db.ConnectionManager;

public class Example_Tab_Manager {
/*
	
private static Connection conn= ConnectionManager.getInstance().getConnection();//referanse til databasetilkobling
	
	
	public static void displayAllRows() throws SQLException{//Lister ut alle rader i tabellen 
		
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
	}


	public static Example_Tab getExample_Tab(int recordId) throws SQLException{//Henter en rad fra tabellen, med gitt id
		
		String sql="select * from Example_Tab where RECORD_ID =?";//query for å hente alle data for gitt id fra denne tabellen
		ResultSet rs=null;
		
		try(
				PreparedStatement stmt=conn.prepareStatement(sql);//deklarerer og initialiserer spørring
				
				){
			
			stmt.setInt(1, recordId);//setter inn angitt recordId i spørringen
			rs=stmt.executeQuery();//kjører query, legger resultatet i Resultset rs
			
			if(rs.next()){//hvis det er noe resultat
				
				Example_Tab example = new Example_Tab(); //oppretter ny forekomst av tabellen
				example.setRECORD_ID(recordId); //fyller inn data fra databasen til bean 

				
				return example; //returner bean med data fra hrs500 tabellen, med gitt id
				
				
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

	
	public static boolean insertExample_Tab(Example_Tab example) throws SQLException{ //for å sette inn en person i databasen

		
		//String sql = "{call Personlig.dbo.sp_InsertPerson (?, ?, ?, ?, ?)}";
		//denne bruker en prosedyre som er laget i databasen. prosedyren tar seg av innsetting i databasen
		//Har ikke laget prosedyre for innsetting av data i hrs500 tabellen ennå
		//TAR IKKE MED RECORD_ID, DA DENNE ER AUTOINCREMENT
		
		String sql="INSERT INTO Example_Tab(CLIENT_ID, COMPANY_ID" +
				"VALUES(?,?)";
	
		ResultSet rs=null; //initialiserer resultset for bruk til å sjekke om insert er gått riktig
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
			System.err.println("message " + e.getMessage()+"årsak " + e.getCause()); //skriver ut feilmeldingen
		}finally{
			if(rs!=null)rs.close(); //lukker resultset
		}
		return true;
		
	}

	
	public static boolean updateExample_Tab(Example_Tab example) throws SQLException{//For å endre oppføringer på denne tabellen i databasen
		
		String sql="UPDATE Example_Tab SET CLIENT_ID =?, COMPANY_ID =?" +
				"WHERE RECORD_ID=?";//DEN SISTE HER ER ID, PRIMÆRNØKKEL, ER UNIK
		
		try (
				PreparedStatement stmt = conn.prepareStatement(sql); //forbereder kall til databasen
				){
			
			//henter data fra gitt hrs500, setter det inn i statement mot databaesn
			stmt.setString(1, example.getCLIENT_ID());
			stmt.setString(2, example.getCOMPANY_ID());
			
			//obs obs!!
			stmt.setInt(3, example.getRECORD_ID());  //primærnøkkelen, brukes i where claus
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
	public static boolean deleteExample_Tab(int recordId){
		String sql = "delete from Example_Tab where RECORD_ID=? ";
	
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

*/
}

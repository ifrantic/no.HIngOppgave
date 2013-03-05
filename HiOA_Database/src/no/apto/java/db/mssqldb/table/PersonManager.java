package no.apto.java.db.mssqldb.table;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import no.apto.java.db.ConnectionManager;
import no.apto.java.db.DBType;
import no.apto.java.db.DBUtil;
import no.apto.java.db.beans.Person;
import no.apto.java.util.WriteObjectToJsonFile;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PersonManager {

	
	private static Connection conn= ConnectionManager.getInstance().getConnection();//referanse til databasetilkobling
	
	
	public static void displayAllRows() throws SQLException{//Lister ut alle rader i tabellen Person (kun noen entiteter)
		
		String sql="select PersonId, Fornavn, Mail FROM Personlig.dbo.Person";
		try(
			//	Connection conn=DBUtil.getConnection(DBType.MSSQLDB);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
			System.out.println("Person tabell:");
			while (rs.next()) {
				StringBuffer bf=new StringBuffer();
				bf.append(rs.getInt("PersonId") + ": ");
				bf.append(rs.getString("Fornavn") + ": ");
				bf.append(rs.getString("Mail") + ": ");
				
				System.out.println(bf.toString());
			}
			
		}
	}
		
		
		public static Person getPerson(int personId) throws SQLException{//Henter en rad fra tabellen person, med gitt id
			
			String sql="select * from Personlig.dbo.Person where PersonId =?";
			ResultSet rs=null;
			
			try(
			//		Connection conn=DBUtil.getConnection(DBType.MSSQLDB);
					PreparedStatement stmt=conn.prepareStatement(sql);
					
					){
				
				stmt.setInt(1, personId);
				rs=stmt.executeQuery();
				
				if(rs.next()){
					
					Person pers = new Person();
					pers.setPersonId(personId);
					pers.setFornavn(rs.getString("fornavn"));
					pers.setEtternavn(rs.getString("etternavn"));
					pers.setMail(rs.getString("mail"));
					pers.setHjemmeside(rs.getString("hjemmeside"));
					pers.setMobil(rs.getInt("mobil"));
					pers.setDato(rs.getDate(7));//henter fra kolonne nr 7 som er dato
					
					return pers;
					
					
				}else{
				
				}
				
				return null;
				
			} catch(SQLException e){
				System.err.println(e);
				return null;
			}finally {
				if(rs !=null){
					rs.close();
				}
			}
		
		
		
	}
	


		public static boolean insertPerson(Person person) throws SQLException{ //for å sette inn en person i databasen

			
			String sql = "{call Personlig.dbo.sp_InsertPerson (?, ?, ?, ?, ?)}";
			//denne bruker en prosedyre som er laget i databasen. prosedyren tar seg av innsetting i databasen
		
			ResultSet rs=null; //initialiserer resultset for bruk til å sjekke om insert er gått riktig
			try (
				PreparedStatement stmt = conn.prepareStatement(sql);
					)
			{
				//her settes data fra Person til et gitt tall, tallet representerer variabelnummer i rekken ved insert
				stmt.setString(1, person.getFornavn());
				stmt.setString(2, person.getEtternavn());
				stmt.setString(3, person.getMail());
				stmt.setString(4, person.getHjemmeside());
				stmt.setInt(5,person.getMobil());
			//	stmt.setDate(6, person.getDato()); Det brukes ikke dato her, dette settes automatisk i databasen
				//ved bruk av denne prosedyren
				
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


	public static boolean updatePerson(Person person) throws SQLException{//For å endre oppføringer på en person i databasen
		//Bruker en stored prosedure for å oppdatere personen. Identifiseres med id fra databasen
		String sql = "{call Personlig.dbo.sp_UpdatePerson (?, ?, ?, ?, ?, ?)}";
		
		try (
				PreparedStatement stmt = conn.prepareStatement(sql); //forbereder kall til databasen
				){
			
			//henter data fra gitt person, setter det inn i kallet mot databaesn
			stmt.setInt(1, person.getPersonId());
			stmt.setString(2, person.getFornavn());
			stmt.setString(3, person.getEtternavn());
			stmt.setString(4, person.getMail());
			stmt.setString(5, person.getHjemmeside());
			stmt.setInt(6, person.getMobil());
			
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


	public static boolean deletePerson(int personId){
		String sql = "delete from Personlig.dbo.Person where PersonId=? ";
	
		try(
			PreparedStatement stmt=conn.prepareStatement(sql);	
				) {
			stmt.setInt(1, personId);
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




}
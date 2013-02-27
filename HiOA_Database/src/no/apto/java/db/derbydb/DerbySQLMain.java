package no.apto.java.db.derbydb;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import no.apto.java.db.ConnectionManager;
import no.apto.java.db.DBType;
import no.apto.java.db.beans.Person;
import no.apto.java.db.mssqldb.table.PersonManager;
import no.apto.java.util.InputHelper;

public class DerbySQLMain {

	
	private static Connection conn= null;
		//Denne strengen er kun for derby
		private static final String derbyQ1="CREATE TABLE CARS(ID INT PRIMARY KEY,"
                + "NAME VARCHAR(30), PRICE INT)";
		
		private static final String CreateDerbyPersonTable=
				"CREATE TABLE Person( "+
	"PersonId int primary key NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
	"Fornavn varchar(50) ,"+
	"Etternavn varchar(50) ,"+
	"Mail varchar(50) NOT NULL,"+
	"Hjemmeside varchar(50) ,"+
	"Mobil int ,"+
	"SistEndret timestamp )";
		
		private static final String q3="select * from MAS120_EMPLOYEE_TAB";
		
		public static void main(String[] args) throws SQLException {
			
			ConnectionManager.getInstance().setDBType(DBType.DERBYDB);//lager referanse til tilkoblingsmanager og setter database til derby
			conn= ConnectionManager.getInstance().getConnection();//referanse til databasetilkobling
			ResultSet rs=null;
			try(
				PreparedStatement stmt = conn.prepareStatement(CreateDerbyPersonTable);
					) {
				DatabaseMetaData dbmd = ConnectionManager.getInstance().getConnection().getMetaData();//Finner metadata fra databasen, 
				
				rs = dbmd.getTables(null, "%", "Person", null);//ser om tabell Person er laget
				if(!rs.next())//Hvis tabellen ikke er laget
				{
					int oppdatert=0;
				oppdatert = stmt.executeUpdate();
				if (oppdatert==1) {
					System.out.println("opprettet tabell Person");//Eksekverer query for å opprette tabellen Person
				}else{
					System.out.println("Intet opprettet");
				}
			
				
				}
			} catch (Exception e) {
				System.err.println("Feilet " + e.getMessage() + " " + e.getCause());
			}finally{
				rs.close();
			}
			
			
			
			
			//################################ser om det finnes noe i tabellen
			
			String sql="select PersonId, Fornavn, Mail FROM Person";
			try(
				//	Connection conn=DBUtil.getConnection(DBType.MSSQLDB);
					Statement stmt=conn.createStatement();
					ResultSet rs2=stmt.executeQuery(q3);
					){
				System.out.println("MAS120_EMPLOYEE_TAB tabell:");
				while (rs2.next()) {
					StringBuffer bf=new StringBuffer();
					
					bf.append(rs2.getString("CLIENT_ID") + ": ");
					bf.append(rs2.getString("COMPANY_ID") + ": ");
					
					System.out.println(bf.toString());
				}
				
			}
			
			//#########################
			///#######################Lar deg pprette en person
			
			Person nyPerson=new Person();
			nyPerson.setFornavn(InputHelper.getInput("Fornavn: "));			
			nyPerson.setEtternavn(InputHelper.getInput("Etternavn: "));	
			nyPerson.setMail(InputHelper.getInput("Mail: "));	
			nyPerson.setHjemmeside(InputHelper.getInput("Hjemmeside: "));	
			nyPerson.setMobil(InputHelper.getIntegerInput("Mobil: "));	
			//nyPerson.setDato(dato); dato brukes kun i databasen, settes ikke her i det hele tatt.
			//dato brukes kun i databasen for å vise når sist endring var
			insertPerson(nyPerson);
			
			//############################
			
			ConnectionManager.getInstance().closeConnection();//dette lukker databasetilkoblingen
				
			}
		
		/////////insert
		
public static boolean insertPerson(Person person) throws SQLException{ //for å sette inn en person i databasen

			
			String sql = "insert into Person(Fornavn, Etternavn, Mail, Hjemmeside, Mobil) values (?, ?, ?, ?, ?)";
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
		
		///////insert ferdig

		}

	

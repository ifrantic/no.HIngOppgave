package no.apto.java.db.derbydb;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import no.apto.java.db.ConnectionManager;
import no.apto.java.db.DBType;
import no.apto.java.db.beans.Person;
import no.apto.java.util.InputHelper;
import no.apto.java.util.ReadFileToString;

public class DerbySQLMain {

	
	private static Connection conn= null;//For tilkobling til database
	
	private static Path scriptCreateMAS120_EMPLOYEE_TAB=Paths.get("schema/DerbyPersonTest.sql");//finner sti til scrip for opprettelse av tabellen

	private static String[] tableTypes={"TABLE"};//Tabell av String, brukes når man skal finne type tabeller som er opprettet
	private static boolean tabellFinnes=false;//	brukes for å sjekke om tabell finnes eller ikke
		private static final String CreateDerbyPersonTable=
				"CREATE TABLE Person( "+
	"PersonId int primary key NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
	"Fornavn varchar(50) ,"+
	"Etternavn varchar(50) ,"+
	"Mail varchar(50) NOT NULL,"+
	"Hjemmeside varchar(50) ,"+
	"Mobil int ,"+
	"SistEndret timestamp )";
		
		private static String createMAS120_EMPLOYEE_TAB="";
		private static String MAS120_EMPLOYEE_TAB="MAS120_EMPLOYEE_TAB";
		
		private static final String q3="select * from MAS120_EMPLOYEE_TAB";
		
		public static void main(String[] args) throws SQLException {
			
			ConnectionManager.getInstance().setDBType(DBType.DERBYDB);//lager referanse til tilkoblingsmanager og setter database til derby
			conn= ConnectionManager.getInstance().getConnection();//referanse til databasetilkobling
			
			//les script for opprettelse av tabellen, legg det i en String
			createMAS120_EMPLOYEE_TAB=ReadFileToString.returnString(scriptCreateMAS120_EMPLOYEE_TAB);
			
			
			ResultSet rs=null; //deklarerer resultset 
			try(
				PreparedStatement stmt = conn.prepareStatement(createMAS120_EMPLOYEE_TAB);
					) {
				DatabaseMetaData dbmd = conn.getMetaData();//Finner metadata fra databasen, 
				
				rs = dbmd.getTables(null, "%", "%", tableTypes);//ser hvilke tabeller som er opprettet
				while (rs.next()) {
					if(rs.getString("TABLE_NAME").compareTo(MAS120_EMPLOYEE_TAB)==0){//sjekker om MAS120_EMPLOYEE_TAB finnes i tabellen med tabellnavn
						tabellFinnes=true;
						
					}
				}
				if(tabellFinnes==false)//Hvis tabellen ikke er laget
				{

					System.out.println(createMAS120_EMPLOYEE_TAB);
					int oppdatert=0;
				oppdatert = stmt.executeUpdate();//oppretter tabellen MAS120_EMPLOYEE_TAB
				if (oppdatert==1) {
					System.out.println("opprettet tabell MAS120_EMPLOYEE_TAB");//Eksekvert query for å opprette tabellen MAS120_EMPLOYEE_TAB
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

	

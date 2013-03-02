package no.apto.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Denne klassen er for � h�ndtere tilkoblinger til databasen for hele
 * applikasjonen. Dette for at det skal bli f�rrest mulig instanser av tilkoblinger,
 * og minst mulig ressursbruk (bl.a. minne) p� � �pne og lukke tilkoblinger.
 * 
 * Dette er en "singleton." dvs den kan bare bli instansiert en gang i denne klassen,
 * men hele applikasjonen kan bruke dette objektet.
 * 
 * */
public class ConnectionManager {
	
	private static ConnectionManager instance=null; //instans av klassen
	
	private static final String USERNAME = "dbuser";//brukernavn til database
	private static final String PASSWORD = "dbpassword"; //passord til databasen
	
	private static final String HYPER_CONN_STRING = //Tilkoblingsstreng for hypersql database
			"jdbc:hsqldb:data/hsqldb/hypersqldb;ifexists=false";//ligger i mappen "data"

	private static final String MSSQL_CONN_STRING=//Tilkoblingsstreng for mssql database
			"jdbc:sqlserver://localhost;databaseName=Personlig;integratedSecurity=true";
	
	private static final String DERBY_CONN_STRING=//Tilkoblingsstreng for darby database
			"jdbc:derby:data/DerbyDB;create=true";
	
	
	private DBType dbType = DBType.DERBYDB;		//type database, velger her hypersqldb database � jobbe mot.
	
	private Connection conn = null;	//setter databasetilkobling til null
	
	private ConnectionManager(){ //private slik at den kun kan brukes fra denne klassen

		
		
	}
	
	private boolean openConnection(){//gir true eller false tilbake om en kobling er �pnet eller ikke
		try{
			switch(dbType){
			case MSSQLDB: //Bruker denne for � koble til mssql database
				conn=DriverManager.getConnection(MSSQL_CONN_STRING, USERNAME, PASSWORD);
				return true;//returnerer true n�r koblingen er �pnet
				
			case HYPERSQLDB: //har ikke satt opp alternativ for � koble til hypersql database
				conn=DriverManager.getConnection(HYPER_CONN_STRING, USERNAME, PASSWORD);
				return true;
				
			case DERBYDB:
				conn=DriverManager.getConnection(DERBY_CONN_STRING, USERNAME, PASSWORD);
				return true;
				
				
				default:
					return false;
					
			
			}
		}
		catch(SQLException e){
			workingException(e);//for � h�ndtere sql feilmeldinger
			return false;
			
		}
	}

	public Connection getConnection(){ //f� en tilkobling til databasen, for hele applikasjonen
		if (conn == null) {//hvis det ikke er noen tilkobling
			if (openConnection()) {//hvis koblingen til databasen er �pnet /lar seg �pne
				System.out.println("�pnet tilkobling");
				return conn; //returner �pnet tilkobling
			}else{
				return null; //returner null for ingen tilkobling
			}
			
		}
		return conn;//returner tilkoblingen , �pnet eller ei
	}

	public void closeConnection(){ //Denne er for � lukke tilkobling til databasen
		System.out.println("lukker tilkoblingen");//Skriver ut en beskjed
		try {
			conn.close();//lukker tikoblingen
			conn=null; //setter tilkoblingen til null igjen
		} catch (Exception e) {
		
		}
	}
	
	public static ConnectionManager getInstance(){	//resten av applikasjonen m� kalle denne for � f� referanse til databasekoblingen
		if (instance == null) { //Hvis det ikke er noen oppkobling
			
			instance = new ConnectionManager();//Initier en ny oppkobling
			
			
		}
		return instance;	//returner oppkoblingen
	}

	public void setDBType(DBType dbType){//denne er for � kunne endre type database det kobles opp mot
		this.dbType=dbType;
		
	}



	public static void workingException(SQLException e){ //for h�ndtering av feilmeldinger
		System.err.println("Error message: " + e.getMessage());
		System.err.println("Error code: " + e.getErrorCode());
		System.err.println("SQL state: " + e.getSQLState());
	}
}

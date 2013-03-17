package no.apto.java;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import no.apto.java.db.ConnectionManager;
import no.apto.java.db.DBType;
import no.apto.java.db.beans.STANDALONE_APPLICATION_USER_TAB;
import no.apto.java.db.derbydb.table.STANDALONE_APPLICATION_USER_TAB_Manager;
import no.apto.java.util.InputHelper;



public class Main {

static long time = System.currentTimeMillis(); //finner tidspunktet her og nå. dette må fikses på!!
//static java.sql.Date dato = new java.sql.Date(time); //setter dato til her og nå, må gjøres mer robust eller fjernes
static Timestamp stamp= new Timestamp(time);
	
	public static void main(String[] args) throws SQLException, IOException {
		
		System.out.println("starter applikasjon");
		
		ConnectionManager.getInstance().setDBType(DBType.DERBYDB);//lager referanse til tilkoblingsmanager og
		//velger type database å koble til. derbyDB er også default, men setter det inn for syns skyld
		
	//	STANDALONE_APPLICATION_USER_TAB_Manager.displayAllRows(); //lister ut personer
		
		//TestData opprettes for ny bruker
		STANDALONE_APPLICATION_USER_TAB user=new STANDALONE_APPLICATION_USER_TAB();
		//user.setUSER_ID(1); id settes automatisk på denne
		user.setSTANDALONE_USER_CREATED_DATE(stamp);

		//Setter inn 1 testbrukere
		STANDALONE_APPLICATION_USER_TAB_Manager.insertSTANDALONE_APPLICATION_USER_TAB(user);
		
		System.out.println("Skriver følgende i customQuery");
		System.out.println("select * from STANDALONE_APPLICATION_USER_TAB");
		ResultSet rs2= STANDALONE_APPLICATION_USER_TAB_Manager.customQuery("select * from STANDALONE_APPLICATION_USER_TAB");
		
	

		int userId = InputHelper.getIntegerInput("Skriv inn id på en som skal vises :");
		
		STANDALONE_APPLICATION_USER_TAB getUser = new STANDALONE_APPLICATION_USER_TAB_Manager().getSTANDALONE_APPLICATION_USER_TAB(userId);
		if (getUser==null) {
			System.err.println("intet funnet");
		} else {
			System.out.println("Person id : " + getUser.getUSER_ID());
			System.out.println("created date  : " + getUser.getSTANDALONE_USER_CREATED_DATE());
			System.out.println("last sync  : " + getUser.getLAST_SYNC_WITH_APTO_DATE());
			System.out.println("last login : " + getUser.getLAST_LOGIN_STANDALONE_DATE());
			System.out.println("last send to attempt : " + getUser.getLAST_ATTEMPT_SEND_TO_APTO_DATE());
			System.out.println("last succeed send to : " + getUser.getLAST_SUCCEED_SEND_TO_APTO_DATE());
			System.out.println("login usernam : " + getUser.getLOGIN_USERNAME());
			System.out.println("password hash : " + getUser.getPASSWORD_HASH());
	
		
			System.out.println("###########################");
			
			int userIdUpdate = InputHelper.getIntegerInput("Skriv inn id på en som skal oppdatere loginBrukernavn :");
			
			STANDALONE_APPLICATION_USER_TAB userUpdate=new STANDALONE_APPLICATION_USER_TAB_Manager().getSTANDALONE_APPLICATION_USER_TAB(userIdUpdate);
			if(userUpdate==null){
				System.err.println("rad er ikke funnet");
				return;
			}
			String userNameUpdate=InputHelper.getInput("Skriv inn nytt brukernavn : ");
			userUpdate.setLOGIN_USERNAME(userNameUpdate);
			if(STANDALONE_APPLICATION_USER_TAB_Manager.updateSTANDALONE_APPLICATION_USER_TAB(userUpdate)){
			
			System.out.println("oppdatert user følger: ");
			System.out.println("Person id : " + userUpdate.getUSER_ID());
			System.out.println("created date  : " + userUpdate.getSTANDALONE_USER_CREATED_DATE());
			System.out.println("last sync  : " + userUpdate.getLAST_SYNC_WITH_APTO_DATE());
			System.out.println("last login : " + userUpdate.getLAST_LOGIN_STANDALONE_DATE());
			System.out.println("last send to attempt : " + userUpdate.getLAST_ATTEMPT_SEND_TO_APTO_DATE());
			System.out.println("last succeed send to : " + userUpdate.getLAST_SUCCEED_SEND_TO_APTO_DATE());
			System.out.println("login usernam : " + userUpdate.getLOGIN_USERNAME());
			System.out.println("password hash : " + userUpdate.getPASSWORD_HASH());
			System.out.println("###########################");

			}
			else{
				System.out.println("det skjedde en feil ved oppdatering");
			}
		}
		
		///////////Sletting av person
		int slettUser = InputHelper.getIntegerInput("Skriv inn id nr på user som skal slettes :");
		if (STANDALONE_APPLICATION_USER_TAB_Manager.deleteSTANDALONE_APPLICATION_USER_TAB(slettUser)) {
			System.out.println("User slettet");
		} else{
			System.err.println("Intet slettet");
		}
		
		


		ConnectionManager.getInstance().closeConnection();//dette lukker databasetilkoblingen
	}

}

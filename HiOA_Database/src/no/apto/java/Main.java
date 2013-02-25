package no.apto.java;
import java.io.IOException;
import java.sql.SQLException;
import no.apto.java.db.ConnectionManager;
import no.apto.java.db.DBType;
import no.apto.java.db.beans.Person;
import no.apto.java.db.mssqldb.table.PersonManager;
import no.apto.java.util.InputHelper;



public class Main {

//	static long time = System.currentTimeMillis(); //finner tidspunktet her og nå. dette må fikses på!!
//	static java.sql.Date dato = new java.sql.Date(time); //setter dato til her og nå, må gjøres mer robust eller fjernes
	
	public static void main(String[] args) throws SQLException, IOException {
		
		System.out.println("starter applikasjon");
		
		ConnectionManager.getInstance().setDBType(DBType.MSSQLDB);//lager referanse til tilkoblingsmanager og
		//velger type database å koble til. mssqldb er også default..
		
		PersonManager.displayAllRows(); //lister ut personer
		
		Person nyPerson=new Person();
		nyPerson.setFornavn(InputHelper.getInput("Fornavn: "));			
		nyPerson.setEtternavn(InputHelper.getInput("Etternavn: "));	
		nyPerson.setMail(InputHelper.getInput("Mail: "));	
		nyPerson.setHjemmeside(InputHelper.getInput("Hjemmeside: "));	
		nyPerson.setMobil(InputHelper.getIntegerInput("Mobil: "));	
		//nyPerson.setDato(dato); dato brukes kun i databasen, settes ikke her i det hele tatt.
		//dato brukes kun i databasen for å vise når sist endring var
		PersonManager.insertPerson(nyPerson);
		
		
	

		int persId = InputHelper.getIntegerInput("Skriv inn id på en som skal vises :");
		
		Person pers= PersonManager.getPerson(persId);
		if (pers==null) {
			System.err.println("intet funnet");
		} else {
			System.out.println("Person id : " + pers.getPersonId());
			System.out.println("Person fornavn : " + pers.getFornavn());
			System.out.println("Person etternavn : " + pers.getEtternavn());
			System.out.println("Person mail : " + pers.getMail());
			System.out.println("Person hjemmeside : " + pers.getHjemmeside());
			System.out.println("Person mobil : " + pers.getMobil());
			System.out.println("Person sist oppdatert : " + pers.getDato());
		
			System.out.println("###########################");
			
			int persIdUpdate = InputHelper.getIntegerInput("Skriv inn id på en som skal oppdatere mail :");
			
			Person persUpdate=PersonManager.getPerson(persIdUpdate);
			if(persUpdate==null){
				System.err.println("rad er ikke funnet");
				return;
			}
			String mailUpdate=InputHelper.getInput("Skriv inn ny mail : ");
			persUpdate.setMail(mailUpdate);
			if(PersonManager.updatePerson(persUpdate)){
			
			System.out.println("oppdatert person følger: ");
			System.out.println("Person id : " + persUpdate.getPersonId());
			System.out.println("Person fornavn : " + persUpdate.getFornavn());
			System.out.println("Person etternavn : " + persUpdate.getEtternavn());
			System.out.println("Person mail : " + persUpdate.getMail());
			System.out.println("Person hjemmeside : " + persUpdate.getHjemmeside());
			System.out.println("Person mobil : " + persUpdate.getMobil());
			System.out.println("Person sist oppdatert : " + persUpdate.getDato());
			System.out.println("###########################");

			}
			else{
				System.out.println("det skjedde en feil ved oppdatering");
			}
		}
		
		///////////Sletting av person
		int slettPerson = InputHelper.getIntegerInput("Skriv inn rad nr som skal slettes :");
		if (PersonManager.deletePerson(slettPerson)) {
			System.out.println("Person slettet");
		} else{
			System.err.println("Intet slettet");
		}
		
		


		ConnectionManager.getInstance().closeConnection();//dette lukker databasetilkoblingen
	}

}

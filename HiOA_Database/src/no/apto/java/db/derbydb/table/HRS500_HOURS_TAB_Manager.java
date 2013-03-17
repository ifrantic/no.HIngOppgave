package no.apto.java.db.derbydb.table;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import no.apto.java.db.ConnectionManager;
import no.apto.java.db.beans.HRS500_HOURS_TAB;

public class HRS500_HOURS_TAB_Manager {

	
	private static Connection conn= ConnectionManager.getInstance().getConnection();//referanse til databasetilkobling
	
	//IKKE TIL BRUK TROR JEG HRS500_HOURS_TAB
	public static void displayAllRows() throws SQLException{//Lister ut alle rader i tabellen HRS500_HOURS_TAB
		
		String sql="select * FROM HRS500_HOURS_TAB"; //oppretter en query string som skal brukes for å hente alle data
		try(
			//	Connection conn=DBUtil.getConnection(DBType.MSSQLDB);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
			System.out.println("Tabellen HRS500_HOURS_TAB :");
			while (rs.next()) {
				StringBuffer bf=new StringBuffer();
				bf.append(rs.getInt(0));
				
				
				System.out.println(bf.toString());
			}
			
		}
	}
		
		//TODO denne er ikke ferdig!
		public static HRS500_HOURS_TAB getHRS500_HOURS_TAB(int recordId) throws SQLException{//Henter en rad fra tabellen HRS500_HOURS_TAB, med gitt id
			
			String sql="select * from HRS500_HOURS_TAB where RECORD_ID =?";//query for å hente alle data for gitt id fra denne tabellen
			ResultSet rs=null;
			
			try(
					PreparedStatement stmt=conn.prepareStatement(sql);//deklarerer og initialiserer spørring
					
					){
				
				stmt.setInt(1, recordId);//setter inn angitt recordId i spørringen
				rs=stmt.executeQuery();//kjører query, legger resultatet i Resultset rs
				
				if(rs.next()){//hvis det er noe resultat
					
					HRS500_HOURS_TAB hrs500 = new HRS500_HOURS_TAB(); //oppretter ny forekomst av hrs500
					hrs500.setRECORD_ID(recordId); //fyller inn data fra databasen til bean hrs500

					
					return hrs500; //returner bean med data fra hrs500 tabellen, med gitt id
					
					
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
	


		public static boolean insertHRS500_HOURS_TAB(HRS500_HOURS_TAB hrs500) throws SQLException{ //for å sette inn en person i databasen

			
			//String sql = "{call Personlig.dbo.sp_InsertPerson (?, ?, ?, ?, ?)}";
			//denne bruker en prosedyre som er laget i databasen. prosedyren tar seg av innsetting i databasen
			//Har ikke laget prosedyre for innsetting av data i hrs500 tabellen ennå
			//TAR IKKE MED RECORD_ID, DA DENNE ER AUTOINCREMENT
			
			String sql="INSERT INTO HRS500_HOURS_TAB(CLIENT_ID, COMPANY_ID,EMPLOYEE_ID, PROMAIN_ID, PROSUB_ID, ACTIVITY_CODE, JOB_CODE, COST_UNIT_ID, HOURS_TYPE_CODE, HOURS_MAIN_CAT_CODE, HOURS_SUB_CAT_CODE, LOCATION_CODE, SHIFT_CODE, ROTATION_ID, ACCOUNTING_PERIOD_ID, WORK_MONTH, WORK_DATE, WORK_WEEK,  RECORD_TYPE_CODE, CORR_REF_RECORD_ID, CORRECTED_SW, ROT_REF_RECORD_ID, SUBL_REF_RECORD_ID, IMP_REF_RECORD_ID, PAYMENT_CERTIFICATE_ID, HOURS, HOURS_RATE, STATUS_CODE, ATT_BY_USER_ID, ATT_DATE, SIGNED_DATE,  SIGNED_BY_USER_ID, SENT_TO_USER_ID, TRANSF_PAYROLL_ID, TRANSF_FINANCE_ID, REPRICE_FINANCE_SW, REPRICE_PAYROLL_SW, CREATED_BY_USER, CREATED_BY_PROGRAM, CREATED_DATE, ALTERED_BY_USER,  ALTERED_BY_PROGRAM, ALTERED_DATE, REVISION_NO, INVOICE_VOUCHER_ID, TRANSF_INDIRECT_COST_ID, PROJECT_ROLE_CODE, EXTRA_DIM1_CODE, EXTRA_DIM2_CODE      )"+
			"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
			ResultSet rs=null; //initialiserer resultset for bruk til å sjekke om insert er gått riktig
			try (
				PreparedStatement stmt = conn.prepareStatement(sql);
					)
			{
				//her settes data fra hrs500 inn i statement; hvert felt settes til et gitt tall, tallet representerer variabelnummer i rekken ved insert
				stmt.setString(1, hrs500.getCLIENT_ID());
				stmt.setString(2, hrs500.getCOMPANY_ID());
				//stmt.setInt(3, hrs500.getRECORD_ID()); denne er utelatt, siden dette er autoincrement
			
				stmt.setString(3, hrs500.getEMPLOYEE_ID());
				stmt.setString(4, hrs500.getPROMAIN_ID());
				stmt.setString(5, hrs500.getPROSUB_ID());
				stmt.setString(6, hrs500.getACTIVITY_CODE());
				stmt.setString(7, hrs500.getJOB_CODE());
				stmt.setString(8, hrs500.getCOST_UNIT_ID());
				stmt.setString(9, hrs500.getHOURS_TYPE_CODE());
				stmt.setString(10, hrs500.getHOURS_MAIN_CAT_CODE()); 
				stmt.setString(11, hrs500.getHOURS_SUB_CAT_CODE());
				stmt.setString(12, hrs500.getLOCATION_CODE());
				stmt.setString(13, hrs500.getSHIFT_CODE());
				stmt.setString(14, hrs500.getROTATION_ID());
				stmt.setString(15, hrs500.getACCOUNTING_PERIOD_ID());
				stmt.setString(16, hrs500.getWORK_MONTH());
				stmt.setTimestamp(17, hrs500.getWORK_DATE());
				stmt.setString(18, hrs500.getWORK_WEEK());
				stmt.setString(19, hrs500.getRECORD_TYPE_CODE());
				stmt.setInt(20, hrs500.getCORR_REF_RECORD_ID());
				stmt.setString(21, String.valueOf(hrs500.getCORRECTED_SW())); //det er char som er input...
				stmt.setInt(22, hrs500.getROT_REF_RECORD_ID());
				stmt.setInt(23, hrs500.getSUBL_REF_RECORD_ID());
				stmt.setInt(24, hrs500.getIMP_REF_RECORD_ID());
				stmt.setInt(25, hrs500.getPAYMENT_CERTIFICATE_ID());
				stmt.setDouble(26, hrs500.getHOURS());
				stmt.setDouble(27, hrs500.getHOURS_RATE());
				stmt.setString(28, hrs500.getSTATUS_CODE());
				stmt.setString(29, hrs500.getATT_BY_USER_ID());
				stmt.setTimestamp(30, hrs500.getATT_DATE());
				stmt.setTimestamp(31, hrs500.getSIGNED_DATE());
				stmt.setString(32, hrs500.getSIGNED_BY_USER_ID());
				stmt.setString(33, hrs500.getSENT_TO_USER_ID());
				stmt.setString(34, hrs500.getTRANSF_PAYROLL_ID());
				stmt.setString(35, hrs500.getTRANSF_FINANCE_ID());
				stmt.setString(36, String.valueOf(hrs500.getREPRICE_FINANCE_SW()));//char for bit data
				stmt.setString(37, String.valueOf(hrs500.getREPRICE_PAYROLL_SW()));//char for bit data
				stmt.setString(38, hrs500.getCREATED_BY_USER());
				stmt.setString(39, hrs500.getCREATED_BY_PROGRAM());
				stmt.setTimestamp(40, hrs500.getCREATED_DATE());
				stmt.setString(41, hrs500.getALTERED_BY_USER());
				stmt.setString(42, hrs500.getALTERED_BY_PROGRAM());
				stmt.setTimestamp(43, hrs500.getALTERED_DATE());
				stmt.setInt(44, hrs500.getREVISION_NO());
				stmt.setInt(45, hrs500.getINVOICE_VOUCHER_ID());
				stmt.setString(46, hrs500.getTRANSF_INDIRECT_COST_ID());
				stmt.setString(47, hrs500.getPROJECT_ROLE_CODE());
				stmt.setString(48, hrs500.getEXTRA_DIM1_CODE());
				stmt.setString(49, hrs500.getEXTRA_DIM2_CODE());
				
				
			//	stmt.setDate(6, hrs500.getDato()); Det brukes ikke dato her, dette settes automatisk i databasen
				//ved bruk av denne prosedyren, har ikke prosedyre ennå!!!!!!!!
				
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


	public static boolean updateHRS500_HOURS_TAB(HRS500_HOURS_TAB hrs500) throws SQLException{//For å endre oppføringer på en person i databasen
		//Bruker en stored prosedure for å oppdatere personen. Identifiseres med id fra databasen
		String sql="UPDATE HRS500_HOURS_TAB SET CLIENT_ID =?, COMPANY_ID =?,EMPLOYEE_ID =?, PROMAIN_ID =?, PROSUB_ID =?, ACTIVITY_CODE =?, JOB_CODE =?, COST_UNIT_ID =?, HOURS_TYPE_CODE =?, HOURS_MAIN_CAT_CODE =?, HOURS_SUB_CAT_CODE =?, LOCATION_CODE =?, SHIFT_CODE =?, ROTATION_ID =?, ACCOUNTING_PERIOD_ID =?, WORK_MONTH =?, WORK_DATE =?, WORK_WEEK =?,  RECORD_TYPE_CODE =?, CORR_REF_RECORD_ID =?, CORRECTED_SW =?, ROT_REF_RECORD_ID =?, SUBL_REF_RECORD_ID =?, IMP_REF_RECORD_ID =?, PAYMENT_CERTIFICATE_ID =?, HOURS =?, HOURS_RATE =?, STATUS_CODE =?, ATT_BY_USER_ID =?, ATT_DATE =?, SIGNED_DATE =?,  SIGNED_BY_USER_ID =?, SENT_TO_USER_ID =?, TRANSF_PAYROLL_ID =?, TRANSF_FINANCE_ID =?, REPRICE_FINANCE_SW =?, REPRICE_PAYROLL_SW =?, CREATED_BY_USER =?, CREATED_BY_PROGRAM =?, CREATED_DATE =?, ALTERED_BY_USER =?,  ALTERED_BY_PROGRAM =?, ALTERED_DATE =?, REVISION_NO =?, INVOICE_VOUCHER_ID =?, TRANSF_INDIRECT_COST_ID =?, PROJECT_ROLE_CODE =?, EXTRA_DIM1_CODE =?, EXTRA_DIM2_CODE =? " +
		"WHERE RECORD_ID=?";//DEN SISTE HER ER ID, PRIMÆRNØKKEL, ER UNIK
		
		try (
				PreparedStatement stmt = conn.prepareStatement(sql); //forbereder kall til databasen
				){
			
			//henter data fra gitt hrs500, setter det inn i statement mot databaesn
			stmt.setString(1, hrs500.getCLIENT_ID());
			stmt.setString(2, hrs500.getCOMPANY_ID());
			
			//obs obs!!
			stmt.setInt(50, hrs500.getRECORD_ID());  //primærnøkkelen, brukes i where claus
			//brukes i WHERE
			
			stmt.setString(3, hrs500.getEMPLOYEE_ID());
			stmt.setString(4, hrs500.getPROMAIN_ID());
			stmt.setString(5, hrs500.getPROSUB_ID());
			stmt.setString(6, hrs500.getACTIVITY_CODE());
			stmt.setString(7, hrs500.getJOB_CODE());
			stmt.setString(8, hrs500.getCOST_UNIT_ID());
			stmt.setString(9, hrs500.getHOURS_TYPE_CODE());
			stmt.setString(10, hrs500.getHOURS_MAIN_CAT_CODE()); 
			stmt.setString(11, hrs500.getHOURS_SUB_CAT_CODE());
			stmt.setString(12, hrs500.getLOCATION_CODE());
			stmt.setString(13, hrs500.getSHIFT_CODE());
			stmt.setString(14, hrs500.getROTATION_ID());
			stmt.setString(15, hrs500.getACCOUNTING_PERIOD_ID());
			stmt.setString(16, hrs500.getWORK_MONTH());
			stmt.setTimestamp(17, hrs500.getWORK_DATE());
			stmt.setString(18, hrs500.getWORK_WEEK());
			stmt.setString(19, hrs500.getRECORD_TYPE_CODE());
			stmt.setInt(20, hrs500.getCORR_REF_RECORD_ID());
			stmt.setString(21, String.valueOf(hrs500.getCORRECTED_SW())); //det er char som er input...
			stmt.setInt(22, hrs500.getROT_REF_RECORD_ID());
			stmt.setInt(23, hrs500.getSUBL_REF_RECORD_ID());
			stmt.setInt(24, hrs500.getIMP_REF_RECORD_ID());
			stmt.setInt(25, hrs500.getPAYMENT_CERTIFICATE_ID());
			stmt.setDouble(26, hrs500.getHOURS());
			stmt.setDouble(27, hrs500.getHOURS_RATE());
			stmt.setString(28, hrs500.getSTATUS_CODE());
			stmt.setString(29, hrs500.getATT_BY_USER_ID());
			stmt.setTimestamp(30, hrs500.getATT_DATE());
			stmt.setTimestamp(31, hrs500.getSIGNED_DATE());
			stmt.setString(32, hrs500.getSIGNED_BY_USER_ID());
			stmt.setString(33, hrs500.getSENT_TO_USER_ID());
			stmt.setString(34, hrs500.getTRANSF_PAYROLL_ID());
			stmt.setString(35, hrs500.getTRANSF_FINANCE_ID());
			stmt.setString(36, String.valueOf(hrs500.getREPRICE_FINANCE_SW()));//char for bit data
			stmt.setString(37, String.valueOf(hrs500.getREPRICE_PAYROLL_SW()));//char for bit data
			stmt.setString(38, hrs500.getCREATED_BY_USER());
			stmt.setString(39, hrs500.getCREATED_BY_PROGRAM());
			stmt.setTimestamp(40, hrs500.getCREATED_DATE());
			stmt.setString(41, hrs500.getALTERED_BY_USER());
			stmt.setString(42, hrs500.getALTERED_BY_PROGRAM());
			stmt.setTimestamp(43, hrs500.getALTERED_DATE());
			stmt.setInt(44, hrs500.getREVISION_NO());
			stmt.setInt(45, hrs500.getINVOICE_VOUCHER_ID());
			stmt.setString(46, hrs500.getTRANSF_INDIRECT_COST_ID());
			stmt.setString(47, hrs500.getPROJECT_ROLE_CODE());
			stmt.setString(48, hrs500.getEXTRA_DIM1_CODE());
			stmt.setString(49, hrs500.getEXTRA_DIM2_CODE());

			
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

//SLETTER GITT OPPFØRING I HRS500_HOURS_TAB, TAR RECORD_ID som argument
	public static boolean deleteHRS500_HOURS_TAB(int recordId){
		String sql = "delete from HRS500_HOURS_TAB where RECORD_ID=? ";
	
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
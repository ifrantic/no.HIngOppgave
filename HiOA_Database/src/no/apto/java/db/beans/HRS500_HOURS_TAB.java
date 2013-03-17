/**
 * 
 */
package no.apto.java.db.beans;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author KnutInge
 *
 */
public class HRS500_HOURS_TAB implements Serializable {

	/**
	 * Denne bean er opprettet ut fra tabellen hrs500_hours_tab i databasen.
	 * Den brukes av HRS500_HOURS_TAB_Manager for å gjøre kall til databasen.
	 */
	private static final long serialVersionUID = -8602171813840082386L;

	/**
	 * 
	 */
	private String CLIENT_ID;	//varchar(10) NOT NULL,	
	private String COMPANY_ID;	//varchar(10) NOT NULL,
	private int RECORD_ID; //INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),	--primærnøkkel i tabellen, 
	private String EMPLOYEE_ID;	//varchar(10) NOT NULL,
	private String PROMAIN_ID;// varchar(10) ,	
	private String PROSUB_ID;// varchar(10) ,	
	private String ACTIVITY_CODE;// varchar(20) ,	
	private String JOB_CODE;// varchar(10) ,	
	private String COST_UNIT_ID;// varchar(15) ,	
	private String HOURS_TYPE_CODE;// varchar(10) NOT NULL,	
	private String HOURS_MAIN_CAT_CODE;// varchar(10) NOT NULL,	
	private String HOURS_SUB_CAT_CODE;// varchar(10) NOT NULL,	
	private String LOCATION_CODE;// varchar(10) ,	
	private String SHIFT_CODE;// varchar(10) ,	
	private String ROTATION_ID;// varchar(10) ,	
	private String ACCOUNTING_PERIOD_ID;// varchar(10) ,	
	private String WORK_MONTH;// varchar(7) NOT NULL,	
	private Timestamp WORK_DATE;// timestamp NOT NULL,	
	private String WORK_WEEK;// varchar(6) NOT NULL,	
	private String RECORD_TYPE_CODE;// varchar(10) NOT NULL DEFAULT 'ORDINARY',	
	private int CORR_REF_RECORD_ID;// int ,	
	private char CORRECTED_SW;// char(2) for bit data NOT NULL,	
	private int ROT_REF_RECORD_ID;// int ,	
	private int SUBL_REF_RECORD_ID;// int ,	
	private int IMP_REF_RECORD_ID;// int ,	
	private int PAYMENT_CERTIFICATE_ID;// int ,	
	private double HOURS;// decimal(7, 5) NOT NULL DEFAULT 0,	
	private double HOURS_RATE;// decimal(7, 2) ,	
	private String STATUS_CODE;// varchar(10) NOT NULL,	
	private String ATT_BY_USER_ID;// varchar(10) ,	
	private Timestamp ATT_DATE;// timestamp ,	
	private Timestamp SIGNED_DATE;// timestamp ,	
	private String SIGNED_BY_USER_ID;// varchar(10) ,	
	private String SENT_TO_USER_ID;// varchar(10) ,	
	private String TRANSF_PAYROLL_ID;// varchar(10) ,	
	private String TRANSF_FINANCE_ID;// varchar(10) ,	
	private char REPRICE_FINANCE_SW;// char(2) for bit data ,	
	private char REPRICE_PAYROLL_SW;// char(2) for bit data ,	
	private String CREATED_BY_USER;// varchar(10) ,	
	private String CREATED_BY_PROGRAM;// varchar(10) ,	
	private Timestamp CREATED_DATE;// timestamp ,	
	private String ALTERED_BY_USER;// varchar(10) ,	
	private String ALTERED_BY_PROGRAM;// varchar(10) ,	
	private Timestamp ALTERED_DATE;// timestamp ,	
	private short REVISION_NO;// smallint  DEFAULT 0,	
	private int INVOICE_VOUCHER_ID;// int ,	
	private String TRANSF_INDIRECT_COST_ID;// varchar(10) ,	
	private String PROJECT_ROLE_CODE;// varchar(10) ,	
	private String EXTRA_DIM1_CODE;// varchar(10) ,	
	private String EXTRA_DIM2_CODE;// varchar(10) , 
	
	/**
	 * 
	 * Under følger getter og setter for alle feltene 
	 */
	
	
	public String getCLIENT_ID() {
		return CLIENT_ID;
	}
	public void setCLIENT_ID(String cLIENT_ID) {
		CLIENT_ID = cLIENT_ID;
	}
	public String getCOMPANY_ID() {
		return COMPANY_ID;
	}
	public void setCOMPANY_ID(String cOMPANY_ID) {
		COMPANY_ID = cOMPANY_ID;
	}
	public int getRECORD_ID() {
		return RECORD_ID;
	}
	public void setRECORD_ID(int rECORD_ID) {
		RECORD_ID = rECORD_ID;
	}
	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public String getPROMAIN_ID() {
		return PROMAIN_ID;
	}
	public void setPROMAIN_ID(String pROMAIN_ID) {
		PROMAIN_ID = pROMAIN_ID;
	}
	public String getPROSUB_ID() {
		return PROSUB_ID;
	}
	public void setPROSUB_ID(String pROSUB_ID) {
		PROSUB_ID = pROSUB_ID;
	}
	public String getACTIVITY_CODE() {
		return ACTIVITY_CODE;
	}
	public void setACTIVITY_CODE(String aCTIVITY_CODE) {
		ACTIVITY_CODE = aCTIVITY_CODE;
	}
	public String getJOB_CODE() {
		return JOB_CODE;
	}
	public void setJOB_CODE(String jOB_CODE) {
		JOB_CODE = jOB_CODE;
	}
	public String getCOST_UNIT_ID() {
		return COST_UNIT_ID;
	}
	public void setCOST_UNIT_ID(String cOST_UNIT_ID) {
		COST_UNIT_ID = cOST_UNIT_ID;
	}
	public String getHOURS_TYPE_CODE() {
		return HOURS_TYPE_CODE;
	}
	public void setHOURS_TYPE_CODE(String hOURS_TYPE_CODE) {
		HOURS_TYPE_CODE = hOURS_TYPE_CODE;
	}
	public String getHOURS_MAIN_CAT_CODE() {
		return HOURS_MAIN_CAT_CODE;
	}
	public void setHOURS_MAIN_CAT_CODE(String hOURS_MAIN_CAT_CODE) {
		HOURS_MAIN_CAT_CODE = hOURS_MAIN_CAT_CODE;
	}
	public String getHOURS_SUB_CAT_CODE() {
		return HOURS_SUB_CAT_CODE;
	}
	public void setHOURS_SUB_CAT_CODE(String hOURS_SUB_CAT_CODE) {
		HOURS_SUB_CAT_CODE = hOURS_SUB_CAT_CODE;
	}
	public String getLOCATION_CODE() {
		return LOCATION_CODE;
	}
	public void setLOCATION_CODE(String lOCATION_CODE) {
		LOCATION_CODE = lOCATION_CODE;
	}
	public String getSHIFT_CODE() {
		return SHIFT_CODE;
	}
	public void setSHIFT_CODE(String sHIFT_CODE) {
		SHIFT_CODE = sHIFT_CODE;
	}
	public String getROTATION_ID() {
		return ROTATION_ID;
	}
	public void setROTATION_ID(String rOTATION_ID) {
		ROTATION_ID = rOTATION_ID;
	}
	public String getACCOUNTING_PERIOD_ID() {
		return ACCOUNTING_PERIOD_ID;
	}
	public void setACCOUNTING_PERIOD_ID(String aCCOUNTING_PERIOD_ID) {
		ACCOUNTING_PERIOD_ID = aCCOUNTING_PERIOD_ID;
	}
	public String getWORK_MONTH() {
		return WORK_MONTH;
	}
	public void setWORK_MONTH(String wORK_MONTH) {
		WORK_MONTH = wORK_MONTH;
	}
	public Timestamp getWORK_DATE() {
		return WORK_DATE;
	}
	public void setWORK_DATE(Timestamp wORK_DATE) {
		WORK_DATE = wORK_DATE;
	}
	public String getWORK_WEEK() {
		return WORK_WEEK;
	}
	public void setWORK_WEEK(String wORK_WEEK) {
		WORK_WEEK = wORK_WEEK;
	}
	public String getRECORD_TYPE_CODE() {
		return RECORD_TYPE_CODE;
	}
	public void setRECORD_TYPE_CODE(String rECORD_TYPE_CODE) {
		RECORD_TYPE_CODE = rECORD_TYPE_CODE;
	}
	public int getCORR_REF_RECORD_ID() {
		return CORR_REF_RECORD_ID;
	}
	public void setCORR_REF_RECORD_ID(int cORR_REF_RECORD_ID) {
		CORR_REF_RECORD_ID = cORR_REF_RECORD_ID;
	}
	public char getCORRECTED_SW() {
		return CORRECTED_SW;
	}
	public void setCORRECTED_SW(char cORRECTED_SW) {
		CORRECTED_SW = cORRECTED_SW;
	}
	public int getROT_REF_RECORD_ID() {
		return ROT_REF_RECORD_ID;
	}
	public void setROT_REF_RECORD_ID(int rOT_REF_RECORD_ID) {
		ROT_REF_RECORD_ID = rOT_REF_RECORD_ID;
	}
	public int getSUBL_REF_RECORD_ID() {
		return SUBL_REF_RECORD_ID;
	}
	public void setSUBL_REF_RECORD_ID(int sUBL_REF_RECORD_ID) {
		SUBL_REF_RECORD_ID = sUBL_REF_RECORD_ID;
	}
	public int getIMP_REF_RECORD_ID() {
		return IMP_REF_RECORD_ID;
	}
	public void setIMP_REF_RECORD_ID(int iMP_REF_RECORD_ID) {
		IMP_REF_RECORD_ID = iMP_REF_RECORD_ID;
	}
	public int getPAYMENT_CERTIFICATE_ID() {
		return PAYMENT_CERTIFICATE_ID;
	}
	public void setPAYMENT_CERTIFICATE_ID(int pAYMENT_CERTIFICATE_ID) {
		PAYMENT_CERTIFICATE_ID = pAYMENT_CERTIFICATE_ID;
	}
	public double getHOURS() {
		return HOURS;
	}
	public void setHOURS(double hOURS) {
		HOURS = hOURS;
	}
	public double getHOURS_RATE() {
		return HOURS_RATE;
	}
	public void setHOURS_RATE(double hOURS_RATE) {
		HOURS_RATE = hOURS_RATE;
	}
	public String getSTATUS_CODE() {
		return STATUS_CODE;
	}
	public void setSTATUS_CODE(String sTATUS_CODE) {
		STATUS_CODE = sTATUS_CODE;
	}
	public String getATT_BY_USER_ID() {
		return ATT_BY_USER_ID;
	}
	public void setATT_BY_USER_ID(String aTT_BY_USER_ID) {
		ATT_BY_USER_ID = aTT_BY_USER_ID;
	}
	public Timestamp getATT_DATE() {
		return ATT_DATE;
	}
	public void setATT_DATE(Timestamp aTT_DATE) {
		ATT_DATE = aTT_DATE;
	}
	public Timestamp getSIGNED_DATE() {
		return SIGNED_DATE;
	}
	public void setSIGNED_DATE(Timestamp sIGNED_DATE) {
		SIGNED_DATE = sIGNED_DATE;
	}
	public String getSIGNED_BY_USER_ID() {
		return SIGNED_BY_USER_ID;
	}
	public void setSIGNED_BY_USER_ID(String sIGNED_BY_USER_ID) {
		SIGNED_BY_USER_ID = sIGNED_BY_USER_ID;
	}
	public String getSENT_TO_USER_ID() {
		return SENT_TO_USER_ID;
	}
	public void setSENT_TO_USER_ID(String sENT_TO_USER_ID) {
		SENT_TO_USER_ID = sENT_TO_USER_ID;
	}
	public String getTRANSF_PAYROLL_ID() {
		return TRANSF_PAYROLL_ID;
	}
	public void setTRANSF_PAYROLL_ID(String tRANSF_PAYROLL_ID) {
		TRANSF_PAYROLL_ID = tRANSF_PAYROLL_ID;
	}
	public String getTRANSF_FINANCE_ID() {
		return TRANSF_FINANCE_ID;
	}
	public void setTRANSF_FINANCE_ID(String tRANSF_FINANCE_ID) {
		TRANSF_FINANCE_ID = tRANSF_FINANCE_ID;
	}
	public char getREPRICE_FINANCE_SW() {
		return REPRICE_FINANCE_SW;
	}
	public void setREPRICE_FINANCE_SW(char rEPRICE_FINANCE_SW) {
		REPRICE_FINANCE_SW = rEPRICE_FINANCE_SW;
	}
	public char getREPRICE_PAYROLL_SW() {
		return REPRICE_PAYROLL_SW;
	}
	public void setREPRICE_PAYROLL_SW(char rEPRICE_PAYROLL_SW) {
		REPRICE_PAYROLL_SW = rEPRICE_PAYROLL_SW;
	}
	public String getCREATED_BY_USER() {
		return CREATED_BY_USER;
	}
	public void setCREATED_BY_USER(String cREATED_BY_USER) {
		CREATED_BY_USER = cREATED_BY_USER;
	}
	public String getCREATED_BY_PROGRAM() {
		return CREATED_BY_PROGRAM;
	}
	public void setCREATED_BY_PROGRAM(String cREATED_BY_PROGRAM) {
		CREATED_BY_PROGRAM = cREATED_BY_PROGRAM;
	}
	public Timestamp getCREATED_DATE() {
		return CREATED_DATE;
	}
	public void setCREATED_DATE(Timestamp cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}
	public String getALTERED_BY_USER() {
		return ALTERED_BY_USER;
	}
	public void setALTERED_BY_USER(String aLTERED_BY_USER) {
		ALTERED_BY_USER = aLTERED_BY_USER;
	}
	public String getALTERED_BY_PROGRAM() {
		return ALTERED_BY_PROGRAM;
	}
	public void setALTERED_BY_PROGRAM(String aLTERED_BY_PROGRAM) {
		ALTERED_BY_PROGRAM = aLTERED_BY_PROGRAM;
	}
	public Timestamp getALTERED_DATE() {
		return ALTERED_DATE;
	}
	public void setALTERED_DATE(Timestamp aLTERED_DATE) {
		ALTERED_DATE = aLTERED_DATE;
	}
	public short getREVISION_NO() {
		return REVISION_NO;
	}
	public void setREVISION_NO(short rEVISION_NO) {
		REVISION_NO = rEVISION_NO;
	}
	public int getINVOICE_VOUCHER_ID() {
		return INVOICE_VOUCHER_ID;
	}
	public void setINVOICE_VOUCHER_ID(int iNVOICE_VOUCHER_ID) {
		INVOICE_VOUCHER_ID = iNVOICE_VOUCHER_ID;
	}
	public String getTRANSF_INDIRECT_COST_ID() {
		return TRANSF_INDIRECT_COST_ID;
	}
	public void setTRANSF_INDIRECT_COST_ID(String tRANSF_INDIRECT_COST_ID) {
		TRANSF_INDIRECT_COST_ID = tRANSF_INDIRECT_COST_ID;
	}
	public String getPROJECT_ROLE_CODE() {
		return PROJECT_ROLE_CODE;
	}
	public void setPROJECT_ROLE_CODE(String pROJECT_ROLE_CODE) {
		PROJECT_ROLE_CODE = pROJECT_ROLE_CODE;
	}
	public String getEXTRA_DIM1_CODE() {
		return EXTRA_DIM1_CODE;
	}
	public void setEXTRA_DIM1_CODE(String eXTRA_DIM1_CODE) {
		EXTRA_DIM1_CODE = eXTRA_DIM1_CODE;
	}
	public String getEXTRA_DIM2_CODE() {
		return EXTRA_DIM2_CODE;
	}
	public void setEXTRA_DIM2_CODE(String eXTRA_DIM2_CODE) {
		EXTRA_DIM2_CODE = eXTRA_DIM2_CODE;
	}
	
	/**
	 * 
	 */

}

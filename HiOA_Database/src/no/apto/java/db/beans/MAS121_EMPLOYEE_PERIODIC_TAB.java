package no.apto.java.db.beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class MAS121_EMPLOYEE_PERIODIC_TAB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4936541432496551548L;
	
	/**
	 * 
	 */
	/*	CONSTRAINT PK_MAS121_EMPLOYEE_PERIODIC_TAB PRIMARY KEY  (	
	CLIENT_ID,	
	COMPANY_ID,	
	EMPLOYEE_ID,	
	SERIAL_NO)
	) */
	
	private String CLIENT_ID;// varchar(10) NOT NULL,	
	private String COMPANY_ID;// varchar(10) NOT NULL,	
	private String EMPLOYEE_ID;// varchar(10) NOT NULL,	
	private int SERIAL_NO;// int NOT NULL,	
	private Timestamp VALID_FROM_DATE;// timestamp NOT NULL,	
	private Timestamp VALID_TO_DATE;// timestamp ,	
	private String ADDRESS_LINE1;// varchar(50) ,	
	private String ADDRESS_LINE2;// varchar(50) ,	
	private String ZIP_CODE;// varchar(10) ,	
	private String COUNTRY_CODE ;//varchar(10) ,	
	private String ADDRESS_ABROAD ;//varchar(50) ,	
	private double PART_TIME_PERCENTAGE;// decimal(5, 2) DEFAULT 0 ,	
	private String DISCIPLINE_CODE;// varchar(10) NOT NULL,	
	private String LOCATION_CODE;// varchar(10) NOT NULL,	
	private String EMPLOYEE_STATUS_CODE ;//varchar(10) NOT NULL,	
	private String TERMINATED_REASON ;//varchar(50) ,	
	private String EMPLOYEE_CAT_CODE;// varchar(10) NOT NULL,	
	private String SALARY_CAT_CODE ;//varchar(10) NOT NULL,	
	private String SALARY_TYPE_CODE;// varchar(10) NOT NULL,	
	private String PAYROLL_GROUP_CODE ;//varchar(10) NOT NULL,	
	private String REGULAR_PROMAIN_ID ;//varchar(10) ,	
	private String REGULAR_PROSUB_ID ;//varchar(10) ,	
	private String TRADE_CODE ;//varchar(10) NOT NULL,	
	private String EMPLOYMENT_CODE ;//varchar(10) ,	
	private String POSITION_TYPE_CODE ;//varchar(10) NOT NULL,	
	private char OVERTIME_ENTITLED_SW ;//char(2) for bit data NOT NULL DEFAULT X'00',	
	private String ORGANISATION_UNIT_ID;// varchar(10) NOT NULL,	
	private String SUPPLIER_ID ;//varchar(10) ,	
	private String INVOICE_PRICE_GRP_CODE;// varchar(50) NOT NULL,	
	private String CREATED_BY_USER;// varchar(10) ,	
	private String CREATED_BY_PROGRAM;// varchar(10) ,	
	private Timestamp CREATED_DATE ;//timestamp NOT NULL ,	
	private String ALTERED_BY_USER;// varchar(10) ,	
	private String ALTERED_BY_PROGRAM ;//varchar(10) ,	
	private Timestamp ALTERED_DATE ;//timestamp NOT NULL,	
	private short REVISION_NO ;//smallint NOT NULL DEFAULT 0,	
	private String LABOR_UNION_CODE ;//varchar(10) ,	
	private String TERMINATED_REASON_CODE;// varchar(10) ,	
	private String SALARY_SCHEME;// varchar(10) , 
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
	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public int getSERIAL_NO() {
		return SERIAL_NO;
	}
	public void setSERIAL_NO(int sERIAL_NO) {
		SERIAL_NO = sERIAL_NO;
	}
	public Timestamp getVALID_FROM_DATE() {
		return VALID_FROM_DATE;
	}
	public void setVALID_FROM_DATE(Timestamp vALID_FROM_DATE) {
		VALID_FROM_DATE = vALID_FROM_DATE;
	}
	public Timestamp getVALID_TO_DATE() {
		return VALID_TO_DATE;
	}
	public void setVALID_TO_DATE(Timestamp vALID_TO_DATE) {
		VALID_TO_DATE = vALID_TO_DATE;
	}
	public String getADDRESS_LINE1() {
		return ADDRESS_LINE1;
	}
	public void setADDRESS_LINE1(String aDDRESS_LINE1) {
		ADDRESS_LINE1 = aDDRESS_LINE1;
	}
	public String getADDRESS_LINE2() {
		return ADDRESS_LINE2;
	}
	public void setADDRESS_LINE2(String aDDRESS_LINE2) {
		ADDRESS_LINE2 = aDDRESS_LINE2;
	}
	public String getZIP_CODE() {
		return ZIP_CODE;
	}
	public void setZIP_CODE(String zIP_CODE) {
		ZIP_CODE = zIP_CODE;
	}
	public String getCOUNTRY_CODE() {
		return COUNTRY_CODE;
	}
	public void setCOUNTRY_CODE(String cOUNTRY_CODE) {
		COUNTRY_CODE = cOUNTRY_CODE;
	}
	public String getADDRESS_ABROAD() {
		return ADDRESS_ABROAD;
	}
	public void setADDRESS_ABROAD(String aDDRESS_ABROAD) {
		ADDRESS_ABROAD = aDDRESS_ABROAD;
	}
	public double getPART_TIME_PERCENTAGE() {
		return PART_TIME_PERCENTAGE;
	}
	public void setPART_TIME_PERCENTAGE(double pART_TIME_PERCENTAGE) {
		PART_TIME_PERCENTAGE = pART_TIME_PERCENTAGE;
	}
	public String getDISCIPLINE_CODE() {
		return DISCIPLINE_CODE;
	}
	public void setDISCIPLINE_CODE(String dISCIPLINE_CODE) {
		DISCIPLINE_CODE = dISCIPLINE_CODE;
	}
	public String getLOCATION_CODE() {
		return LOCATION_CODE;
	}
	public void setLOCATION_CODE(String lOCATION_CODE) {
		LOCATION_CODE = lOCATION_CODE;
	}
	public String getEMPLOYEE_STATUS_CODE() {
		return EMPLOYEE_STATUS_CODE;
	}
	public void setEMPLOYEE_STATUS_CODE(String eMPLOYEE_STATUS_CODE) {
		EMPLOYEE_STATUS_CODE = eMPLOYEE_STATUS_CODE;
	}
	public String getTERMINATED_REASON() {
		return TERMINATED_REASON;
	}
	public void setTERMINATED_REASON(String tERMINATED_REASON) {
		TERMINATED_REASON = tERMINATED_REASON;
	}
	public String getEMPLOYEE_CAT_CODE() {
		return EMPLOYEE_CAT_CODE;
	}
	public void setEMPLOYEE_CAT_CODE(String eMPLOYEE_CAT_CODE) {
		EMPLOYEE_CAT_CODE = eMPLOYEE_CAT_CODE;
	}
	public String getSALARY_CAT_CODE() {
		return SALARY_CAT_CODE;
	}
	public void setSALARY_CAT_CODE(String sALARY_CAT_CODE) {
		SALARY_CAT_CODE = sALARY_CAT_CODE;
	}
	public String getSALARY_TYPE_CODE() {
		return SALARY_TYPE_CODE;
	}
	public void setSALARY_TYPE_CODE(String sALARY_TYPE_CODE) {
		SALARY_TYPE_CODE = sALARY_TYPE_CODE;
	}
	public String getPAYROLL_GROUP_CODE() {
		return PAYROLL_GROUP_CODE;
	}
	public void setPAYROLL_GROUP_CODE(String pAYROLL_GROUP_CODE) {
		PAYROLL_GROUP_CODE = pAYROLL_GROUP_CODE;
	}
	public String getREGULAR_PROMAIN_ID() {
		return REGULAR_PROMAIN_ID;
	}
	public void setREGULAR_PROMAIN_ID(String rEGULAR_PROMAIN_ID) {
		REGULAR_PROMAIN_ID = rEGULAR_PROMAIN_ID;
	}
	public String getREGULAR_PROSUB_ID() {
		return REGULAR_PROSUB_ID;
	}
	public void setREGULAR_PROSUB_ID(String rEGULAR_PROSUB_ID) {
		REGULAR_PROSUB_ID = rEGULAR_PROSUB_ID;
	}
	public String getTRADE_CODE() {
		return TRADE_CODE;
	}
	public void setTRADE_CODE(String tRADE_CODE) {
		TRADE_CODE = tRADE_CODE;
	}
	public String getEMPLOYMENT_CODE() {
		return EMPLOYMENT_CODE;
	}
	public void setEMPLOYMENT_CODE(String eMPLOYMENT_CODE) {
		EMPLOYMENT_CODE = eMPLOYMENT_CODE;
	}
	public String getPOSITION_TYPE_CODE() {
		return POSITION_TYPE_CODE;
	}
	public void setPOSITION_TYPE_CODE(String pOSITION_TYPE_CODE) {
		POSITION_TYPE_CODE = pOSITION_TYPE_CODE;
	}
	public char getOVERTIME_ENTITLED_SW() {
		return OVERTIME_ENTITLED_SW;
	}
	public void setOVERTIME_ENTITLED_SW(char oVERTIME_ENTITLED_SW) {
		OVERTIME_ENTITLED_SW = oVERTIME_ENTITLED_SW;
	}
	public String getORGANISATION_UNIT_ID() {
		return ORGANISATION_UNIT_ID;
	}
	public void setORGANISATION_UNIT_ID(String oRGANISATION_UNIT_ID) {
		ORGANISATION_UNIT_ID = oRGANISATION_UNIT_ID;
	}
	public String getSUPPLIER_ID() {
		return SUPPLIER_ID;
	}
	public void setSUPPLIER_ID(String sUPPLIER_ID) {
		SUPPLIER_ID = sUPPLIER_ID;
	}
	public String getINVOICE_PRICE_GRP_CODE() {
		return INVOICE_PRICE_GRP_CODE;
	}
	public void setINVOICE_PRICE_GRP_CODE(String iNVOICE_PRICE_GRP_CODE) {
		INVOICE_PRICE_GRP_CODE = iNVOICE_PRICE_GRP_CODE;
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
	public String getLABOR_UNION_CODE() {
		return LABOR_UNION_CODE;
	}
	public void setLABOR_UNION_CODE(String lABOR_UNION_CODE) {
		LABOR_UNION_CODE = lABOR_UNION_CODE;
	}
	public String getTERMINATED_REASON_CODE() {
		return TERMINATED_REASON_CODE;
	}
	public void setTERMINATED_REASON_CODE(String tERMINATED_REASON_CODE) {
		TERMINATED_REASON_CODE = tERMINATED_REASON_CODE;
	}
	public String getSALARY_SCHEME() {
		return SALARY_SCHEME;
	}
	public void setSALARY_SCHEME(String sALARY_SCHEME) {
		SALARY_SCHEME = sALARY_SCHEME;
	}

	
	
	


}

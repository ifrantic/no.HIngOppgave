package no.apto.java.db.beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class MAS120_EMPLOYEE_TAB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5224605878010834983L;

	/**
	 * 
	 */
	/*
	CONSTRAINT PK_MAS120_EMPLOYEE_TAB PRIMARY KEY  (	
	CLIENT_ID,	
	COMPANY_ID,	
	EMPLOYEE_ID)
	)*/
	
	
	
	private String CLIENT_ID;// varchar(10) NOT NULL,	
	private String COMPANY_ID;// varchar(10) NOT NULL,	
	private String EMPLOYEE_ID;// varchar(10) NOT NULL,	
	private String FIRSTNAME;// varchar(50) NOT NULL,	
	private String SURNAME;// varchar(50) NOT NULL,	
	private String EMPLOYEE_TYPE_CODE;// varchar(10) ,	
	private String INITIALS;// varchar(10) ,	
	private String GENDER;// varchar(10) ,	
	private Timestamp DATE_OF_BIRTH ;//timestamp ,	
	private String NATIONAL_IDENTITY_NO ;//varchar(20),	
	private String NATIONALITY ;//varchar(10) ,	
	private char PRE_GENERATE_HOURS_SW ;//char(2) for bit data NOT NULL DEFAULT X'00',	
	private char REQ_HOURS_REG_SW;// char(2) for bit data NOT NULL DEFAULT X'00',	
	private char EMAIL_REMINDER_SW;// char(2) for bit data NOT NULL DEFAULT X'00',	
	private String EMAIL_WORK ;//varchar(50) ,	
	private String EMAIL_PRIVATE;// varchar(50) ,	
	private String ELECTRONIC_PAYCHECK_CODE;// varchar(10) ,	
	private String PHONE_NO_WORK ;//varchar(20) ,	
	private String PHONE_NO_PRIVATE ;//varchar(20) ,	
	private String PHONE_NO_MOBILE ;//varchar(20) ,	
	private String SUPERIOR_ID ;//varchar(10) ,	
	private String MATERIAL_STATUS_CODE;// varchar(10) ,	
	private char NATIVE_COMPANY_SW;// char(2) for bit data NOT NULL DEFAULT X'00',	
	private char TRANSF_EMPL_PAYROLL_SW;// char(2) for bit data NOT NULL DEFAULT X'00',	
	private char COMPANY_CAR_SW ;//char(2) for bit data NOT NULL DEFAULT X'00',	
	private String BANK_ACCOUNT_NO;// varchar(50) ,	
	private String CREATED_BY_USER;// varchar(10) ,	
	private String CREATED_BY_PROGRAM;// varchar(10) ,	
	private Timestamp CREATED_DATE;// timestamp ,	
	private String ALTERED_BY_USER;// varchar(10) ,	
	private String ALTERED_BY_PROGRAM ;//varchar(10) ,	
	private Timestamp ALTERED_DATE ;//timestamp ,	
	private short REVISION_NO;// smallint NOT NULL DEFAULT 0,	
	private char ABSENCE_MESSAGE_RECIPIENT_SW ;//char(2) for bit data NOT NULL DEFAULT X'00',	
	private char PROJECT_RESPONSIBLE_SW ;//char(2) for bit data NOT NULL DEFAULT X'00',	
	private Timestamp LAST_SETTLEMENT_DATE ;//timestamp , 
	
	
	
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
	public String getFIRSTNAME() {
		return FIRSTNAME;
	}
	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}
	public String getSURNAME() {
		return SURNAME;
	}
	public void setSURNAME(String sURNAME) {
		SURNAME = sURNAME;
	}
	public String getEMPLOYEE_TYPE_CODE() {
		return EMPLOYEE_TYPE_CODE;
	}
	public void setEMPLOYEE_TYPE_CODE(String eMPLOYEE_TYPE_CODE) {
		EMPLOYEE_TYPE_CODE = eMPLOYEE_TYPE_CODE;
	}
	public String getINITIALS() {
		return INITIALS;
	}
	public void setINITIALS(String iNITIALS) {
		INITIALS = iNITIALS;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public Timestamp getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}
	public void setDATE_OF_BIRTH(Timestamp dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}
	public String getNATIONAL_IDENTITY_NO() {
		return NATIONAL_IDENTITY_NO;
	}
	public void setNATIONAL_IDENTITY_NO(String nATIONAL_IDENTITY_NO) {
		NATIONAL_IDENTITY_NO = nATIONAL_IDENTITY_NO;
	}
	public String getNATIONALITY() {
		return NATIONALITY;
	}
	public void setNATIONALITY(String nATIONALITY) {
		NATIONALITY = nATIONALITY;
	}
	public char getPRE_GENERATE_HOURS_SW() {
		return PRE_GENERATE_HOURS_SW;
	}
	public void setPRE_GENERATE_HOURS_SW(char pRE_GENERATE_HOURS_SW) {
		PRE_GENERATE_HOURS_SW = pRE_GENERATE_HOURS_SW;
	}
	public char getREQ_HOURS_REG_SW() {
		return REQ_HOURS_REG_SW;
	}
	public void setREQ_HOURS_REG_SW(char rEQ_HOURS_REG_SW) {
		REQ_HOURS_REG_SW = rEQ_HOURS_REG_SW;
	}
	public char getEMAIL_REMINDER_SW() {
		return EMAIL_REMINDER_SW;
	}
	public void setEMAIL_REMINDER_SW(char eMAIL_REMINDER_SW) {
		EMAIL_REMINDER_SW = eMAIL_REMINDER_SW;
	}
	public String getEMAIL_WORK() {
		return EMAIL_WORK;
	}
	public void setEMAIL_WORK(String eMAIL_WORK) {
		EMAIL_WORK = eMAIL_WORK;
	}
	public String getEMAIL_PRIVATE() {
		return EMAIL_PRIVATE;
	}
	public void setEMAIL_PRIVATE(String eMAIL_PRIVATE) {
		EMAIL_PRIVATE = eMAIL_PRIVATE;
	}
	public String getELECTRONIC_PAYCHECK_CODE() {
		return ELECTRONIC_PAYCHECK_CODE;
	}
	public void setELECTRONIC_PAYCHECK_CODE(String eLECTRONIC_PAYCHECK_CODE) {
		ELECTRONIC_PAYCHECK_CODE = eLECTRONIC_PAYCHECK_CODE;
	}
	public String getPHONE_NO_WORK() {
		return PHONE_NO_WORK;
	}
	public void setPHONE_NO_WORK(String pHONE_NO_WORK) {
		PHONE_NO_WORK = pHONE_NO_WORK;
	}
	public String getPHONE_NO_PRIVATE() {
		return PHONE_NO_PRIVATE;
	}
	public void setPHONE_NO_PRIVATE(String pHONE_NO_PRIVATE) {
		PHONE_NO_PRIVATE = pHONE_NO_PRIVATE;
	}
	public String getPHONE_NO_MOBILE() {
		return PHONE_NO_MOBILE;
	}
	public void setPHONE_NO_MOBILE(String pHONE_NO_MOBILE) {
		PHONE_NO_MOBILE = pHONE_NO_MOBILE;
	}
	public String getSUPERIOR_ID() {
		return SUPERIOR_ID;
	}
	public void setSUPERIOR_ID(String sUPERIOR_ID) {
		SUPERIOR_ID = sUPERIOR_ID;
	}
	public String getMATERIAL_STATUS_CODE() {
		return MATERIAL_STATUS_CODE;
	}
	public void setMATERIAL_STATUS_CODE(String mATERIAL_STATUS_CODE) {
		MATERIAL_STATUS_CODE = mATERIAL_STATUS_CODE;
	}
	public char getNATIVE_COMPANY_SW() {
		return NATIVE_COMPANY_SW;
	}
	public void setNATIVE_COMPANY_SW(char nATIVE_COMPANY_SW) {
		NATIVE_COMPANY_SW = nATIVE_COMPANY_SW;
	}
	public char getTRANSF_EMPL_PAYROLL_SW() {
		return TRANSF_EMPL_PAYROLL_SW;
	}
	public void setTRANSF_EMPL_PAYROLL_SW(char tRANSF_EMPL_PAYROLL_SW) {
		TRANSF_EMPL_PAYROLL_SW = tRANSF_EMPL_PAYROLL_SW;
	}
	public char getCOMPANY_CAR_SW() {
		return COMPANY_CAR_SW;
	}
	public void setCOMPANY_CAR_SW(char cOMPANY_CAR_SW) {
		COMPANY_CAR_SW = cOMPANY_CAR_SW;
	}
	public String getBANK_ACCOUNT_NO() {
		return BANK_ACCOUNT_NO;
	}
	public void setBANK_ACCOUNT_NO(String bANK_ACCOUNT_NO) {
		BANK_ACCOUNT_NO = bANK_ACCOUNT_NO;
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
	public char getABSENCE_MESSAGE_RECIPIENT_SW() {
		return ABSENCE_MESSAGE_RECIPIENT_SW;
	}
	public void setABSENCE_MESSAGE_RECIPIENT_SW(char aBSENCE_MESSAGE_RECIPIENT_SW) {
		ABSENCE_MESSAGE_RECIPIENT_SW = aBSENCE_MESSAGE_RECIPIENT_SW;
	}
	public char getPROJECT_RESPONSIBLE_SW() {
		return PROJECT_RESPONSIBLE_SW;
	}
	public void setPROJECT_RESPONSIBLE_SW(char pROJECT_RESPONSIBLE_SW) {
		PROJECT_RESPONSIBLE_SW = pROJECT_RESPONSIBLE_SW;
	}
	public Timestamp getLAST_SETTLEMENT_DATE() {
		return LAST_SETTLEMENT_DATE;
	}
	public void setLAST_SETTLEMENT_DATE(Timestamp lAST_SETTLEMENT_DATE) {
		LAST_SETTLEMENT_DATE = lAST_SETTLEMENT_DATE;
	}
 
	
	
	
	
}

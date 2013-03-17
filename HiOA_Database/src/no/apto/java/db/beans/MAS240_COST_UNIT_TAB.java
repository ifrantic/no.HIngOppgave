package no.apto.java.db.beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class MAS240_COST_UNIT_TAB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5868081322131950864L;
	
	/**
	 * 
	 */
	
	/* 	CONSTRAINT aaaaaMAS000_COST_UNIT_TAB_PK PRIMARY KEY (	
	COST_UNIT_ID,	
	COMPANY_ID,	
	CLIENT_ID)
	) */
	
	private String CLIENT_ID;// varchar(10) NOT NULL,	
	private String COMPANY_ID;// varchar(10) NOT NULL,	
	private String COST_UNIT_ID ;//varchar(15) NOT NULL,	
	private String PROMAIN_ID ;//varchar(10) NOT NULL,	
	private String PROSUB_ID;// varchar(10) NOT NULL,	
	private String ACTIVITY_CODE;// varchar(20) ,	
	private String JOB_CODE;// varchar(10) ,	
	private String DESCRIPTION;// varchar(100) ,	
	private Timestamp VALID_FROM_DATE;//timestamp ,	
	private Timestamp VALID_TO_DATE ;//timestamp ,	
	private String 	LOCATION_CODE ;//varchar(10) ,	
	private String CUSTOMER_COST_UNIT ;//varchar(50) ,	
	private String EXTERNAL_REFERENCE ;//varchar(20) ,	
	private String CREATED_BY_USER;//varchar(10) ,	
	private String CREATED_BY_PROGRAM ;//varchar(10) ,	
	private Timestamp CREATED_DATE ;//timestamp ,	
	private String ALTERED_BY_USER;// varchar(10) ,	
	private String ALTERED_BY_PROGRAM;// varchar(10) ,	
	private Timestamp ALTERED_DATE;// timestamp ,	
	private short REVISION_NO;// smallint ,	
	private String EXTERNAL_KEY1 ;//varchar(20) ,	
	private String EXTERNAL_KEY2 ;//varchar(20) , 
	
	
	
	/**
	 * 
	 * 
	 * GETTERS OG SETTERS kommer her
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
	public String getCOST_UNIT_ID() {
		return COST_UNIT_ID;
	}
	public void setCOST_UNIT_ID(String cOST_UNIT_ID) {
		COST_UNIT_ID = cOST_UNIT_ID;
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
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
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
	public String getLOCATION_CODE() {
		return LOCATION_CODE;
	}
	public void setLOCATION_CODE(String lOCATION_CODE) {
		LOCATION_CODE = lOCATION_CODE;
	}
	public String getCUSTOMER_COST_UNIT() {
		return CUSTOMER_COST_UNIT;
	}
	public void setCUSTOMER_COST_UNIT(String cUSTOMER_COST_UNIT) {
		CUSTOMER_COST_UNIT = cUSTOMER_COST_UNIT;
	}
	public String getEXTERNAL_REFERENCE() {
		return EXTERNAL_REFERENCE;
	}
	public void setEXTERNAL_REFERENCE(String eXTERNAL_REFERENCE) {
		EXTERNAL_REFERENCE = eXTERNAL_REFERENCE;
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
	public String getEXTERNAL_KEY1() {
		return EXTERNAL_KEY1;
	}
	public void setEXTERNAL_KEY1(String eXTERNAL_KEY1) {
		EXTERNAL_KEY1 = eXTERNAL_KEY1;
	}
	public String getEXTERNAL_KEY2() {
		return EXTERNAL_KEY2;
	}
	public void setEXTERNAL_KEY2(String eXTERNAL_KEY2) {
		EXTERNAL_KEY2 = eXTERNAL_KEY2;
	}

 

}

package no.apto.java.db.beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class HRS200_ROTATION_PLAN_TAB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5310111116763761167L;
	
	/**
	 * 
	 */
	/*CONSTRAINT aaaaaHRS000_ROTATION_PLAN_TAB_PK PRIMARY KEY(	
	CLIENT_ID,	
	COMPANY_ID,	
	EMPLOYEE_ID,	
	ROTATION_ID,	
	VALID_FROM_DATE,	
	PROMAIN_ID)
	) */
	
	
	
	private String CLIENT_ID ;// varchar(10) NOT NULL,	
	private String COMPANY_ID  ;// varchar(10) NOT NULL,	
	private String EMPLOYEE_ID ;//  varchar(10) NOT NULL,	
	private String ROTATION_ID  ;// varchar(10) NOT NULL,	
	private String PROMAIN_ID ;//  varchar(10) NOT NULL,	
	private Timestamp VALID_FROM_DATE ;//  timestamp NOT NULL,	
	private Timestamp VALID_TO_DATE ;//  timestamp ,	
	private String LOCATION_CODE ;//  varchar(10) ,	
	private char USE_REGULAR_PROJECT_SW ;//  char(2) for bit data NOT NULL DEFAULT X'00',	
	private String PROJECT_ROLE_CODE  ;// varchar(10) ,	
	private String CREATED_BY_USER  ;// varchar(10) ,	
	private String CREATED_BY_PROGRAM  ;// varchar(10) ,	
	private Timestamp CREATED_DATE ;//  timestamp ,	
	private String ALTERED_BY_USER ;//  varchar(10) ,	
	private String ALTERED_BY_PROGRAM ;//  varchar(10) ,	
	private Timestamp ALTERED_DATE ;//  timestamp ,	
	private short REVISION_NO  ;// smallint DEFAULT 0, 
	
	/**
	 * GETTERS AND SETTERS kommer her
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
	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public String getROTATION_ID() {
		return ROTATION_ID;
	}
	public void setROTATION_ID(String rOTATION_ID) {
		ROTATION_ID = rOTATION_ID;
	}
	public String getPROMAIN_ID() {
		return PROMAIN_ID;
	}
	public void setPROMAIN_ID(String pROMAIN_ID) {
		PROMAIN_ID = pROMAIN_ID;
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
	public char getUSE_REGULAR_PROJECT_SW() {
		return USE_REGULAR_PROJECT_SW;
	}
	public void setUSE_REGULAR_PROJECT_SW(char uSE_REGULAR_PROJECT_SW) {
		USE_REGULAR_PROJECT_SW = uSE_REGULAR_PROJECT_SW;
	}
	public String getPROJECT_ROLE_CODE() {
		return PROJECT_ROLE_CODE;
	}
	public void setPROJECT_ROLE_CODE(String pROJECT_ROLE_CODE) {
		PROJECT_ROLE_CODE = pROJECT_ROLE_CODE;
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



}

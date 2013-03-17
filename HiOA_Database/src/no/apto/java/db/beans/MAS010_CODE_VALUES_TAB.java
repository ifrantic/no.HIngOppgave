package no.apto.java.db.beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class MAS010_CODE_VALUES_TAB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2684747564650555533L;

	/**
	 * 
	 */
	/*CONSTRAINT PK_MAS000_CODE_VALUES_TAB PRIMARY KEY  (	
	CLIENT_ID,	
	COMPANY_ID,	
	CODE_ID,	
	CODE_VALUE)
	) 
	GO*/
	
	private String CLIENT_ID;// varchar(10) NOT NULL,	
	private String COMPANY_ID;// varchar(10) NOT NULL,	
	private String CODE_ID ;//varchar(20) NOT NULL,	
	private String CODE_VALUE;// varchar(10) NOT NULL,	
	private char ACTIVE_SW;// char(2) for bit data NOT NULL DEFAULT X'00',	
	private String SHORT_DESCRIPTION;// varchar(10) ,	
	private String DESCRIPTION ;//varchar(40) ,	
	private String SHORT_DESCRIPTION_RESOURCE_ID;// varchar(50) ,	
	private String DESCRIPTION_RESOURCE_ID ;//varchar(50) ,	
	private short SORT_ORDER;// smallint ,	
	private String CREATED_BY_USER;// varchar(10) ,	
	private String CREATED_BY_PROGRAM ;//varchar(10) ,	
	private Timestamp CREATED_DATE;// timestamp,	
	private String ALTERED_BY_USER ;//varchar(10) ,	
	private String ALTERED_BY_PROGRAM ;//varchar(10) ,	
	private Timestamp ALTERED_DATE;// timestamp ,	
	private short REVISION_NO;// smallint  DEFAULT 0, 
	
	
	/**
	 * GETTERS OG SETTERS KOMMER HER
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
	public String getCODE_ID() {
		return CODE_ID;
	}
	public void setCODE_ID(String cODE_ID) {
		CODE_ID = cODE_ID;
	}
	public String getCODE_VALUE() {
		return CODE_VALUE;
	}
	public void setCODE_VALUE(String cODE_VALUE) {
		CODE_VALUE = cODE_VALUE;
	}
	public char getACTIVE_SW() {
		return ACTIVE_SW;
	}
	public void setACTIVE_SW(char aCTIVE_SW) {
		ACTIVE_SW = aCTIVE_SW;
	}
	public String getSHORT_DESCRIPTION() {
		return SHORT_DESCRIPTION;
	}
	public void setSHORT_DESCRIPTION(String sHORT_DESCRIPTION) {
		SHORT_DESCRIPTION = sHORT_DESCRIPTION;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public String getSHORT_DESCRIPTION_RESOURCE_ID() {
		return SHORT_DESCRIPTION_RESOURCE_ID;
	}
	public void setSHORT_DESCRIPTION_RESOURCE_ID(
			String sHORT_DESCRIPTION_RESOURCE_ID) {
		SHORT_DESCRIPTION_RESOURCE_ID = sHORT_DESCRIPTION_RESOURCE_ID;
	}
	public String getDESCRIPTION_RESOURCE_ID() {
		return DESCRIPTION_RESOURCE_ID;
	}
	public void setDESCRIPTION_RESOURCE_ID(String dESCRIPTION_RESOURCE_ID) {
		DESCRIPTION_RESOURCE_ID = dESCRIPTION_RESOURCE_ID;
	}
	public short getSORT_ORDER() {
		return SORT_ORDER;
	}
	public void setSORT_ORDER(short sORT_ORDER) {
		SORT_ORDER = sORT_ORDER;
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

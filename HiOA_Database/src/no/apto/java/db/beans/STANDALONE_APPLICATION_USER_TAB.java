package no.apto.java.db.beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class STANDALONE_APPLICATION_USER_TAB implements Serializable {

	/**
	 * Denne er ca ferdig.
	 */
	private static final long serialVersionUID = 8537460877194842679L;
	
	private int USER_ID;
	private Timestamp STANDALONE_USER_CREATED_DATE=null; //STANDALONE_USER_CREATED_DATE timestamp,
	private Timestamp LAST_SYNC_WITH_APTO_DATE=null; //LAST_SYNC_WITH_APTO_DATE timestamp ,
	private Timestamp LAST_LOGIN_STANDALONE_DATE=null; //LAST_LOGIN_STANDALONE_DATE timestamp,
	private Timestamp LAST_ATTEMPT_SEND_TO_APTO_DATE=null; //LAST_ATTEMPT_SEND_TO_APTO_DATE timestamp,
	private Timestamp LAST_SUCCEED_SEND_TO_APTO_DATE=null; //LAST_SUCCEED_SEND_TO_APTO_DATE timestamp,
	private String LOGIN_USERNAME=null; // LOGIN_USERNAME varchar(50),
	private String PASSWORD_HASH=null; //PASSWORD_HASH varchar(100),
	
	
	


	/**
	 * 
	 * Under følger getter og setter for alle feltene 
	 */
	
	public int getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getLOGIN_USERNAME() {
		return LOGIN_USERNAME;
	}
	public void setLOGIN_USERNAME(String lOGIN_USERNAME) {
		LOGIN_USERNAME = lOGIN_USERNAME;
	}

	public Timestamp getSTANDALONE_USER_CREATED_DATE() {
		return STANDALONE_USER_CREATED_DATE;
	}
	public void setSTANDALONE_USER_CREATED_DATE(Timestamp sTANDALONE_USER_CREATED_DATE) {
		STANDALONE_USER_CREATED_DATE = sTANDALONE_USER_CREATED_DATE;
	}
	public Timestamp getLAST_SYNC_WITH_APTO_DATE() {
		return LAST_SYNC_WITH_APTO_DATE;
	}
	public void setLAST_SYNC_WITH_APTO_DATE(Timestamp lAST_SYNC_WITH_APTO_DATE) {
		LAST_SYNC_WITH_APTO_DATE = lAST_SYNC_WITH_APTO_DATE;
	}
	public Timestamp getLAST_LOGIN_STANDALONE_DATE() {
		return LAST_LOGIN_STANDALONE_DATE;
	}
	public void setLAST_LOGIN_STANDALONE_DATE(Timestamp lAST_LOGIN_STANDALONE_DATE) {
		LAST_LOGIN_STANDALONE_DATE = lAST_LOGIN_STANDALONE_DATE;
	}
	public Timestamp getLAST_ATTEMPT_SEND_TO_APTO_DATE() {
		return LAST_ATTEMPT_SEND_TO_APTO_DATE;
	}
	public void setLAST_ATTEMPT_SEND_TO_APTO_DATE(
			Timestamp lAST_ATTEMPT_SEND_TO_APTO_DATE) {
		LAST_ATTEMPT_SEND_TO_APTO_DATE = lAST_ATTEMPT_SEND_TO_APTO_DATE;
	}
	public Timestamp getLAST_SUCCEED_SEND_TO_APTO_DATE() {
		return LAST_SUCCEED_SEND_TO_APTO_DATE;
	}
	public void setLAST_SUCCEED_SEND_TO_APTO_DATE(
			Timestamp lAST_SUCCEED_SEND_TO_APTO_DATE) {
		LAST_SUCCEED_SEND_TO_APTO_DATE = lAST_SUCCEED_SEND_TO_APTO_DATE;
	}
	public String getPASSWORD_HASH() {
		return PASSWORD_HASH;
	}
	public void setPASSWORD_HASH(String pASSWORD_HASH) {
		PASSWORD_HASH = pASSWORD_HASH;
	}

	/**
	 * 
	 */
}

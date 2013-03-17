package no.apto.java.db.beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class HRS100_HOURS_TYPE_TAB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7972561520254942489L;
	
	/**
	 * 
		CONSTRAINT PK_HRS100_HOURS_TYPE_TAB PRIMARY KEY  (	
		CLIENT_ID,	
		COMPANY_ID,	
		HOURS_TYPE_CODE)
		) 
	 */
	
	private String CLIENT_ID;// CLIENT_ID varchar(10) NOT NULL,	
	private String COMPANY_ID;// varchar(10) NOT NULL,	
	private String HOURS_TYPE_CODE;// varchar(10) NOT NULL,	
	private String HOURS_TYPE_GRP_CODE;// varchar(10) ,	
	private String DESCRIPTION;// varchar(50) ,	
	private String HOURS_MAIN_CAT_CODE;// varchar(10) NOT NULL,	
	private String HOURS_SUB_CAT_CODE;// varchar(10) NOT NULL,	
	private char PUBLIC_HOLIDAY_SW;// char(2) for bit data NOT NULL,	
	private char COMPENSATED_IN_ROTATION_SW;// char(2) for bit data NOT NULL,	
	private char ALLOW_LONG_TERM_ABSENCE_SW ;//char(2) for bit data NOT NULL,	
	private char AVAILABLE_FOR_REG_SW ;//char(2) for bit data ,	
	private char ALLOW_STATUS_LEAVE_SW ;//char(2) for bit data ,	
	private char INVOICE_UTILIZATION_CALC_SW;// char(2) for bit data NOT NULL DEFAULT X'00',	
	private char NORMAL_HOURS_SW ;//char(2) for bit data NOT NULL DEFAULT X'00',	
	private char SICK_LEAVE_SW ;//char(2) for bit data NOT NULL DEFAULT X'00',	
	private char OVERTIME_CALC_SW ;//char(2) for bit data NOT NULL DEFAULT X'00',	
	private double MIN_PR_DAY;// decimal(5, 2) ,	
	private double MAX_PR_DAY ;//decimal(5, 2) ,	
	private String FIXED_COST_UNIT_ID ;//varchar(15) ,	
	private Timestamp VALID_FROM_DATE;// timestamp ,	
	private Timestamp VALID_TO_DATE;// timestamp ,	
	private String COMMENT ;//varchar(200) ,	
	private String CREATED_BY_USER;// varchar(10) ,	
	private String CREATED_BY_PROGRAM ;//varchar(10) ,	
	private Timestamp CREATED_DATE;// timestamp ,	
	private String ALTERED_BY_USER;// varchar(10) ,	
	private String ALTERED_BY_PROGRAM;// varchar(10) ,	
	private Timestamp ALTERED_DATE ;//timestamp ,	
	private short REVISION_NO ;//smallint DEFAULT 0 ,	
	private String AVG_CALC_MOB_CODE ;//varchar(10) NOT NULL DEFAULT 'NONE',	
	private String AVG_CALC_GRP_CODE ;//varchar(10) NOT NULL DEFAULT 'NONE',	
	private double MAX_PR_WEEK;// decimal(5, 2) ,	
	private String SPECIAL_ACCESS_ID ;//varchar(50) ,	
	private char ALLOW_WAGE_TYPE_MAPPING_SW ;//char(2) for bit data NOT NULL DEFAULT X'00',	
	private String REPORT_DESCRIPTION ;//varchar(200) ,	
	private char OVERTIME_SW;// char(2) for bit data NOT NULL DEFAULT X'00', 
	
	
	
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
	public String getHOURS_TYPE_CODE() {
		return HOURS_TYPE_CODE;
	}
	public void setHOURS_TYPE_CODE(String hOURS_TYPE_CODE) {
		HOURS_TYPE_CODE = hOURS_TYPE_CODE;
	}
	public String getHOURS_TYPE_GRP_CODE() {
		return HOURS_TYPE_GRP_CODE;
	}
	public void setHOURS_TYPE_GRP_CODE(String hOURS_TYPE_GRP_CODE) {
		HOURS_TYPE_GRP_CODE = hOURS_TYPE_GRP_CODE;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
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
	public char getPUBLIC_HOLIDAY_SW() {
		return PUBLIC_HOLIDAY_SW;
	}
	public void setPUBLIC_HOLIDAY_SW(char pUBLIC_HOLIDAY_SW) {
		PUBLIC_HOLIDAY_SW = pUBLIC_HOLIDAY_SW;
	}
	public char getCOMPENSATED_IN_ROTATION_SW() {
		return COMPENSATED_IN_ROTATION_SW;
	}
	public void setCOMPENSATED_IN_ROTATION_SW(char cOMPENSATED_IN_ROTATION_SW) {
		COMPENSATED_IN_ROTATION_SW = cOMPENSATED_IN_ROTATION_SW;
	}
	public char getALLOW_LONG_TERM_ABSENCE_SW() {
		return ALLOW_LONG_TERM_ABSENCE_SW;
	}
	public void setALLOW_LONG_TERM_ABSENCE_SW(char aLLOW_LONG_TERM_ABSENCE_SW) {
		ALLOW_LONG_TERM_ABSENCE_SW = aLLOW_LONG_TERM_ABSENCE_SW;
	}
	public char getAVAILABLE_FOR_REG_SW() {
		return AVAILABLE_FOR_REG_SW;
	}
	public void setAVAILABLE_FOR_REG_SW(char aVAILABLE_FOR_REG_SW) {
		AVAILABLE_FOR_REG_SW = aVAILABLE_FOR_REG_SW;
	}
	public char getALLOW_STATUS_LEAVE_SW() {
		return ALLOW_STATUS_LEAVE_SW;
	}
	public void setALLOW_STATUS_LEAVE_SW(char aLLOW_STATUS_LEAVE_SW) {
		ALLOW_STATUS_LEAVE_SW = aLLOW_STATUS_LEAVE_SW;
	}
	public char getINVOICE_UTILIZATION_CALC_SW() {
		return INVOICE_UTILIZATION_CALC_SW;
	}
	public void setINVOICE_UTILIZATION_CALC_SW(char iNVOICE_UTILIZATION_CALC_SW) {
		INVOICE_UTILIZATION_CALC_SW = iNVOICE_UTILIZATION_CALC_SW;
	}
	public char getNORMAL_HOURS_SW() {
		return NORMAL_HOURS_SW;
	}
	public void setNORMAL_HOURS_SW(char nORMAL_HOURS_SW) {
		NORMAL_HOURS_SW = nORMAL_HOURS_SW;
	}
	public char getSICK_LEAVE_SW() {
		return SICK_LEAVE_SW;
	}
	public void setSICK_LEAVE_SW(char sICK_LEAVE_SW) {
		SICK_LEAVE_SW = sICK_LEAVE_SW;
	}
	public char getOVERTIME_CALC_SW() {
		return OVERTIME_CALC_SW;
	}
	public void setOVERTIME_CALC_SW(char oVERTIME_CALC_SW) {
		OVERTIME_CALC_SW = oVERTIME_CALC_SW;
	}
	public double getMIN_PR_DAY() {
		return MIN_PR_DAY;
	}
	public void setMIN_PR_DAY(double mIN_PR_DAY) {
		MIN_PR_DAY = mIN_PR_DAY;
	}
	public double getMAX_PR_DAY() {
		return MAX_PR_DAY;
	}
	public void setMAX_PR_DAY(double mAX_PR_DAY) {
		MAX_PR_DAY = mAX_PR_DAY;
	}
	public String getFIXED_COST_UNIT_ID() {
		return FIXED_COST_UNIT_ID;
	}
	public void setFIXED_COST_UNIT_ID(String fIXED_COST_UNIT_ID) {
		FIXED_COST_UNIT_ID = fIXED_COST_UNIT_ID;
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
	public String getCOMMENT() {
		return COMMENT;
	}
	public void setCOMMENT(String cOMMENT) {
		COMMENT = cOMMENT;
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
	public String getAVG_CALC_MOB_CODE() {
		return AVG_CALC_MOB_CODE;
	}
	public void setAVG_CALC_MOB_CODE(String aVG_CALC_MOB_CODE) {
		AVG_CALC_MOB_CODE = aVG_CALC_MOB_CODE;
	}
	public String getAVG_CALC_GRP_CODE() {
		return AVG_CALC_GRP_CODE;
	}
	public void setAVG_CALC_GRP_CODE(String aVG_CALC_GRP_CODE) {
		AVG_CALC_GRP_CODE = aVG_CALC_GRP_CODE;
	}
	public double getMAX_PR_WEEK() {
		return MAX_PR_WEEK;
	}
	public void setMAX_PR_WEEK(double mAX_PR_WEEK) {
		MAX_PR_WEEK = mAX_PR_WEEK;
	}
	public String getSPECIAL_ACCESS_ID() {
		return SPECIAL_ACCESS_ID;
	}
	public void setSPECIAL_ACCESS_ID(String sPECIAL_ACCESS_ID) {
		SPECIAL_ACCESS_ID = sPECIAL_ACCESS_ID;
	}
	public char getALLOW_WAGE_TYPE_MAPPING_SW() {
		return ALLOW_WAGE_TYPE_MAPPING_SW;
	}
	public void setALLOW_WAGE_TYPE_MAPPING_SW(char aLLOW_WAGE_TYPE_MAPPING_SW) {
		ALLOW_WAGE_TYPE_MAPPING_SW = aLLOW_WAGE_TYPE_MAPPING_SW;
	}
	public String getREPORT_DESCRIPTION() {
		return REPORT_DESCRIPTION;
	}
	public void setREPORT_DESCRIPTION(String rEPORT_DESCRIPTION) {
		REPORT_DESCRIPTION = rEPORT_DESCRIPTION;
	}
	public char getOVERTIME_SW() {
		return OVERTIME_SW;
	}
	public void setOVERTIME_SW(char oVERTIME_SW) {
		OVERTIME_SW = oVERTIME_SW;
	}

	
	
	
	
	
}

CREATE TABLE MAS120_EMPLOYEE_TAB(
	CLIENT_ID varchar(10) NOT NULL,
	COMPANY_ID varchar(10) NOT NULL,
	EMPLOYEE_ID varchar(10) NOT NULL,
	FIRSTNAME varchar(50) NOT NULL,
	SURNAME varchar(50) NOT NULL,
	EMPLOYEE_TYPE_CODE varchar(10),--tok vekk NULL, også fra resten. feilet på dette
	INITIALS varchar(10) ,
	GENDER varchar(10) ,
	DATE_OF_BIRTH timestamp ,
	NATIONAL_IDENTITY_NO varchar(20) ,
	NATIONALITY varchar(10) ,
	PRE_GENERATE_HOURS_SW char(2) for bit data NOT NULL,
	REQ_HOURS_REG_SW char(2) for bit data NOT NULL,
	EMAIL_REMINDER_SW char(2) for bit data NOT NULL,
	EMAIL_WORK varchar(50) ,
	EMAIL_PRIVATE varchar(50) ,
	ELECTRONIC_PAYCHECK_CODE varchar(10) ,
	PHONE_NO_WORK varchar(20) ,
	PHONE_NO_PRIVATE varchar(20) ,
	PHONE_NO_MOBILE varchar(20) ,
	SUPERIOR_ID varchar(10) ,
	MATERIAL_STATUS_CODE varchar(10) ,
	NATIVE_COMPANY_SW char(2) for bit data NOT NULL,
	TRANSF_EMPL_PAYROLL_SW char(2) for bit data NOT NULL,
	COMPANY_CAR_SW char(2) for bit data NOT NULL,
	BANK_ACCOUNT_NO varchar(50) ,
	CREATED_BY_USER varchar(10),
	CREATED_BY_PROGRAM varchar(10) ,
	CREATED_DATE timestamp ,
	ALTERED_BY_USER varchar(10) ,
	ALTERED_BY_PROGRAM varchar(10) ,
	ALTERED_DATE timestamp ,
	REVISION_NO smallint NOT NULL,
	ABSENCE_MESSAGE_RECIPIENT_SW char(2) for bit data NOT NULL,
	PROJECT_RESPONSIBLE_SW char(2) for bit data NOT NULL,
	LAST_SETTLEMENT_DATE timestamp ,
 CONSTRAINT PK_MAS120_EMPLOYEE_TAB PRIMARY KEY --CLUSTERED feiler på clustered..
(
	CLIENT_ID , --tok vekk asc, feiler på dette
	COMPANY_ID ,
	EMPLOYEE_ID 
)
)--la til denne grunnet EOF feil

--succeeded!!!!
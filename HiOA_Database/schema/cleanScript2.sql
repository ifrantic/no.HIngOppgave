
--TODO sjekk/endre datatyper, 
--ta vekk "alter table" og 
--sett heller inn defaults i tabellene hvis mulig
--endret datetime til timestamp
--tatt vekk alle klammer ved create table
--endret default() til default ''
--fjernet NULL, men NOT NULL kan stå
--fjernet CLUSTERED
--default feiler hele tiden. Må endre verdiene til hexadecimal for char, eksemeplvis X'00'
--Får ikke satt default på timestamp
--må sette default ved opprettelse av tabeller, feiler ved ALTER TABLE

--RECORD_ID int IDENTITY(1,1) NOT NULL,
--MÅTTE GJØRE OM TIL: RECORD_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),


CREATE TABLE MAS010_CODE_VALUES_TAB(	
CLIENT_ID varchar(10) NOT NULL,	
COMPANY_ID varchar(10) NOT NULL,	
CODE_ID varchar(20) NOT NULL,	
CODE_VALUE varchar(10) NOT NULL,	
ACTIVE_SW char(2) for bit data NOT NULL DEFAULT X'00',	
SHORT_DESCRIPTION varchar(10) ,	
DESCRIPTION varchar(40) ,	
SHORT_DESCRIPTION_RESOURCE_ID varchar(50) ,	
DESCRIPTION_RESOURCE_ID varchar(50) ,	
SORT_ORDER smallint ,	
CREATED_BY_USER varchar(10) ,	
CREATED_BY_PROGRAM varchar(10) ,	
CREATED_DATE timestamp,	
ALTERED_BY_USER varchar(10) ,	
ALTERED_BY_PROGRAM varchar(10) ,	
ALTERED_DATE timestamp ,	
REVISION_NO smallint  DEFAULT 0, 
CONSTRAINT PK_MAS000_CODE_VALUES_TAB PRIMARY KEY  (	
CLIENT_ID,	
COMPANY_ID,	
CODE_ID,	
CODE_VALUE)
) 
GO
--succeeded
/****** Object:  
 * Table dbo.MAS120_EMPLOYEE_TAB    
 * Script Date: 26.02.2013 10:14:16 *****		MAS120 ANSATTDATA TABELL:******/
CREATE TABLE MAS120_EMPLOYEE_TAB(	
CLIENT_ID varchar(10) NOT NULL,	
COMPANY_ID varchar(10) NOT NULL,	
EMPLOYEE_ID varchar(10) NOT NULL,	
FIRSTNAME varchar(50) NOT NULL,	
SURNAME varchar(50) NOT NULL,	
EMPLOYEE_TYPE_CODE varchar(10) ,	
INITIALS varchar(10) ,	
GENDER varchar(10) ,	
DATE_OF_BIRTH timestamp ,	
NATIONAL_IDENTITY_NO varchar(20),	
NATIONALITY varchar(10) ,	
PRE_GENERATE_HOURS_SW char(2) for bit data NOT NULL DEFAULT X'00',	
REQ_HOURS_REG_SW char(2) for bit data NOT NULL DEFAULT X'00',	
EMAIL_REMINDER_SW char(2) for bit data NOT NULL DEFAULT X'00',	
EMAIL_WORK varchar(50) ,	
EMAIL_PRIVATE varchar(50) ,	
ELECTRONIC_PAYCHECK_CODE varchar(10) ,	
PHONE_NO_WORK varchar(20) ,	
PHONE_NO_PRIVATE varchar(20) ,	
PHONE_NO_MOBILE varchar(20) ,	
SUPERIOR_ID varchar(10) ,	
MATERIAL_STATUS_CODE varchar(10) ,	
NATIVE_COMPANY_SW char(2) for bit data NOT NULL DEFAULT X'00',	
TRANSF_EMPL_PAYROLL_SW char(2) for bit data NOT NULL DEFAULT X'00',	
COMPANY_CAR_SW char(2) for bit data NOT NULL DEFAULT X'00',	
BANK_ACCOUNT_NO varchar(50) ,	
CREATED_BY_USER varchar(10) ,	
CREATED_BY_PROGRAM varchar(10) ,	
CREATED_DATE timestamp ,	
ALTERED_BY_USER varchar(10) ,	
ALTERED_BY_PROGRAM varchar(10) ,	
ALTERED_DATE timestamp ,	
REVISION_NO smallint NOT NULL DEFAULT 0,	
ABSENCE_MESSAGE_RECIPIENT_SW char(2) for bit data NOT NULL DEFAULT X'00',	
PROJECT_RESPONSIBLE_SW char(2) for bit data NOT NULL DEFAULT X'00',	
LAST_SETTLEMENT_DATE timestamp , 

CONSTRAINT PK_MAS120_EMPLOYEE_TAB PRIMARY KEY  (	
CLIENT_ID,	
COMPANY_ID,	
EMPLOYEE_ID)
) 
--already exists

GO
/****** Object:  Table dbo.MAS121_EMPLOYEE_PERIODIC_TAB    
 * Script Date: 26.02.2013 10:15:33 	
 * 	MAS121 VARIABLE ANSATTDATA TABELL:******/
--Alt fikset hit


CREATE TABLE MAS121_EMPLOYEE_PERIODIC_TAB(	
CLIENT_ID varchar(10) NOT NULL,	
COMPANY_ID varchar(10) NOT NULL,	
EMPLOYEE_ID varchar(10) NOT NULL,	
SERIAL_NO int NOT NULL,	
VALID_FROM_DATE timestamp NOT NULL,	
VALID_TO_DATE timestamp ,	
ADDRESS_LINE1 varchar(50) ,	
ADDRESS_LINE2 varchar(50) ,	
ZIP_CODE varchar(10) ,	
COUNTRY_CODE varchar(10) ,	
ADDRESS_ABROAD varchar(50) ,	
PART_TIME_PERCENTAGE decimal(5, 2) DEFAULT 0 ,	
DISCIPLINE_CODE varchar(10) NOT NULL,	
LOCATION_CODE varchar(10) NOT NULL,	
EMPLOYEE_STATUS_CODE varchar(10) NOT NULL,	
TERMINATED_REASON varchar(50) ,	
EMPLOYEE_CAT_CODE varchar(10) NOT NULL,	
SALARY_CAT_CODE varchar(10) NOT NULL,	
SALARY_TYPE_CODE varchar(10) NOT NULL,	
PAYROLL_GROUP_CODE varchar(10) NOT NULL,	
REGULAR_PROMAIN_ID varchar(10) ,	
REGULAR_PROSUB_ID varchar(10) ,	
TRADE_CODE varchar(10) NOT NULL,	
EMPLOYMENT_CODE varchar(10) ,	
POSITION_TYPE_CODE varchar(10) NOT NULL,	
OVERTIME_ENTITLED_SW char(2) for bit data NOT NULL DEFAULT X'00',	
ORGANISATION_UNIT_ID varchar(10) NOT NULL,	
SUPPLIER_ID varchar(10) ,	
INVOICE_PRICE_GRP_CODE varchar(50) NOT NULL,	
CREATED_BY_USER varchar(10) ,	
CREATED_BY_PROGRAM varchar(10) ,	
CREATED_DATE timestamp NOT NULL ,	
ALTERED_BY_USER varchar(10) ,	
ALTERED_BY_PROGRAM varchar(10) ,	
ALTERED_DATE timestamp NOT NULL,	
REVISION_NO smallint NOT NULL DEFAULT 0,	
LABOR_UNION_CODE varchar(10) ,	
TERMINATED_REASON_CODE varchar(10) ,	
SALARY_SCHEME varchar(10) , 

CONSTRAINT PK_MAS121_EMPLOYEE_PERIODIC_TAB PRIMARY KEY  (	
CLIENT_ID,	
COMPANY_ID,	
EMPLOYEE_ID,	
SERIAL_NO)
) 


GO
/****** Object:  
 * Table dbo.MAS240_COST_UNIT_TAB    
 * Script Date: 26.02.2013 10:16:26 	
 * 	MAS240 KOSTNADSBÆRER TABELL******/
--SUCCEEDED UNTIL HERE :-)


CREATE TABLE MAS240_COST_UNIT_TAB(	
CLIENT_ID varchar(10) NOT NULL,	
COMPANY_ID varchar(10) NOT NULL,	
COST_UNIT_ID varchar(15) NOT NULL,	
PROMAIN_ID varchar(10) NOT NULL,	
PROSUB_ID varchar(10) NOT NULL,	
ACTIVITY_CODE varchar(20) ,	
JOB_CODE varchar(10) ,	
DESCRIPTION varchar(100) ,	
VALID_FROM_DATE timestamp ,	
VALID_TO_DATE timestamp ,	
LOCATION_CODE varchar(10) ,	
CUSTOMER_COST_UNIT varchar(50) ,	
EXTERNAL_REFERENCE varchar(20) ,	
CREATED_BY_USER varchar(10) ,	
CREATED_BY_PROGRAM varchar(10) ,	
CREATED_DATE timestamp ,	
ALTERED_BY_USER varchar(10) ,	
ALTERED_BY_PROGRAM varchar(10) ,	
ALTERED_DATE timestamp ,	
REVISION_NO smallint ,	
EXTERNAL_KEY1 varchar(20) ,	
EXTERNAL_KEY2 varchar(20) , 

CONSTRAINT aaaaaMAS000_COST_UNIT_TAB_PK PRIMARY KEY (	
COST_UNIT_ID,	
COMPANY_ID,	
CLIENT_ID)
) 
--SUCCEEDED UNTIL HERE
GO
/****** Object:  Table dbo.HRS200_ROTATION_PLAN_TAB    
 * Script Date: 26.02.2013 10:17:34 	
 *	HRS200 ROTASJON TABELL:******/

CREATE TABLE HRS200_ROTATION_PLAN_TAB(	
CLIENT_ID varchar(10) NOT NULL,	
COMPANY_ID varchar(10) NOT NULL,	
EMPLOYEE_ID varchar(10) NOT NULL,	
ROTATION_ID varchar(10) NOT NULL,	
PROMAIN_ID varchar(10) NOT NULL,	
VALID_FROM_DATE timestamp NOT NULL,	
VALID_TO_DATE timestamp ,	
LOCATION_CODE varchar(10) ,	
USE_REGULAR_PROJECT_SW char(2) for bit data NOT NULL DEFAULT X'00',	
PROJECT_ROLE_CODE varchar(10) ,	
CREATED_BY_USER varchar(10) ,	
CREATED_BY_PROGRAM varchar(10) ,	
CREATED_DATE timestamp ,	
ALTERED_BY_USER varchar(10) ,	
ALTERED_BY_PROGRAM varchar(10) ,	
ALTERED_DATE timestamp ,	
REVISION_NO smallint DEFAULT 0, 

CONSTRAINT aaaaaHRS000_ROTATION_PLAN_TAB_PK PRIMARY KEY(	
CLIENT_ID,	
COMPANY_ID,	
EMPLOYEE_ID,	
ROTATION_ID,	
VALID_FROM_DATE,	
PROMAIN_ID)
) 

GO

--SUCCEEDED UNTIL HERE
/****** Object:  
 * Table dbo.HRS100_HOURS_TYPE_TAB    
 * Script Date: 26.02.2013 10:18:31 	
 * 	HRS100 TIMETYPE TABELL******/

CREATE TABLE HRS100_HOURS_TYPE_TAB(	
CLIENT_ID varchar(10) NOT NULL,	
COMPANY_ID varchar(10) NOT NULL,	
HOURS_TYPE_CODE varchar(10) NOT NULL,	
HOURS_TYPE_GRP_CODE varchar(10) ,	
DESCRIPTION varchar(50) ,	
HOURS_MAIN_CAT_CODE varchar(10) NOT NULL,	
HOURS_SUB_CAT_CODE varchar(10) NOT NULL,	
PUBLIC_HOLIDAY_SW char(2) for bit data NOT NULL,	
COMPENSATED_IN_ROTATION_SW char(2) for bit data NOT NULL,	
ALLOW_LONG_TERM_ABSENCE_SW char(2) for bit data NOT NULL,	
AVAILABLE_FOR_REG_SW char(2) for bit data ,	
ALLOW_STATUS_LEAVE_SW char(2) for bit data ,	
INVOICE_UTILIZATION_CALC_SW char(2) for bit data NOT NULL DEFAULT X'00',	
NORMAL_HOURS_SW char(2) for bit data NOT NULL DEFAULT X'00',	
SICK_LEAVE_SW char(2) for bit data NOT NULL DEFAULT X'00',	
OVERTIME_CALC_SW char(2) for bit data NOT NULL DEFAULT X'00',	
MIN_PR_DAY decimal(5, 2) ,	
MAX_PR_DAY decimal(5, 2) ,	
FIXED_COST_UNIT_ID varchar(15) ,	
VALID_FROM_DATE timestamp ,	
VALID_TO_DATE timestamp ,	
COMMENT varchar(200) ,	
CREATED_BY_USER varchar(10) ,	
CREATED_BY_PROGRAM varchar(10) ,	
CREATED_DATE timestamp ,	
ALTERED_BY_USER varchar(10) ,	
ALTERED_BY_PROGRAM varchar(10) ,	
ALTERED_DATE timestamp ,	
REVISION_NO smallint DEFAULT 0 ,	
AVG_CALC_MOB_CODE varchar(10) NOT NULL DEFAULT 'NONE',	
AVG_CALC_GRP_CODE varchar(10) NOT NULL DEFAULT 'NONE',	
MAX_PR_WEEK decimal(5, 2) ,	
SPECIAL_ACCESS_ID varchar(50) ,	
ALLOW_WAGE_TYPE_MAPPING_SW char(2) for bit data NOT NULL DEFAULT X'00',	
REPORT_DESCRIPTION varchar(200) ,	
OVERTIME_SW char(2) for bit data NOT NULL DEFAULT X'00', 

CONSTRAINT PK_HRS100_HOURS_TYPE_TAB PRIMARY KEY  (	
CLIENT_ID,	
COMPANY_ID,	
HOURS_TYPE_CODE)
) 


GO
--SUCCEEDED UNTIL HERE

/****** Object:  
 * Table dbo.HRS500_HOURS_TAB    
 * Script Date: 26.02.2013 10:24:30 		
 * HRS500 TIME TABELL:******/
--RECORD_ID int IDENTITY(1,1) NOT NULL,
--MÅTTE GJØRE OM TIL: RECORD_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),		
CREATE TABLE HRS500_HOURS_TAB(	
CLIENT_ID varchar(10) NOT NULL,	
COMPANY_ID varchar(10) NOT NULL,	
RECORD_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),	
EMPLOYEE_ID varchar(10) NOT NULL,	
PROMAIN_ID varchar(10) ,	
PROSUB_ID varchar(10) ,	
ACTIVITY_CODE varchar(20) ,	
JOB_CODE varchar(10) ,	
COST_UNIT_ID varchar(15) ,	
HOURS_TYPE_CODE varchar(10) NOT NULL,	
HOURS_MAIN_CAT_CODE varchar(10) NOT NULL,	
HOURS_SUB_CAT_CODE varchar(10) NOT NULL,	
LOCATION_CODE varchar(10) ,	
SHIFT_CODE varchar(10) ,	
ROTATION_ID varchar(10) ,	
ACCOUNTING_PERIOD_ID varchar(10) ,	
WORK_MONTH varchar(7) NOT NULL,	
WORK_DATE timestamp NOT NULL,	
WORK_WEEK varchar(6) NOT NULL,	
RECORD_TYPE_CODE varchar(10) NOT NULL DEFAULT 'ORDINARY',	
CORR_REF_RECORD_ID int ,	
CORRECTED_SW char(2) for bit data NOT NULL,	
ROT_REF_RECORD_ID int ,	
SUBL_REF_RECORD_ID int ,	
IMP_REF_RECORD_ID int ,	
PAYMENT_CERTIFICATE_ID int ,	
HOURS decimal(7, 5) NOT NULL DEFAULT 0,	
HOURS_RATE decimal(7, 2) ,	
STATUS_CODE varchar(10) NOT NULL,	
ATT_BY_USER_ID varchar(10) ,	
ATT_DATE timestamp ,	
SIGNED_DATE timestamp ,	
SIGNED_BY_USER_ID varchar(10) ,	
SENT_TO_USER_ID varchar(10) ,	
TRANSF_PAYROLL_ID varchar(10) ,	
TRANSF_FINANCE_ID varchar(10) ,	
REPRICE_FINANCE_SW char(2) for bit data ,	
REPRICE_PAYROLL_SW char(2) for bit data ,	
CREATED_BY_USER varchar(10) ,	
CREATED_BY_PROGRAM varchar(10) ,	
CREATED_DATE timestamp ,	
ALTERED_BY_USER varchar(10) ,	
ALTERED_BY_PROGRAM varchar(10) ,	
ALTERED_DATE timestamp ,	
REVISION_NO smallint  DEFAULT 0,	
INVOICE_VOUCHER_ID int ,	
TRANSF_INDIRECT_COST_ID varchar(10) ,	
PROJECT_ROLE_CODE varchar(10) ,	
EXTRA_DIM1_CODE varchar(10) ,	
EXTRA_DIM2_CODE varchar(10) , 

CONSTRAINT PK_HRS500_HOURS_TAB PRIMARY KEY  (	
RECORD_ID)
) 
--SUCCEEDED AT ALL !!!!!!!!!

Create table CONNECTION_MAS120_EMPLOYEE_TAB_TO_STANDALONE_APPLICATION_USER_TAB (
--lager egen CONNECTION tabell mellom MAS120_EMPLOYEE_TAB og STANDALONE_APPLICATION_USER_TAB
--Dette kun for å bedre oversikt ved skrive til/fra tabeller, uten å redigere tabeller fra apto
--Denne tabellen oppfyller ikke krav for 2. og 3. normalform, men opprettes for at vi ikke skal 
--endre tabellene fra apto
CLIENT_ID varchar(10) NOT NULL,	
COMPANY_ID varchar(10) NOT NULL,	
EMPLOYEE_ID varchar(10) NOT NULL,
USER_ID int NOT NULL,


CONSTRAINT PK_CONNECTION_MAS120_EMPLOYEE_TAB_TO_STANDALONE_APPLICATION_USER_TAB PRIMARY KEY  (	
CLIENT_ID,	
COMPANY_ID,	
EMPLOYEE_ID)
) --succeeded

--oppretter tabell for login info for lokal bruker, her i standalone applikasjonen.
Create table STANDALONE_APPLICATION_USER_TAB (
USER_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
STANDALONE_USER_CREATED_DATE timestamp,
LAST_SYNC_WITH_APTO_DATE timestamp ,
LAST_LOGIN_STANDALONE_DATE timestamp,
LAST_ATTEMPT_SEND_TO_APTO_DATE timestamp,
LAST_SUCCEED_SEND_TO_APTO_DATE timestamp,
LOGIN_USERNAME varchar(50),
PASSWORD_HASH varchar(100),


CONSTRAINT PK_STANDALONE_APPLICATION_USER_TAB PRIMARY KEY  (	
USER_ID)
) --succeeded






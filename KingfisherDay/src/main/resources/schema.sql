create table QUESTION(
	QUESTION_ID VARCHAR2(2),
	QUESTION_TEXT VARCHAR2(200),
	OPTION_A VARCHAR2(50),
	OPTION_B VARCHAR2(50),
	OPTION_C VARCHAR2(50),
	OPTION_D VARCHAR2(50),
	OPTION_CORRECT VARCHAR2(1),
	CURRENT BOOLEAN	
);

create table FLAG(
	KEY VARCHAR2(100),
	VALUE BOOLEAN
);

create table EMPLOYEE(
	first_name VARCHAR2(100),
	last_name VARCHAR2(100),
	email_id VARCHAR2(100),
	food_preference INTEGER,
	photo_file VARCHAR2(100),
	password VARCHAR2(100)
);
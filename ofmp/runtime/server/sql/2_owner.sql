DROP USER VT_OWNER CASCADE;
	
CREATE USER VT_OWNER
IDENTIFIED BY VT_OWNER
DEFAULT TABLESPACE OFMP_DATA
TEMPORARY TABLESPACE TEMP
PROFILE DEFAULT
ACCOUNT UNLOCK;
	  
GRANT SELECT ANY TABLE TO VT_OWNER;
GRANT INSERT ANY TABLE TO VT_OWNER;
GRANT UPDATE ANY TABLE TO VT_OWNER;
GRANT DELETE ANY TABLE TO VT_OWNER;
	
GRANT CONNECT TO VT_OWNER;
GRANT DBA TO VT_OWNER;
/

exit
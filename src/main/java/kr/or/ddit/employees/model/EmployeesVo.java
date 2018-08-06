package kr.or.ddit.employees.model;

import java.util.Date;

public class EmployeesVo {
	String EMP_NAME      ;
	String EMAIL         ;
	String PHONE_NUMBER  ;
	String JOB_ID        ;
	int SALARY           ;
	int EMPLOYEE_ID      ;
	int MANAGER_ID       ;
	int DEPARTMENT_ID    ;
	int COMMISSION_PCT   ;
	Date RETIRE_DATE     ;
	Date CREATE_DATE     ;
	Date HIRE_DATE       ;
	Date UPDATE_DATE     ;
	
	
	String getEMP_NAME() {
		return EMP_NAME;
	}
	void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}
	String getEMAIL() {
		return EMAIL;
	}
	void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}
	String getJOB_ID() {
		return JOB_ID;
	}
	void setJOB_ID(String jOB_ID) {
		JOB_ID = jOB_ID;
	}
	int getSALARY() {
		return SALARY;
	}
	void setSALARY(int sALARY) {
		SALARY = sALARY;
	}
	int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	int getMANAGER_ID() {
		return MANAGER_ID;
	}
	void setMANAGER_ID(int mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}
	int getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}
	void setDEPARTMENT_ID(int dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	int getCOMMISSION_PCT() {
		return COMMISSION_PCT;
	}
	void setCOMMISSION_PCT(int cOMMISSION_PCT) {
		COMMISSION_PCT = cOMMISSION_PCT;
	}
	Date getRETIRE_DATE() {
		return RETIRE_DATE;
	}
	void setRETIRE_DATE(Date rETIRE_DATE) {
		RETIRE_DATE = rETIRE_DATE;
	}
	Date getCREATE_DATE() {
		return CREATE_DATE;
	}
	void setCREATE_DATE(Date cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	Date getHIRE_DATE() {
		return HIRE_DATE;
	}
	void setHIRE_DATE(Date hIRE_DATE) {
		HIRE_DATE = hIRE_DATE;
	}
	Date getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	void setUPDATE_DATE(Date uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	
	@Override
	public String toString() {
		return "EmployeesVo [EMP_NAME=" + EMP_NAME + ", EMAIL=" + EMAIL
				+ ", PHONE_NUMBER=" + PHONE_NUMBER + ", JOB_ID=" + JOB_ID
				+ ", SALARY=" + SALARY + ", EMPLOYEE_ID=" + EMPLOYEE_ID
				+ ", MANAGER_ID=" + MANAGER_ID + ", DEPARTMENT_ID="
				+ DEPARTMENT_ID + ", COMMISSION_PCT=" + COMMISSION_PCT
				+ ", RETIRE_DATE=" + RETIRE_DATE + ", CREATE_DATE="
				+ CREATE_DATE + ", HIRE_DATE=" + HIRE_DATE + ", UPDATE_DATE="
				+ UPDATE_DATE + "]";
	}
	
	
	
	
}

package com.wu.model;

public class S_C {
	
	private String Sno;
	private String Cno;
	private String Cname;
	private int Grade;
	private int GeneralGrade;
	private int TerminalGrade;
	
	
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	
	public String getCno() {
		return Cno;
	}
	public void setCno(String cno) {
		Cno = cno;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public int getGeneralGrade() {
		return GeneralGrade;
	}
	public void setGeneralGrade(int generalGrade) {
		GeneralGrade = generalGrade;
	}
	public int getTerminalGrade() {
		return TerminalGrade;
	}
	public void setTerminalGrade(int terminalGrade) {
		TerminalGrade = terminalGrade;
	}
	public S_C(String sno, String cno, String cname, int grade, int generalGrade, int terminalGrade) {
		Sno = sno;
		Cno = cno;
		Cname = cname;
		Grade = grade;
		GeneralGrade = generalGrade;
		TerminalGrade = terminalGrade;
	}
	public S_C() {
	}
	
	

}

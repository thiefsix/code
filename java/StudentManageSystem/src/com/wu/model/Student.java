package com.wu.model;

import java.sql.Date;

public class Student {
	
	private String Sno;
	private String Sname;
	private String Ssex;
	private Date Sbirthday; 
	private Date Senttime;
	private String Mno;
	private String Deptno;
	private String Spassword;
	private String Deptname;
	private String Mname;
	
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSsex() {
		return Ssex;
	}
	public void setSsex(String ssex) {
		Ssex = ssex;
	}
	public Date getSbirthday() {
		return Sbirthday;
	}
	public void setSbirthday(Date sbirthday) {
		Sbirthday = sbirthday;
	}
	public Date getSenttime() {
		return Senttime;
	}
	public void setSenttime(Date senttime) {
		Senttime = senttime;
	}
	public String getMno() {
		return Mno;
	}
	public void setMno(String mno) {
		Mno = mno;
	}
	public String getDeptno() {
		return Deptno;
	}
	public void setDeptno(String deptno) {
		Deptno = deptno;
	}
	public String getSpassword() {
		return Spassword;
	}
	public void setSpassword(String spassword) {
		Spassword = spassword;
	}
	public String getDeptname() {
		return Deptname;
	}
	public void setDeptname(String deptname) {
		Deptname = deptname;
	}
	
	/**
	 * 
	 * 构造方法
	 */
	public Student(){}
	public Student(String sno, String sname, String ssex, Date sbirthday, Date senttime, String mno, String deptno,
			String spassword, String deptname, String mname) {
	
		Sno = sno;
		Sname = sname;
		Ssex = ssex;
		Sbirthday = sbirthday;
		Senttime = senttime;
		Mno = mno;
		Deptno = deptno;
		Spassword = spassword;
		Deptname = deptname;
		Mname = mname;
		
	}
	
	
	
}

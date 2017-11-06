package com.wu.model;

public class Major {
	
	private String Mno;
	private String Mname;
	private String Deptno;
	private String Deptname;
	
	
	public String getMno() {
		return Mno;
	}
	public void setMno(String mno) {
		Mno = mno;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getDeptno() {
		return Deptno;
	}
	public void setDeptno(String deptno) {
		Deptno = deptno;
	}
	public String getDeptname() {
		return Deptname;
	}
	public void setDeptname(String deptname) {
		Deptname = deptname;
	}
	
	/**
	 * 构造方法
	 * @param mno
	 * @param mname
	 * @param deptno
	 * @param deptname
	 */
	public Major(String mno, String mname, String deptno, String deptname) {
		super();
		Mno = mno;
		Mname = mname;
		Deptno = deptno;
		Deptname = deptname;
	}
	
	public Major(){}

}

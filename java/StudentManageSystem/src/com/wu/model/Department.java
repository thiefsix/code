package com.wu.model;

public class Department {
	
	private String Deptno;
	private String Deptname;
	
	
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
	
	public Department(String deptno, String deptname){
		this.Deptno = deptno;
		this.Deptname = deptname;
	}
	
	public Department(){}

}

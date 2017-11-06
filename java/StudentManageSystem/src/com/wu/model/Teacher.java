package com.wu.model;

public class Teacher {
	
	private String Tno;
	private String Tname;
	private String Tsex;
	private String Tpassword;
	private String Deptname;
	private String Titleno;
	private String Titlename;
	
	
	public String getTno() {
		return Tno;
	}
	public void setTno(String tno) {
		Tno = tno;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTsex() {
		return Tsex;
	}
	public void setTsex(String tsex) {
		Tsex = tsex;
	}
	public String getTpassword() {
		return Tpassword;
	}
	public void setTpassword(String tpassword) {
		Tpassword = tpassword;
	}
	public String getDeptname() {
		return Deptname;
	}
	public void setDeptname(String deptname) {
		Deptname = deptname;
	}
	public String getTitleno() {
		return Titleno;
	}
	public void setTitleno(String titleno) {
		Titleno = titleno;
	}
	public String getTitlename() {
		return Titlename;
	}
	public void setTitlename(String titlename) {
		Titlename = titlename;
	}
	/**
	 * 构造方法
	 * @param tno
	 * @param tname
	 * @param tsex
	 * @param tpassword
	 * @param deptname
	 * @param titleno
	 * @param titlename
	 */
	public Teacher(String tno, String tname, String tsex, String tpassword, String deptname, String titleno,
			String titlename) {
		super();
		Tno = tno;
		Tname = tname;
		Tsex = tsex;
		Tpassword = tpassword;
		Deptname = deptname;
		Titleno = titleno;
		Titlename = titlename;
	}
	public Teacher(){}

}

package com.wu.model;

public class T_C {
	private String Tno;
	private String Cno;
	private String Tname;
	private String Cname;
	private String TCplace;
	private String TCtime;
	
	
	public String getTno() {
		return Tno;
	}
	public void setTno(String tno) {
		Tno = tno;
	}
	public String getCno() {
		return Cno;
	}
	public void setCno(String cno) {
		Cno = cno;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getTCplace() {
		return TCplace;
	}
	public void setTCplace(String tCplace) {
		TCplace = tCplace;
	}
	public String getTCtime() {
		return TCtime;
	}
	public void setTCtime(String tCtime) {
		TCtime = tCtime;
	}
	
	/**
	 * 构造方法
	 * @param tno
	 * @param cno
	 * @param tname
	 * @param cname
	 * @param tCplace
	 * @param tCtime
	 */
	public T_C(String tno, String cno, String tname, String cname, String tCplace, String tCtime) {
		Tno = tno;
		Cno = cno;
		Tname = tname;
		Cname = cname;
		TCplace = tCplace;
		TCtime = tCtime;
	}
	
	
	public T_C() {	}
	
}

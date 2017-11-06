package com.wu.model;

public class Title {
	
	private String titleno;  
	private String titlename;
	private int titleorder;
	public int getTitleorder() {
		return titleorder;
	}
	public void setTitleorder(int titleorder) {
		this.titleorder = titleorder;
	}
	public String getTitleno() {
		return titleno;
	}
	public void setTitleno(String titleno) {
		this.titleno = titleno;
	}
	public String getTitlename() {
		return titlename;
	}
	public void setTitlename(String titlename) {
		this.titlename = titlename;
	}
	public Title(String titleno, String titlename, int titleorder) {
		
		this.titleorder = titleorder;
		this.titleno = titleno;
		this.titlename = titlename;
	}
	public Title() {
		
	}
	

}

package com.wu.model;

public class Admin {
	/*
	 * 管理员实体类
	 * 
	 */
	private String Ano;
	private String Aname;
	private String Apassword;
	
	
	
	public String getAno() {
		return Ano;
	}
	
	public void setAno(String ano) {
		Ano = ano;
	}
	
	public String getAname() {
		return Aname;
	}
	
	public void setAname(String aname) {
		Aname = aname;
	}
	
	public String getApassword() {
		return Apassword;
	}
	
	public void setApassword(String apassword) {
		Apassword = apassword;
	}
	
	public Admin(String Ano, String Aname, String Apassword){
		this.Ano = Ano;
		this.Aname = Aname;
		this.Apassword = Apassword;
		
	}
	
	public Admin(){}
	
}

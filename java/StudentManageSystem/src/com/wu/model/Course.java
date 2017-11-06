package com.wu.model;

public class Course {
	
	/**
	 * 课程实体类
	 * 	
	 */
	private String Cno;             //课程编号
	private String Cname;			//课程名
	private int Ctime;				//课时
	private float Ccredit;			//学分
	private String Curl;			//课程图片地址
	private String Deptno;			//课程所属学院id
	private String Cdescription;	//课程描述
	private String Deptname;		//所属学院名称
	
	
	
	public String getDeptname() {
		return Deptname;
	}
	public void setDeptname(String deptname) {
		Deptname = deptname;
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
	public int getCtime() {
		return Ctime;
	}
	public void setCtime(int ctime) {
		Ctime = ctime;
	}
	public float getCcredit() {
		return Ccredit;
	}
	public void setCcredit(float ccredit) {
		Ccredit = ccredit;
	}
	public String getCurl() {
		return Curl;
	}
	public void setCurl(String curl) {
		Curl = curl;
	}
	public String getDeptno() {
		return Deptno;
	}
	public void setDeptno(String deptno) {
		Deptno = deptno;
	}
	public String getCdescription() {
		return Cdescription;
	}
	public void setCdescription(String cdescription) {
		Cdescription = cdescription;
	}
	
	public Course(String Cno,String Cname,int Ctime,float Ccredit,String Curl,String Deptno,String Deptname,String Cdescription){
		this.Cno = Cno;
		this.Cname = Cname;
		this.Ctime = Ctime;
		this.Ccredit = Ccredit;
		this.Curl = Curl;
		this.Deptno = Deptno;
		this.Deptname = Deptname;
		this.Cdescription= Cdescription;
	}
	
	public Course(){}
}

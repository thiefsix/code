package com.wu.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.wu.dao.TeacherDao;
import com.wu.model.Teacher;
import com.wu.util.Dbconn;

public class TeacherDaoImpl implements TeacherDao {
	
	Connection conn = Dbconn.getConn();

	@Override
	public boolean addTeacher(Teacher tea) {
		boolean flag = false;
		String sql = "insert into teacher(Tno,Tname,Deptname,Tsex,Tpassword,Titleno,Titlename) values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, tea.getTno());
			psmt.setString(2, tea.getTname());
			psmt.setString(3, tea.getDeptname());
			psmt.setString(4, tea.getTsex());
			psmt.setString(5, com.wu.util.Base64.Encode(tea.getTpassword()));
			psmt.setString(6, tea.getTitleno());
			psmt.setString(7, tea.getTitlename());
			int i = psmt.executeUpdate();
			if(i==1){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean deleteTeacher(String tno) {
		boolean flag = false;
		String sql = "delete from teacher where Tno=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, tno);
			if (psmt.executeUpdate() > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public boolean updateTeacher(String name, String deptname, String sex, String titleno, String titlename, String tno) {
		boolean flag = false;
		String sql = "update teacher set Tname='"+name+"',Deptname='"+deptname+"',Tsex='"+sex+"',Titleno='"+titleno+"',Titlename='"+titlename+"' where Tno="+tno+"";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			int i = psmt.executeUpdate(sql);
			if(i==1){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<Teacher> queryTeacherByName(String sname) {
		List<Teacher> teaList = new ArrayList<>();
		String sql = "select * from teacher where Tname=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, sname);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Tno = rs.getString("Tno");
				String Tname = rs.getString("Tnmae");
				String Deptname = rs.getString("Deptname");
				String Tsex = rs.getString("Tsex");
				String Tpassword = null;
				String Titleno = rs.getString("Titleno");
				String Titlename = rs.getString("Titlename");
				
				Teacher tea = new Teacher(Tno, Tname, Tsex, Tpassword, Deptname, Titleno, Titlename);
				teaList.add(tea);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teaList;
	}

	@Override
	public Teacher queryTeacherById(String tId) {
		Teacher tea = null;
		String sql = "select * from teacher where Tno=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, tId);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Tno = rs.getString("Tno");
				String Tname = rs.getString("Tname");
				String Deptname = rs.getString("Deptname");
				String Tsex = rs.getString("Tsex");
				String Tpassword = rs.getString("Tpassword");
				String Titleno = rs.getString("Titleno");
				String Titlename = rs.getString("Titlename");
				
				tea = new Teacher(Tno, Tname, Tsex, Tpassword, Deptname, Titleno, Titlename);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tea;
	}

	@Override
	public List<Teacher> queryTeacherByDept(String deptname) {
		List<Teacher> teaList = new ArrayList<>();
		String sql = "select * from teacher where Deptname=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, deptname);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Tno = rs.getString("Tno");
				String Tname = rs.getString("Tnmae");
				String Deptname = rs.getString("Deptname");
				String Tsex = rs.getString("Tsex");
				String Tpassword = null;
				String Titleno = rs.getString("Titleno");
				String Titlename = rs.getString("Titlename");
				
				Teacher tea = new Teacher(Tno, Tname, Tsex, Tpassword, Deptname, Titleno, Titlename);
				teaList.add(tea);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teaList;
	}

	@Override
	public List<Teacher> queryTeacher() {
		List<Teacher> teaList = new ArrayList<>();
		String sql = "select * from teacher";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Tno = rs.getString("Tno");
				String Tname = rs.getString("Tname");
				String Deptname = rs.getString("Deptname");
				String Tsex = rs.getString("Tsex");
				String Tpassword = null;
				String Titleno = rs.getString("Titleno");
				String Titlename = rs.getString("Titlename");
				
				Teacher tea = new Teacher(Tno, Tname, Tsex, Tpassword, Deptname, Titleno, Titlename);
				teaList.add(tea);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teaList;
	}

	@Override
	public List<Teacher> queryTeacherByTitle(String titlename) {
		List<Teacher> teaList = new ArrayList<>();
		String sql = "select * from teacher where Titlename=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, titlename);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Tno = rs.getString("Tno");
				String Tname = rs.getString("Tnmae");
				String Deptname = rs.getString("Deptname");
				String Tsex = rs.getString("Tsex");
				String Tpassword = null;
				String Titleno = rs.getString("Titleno");
				String Titlename = rs.getString("Titlename");
				
				Teacher tea = new Teacher(Tno, Tname, Tsex, Tpassword, Deptname, Titleno, Titlename);
				teaList.add(tea);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teaList;
	}

	@Override
	public boolean updatePassword(String pwd, String tno) {
		boolean flag = false;
		String sql = "update teacher set Tpassword="+pwd+" where tno="+tno+"";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int i =  psmt.executeUpdate();
			if(i == 1){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}

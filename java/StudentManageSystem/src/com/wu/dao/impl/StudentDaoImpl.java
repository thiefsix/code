package com.wu.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wu.dao.StudentDao;
import com.wu.model.Student;
import com.wu.util.Base64;
import com.wu.util.Dbconn;

public class StudentDaoImpl implements StudentDao {
	
	private Connection conn = Dbconn.getConn();

	@Override
	public boolean addStudent(Student stu) {
		
		boolean flag = false;
		String sql = "insert into student(Sno,Sname,Ssex,Sbirthday,Senttime,Mno,Deptno,Spassword,Deptname,Mname) values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, stu.getSno());
			psmt.setString(2, stu.getSname());
			psmt.setString(3, stu.getSsex());
			psmt.setDate(4, stu.getSbirthday());
			psmt.setDate(5, stu.getSenttime());
			psmt.setString(6, stu.getMno());
			psmt.setString(7, stu.getDeptno());
			psmt.setString(8, Base64.Encode(stu.getSpassword()));
			psmt.setString(9, stu.getDeptname());
			psmt.setString(10, stu.getMname());
			
			int i = psmt.executeUpdate();
			if(i == 1){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public boolean deleteStudent(String sno) {
		boolean flag = false;
		String sql = "delete from student where Sno=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, sno);
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
	public boolean updateStudent(Student stu) {
		boolean flag = false;
		String sql = "update student set Sname=?, Ssex=?, Sbirthday=?, Senttime=?, Mno=?, Deptno=?, Deptname=?, Mname=? where Sno=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, stu.getSname());
			psmt.setString(2, stu.getSsex());
			psmt.setDate(3, stu.getSbirthday());
			psmt.setDate(4, stu.getSenttime());
			psmt.setString(5, stu.getMno());
			psmt.setString(6, stu.getDeptno());
			
			psmt.setString(7, stu.getDeptname());
			psmt.setString(8, stu.getMname());
			psmt.setString(9, stu.getSno());
			
			int i = psmt.executeUpdate();
			if(i == 1){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public Student queryStudentById(String sno) {
		Student stu = null;
		String sql = "select * from student where Sno=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, sno);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Sno = rs.getString("Sno");
				String Sname = rs.getString("Sname");
				String Ssex = rs.getString("Ssex");
				Date Sbirthday = rs.getDate("Sbirthday");
				Date Senttime = rs.getDate("Senttime");
				String Mno = rs.getString("Mno");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Mname = rs.getString("Mname");
				String Spassword = rs.getString("Spassword");
				stu = new Student(Sno, Sname, Ssex, Sbirthday, Senttime, Mno, Deptno, Spassword, Deptname, Mname);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;
	}

	@Override
	public List<Student> queryStudentByName(String sname) {
		List<Student> stuList = new ArrayList<>();
		String sql = "select * from student where Sname=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, sname);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Sno = rs.getString("Sno");
				String Sname = rs.getString("Sname");
				String Ssex = rs.getString("Ssex");
				Date Sbirthday = rs.getDate("Sbirthday");
				Date Senttime = rs.getDate("Senttime");
				String Mno = rs.getString("Mno");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Mname = rs.getString("Mname");
				String Spassword = null;
				
				Student stu = new Student(Sno, Sname, Ssex, Sbirthday, Senttime, Mno, Deptno, Spassword, Deptname, Mname);
				stuList.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stuList;
	}

	@Override
	public List<Student> queryStudentByMajor(String majorname) {
		List<Student> stuList = new ArrayList<>();
		String sql = "select * from student where Mname=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, majorname);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Sno = rs.getString("Sno");
				String Sname = rs.getString("Sname");
				String Ssex = rs.getString("Ssex");
				Date Sbirthday = rs.getDate("Sbirthday");
				Date Senttime = rs.getDate("Senttime");
				String Mno = rs.getString("Mno");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Mname = rs.getString("Mname");
				String Spassword = null;
				
				Student stu = new Student(Sno, Sname, Ssex, Sbirthday, Senttime, Mno, Deptno, Spassword, Deptname, Mname);
				stuList.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stuList;
	}

	@Override
	public List<Student> queryStudentByDept(String deptname) {
		List<Student> stuList = new ArrayList<>();
		String sql = "select * from student where Deptname=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, deptname);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Sno = rs.getString("Sno");
				String Sname = rs.getString("Sname");
				String Ssex = rs.getString("Ssex");
				Date Sbirthday = rs.getDate("Sbirthday");
				Date Senttime = rs.getDate("Senttime");
				String Mno = rs.getString("Mno");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Mname = rs.getString("Mname");
				String Spassword = null;
				
				Student stu = new Student(Sno, Sname, Ssex, Sbirthday, Senttime, Mno, Deptno, Spassword, Deptname, Mname);
				stuList.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stuList;
	}

	@Override
	public List<Student> queryStudent() {
		List<Student> stuList = new ArrayList<>();
		String sql = "select * from student";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Sno = rs.getString("Sno");
				String Sname = rs.getString("Sname");
				String Ssex = rs.getString("Ssex");
				Date Sbirthday = rs.getDate("Sbirthday");
				Date Senttime = rs.getDate("Senttime");
				String Mno = rs.getString("Mno");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Mname = rs.getString("Mname");
				String Spassword = null;
				
				Student stu = new Student(Sno, Sname, Ssex, Sbirthday, Senttime, Mno, Deptno, Spassword, Deptname, Mname);
				stuList.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stuList;
	}

	@Override
	public boolean updatePassword(String pwd, String sno) {
		boolean flag = false;
		String sql = "update student set Spassword="+pwd+" where sno="+sno+"";
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

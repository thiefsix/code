package com.wu.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.wu.dao.MajorDao;
import com.wu.model.Major;
import com.wu.util.Dbconn;

public class MajorDaoImpl implements MajorDao {
	
	private Connection conn = Dbconn.getConn();

	@Override
	public boolean addMajor(Major maj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMajor(String mno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMajor(Major maj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Major queryMajorByName(String mname) {
		Major major = null;
		String sql = "select * from major where Mname=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, mname);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Mno = rs.getString("Mno");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Mname = rs.getString("Mname");
				major = new Major(Mno, Mname, Deptno, Deptname);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return major;
	}

	@Override
	public List<Major> queryMajorByDeptname(String deptname) {
		List<Major> majList = new ArrayList<Major>();
		String sql = "select * from major where Deptname=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, deptname);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Mno = rs.getString("Mno");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Mname = rs.getString("Mname");
				Major major = new Major(Mno, Mname, Deptno, Deptname);
				majList.add(major);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return majList;
	}

	@Override
	public List<Major> queryMajorByDeptno(String deptno) {
		List<Major> majList = new ArrayList<Major>();
		String sql = "select * from major where Deptno=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, deptno);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Mno = rs.getString("Mno");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Mname = rs.getString("Mname");
				Major major = new Major(Mno, Mname, Deptno, Deptname);
				majList.add(major);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return majList;
	}

	@Override
	public List<Major> queryMajor() {
		List<Major> majList = new ArrayList<Major>();
		String sql = "select * from major ";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Mno = rs.getString("Mno");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Mname = rs.getString("Mname");
				Major major = new Major(Mno, Mname, Deptno, Deptname);
				majList.add(major);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return majList;
	}

}

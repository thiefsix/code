package com.wu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wu.dao.AdminDao;
import com.wu.model.Admin;
import com.wu.util.Base64;
import com.wu.util.Dbconn;

public class AdminDaoImpl implements AdminDao{
	
	/**
	 * 
	 * 数据访问层，管理员操作
	 */
	
	private Connection conn = Dbconn.getConn();
	
	@Override
	public Admin queryAdmin(String id) {
		Admin admin = null;
		String sql = "select * from admin where Ano=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Ano = rs.getString("Ano");
				String Aname = rs.getString("Aname");
				String Apassword = rs.getString("Apassword");
				admin = new Admin(Ano, Aname, Apassword);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return admin;
	}

	@Override
	public boolean updateAdmin(Admin admin) {
		
		boolean flag = false;
		String sql = "update admin set Aname=?,Apassword=? where Ano=?";
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, admin.getAname());
			psmt.setString(2, Base64.Encode(admin.getApassword()));
			psmt.setString(3, admin.getAno());
			
			int i = psmt.executeUpdate();
			if(i==1){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean addAdmin(Admin admin) {
		
		boolean flag = false;
		String sql = "insert into admin(Ano, Aname, Apassword) values(?,?,?)";
		
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, admin.getAno());
			psmt.setString(2, admin.getAname());
			psmt.setString(3, Base64.Encode(admin.getApassword()));
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
	public boolean deleteAdmin(String id) {
		
		boolean flag = false;
		String sql = "delete from admin where Ano=?";
		
		try {
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, id);
			
			if(pmst.executeUpdate()>1){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}

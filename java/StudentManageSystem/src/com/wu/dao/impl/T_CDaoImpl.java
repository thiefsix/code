package com.wu.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.wu.dao.T_CDao;
import com.wu.model.T_C;
import com.wu.util.Dbconn;

public class T_CDaoImpl implements T_CDao {
	private Connection conn = Dbconn.getConn();

	@Override
	public boolean addTC(T_C tc) {
		boolean flag = false;
		String sql = "insert into TC(Tno,Tname,Cno,Cname,TCplace,TCtime) values(?,?,?,?,?,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, tc.getTno());
			psmt.setString(2, tc.getTname());
			psmt.setString(3, tc.getCno());
			psmt.setString(4, tc.getCname());
			psmt.setString(5, tc.getTCplace());
			psmt.setString(6, tc.getTCtime());
			
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
	public boolean deleteTC(String Tno, String Cno) { 
		boolean flag = false;
		String sql = "delete from TC where Tno="+Tno+"and Cno="+Cno+"";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
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
	public boolean updateTC(T_C tc) {
		boolean flag = false;
		String sql = "update TC set Tname=?,Cname=?,TCplace=?,TCtime=? where Tno=? and Cno=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, tc.getTname());
			psmt.setString(2, tc.getCname());
			psmt.setString(3, tc.getTCplace());
			psmt.setString(4, tc.getTCtime());
			psmt.setString(5, tc.getTno());
			psmt.setString(6, tc.getCno());
			
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
	public List<T_C> queryTCByTno(String tno) {
		List<T_C> listTC = new ArrayList<>();
		String sql = "select * from TC where Tno="+tno+"";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Tno = rs.getString("Tno");
				String Tname = rs.getString("Tname");
				String Cno = rs.getString("Cno");
				String Cname = rs.getString("Cname");
				String TCplace = rs.getString("TCplace");
				String TCtime = rs.getString("TCtime");
				T_C tc = new T_C(Tno, Cno, Tname, Cname, TCplace, TCtime);
				listTC.add(tc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listTC;
	}

	@Override
	public List<T_C> queryTCByCname(String C_name) {
		List<T_C> listTC = new ArrayList<>();
		String sql = "select * from TC where Cname="+C_name+"";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Tno = rs.getString("Tno");
				String Tname = rs.getString("Tname");
				String Cno = rs.getString("Cno");
				String Cname = rs.getString("Cname");
				String TCplace = rs.getString("TCplace");
				String TCtime = rs.getString("TCtime");
				T_C tc = new T_C(Tno, Cno, Tname, Cname, TCplace, TCtime);
				listTC.add(tc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listTC;
	}

	@Override
	public List<T_C> queryTC() {
		List<T_C> listTC = new ArrayList<>();
		String sql = "select * from TC";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Tno = rs.getString("Tno");
				String Tname = rs.getString("Tname");
				String Cno = rs.getString("Cno");
				String Cname = rs.getString("Cname");
				String TCplace = rs.getString("TCplace");
				String TCtime = rs.getString("TCtime");
				T_C tc = new T_C(Tno, Cno, Tname, Cname, TCplace, TCtime);
				listTC.add(tc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listTC;
	}

}

package com.wu.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.wu.dao.S_CDao;
import com.wu.model.S_C;
import com.wu.model.Teacher;
import com.wu.util.Dbconn;

public class S_CDaoImpl implements S_CDao {
	
	private Connection conn = Dbconn.getConn();

	@Override
	public boolean addSC(S_C sc) {
		boolean flag = false;
		String sql = "insert into sc(Sno,Cno,Cname,Grade,GeneralGrade,TerminalGrade) values(?,?,?,?,?,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, sc.getSno());
			psmt.setString(2, sc.getCno());
			psmt.setString(3, sc.getCname());
			psmt.setInt(4, sc.getGrade());
			psmt.setInt(5, sc.getGeneralGrade());
			psmt.setInt(6, sc.getTerminalGrade());
			int i = psmt.executeUpdate();
			if(i==1){
				flag = true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			return flag;
		
		
	}

	@Override
	public boolean deleteSC(String sno, String cno) {
		boolean flag = false;
		String sql = "delete from sc where Sno="+sno+" and Cno="+cno+"";
//		System.out.println(sql);
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
	public List<S_C> querySC(String sno) {
		List<S_C> scList = new ArrayList<>();
		String sql = "select * from sc where Sno="+sno+"";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Sno = rs.getString("Sno");
				String Cno = rs.getString("Cno");
				String Cname = rs.getString("Cname");
				int Grade = rs.getInt("Grade");
				
				int GenaralGrade = rs.getInt("GeneralGrade");
				int TerminalGrade = rs.getInt("TerminalGrade");
				
				S_C sc = new S_C(Sno, Cno, Cname, Grade, GenaralGrade, TerminalGrade);
				scList.add(sc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scList;
	}

	@Override
	public boolean updateSC(String sno, String cno, int geneGrade, int termGrade, int grade) {
		boolean flag = false;
		String sql = "update sc set GeneralGrade="+geneGrade+",TerminalGrade="+termGrade+",Grade="+grade+" where Sno="+sno+" and Cno="+cno+"";
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
	public List<S_C> queryAllSC() {
		List<S_C> scList = new ArrayList<>();
		String sql = "select * from sc";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Sno = rs.getString("Sno");
				String Cno = rs.getString("Cno");
				String Cname = rs.getString("Cname");
				int Grade = rs.getInt("Grade");
				
				int GenaralGrade = rs.getInt("GeneralGrade");
				int TerminalGrade = rs.getInt("TerminalGrade");
				
				S_C sc = new S_C(Sno, Cno, Cname, Grade, GenaralGrade, TerminalGrade);
				scList.add(sc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scList;
	}

}

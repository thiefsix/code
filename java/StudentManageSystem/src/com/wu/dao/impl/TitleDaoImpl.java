package com.wu.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.wu.dao.TitleDao;
import com.wu.model.Title;
import com.wu.util.Dbconn;

public class TitleDaoImpl implements TitleDao {
	
	private Connection conn = Dbconn.getConn();

	@Override
	public List<Title> queryTitle() {
		List<Title> titleList = new ArrayList<>();
		String sql = "select * from title";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String titleno = rs.getString("Titleno");
				String titlename = rs.getString("Titlename");
				int titleorder = rs.getInt("Titleorder");
				Title title = new Title(titleno, titlename, titleorder);
				titleList.add(title);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return titleList;
	}

}

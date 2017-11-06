package com.wu.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.wu.dao.DeptDao;
import com.wu.model.Department;
import com.wu.util.Dbconn;

public class DeptDaoImpl implements DeptDao{
	
	private Connection conn = Dbconn.getConn();

	@Override
	public boolean addDept(Department dept) {
		return false;
	}

	@Override
	public boolean deleteDept(String deptno) {
		return false;
	}

	@Override
	public boolean updateDept(Department dept) {
		return false;
	}

	@Override
	public List<Department> queryDept() {
		List<Department> list = new ArrayList<>();
		String sql = "select * from department";
		try {
			PreparedStatement pmst = conn.prepareStatement(sql);
			ResultSet rs = pmst.executeQuery();
			
			while(rs.next()){
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				
				Department dept = new Department(Deptno, Deptname);
				list.add(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return list;
	}

}

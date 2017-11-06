package com.wu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wu.util.Dbconn;
import com.mysql.jdbc.Statement;
import com.wu.dao.CourseDao;
import com.wu.model.Course;
import com.wu.model.PageBean;

public class CourseDaoImpl implements CourseDao{
	
	/**
	 * 数据访问层，课程信息CRUD操作
	 * 
	 */
	private Connection conn = Dbconn.getConn();
	
	/**
	 * 添加课程信息
	 * 
	 * @param cou
	 * @retursn flag
	 */
	@Override
	public boolean addCourse(Course cou) {
//		Course(Cno, Cname, Ctime, Ccredit, Curl, Deptno, Deptname, Cdescription)
		boolean flag = false;
		String sql = "insert into course(Cno, Cname, Ctime, Ccredit, Curl, Deptno, Deptname, Cdescription) values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, cou.getCno());
			psmt.setString(2, cou.getCname());
			psmt.setInt(3, cou.getCtime());
			psmt.setFloat(4, cou.getCcredit());
			psmt.setString(5, cou.getCurl());
			psmt.setString(6, cou.getDeptno());
			psmt.setString(7, cou.getDeptname());
			psmt.setString(8, cou.getCdescription());
			int i = psmt.executeUpdate();
			if (i == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 删除课程信息
	 * 
	 * @param Cno
	 * @return flag
	 */
	@Override
	public boolean deleteCourse(String Cno) {
		boolean flag = false;
		String sql = "delete from course where Cno=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, Cno);
			if (psmt.executeUpdate() > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 获取指定的用戶(更新页面操作使用)
	 * 查询课程信息(课程名)
	 * @param id
	 * @return stu
	 */
	@Override
	public Course queryCourseByName(String coursename) {
		Course cou = null;
		String sql = "select * from course where Cname like concat('%',?,'%')";
		try {
			PreparedStatement psmt =  conn.prepareStatement(sql);
			psmt.setString(1, coursename);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Cno = rs.getString("Cno");
				String Cname = rs.getString("Cname");
				int Ctime = rs.getInt("Ctime");
				float Ccredit = rs.getFloat("Ccredit");
				String Curl = rs.getString("Curl");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Cdescription = rs.getString("Cdescription");
				cou = new Course(Cno,Cname,Ctime,Ccredit,Curl,Deptno,Deptname,Cdescription);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cou;
	}
	
	/**
	 * 更新课程信息
	 * 
	 * @param cou
	 * @return flag
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public boolean updateCourse(Course cou) {
		boolean flag = false;
		String sql = "update course set Cname=?,Ctime=?,Ccredit=?,Curl=?,Deptno=?,Deptname=?,Cdescription=? where Cno=? ";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, cou.getCname());
			psmt.setInt(2, cou.getCtime());
			psmt.setFloat(3, cou.getCcredit());
			psmt.setString(4, cou.getCurl());
			psmt.setString(5, cou.getDeptno());
			psmt.setString(6, cou.getDeptname());
			psmt.setString(7, cou.getCdescription());
			
			int i = psmt.executeUpdate();
			if (i == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 分类查询课程(按学院名称)
	 * 
	 */
	@Override
	public List<Course> queryCourseByDept(String deptname) {
		List<Course> list = new ArrayList<>();
		String sql = "select * from course where Deptname=? ";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, deptname);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Cno = rs.getString("Cno");
				String Cname = rs.getString("Cname");
				int Ctime = rs.getInt("Ctime");
				float Ccredit = rs.getFloat("Ccredit");
				String Curl = rs.getString("Curl");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Cdescription = rs.getString("Cdescription");
				
				Course cou = new Course(Cno,Cname,Ctime,Ccredit,Curl,Deptno,Deptname,Cdescription);
				list.add(cou);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	 
	@Override
	public List queryAllCourse() {
		List<Course> list = new ArrayList<>();
		String sql = "select * from Course";
		try {
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String Cno = rs.getString("Cno");
				String Cname = rs.getString("Cname");
				int Ctime = rs.getInt("Ctime");
				float Ccredit = rs.getFloat("Ccredit");
				String Curl = rs.getString("Curl");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Cdescription = rs.getString("Cdescription");
				
				Course cou = new Course(Cno, Cname, Ctime, Ccredit, Curl, Deptno, Deptname, Cdescription);
				list.add(cou);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Course> queryPageCourse(int pageNow, int pageSize) {
		List<Course> list = new ArrayList<>();
		String sql = "select * from course limit "+((pageNow-1)*pageSize)+","+pageSize;
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
		
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Cno = rs.getString("Cno");
				String Cname = rs.getString("Cname");
				int Ctime = rs.getInt("Ctime");
				float Ccredit = rs.getFloat("Ccredit");
				String Curl = rs.getString("Curl");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Cdescription = rs.getString("Cdescription");
				
				Course cou = new Course(Cno,Cname,Ctime,Ccredit,Curl,Deptno,Deptname,Cdescription);
				list.add(cou);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int queryRecordCount() {
		ResultSet rs = null;
		int res=0;
		String sql = "select count(*) from course";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			if(rs.next()){
				res = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

	@Override
	public Course queryCourseById(String cno) {
		Course cou = null;
		String sql = "select * from course where Cno="+cno+"";
		try {
			PreparedStatement psmt =  conn.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Cno = rs.getString("Cno");
				String Cname = rs.getString("Cname");
				int Ctime = rs.getInt("Ctime");
				float Ccredit = rs.getFloat("Ccredit");
				String Curl = rs.getString("Curl");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Cdescription = rs.getString("Cdescription");
				cou = new Course(Cno,Cname,Ctime,Ccredit,Curl,Deptno,Deptname,Cdescription);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cou;
	}

	@Override
	public List<Course> queryPageCourse(int pageNum, int currentPage, String type) {
		List<Course> list = new ArrayList<>();
		String sql = "select * from course where Deptname='"+type+"' limit "+((pageNum-1)*currentPage)+","+currentPage+"";
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
		
			ResultSet rs = psmt.executeQuery();
			while(rs.next()){
				String Cno = rs.getString("Cno");
				String Cname = rs.getString("Cname");
				int Ctime = rs.getInt("Ctime");
				float Ccredit = rs.getFloat("Ccredit");
				String Curl = rs.getString("Curl");
				String Deptno = rs.getString("Deptno");
				String Deptname = rs.getString("Deptname");
				String Cdescription = rs.getString("Cdescription");
				
				Course cou = new Course(Cno,Cname,Ctime,Ccredit,Curl,Deptno,Deptname,Cdescription);
				list.add(cou);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
	
	
	

}

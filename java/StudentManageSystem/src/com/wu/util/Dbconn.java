package com.wu.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.wu.util.Dbconn;
import com.mysql.jdbc.Connection;

public class Dbconn {
	
	/**
	 * 获得数据库连接
	 * @param
	 */
	private static String username="root";
	private static String password="toor";
	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/sms?useUnicode=true&charactEncoding=UTF-8";
	
	public static Connection getConn(){
		Connection conn = null;
		try {
		    Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public void closeConn(Connection conn) {
		// TODO Auto-generated method stub
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			Dbconn.getConn();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}

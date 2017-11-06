package com.wu.dao;

import com.wu.model.Admin;

public interface AdminDao {
	
	/**
	 * 添加管理员
	 * 
	 */
	public boolean addAdmin(Admin admin);
	
	/**
	 * 查询管理员信息(登录验证)
	 * 
	 */
	public Admin queryAdmin(String id);
	
	/**
	 * 修改管理员信息
	 * 
	 */
	public boolean updateAdmin(Admin admin);
	
	/**
	 * 删除管理员信息
	 * 
	 */
	public boolean deleteAdmin(String id);
}

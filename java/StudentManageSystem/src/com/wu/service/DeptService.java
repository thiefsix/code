package com.wu.service;

import java.util.List;

import com.wu.model.Department;

public interface DeptService {
	
	/**
	 * 添加学院
	 * 
	 */
	public boolean addDept(Department dept);
	
	/**
	 * 删除学院
	 * 
	 */
	public boolean deleteDept(String deptno);
	
	/**
	 * 更新学院
	 * 
	 */
	public boolean updateDept(Department dept);
	
	/**
	 * 查询所有学院
	 * 
	 */
	public List<Department> queryDept();



}

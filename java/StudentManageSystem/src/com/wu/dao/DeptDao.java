package com.wu.dao;

import java.util.List;

import com.wu.model.Department;

public interface DeptDao {
	
	/**
	 * ���ѧԺ
	 * 
	 */
	public boolean addDept(Department dept);
	
	/**
	 * ɾ��ѧԺ
	 * 
	 */
	public boolean deleteDept(String deptno);
	
	/**
	 * ����ѧԺ
	 * 
	 */
	public boolean updateDept(Department dept);
	
	/**
	 * ��ѯ����ѧԺ
	 * 
	 */
	public List<Department> queryDept();

}

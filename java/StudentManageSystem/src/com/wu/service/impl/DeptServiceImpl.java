package com.wu.service.impl;

import java.util.List;

import com.wu.dao.DeptDao;
import com.wu.dao.impl.DeptDaoImpl;
import com.wu.model.Department;
import com.wu.service.DeptService;

public class DeptServiceImpl implements DeptService{
	
	private DeptDao deptDao = new DeptDaoImpl();

	@Override
	public boolean addDept(Department dept) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDept(String deptno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDept(Department dept) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Department> queryDept() {
		
		return deptDao.queryDept();
	}

}

package com.wu.service.impl;

import java.util.List;

import com.wu.dao.MajorDao;
import com.wu.dao.impl.MajorDaoImpl;
import com.wu.model.Major;
import com.wu.service.MajorService;

public class MajorServiceImpl implements MajorService {
	
	private MajorDao majDao = new MajorDaoImpl();

	@Override
	public boolean addMajor(Major maj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMajor(String mno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMajor(Major maj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Major queryMajor(String mname) {
		
		return majDao.queryMajorByName(mname);
		
	}

	@Override
	public List<Major> queryMajorByDeptname(String deptname) {
		
		return majDao.queryMajorByDeptname(deptname);
		
	}

	@Override
	public List<Major> queryMajorByDeptno(String deptno) {
		
		return majDao.queryMajorByDeptno(deptno);
	}

	@Override
	public List<Major> queryMajor() {
		
		return majDao.queryMajor();
	}

}

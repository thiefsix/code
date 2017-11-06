package com.wu.service.impl;

import com.wu.dao.AdminDao;
import com.wu.dao.impl.AdminDaoImpl;
import com.wu.model.Admin;
import com.wu.service.AdminService;

public class AdminServiceImpl implements AdminService{
	
	private AdminDao adminDao = new AdminDaoImpl() ;

	@Override
	public boolean addAdmin(Admin admin) {
		
		return adminDao.addAdmin(admin);
	}

	@Override
	public Admin queryAdmin(String id) {
		
		return adminDao.queryAdmin(id);
	}

	@Override
	public boolean updateAdmin(Admin admin) {
		
		return adminDao.updateAdmin(admin);
	}

	@Override
	public boolean deleteAdmin(String id) {
		
		return adminDao.deleteAdmin(id);
	}

}

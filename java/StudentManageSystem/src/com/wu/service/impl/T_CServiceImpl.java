package com.wu.service.impl;

import java.util.List;

import com.wu.dao.T_CDao;
import com.wu.dao.impl.T_CDaoImpl;
import com.wu.model.T_C;
import com.wu.service.T_CService;

public class T_CServiceImpl implements T_CService {
	
	T_CDao tcDao = new T_CDaoImpl();

	@Override
	public boolean addTC(T_C tc) {
		
		return tcDao.addTC(tc);

	}

	@Override
	public boolean deleteTC(String Tno, String Cno) {
		
		return tcDao.deleteTC(Tno, Cno);

	}

	@Override
	public boolean updateTC(T_C tc) {
		
		return tcDao.updateTC(tc);

	}

	@Override
	public List<T_C> queryTCByTno(String tno) {
		
		return tcDao.queryTCByTno(tno);

	}

	@Override
	public List<T_C> queryTCByCname(String C_name) {
		
		return tcDao.queryTCByCname(C_name);

	}

	@Override
	public List<T_C> queryTC() {
		
		return tcDao.queryTC();

	}

}

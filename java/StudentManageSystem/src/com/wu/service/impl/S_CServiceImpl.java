package com.wu.service.impl;

import java.util.List;

import com.wu.dao.S_CDao;
import com.wu.dao.impl.S_CDaoImpl;
import com.wu.model.S_C;
import com.wu.service.S_CService;

public class S_CServiceImpl implements S_CService {
	
	private S_CDao scDao = new S_CDaoImpl();

	@Override
	public boolean addSC(S_C sc) {
		
		return scDao.addSC(sc);
		
	}

	@Override
	public boolean deleteSC(String sno, String cno) {
		
		return scDao.deleteSC(sno, cno);
		
	}

	@Override
	public List<S_C> querySC(String sno) {
		
		return scDao.querySC(sno);
		
	}

	@Override
	public boolean updateSC(String sno, String cno, int geneGrade, int termGrade, int grade) {
		
		return scDao.updateSC(sno, cno, geneGrade, termGrade, grade);
		
	}

	@Override
	public List<S_C> queryAllSC() {
		
		return scDao.queryAllSC();
	}

}

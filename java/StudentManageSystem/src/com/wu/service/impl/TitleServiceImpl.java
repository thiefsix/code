package com.wu.service.impl;

import java.util.List;

import com.wu.dao.TitleDao;
import com.wu.dao.impl.TitleDaoImpl;
import com.wu.model.Title;
import com.wu.service.TitleService;

public class TitleServiceImpl implements TitleService {
	
	private TitleDao titleDao = new TitleDaoImpl();

	@Override
	public List<Title> queryTitle() {
		
		return titleDao.queryTitle();
	}

}

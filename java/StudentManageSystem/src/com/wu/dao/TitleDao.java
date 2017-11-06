package com.wu.dao;

import java.util.List;

import com.wu.model.Title;

public interface TitleDao {
	
	/**
	 * 查看职称代码表
	 * 
	 */
	public List<Title> queryTitle();

}

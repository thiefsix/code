package com.wu.dao;

import java.util.List;

import com.wu.model.T_C;

public interface T_CDao {
	/**
	 * 添加教师授课信息
	 * 
	 */
	public boolean addTC(T_C tc);
	
	/**
	 * 删除教师授课信息
	 * 
	 */
	public boolean deleteTC(String Tno, String Cno);
	
	/**
	 * 修改教师授课信息
	 * 
	 */
	public boolean updateTC(T_C tc);
	
	/**
	 * 查询教师授课信息(教师id)
	 * 
	 */
	public List<T_C> queryTCByTno(String Tno);
	
	/**
	 * 查询教师授课信息（课程名称）
	 * 
	 */
	public List<T_C> queryTCByCname(String C_name);
	
	/**
	 * 查询所有授课信息
	 * 
	 */
	public List<T_C> queryTC();

}

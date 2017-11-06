package com.wu.dao;

import java.util.List;

import com.wu.model.S_C;

public interface S_CDao {
	
	/**
	 * 添加选课信息（选课）
	 * 
	 */
	public boolean addSC(S_C sc);
	
	/**
	 * 删除选课信息（退选）
	 * 
	 */
	public boolean deleteSC(String sno, String cno);
	
	/**
	 * 查询选课信息（查课）
	 * 
	 */
	public List<S_C> querySC(String sno);
	
	/**
	 * 查询所有选课信息
	 * 
	 */
	public List<S_C> queryAllSC();
	
	/**
	 * 修改SC表信息（打分）
	 * 
	 */
	public boolean updateSC(String sno, String cno, int geneGrade, int termGrade, int grade);

}

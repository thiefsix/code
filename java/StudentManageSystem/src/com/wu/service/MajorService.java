package com.wu.service;

import java.util.List;

import com.wu.model.Major;

public interface MajorService {
	
	/**
	 * 添加专业
	 * 
	 */
	public boolean addMajor(Major maj);
	
	/**
	 * 删除专业
	 * 
	 */
	public boolean deleteMajor(String mno);
	
	/**
	 * 修改专业信息
	 * 
	 */
	public boolean updateMajor(Major maj);
	
	/**
	 * 查询专业信息(专业名)
	 * 
	 */
	public Major queryMajor(String mname);
	
	/**
	 * 查询专业信息(按学院名)
	 * 
	 */
	public List<Major> queryMajorByDeptname(String deptname);
	
	/**
	 * 查询专业信息（按学院编号）
	 * 
	 */
	public List<Major> queryMajorByDeptno(String deptno);
	
	/**
	 * 查询所有专业信息
	 * 
	 */
	public List<Major> queryMajor();



}

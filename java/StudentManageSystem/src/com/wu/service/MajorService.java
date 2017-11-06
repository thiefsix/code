package com.wu.service;

import java.util.List;

import com.wu.model.Major;

public interface MajorService {
	
	/**
	 * ���רҵ
	 * 
	 */
	public boolean addMajor(Major maj);
	
	/**
	 * ɾ��רҵ
	 * 
	 */
	public boolean deleteMajor(String mno);
	
	/**
	 * �޸�רҵ��Ϣ
	 * 
	 */
	public boolean updateMajor(Major maj);
	
	/**
	 * ��ѯרҵ��Ϣ(רҵ��)
	 * 
	 */
	public Major queryMajor(String mname);
	
	/**
	 * ��ѯרҵ��Ϣ(��ѧԺ��)
	 * 
	 */
	public List<Major> queryMajorByDeptname(String deptname);
	
	/**
	 * ��ѯרҵ��Ϣ����ѧԺ��ţ�
	 * 
	 */
	public List<Major> queryMajorByDeptno(String deptno);
	
	/**
	 * ��ѯ����רҵ��Ϣ
	 * 
	 */
	public List<Major> queryMajor();



}

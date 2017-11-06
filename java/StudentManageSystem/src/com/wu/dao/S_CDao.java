package com.wu.dao;

import java.util.List;

import com.wu.model.S_C;

public interface S_CDao {
	
	/**
	 * ���ѡ����Ϣ��ѡ�Σ�
	 * 
	 */
	public boolean addSC(S_C sc);
	
	/**
	 * ɾ��ѡ����Ϣ����ѡ��
	 * 
	 */
	public boolean deleteSC(String sno, String cno);
	
	/**
	 * ��ѯѡ����Ϣ����Σ�
	 * 
	 */
	public List<S_C> querySC(String sno);
	
	/**
	 * ��ѯ����ѡ����Ϣ
	 * 
	 */
	public List<S_C> queryAllSC();
	
	/**
	 * �޸�SC����Ϣ����֣�
	 * 
	 */
	public boolean updateSC(String sno, String cno, int geneGrade, int termGrade, int grade);

}

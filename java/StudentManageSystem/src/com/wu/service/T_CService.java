package com.wu.service;

import java.util.List;

import com.wu.model.T_C;

public interface T_CService {
	
	/**
	 * ��ӽ�ʦ�ڿ���Ϣ
	 * 
	 */
	public boolean addTC(T_C tc);
	
	/**
	 * ɾ����ʦ�ڿ���Ϣ
	 * 
	 */
	public boolean deleteTC(String Tno, String Cno);
	
	/**
	 * �޸Ľ�ʦ�ڿ���Ϣ
	 * 
	 */
	public boolean updateTC(T_C tc);
	
	/**
	 * ��ѯ��ʦ�ڿ���Ϣ(��ʦ����)
	 * 
	 */
	public List<T_C> queryTCByTno(String tno);
	
	/**
	 * ��ѯ��ʦ�ڿ���Ϣ���γ����ƣ�
	 * 
	 */
	public List<T_C> queryTCByCname(String C_name);
	
	/**
	 * ��ѯ�����ڿ���Ϣ
	 * 
	 */
	public List<T_C> queryTC();

}

package com.wu.dao;

import com.wu.model.Admin;

public interface AdminDao {
	
	/**
	 * ��ӹ���Ա
	 * 
	 */
	public boolean addAdmin(Admin admin);
	
	/**
	 * ��ѯ����Ա��Ϣ(��¼��֤)
	 * 
	 */
	public Admin queryAdmin(String id);
	
	/**
	 * �޸Ĺ���Ա��Ϣ
	 * 
	 */
	public boolean updateAdmin(Admin admin);
	
	/**
	 * ɾ������Ա��Ϣ
	 * 
	 */
	public boolean deleteAdmin(String id);
}

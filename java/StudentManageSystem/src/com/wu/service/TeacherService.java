package com.wu.service;

import java.util.List;

import com.wu.model.Teacher;

public interface TeacherService {
	
	/**
	 * ��ӽ�ʦ
	 * 
	 */
	public boolean addTeacher(Teacher tea);
	
	/**
	 * ɾ����ʦ
	 * 
	 */
	public boolean deleteTeacher(String tno);
	
	/**
	 * ���½�ʦ��Ϣ
	 * 
	 */
	public boolean updateTeacher(String name, String deptname, String sex, String titleno, String titlename, String tno);
	
	/**
	 * ��ѯ��ʦ��Ϣ(����)
	 * 
	 */
	public List<Teacher> queryTeacherByName(String tname);
	
	/**
	 * ��ѯ��ʦ��Ϣ(id)
	 * 
	 */
	public Teacher queryTeacherById(String tId);
	
	/**
	 * ��ѯ��ʦ��Ϣ(ѧԺ)
	 * 
	 */
	public List<Teacher> queryTeacherByDept(String deptname);
	
	/**
	 * ��ѯȫ���ʦ��Ϣ
	 * 
	 */
	public List<Teacher> queryTeacher();
	
	/**
	 * ��ѯ��ʦ��Ϣ(ְ��)
	 * 
	 */
	public List<Teacher> queryTeacherByTitle(String titlename);
	
	/**
	 * �޸�����
	 * 
	 */
	public boolean updatePassword(String pwd, String tno);

}

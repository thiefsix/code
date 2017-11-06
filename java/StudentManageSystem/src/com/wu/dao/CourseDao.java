package com.wu.dao;

import java.util.List;

import com.sun.jmx.snmp.SnmpStringFixed;
import com.wu.model.Course;
import com.wu.model.PageBean;

public interface CourseDao {
	
	/**
	 * ��ӿγ�
	 * 
	 */
	public boolean addCourse(Course cou);
	
	/**
	 * ɾ���γ�
	 * 
	 */
	public boolean deleteCourse(String Sno);
	
	/**
	 * ��ѯ�γ�(�γ���)
	 * 
	 */
	public Course queryCourseByName(String Cname);
	
	/**
	 * ��ѯ�γ�(�γ̱��)
	 * 
	 */
	public Course queryCourseById(String cno);
	
	/**
	 * �޸Ŀγ�
	 * @param
	 */
	public boolean updateCourse(Course cou);	
	
	/**
	 * �����ѯ�γ�(ѧԺ����)
	 * 
	 */
	public List<Course> queryCourseByDept(String deptname);
	
	/**
	 * ��ѯȫ���γ�
	 * 
	 */
	public List queryAllCourse();
	
	/**
	 * ��ҳ����ҳ��
	 * 
	 */
	public List<Course> queryPageCourse(int pageNow,int pageSize);
	
	/**
	 * 
	 * ��ѯ�ܼ�¼��
	 * @return
	 */
	public int queryRecordCount();

	public List<Course> queryPageCourse(int pageNum, int currentPage, String type);

	
	

}

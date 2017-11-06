package com.wu.service;

import java.util.List;

import com.wu.model.Course;
import com.wu.model.PageBean;

public interface CourseService {
	
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
	public Course queryCourseByname(String Cname);
	
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

	public PageBean findByPage(int pageNum, int currentPage);

	public PageBean findByTypePage(int pageNum, int currentPage, String type);

}

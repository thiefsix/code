package com.wu.service;

import java.util.List;

import com.wu.model.Course;
import com.wu.model.PageBean;

public interface CourseService {
	
	/**
	 * 添加课程
	 * 
	 */
	public boolean addCourse(Course cou);
	
	/**
	 * 删除课程
	 * 
	 */
	public boolean deleteCourse(String Sno);
	
	/**
	 * 查询课程(课程名)
	 * 
	 */
	public Course queryCourseByname(String Cname);
	
	/**
	 * 查询课程(课程编号)
	 * 
	 */
	public Course queryCourseById(String cno);
	
	/**
	 * 修改课程
	 * @param
	 */
	public boolean updateCourse(Course cou);	
	
	/**
	 * 分类查询课程(学院名称)
	 * 
	 */
	public List<Course> queryCourseByDept(String deptname);
	
	/**
	 * 查询全部课程
	 * 
	 */
	public List queryAllCourse();
	
	/**
	 * 按页查找页面
	 * 
	 */
	public List<Course> queryPageCourse(int pageNow,int pageSize);
	
	/**
	 * 
	 * 查询总记录数
	 * @return
	 */
	public int queryRecordCount();

	public PageBean findByPage(int pageNum, int currentPage);

	public PageBean findByTypePage(int pageNum, int currentPage, String type);

}

package com.wu.service;

import java.util.List;

import com.wu.model.Teacher;

public interface TeacherService {
	
	/**
	 * 添加教师
	 * 
	 */
	public boolean addTeacher(Teacher tea);
	
	/**
	 * 删除教师
	 * 
	 */
	public boolean deleteTeacher(String tno);
	
	/**
	 * 更新教师信息
	 * 
	 */
	public boolean updateTeacher(String name, String deptname, String sex, String titleno, String titlename, String tno);
	
	/**
	 * 查询教师信息(名称)
	 * 
	 */
	public List<Teacher> queryTeacherByName(String tname);
	
	/**
	 * 查询教师信息(id)
	 * 
	 */
	public Teacher queryTeacherById(String tId);
	
	/**
	 * 查询教师信息(学院)
	 * 
	 */
	public List<Teacher> queryTeacherByDept(String deptname);
	
	/**
	 * 查询全体教师信息
	 * 
	 */
	public List<Teacher> queryTeacher();
	
	/**
	 * 查询教师信息(职称)
	 * 
	 */
	public List<Teacher> queryTeacherByTitle(String titlename);
	
	/**
	 * 修改密码
	 * 
	 */
	public boolean updatePassword(String pwd, String tno);

}

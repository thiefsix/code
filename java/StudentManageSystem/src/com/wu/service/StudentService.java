package com.wu.service;

import java.util.List;

import com.wu.model.Student;

public interface StudentService {
	
	/**
	 * 添加学生
	 * 
	 */
	public boolean addStudent(Student stu);
	
	/**
	 * 删除学生
	 * 
	 */
	public boolean deleteStudent(String sno);
	
	/**
	 * 修改学生信息
	 * 
	 */
	public boolean updateStudent(Student stu);
	
	/**
	 * 查询学生信息(学号)
	 * 
	 */
	public Student queryStudentById(String sno);
	
	/**
	 * 查询学生信息(名称)
	 * 
	 */
	public List<Student> queryStudentByName(String sname);
	
	/**
	 * 查询学生信息(专业)
	 * 
	 */
	public List<Student> queryStudentByMajor(String majorname);
	
	/**
	 * 查询学生信息(学院)
	 * 
	 */
	public List<Student> queryStudentByDept(String deptname);
	
	/**
	 * 查询全体学生信息
	 * 
	 */
	public List<Student> queryStudent();
	
	/**
	 * 修改密码
	 * 
	 */
	public boolean updatePassword(String pwd, String sno);


}

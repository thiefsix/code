package com.wu.service;

import java.util.List;

import com.wu.model.Student;

public interface StudentService {
	
	/**
	 * ���ѧ��
	 * 
	 */
	public boolean addStudent(Student stu);
	
	/**
	 * ɾ��ѧ��
	 * 
	 */
	public boolean deleteStudent(String sno);
	
	/**
	 * �޸�ѧ����Ϣ
	 * 
	 */
	public boolean updateStudent(Student stu);
	
	/**
	 * ��ѯѧ����Ϣ(ѧ��)
	 * 
	 */
	public Student queryStudentById(String sno);
	
	/**
	 * ��ѯѧ����Ϣ(����)
	 * 
	 */
	public List<Student> queryStudentByName(String sname);
	
	/**
	 * ��ѯѧ����Ϣ(רҵ)
	 * 
	 */
	public List<Student> queryStudentByMajor(String majorname);
	
	/**
	 * ��ѯѧ����Ϣ(ѧԺ)
	 * 
	 */
	public List<Student> queryStudentByDept(String deptname);
	
	/**
	 * ��ѯȫ��ѧ����Ϣ
	 * 
	 */
	public List<Student> queryStudent();
	
	/**
	 * �޸�����
	 * 
	 */
	public boolean updatePassword(String pwd, String sno);


}

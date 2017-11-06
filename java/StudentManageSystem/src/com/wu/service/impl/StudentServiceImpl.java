package com.wu.service.impl;

import java.util.List;

import com.wu.dao.StudentDao;
import com.wu.dao.impl.StudentDaoImpl;
import com.wu.model.Student;
import com.wu.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao stuDao = new StudentDaoImpl();
	@Override
	public boolean addStudent(Student stu) {
		
		return stuDao.addStudent(stu);
	}

	@Override
	public boolean deleteStudent(String sno) {
		
		return stuDao.deleteStudent(sno);
	}

	@Override
	public boolean updateStudent(Student stu) {
		
		return stuDao.updateStudent(stu);
	}

	@Override
	public Student queryStudentById(String sno) {
		
		return stuDao.queryStudentById(sno);
	}

	@Override
	public List<Student> queryStudentByName(String sname) {
		
		return stuDao.queryStudentByName(sname);
	}

	@Override
	public List<Student> queryStudentByMajor(String majorname) {
		
		return stuDao.queryStudentByMajor(majorname);
	}

	@Override
	public List<Student> queryStudentByDept(String deptname) {
		
		return stuDao.queryStudentByDept(deptname);
	}

	@Override
	public List<Student> queryStudent() {
		
		return stuDao.queryStudent();
	}

	@Override
	public boolean updatePassword(String pwd, String sno) {
		
		return stuDao.updatePassword(pwd, sno);
		
	}

}

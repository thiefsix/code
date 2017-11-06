package com.wu.service.impl;

import java.util.List;

import com.wu.dao.TeacherDao;
import com.wu.dao.impl.TeacherDaoImpl;
import com.wu.model.Teacher;
import com.wu.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	
	private TeacherDao teaDao =new TeacherDaoImpl();

	@Override
	public boolean addTeacher(Teacher tea) {
		
		return teaDao.addTeacher(tea);
		
	}

	@Override
	public boolean deleteTeacher(String tno) {
		
		return teaDao.deleteTeacher(tno);
	}

	@Override
	public boolean updateTeacher(String name, String deptname, String sex, String titleno, String titlename, String tno) {
		
		return teaDao.updateTeacher(name, deptname, sex, titleno, titlename, tno);
		
	}

	@Override
	public List<Teacher> queryTeacherByName(String tname) {
		
		return teaDao.queryTeacherByName(tname);
		
	}

	@Override
	public Teacher queryTeacherById(String tId) {
		
		return teaDao.queryTeacherById(tId);
		
	}

	@Override
	public List<Teacher> queryTeacherByDept(String deptname) {
		
		return teaDao.queryTeacherByDept(deptname);
		
	}

	@Override
	public List<Teacher> queryTeacher() {
		
		return teaDao.queryTeacher();
	}

	@Override
	public List<Teacher> queryTeacherByTitle(String titlename) {
		
		return teaDao.queryTeacherByTitle(titlename);
		
	}

	@Override
	public boolean updatePassword(String pwd, String tno) {
		
		return teaDao.updatePassword(pwd, tno);
	}

}

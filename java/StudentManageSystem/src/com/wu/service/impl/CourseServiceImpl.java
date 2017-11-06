package com.wu.service.impl;

import java.util.List;

import com.wu.dao.CourseDao;
import com.wu.dao.impl.CourseDaoImpl;
import com.wu.model.Course;
import com.wu.model.PageBean;
import com.wu.service.CourseService;

public class CourseServiceImpl implements CourseService {
	
	private CourseDao couDao = new CourseDaoImpl();

	@Override
	public boolean addCourse(Course cou) {
		
		return couDao.addCourse(cou);
	}

	@Override
	public boolean deleteCourse(String id) {
		
		return couDao.deleteCourse(id);
	}

	@Override
	public boolean updateCourse(Course cou) {
		
		return couDao.updateCourse(cou);
	}

	@Override
	public Course queryCourseByname(String Cname) {
		return couDao.queryCourseByName(Cname);
	}

	@Override
	public List queryAllCourse() {
		return couDao.queryAllCourse();
	}

	@Override
	public List<Course> queryCourseByDept(String deptname) {
		return couDao.queryCourseByDept(deptname);
	}

	@Override
	public List<Course> queryPageCourse(int pageNow, int pageSize) {
		return couDao.queryPageCourse(pageNow, pageSize);
		
	}

	@Override
	public int queryRecordCount() {
		return couDao.queryRecordCount();
		
	}

	@Override
	public Course queryCourseById(String cno) {
		// TODO Auto-generated method stub
		return couDao.queryCourseById(cno);
		
	}

	@Override
	public PageBean findByPage(int pageNum, int currentPage) {
		// TODO Auto-generated method stub
		PageBean pb = new PageBean();
		
		List<Course> co = couDao.queryPageCourse(pageNum, currentPage);
		
		int totalCount = couDao.queryRecordCount();
		
		int totalPage = (int) Math.ceil(totalCount*1.0/currentPage);
		pb.setTotalCount(totalCount);
		pb.setTotalPage(totalPage);
		pb.setCourse(co);
		pb.setCurrentPage(currentPage);
		pb.setPageNum(pageNum);
		
		return pb;
	}

	@Override
	public PageBean findByTypePage(int pageNum, int currentPage, String type) {
PageBean pb = new PageBean();
		
		List<Course> co = couDao.queryPageCourse(pageNum, currentPage, type);
		
		int totalCount = couDao.queryRecordCount();
		
		int totalPage = (int) Math.ceil(totalCount*1.0/currentPage);
		pb.setTotalCount(totalCount);
		pb.setTotalPage(totalPage);
		pb.setCourse(co);
		pb.setCurrentPage(currentPage);
		pb.setPageNum(pageNum);
		
		return pb;
	}

}

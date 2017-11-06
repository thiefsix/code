package com.wu.model;

import java.util.ArrayList;
import java.util.List;


public class PageDivide {
	
	private List arrayList;//存放总数据 
	// 分页信息定义 
	private int totalRows = 0; // 总数据数 
	private int pageRecorders = 20;// 每页显示记录数 
	private int totalPages = 0; // 总页数 
	private int pageStartRow = 0;// 每页的起始数 
	private int pageEndRow = 0; // 每页显示数据的终止数 
	private int currentPage = 1;// 当前页 
	private boolean hasNextPage = false; // 是否有下一页 
	private boolean hasPreviousPage = false; // 是否有前一页 
	public int getCurrentPage() { 
	return currentPage; 
	} 
	public void setCurrentPage(int currentPage) { 
	this.currentPage = currentPage; 
	} 
	public boolean isHasNextPage() { 
	return hasNextPage; 
	} 
	public void setHasNextPage(boolean hasNextPage) { 
	this.hasNextPage = hasNextPage; 
	} 
	public boolean isHasPreviousPage() { 
	return hasPreviousPage; 
	} 
	public void setHasPreviousPage(boolean hasPreviousPage) { 
	this.hasPreviousPage = hasPreviousPage; 
	} 
	public int getPageEndRow() { 
	return pageEndRow; 
	} 
	public void setPageEndRow(int pageEndRow) { 
	this.pageEndRow = pageEndRow; 
	} 
	public int getPageRecorders() { 
	return pageRecorders; 
	} 
	public void setPageRecorders(int pageRecorders) { 
	this.pageRecorders = pageRecorders; 
	} 
	public int getPageStartRow() { 
	return pageStartRow; 
	} 
	public void setPageStartRow(int pageStartRow) { 
	this.pageStartRow = pageStartRow; 
	} 
	public int getTotalPages() { 
	return totalPages; 
	} 
	public void setTotalPages(int totalPages) { 
	this.totalPages = totalPages; 
	} 
	public int getTotalRows() { 
	return totalRows; 
	} 
	public void setTotalRows(int totalRows) { 
	this.totalRows = totalRows; 
	} 

	public PageDivide(List arrayList, int pageRecorders) { 
	this.arrayList = arrayList; 
	this.pageRecorders = pageRecorders; 
	totalRows = arrayList.size();// 获得总数据数 
	// 获得总页数 
	if ((totalRows % pageRecorders) == 0) { 
	totalPages = totalRows / pageRecorders; 
	} else { 
	totalPages = totalRows / pageRecorders + 1; 
	} 
	totalPages = (totalPages == 0) ? 1 : totalPages; 
	// 设置第一页开始位置和结束位置 
	if (totalRows < pageRecorders) { 
	this.pageStartRow = 0; 
	this.pageEndRow = totalRows; 
	} else { 
	this.pageStartRow = 0; 
	this.pageEndRow = pageRecorders; 
	} 
	// 是否有下一页 
	if (currentPage >= totalPages) { 
	hasNextPage = false; 
	} else { 
	hasNextPage = true; 
	} 
	} 
	// 转到页面 
	public List getPageList(int currentPage) { 
	//当前页小于1 
	if (currentPage <= 0) { 
	currentPage = 1; 
	} 
	//当前页大于总页数 
	if (currentPage >= totalPages) { 
	currentPage = totalPages; 
	hasNextPage = false; 
	} else { 
	hasNextPage = true; 
	} 
	//当前页大于1 
	if (currentPage > 1) { 
	hasPreviousPage = true; 
	} else { 
	hasPreviousPage = false; 
	} 
	//判断是否为最后一页 
	if (currentPage * pageRecorders < totalRows) { 
	pageEndRow = currentPage * pageRecorders; 
	pageStartRow = pageEndRow - pageRecorders; 
	} else { 
	pageEndRow = totalRows; 
	pageStartRow = pageRecorders * (totalPages - 1); 
	} 
	List<Object> pagelist = new ArrayList<Object>(); 
	for (int i = pageStartRow; i < pageEndRow; i++) { 
	pagelist.add(arrayList.get(i)); 
	} 
	return pagelist; 
	} 
	} 



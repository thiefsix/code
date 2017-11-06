package com.wu.model;

import java.util.ArrayList;
import java.util.List;


public class PageDivide {
	
	private List arrayList;//��������� 
	// ��ҳ��Ϣ���� 
	private int totalRows = 0; // �������� 
	private int pageRecorders = 20;// ÿҳ��ʾ��¼�� 
	private int totalPages = 0; // ��ҳ�� 
	private int pageStartRow = 0;// ÿҳ����ʼ�� 
	private int pageEndRow = 0; // ÿҳ��ʾ���ݵ���ֹ�� 
	private int currentPage = 1;// ��ǰҳ 
	private boolean hasNextPage = false; // �Ƿ�����һҳ 
	private boolean hasPreviousPage = false; // �Ƿ���ǰһҳ 
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
	totalRows = arrayList.size();// ����������� 
	// �����ҳ�� 
	if ((totalRows % pageRecorders) == 0) { 
	totalPages = totalRows / pageRecorders; 
	} else { 
	totalPages = totalRows / pageRecorders + 1; 
	} 
	totalPages = (totalPages == 0) ? 1 : totalPages; 
	// ���õ�һҳ��ʼλ�úͽ���λ�� 
	if (totalRows < pageRecorders) { 
	this.pageStartRow = 0; 
	this.pageEndRow = totalRows; 
	} else { 
	this.pageStartRow = 0; 
	this.pageEndRow = pageRecorders; 
	} 
	// �Ƿ�����һҳ 
	if (currentPage >= totalPages) { 
	hasNextPage = false; 
	} else { 
	hasNextPage = true; 
	} 
	} 
	// ת��ҳ�� 
	public List getPageList(int currentPage) { 
	//��ǰҳС��1 
	if (currentPage <= 0) { 
	currentPage = 1; 
	} 
	//��ǰҳ������ҳ�� 
	if (currentPage >= totalPages) { 
	currentPage = totalPages; 
	hasNextPage = false; 
	} else { 
	hasNextPage = true; 
	} 
	//��ǰҳ����1 
	if (currentPage > 1) { 
	hasPreviousPage = true; 
	} else { 
	hasPreviousPage = false; 
	} 
	//�ж��Ƿ�Ϊ���һҳ 
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



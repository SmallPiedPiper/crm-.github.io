package cn.zyd.utils;

import java.util.List;
//关于分页对象的书写
public class Page <T>{

	//分页对象的是实现
	//总共有多少页
	private int total;
	//每一页有多少条数据
	private int size;
	//当前页具体是第几页
	private int page;
	//当前页具体要存储的每一行的具体数据
	private List<T> rows;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "Page [total=" + total + ", size=" + size + ", page=" + page
				+ ", rows=" + rows + "]";
	} 
	
	
}

package com.diaryprj.web.entity;

import java.sql.Date;

public class Anounce {
	int adminNum;
	String context;
	Date start;
	Date end;
	Date write;
	
	//공지사항을 만들때 사용하는 호출
	public Anounce(int adminNum, String context, Date start, Date end) {
		this.adminNum = adminNum;
		this.context = context;
		this.start = start;
		this.end = end;
	}
	
	//공지사항을 출력할때 사용하는 호출
	public Anounce(String context, Date write) {
		this.context = context;
		this.write = write;
	}
	
	public int getAdminNum() {
		return adminNum;
	}
	public void setAdminNum(int adminNum) {
		this.adminNum = adminNum;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Date getWrite() {
		return write;
	}
	
}

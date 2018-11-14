package com.biz.method.classes.vo;

public class MemberVO {

	public String strId;
	public String strName;
	
	private String strTel;
	private String strAddr;
	private int intAge;
	
	
	public String getStrId() {
		return strId;
	}
	public void setStrId(String strId) {
		this.strId = strId;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public int getIntAge() {
		return intAge;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
		
	}
	public void setIntAge(int intAge) {
		if(intAge< 1) {
			System.out.println("나이는 0세보다 많아야 합니다");
			return;
		}
		if(intAge > 100) {
			System.out.println("나이는 100세보다 적어야 합니다");
			return;
		}
		this.intAge = intAge;
		
	}
}

package com.biz.method.classes.dao;

import com.biz.method.classes.vo.DogVO;

public class DogDAO {

	public DogVO dogVO;
	
	public DogDAO() {
		dogVO = new DogVO();
	}
	
	public void dogRun() {
		String strName = this.dogVO.getStrName();
		System.out.println(strName);
	}
	public void dogRun(String strField) {
		String strName = this.dogVO.getStrName();
		strName += "가  " + strField;
		strName += "를 달립니다";
		System.out.println(strName);
	}
	
	public void goEat() {
		String strName = this.dogVO.getStrName();
		System.out.println(strName);
	}
	public void goEat(String strFood) {
		String strName = this.dogVO.getStrName();
		strName += "가 " + strFood;
		strName += "를 맛있게 먹습니다";
		
		System.out.println(strName);
	}
}

package com.biz.method.classes;

public class Class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = "홍킬동";
		
		
		System.out.println(strName);
		
		String strNation = new String();
		strNation = "대한민국";
		int l = strNation.length();//strnation에담겨잇는 문자열의 길이를 추출해서 'l'에 담아라 
		System.out.println(l); //값은 4
	
		int intNum  = 1;
		float f = (float)intNum; //c언어방식
		
		Integer intNum1 = 45;
		System.out.println(intNum1.floatValue()); //자바방식
		new Integer(0);
		
		
		
		
		
		
		Float floatNum1 = new Float(0f);
		
	}

}

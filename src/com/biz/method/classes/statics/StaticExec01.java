package com.biz.method.classes.statics;

public class StaticExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Nations.KOREA);
		System.out.println(Nations.USA);
		System.out.println(Nations.UAE);
		System.out.println(Nations.CHINA);
	
		String strNum = "30";
		int intNum = Integer.valueOf(strNum); // 30을 숫자로 바꾸는 것.
		//static은 필요한 부분만 최소화로 만들어줘야함. 너무 많으면 느려짐.
		//값들이 누워있으면 내부에 어떤게 static으로 이루어져있는것임.
		
		String strName = "대한민국";
        if(strName.equals("대한민국")) {
        	
        }
        if(strName.equals(Nations.KOREA)) {
        	
     
        }
        //Nations.KOREA변수는 final이어서 값을 변경 할 수 없다.
   //     Nations.KOREA ="우리나라";
        if(strName.equals(Nations.KOREA)) {
	}
	}

}

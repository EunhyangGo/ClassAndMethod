package com.biz.method;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 100;
		addVar();
		addVar(intNum1);
		System.out.println("10번라인: " +intNum1);
		//변수 *값 : 변수를 변화시키지 않는다.
		System.out.println("12번라인:" + (intNum1 *20));
		System.out.println("13번라인:" + intNum1);
		// 변수 *= 값: 변수를 변화 시킨다.
		System.out.println("15번라인:" + (intNum1 *=20));
		System.out.println("16번라인:" + intNum1);
		
	}

	public static void addVar() {
		int intNum1 = 200;
		
	}
	public static void addVar(int intNum1) {
		intNum1 = 300;
	}
}


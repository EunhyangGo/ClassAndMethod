package com.biz.method.classes;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ScoreVO라는 클래스를 사용해서 scoreVO라는 객체 인스턴스를 선언하라
		// 그리고 객체를 초기화 하라.
		ScoreVO scoreVO = new ScoreVO();
		//                    철글자가 대문자인 method = '생성자'라고 부른다.
		//                클래스를 이용해 선언된 객체를 초기화하는 용도로 쓰인다.ㅔ
		ScoreVO scoreVO01 = new ScoreVO();
		
		int intNum;
		intNum = 10 ;
		System.out.println(intNum);
		
		ScoreVO sVO = new ScoreVO();
		sVO = new ScoreVO();
		sVO.strName = "홍길동" ;
		sVO.strName = "이몽룡" ;
		
		sVO = new ScoreVO();
		
		
	}

}

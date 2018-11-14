package com.biz.method.classes.wrapper;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNation = "Republic of Korea";
		String strLower = strNation.toLowerCase();
		String strUpper = strNation.toUpperCase();
		
		String strWord = strNation.substring(0,7); //뒤에서 앞에 숫자를 뺀 값을... 7-0 = 7
		System.out.println(strWord);
		
		String strKorea = strNation.substring(12,13); //13-12 =1 ,12번째부터 1개의 숫자를 뽑아내라..
		System.out.println(strKorea);
		
		String str0f = strNation.substring(9,11); //9번부터 두글자를 추출하라..
				
		System.out.println(strNation.split(" "));
		
		String strNum1 = "30";
		String strNum2 = "40";
		System.out.println(strNum1 + strNum2);
		//어떤 데이터는 숫자이면서 문자화되있는 경우가 있음
		//String은 문자열을 나타내는 변수이니카 답은3040. 70아님
		
				
	}

}

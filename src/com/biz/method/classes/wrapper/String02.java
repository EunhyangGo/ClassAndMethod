package com.biz.method.classes.wrapper;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNation = "Republic of Korea";
		String strLower = strNation.toLowerCase();
		String strUpper = strNation.toUpperCase();
		
		String strWord = strNation.substring(0,7); //�ڿ��� �տ� ���ڸ� �� ����... 7-0 = 7
		System.out.println(strWord);
		
		String strKorea = strNation.substring(12,13); //13-12 =1 ,12��°���� 1���� ���ڸ� �̾Ƴ���..
		System.out.println(strKorea);
		
		String str0f = strNation.substring(9,11); //9������ �α��ڸ� �����϶�..
				
		System.out.println(strNation.split(" "));
		
		String strNum1 = "30";
		String strNum2 = "40";
		System.out.println(strNum1 + strNum2);
		//� �����ʹ� �����̸鼭 ����ȭ���ִ� ��찡 ����
		//String�� ���ڿ��� ��Ÿ���� �����̴�ī ����3040. 70�ƴ�
		
				
	}

}

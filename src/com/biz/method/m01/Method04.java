package com.biz.method.m01;

public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i <5; i++) {
			double dRND = Math.random();
			double dRnd1 = dRND + 100; //0���� 99���� ���ڸ� ������ ����
			dRND = dRND * 50; // 0���� 49.xx����
			dRND = dRND * 30; // 0���� 29.xx����
			int intRND = (int)dRND ; //0���� 29����
			intRND += 1; // 1���� 30����
			intRND +=20; // 21���� 50����

			int intStars = (int)(dRND*(10-5+1))+5; //5���� 10����
			
			intStars = (int)(dRND * (100-50+1)) +50;
			//50���� 100���� ���� ������
			System.out.println(intStars);
		} 

	}

}

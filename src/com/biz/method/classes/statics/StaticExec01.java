package com.biz.method.classes.statics;

public class StaticExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Nations.KOREA);
		System.out.println(Nations.USA);
		System.out.println(Nations.UAE);
		System.out.println(Nations.CHINA);
	
		String strNum = "30";
		int intNum = Integer.valueOf(strNum); // 30�� ���ڷ� �ٲٴ� ��.
		//static�� �ʿ��� �κи� �ּ�ȭ�� ����������. �ʹ� ������ ������.
		//������ ���������� ���ο� ��� static���� �̷�����ִ°���.
		
		String strName = "���ѹα�";
        if(strName.equals("���ѹα�")) {
        	
        }
        if(strName.equals(Nations.KOREA)) {
        	
     
        }
        //Nations.KOREA������ final�̾ ���� ���� �� �� ����.
   //     Nations.KOREA ="�츮����";
        if(strName.equals(Nations.KOREA)) {
	}
	}

}

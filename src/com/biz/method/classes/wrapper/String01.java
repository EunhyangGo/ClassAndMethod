package com.biz.method.classes.wrapper;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String��(type)�� �Ϲ� ����ó�� ����� ������ �����δ� ������ �ƴϰ� class�̴�.
		 * �ٸ�(C���)�� ���� ���ڿ� �����͸� ����ϱ� ���� �ڷ���
		 */
		String strName = "ȫ�浿";
		String strN = "";
		
		System.out.println(strN);
		
		String strNation = new String();
		System.out.println(strNation);
		
		String strDog = new String("��");
		// => String strDog = "��"�̶�� �ϴ°Ͱ� ����.
		
		strNation = "���ѹα�";
		strName = "Tom Cruise";
		System.out.println("���ڿ��� ����: " +strNation.length());
		System.out.println(strName.toLowerCase());
		System.out.println(strName.toUpperCase());
		
		if(strName.toUpperCase() == "TOM CRUISE") {
			System.out.println("Žũ���� �³�!!");
			
		}
		if(strName.toLowerCase() == "tom cruise") {
			System.out.println("Žũ���� �³�!!");
		}
		
		if(strName == "Tom Cruise") {
			System.out.println("Žũ���� �³�!!");
		}
		if(strName.equals("Tom Cruise")) {
			System.out.println("��¥ Ž�̳�!!");
			
		}
		if(strName.toUpperCase().equals("TOM CRUSISE")) {
			System.out.println("�빮�� TOM");
		}
		if(strName.toLowerCase().equals("tom cruise")) {
			System.out.println("�ҹ��� TOM");
		}
		
		if(strName.equalsIgnoreCase("toM CruIse")) {
			System.out.println("��� tom");
		}
		String strA = "A";
		if(strA == "A") {
			System.out.println("�빮�� A��!");
		}
	}

}

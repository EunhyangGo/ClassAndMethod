package com.biz.method.classes.oop01;

public class BookDAO {
	
	BookVO vo ;
	
	//������ �޼���method
	public BookDAO() {
		this.vo = new BookVO();
		
		
	}
	public void viewBook() {
		System.out.println("================");
		System.out.println("å����");
		System.out.println("----------------");
		System.out.println("å�̸�:" + vo.strName);
		System.out.println("����:" + vo.strAuth);
		System.out.println("���ǻ�:" + vo.strComp);
		System.out.println("����:" + vo.intPrice);
		System.out.println("����:" +vo.intDC);
	}
	//å�� �����Ҷ� ����� �����ϴ� �޼��带 ������ ��
	public void priceCacl(int intCount) {
		int intSum =( vo.intPrice - vo.intDC)*intCount;
		
		System.out.println("===================");
		System.out.println("�����ѵ���:" + vo.strName);
		System.out.println("���űǼ�: " + intCount);
		System.out.println("�հ�: " + intSum);
		System.out.println("===================");
		
		
	}

}

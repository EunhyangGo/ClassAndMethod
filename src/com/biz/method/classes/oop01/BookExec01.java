package com.biz.method.classes.oop01;

public class BookExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		//��ü �ν��Ͻ� Ȥ�� ��ü, ������Ʈ(BookVO)
		//BookVO Ŭ������ �̿��ؼ� book ��ü �ν��Ͻ��� ���� (���� �� �ʱ�ȭ)
		BookVO book = new BookVO();
		
		//book ��ü(�ν��Ͻ�)�� �� �Ӽ�(����)�� ��(Data)���� ����(����)�Ѵ�.
		book.strName = "�����ڹ�";
		book.strAuth = "������";
		book.strComp = "������ �̵��";
		book.intPrice = 30000;
		book.intDC = 3000;
		
		//���� ������ book ��ü�� �Ӽ����� �ֿܼ� ���̱� ���� method�� ȣ��
		viewBook(book);
		
 	}
	
	public static void viewBook(BookVO vo) {
	
		System.out.println("================");
		System.out.println("å����");
		System.out.println("----------------");
		System.out.println("å�̸�:" + vo.strName);
		System.out.println("����:" + vo.strAuth);
		System.out.println("���ǻ�:" + vo.strComp);
		System.out.println("����:" + vo.intPrice);
		System.out.println("����:" +vo.intDC);
		
	}

	public static void viewBook(String strName, String strAuth, 
			String strComp, int intPrice, int intDC) {
		System.out.println("================");
		System.out.println("å����");
		System.out.println("----------------");
		System.out.println("å�̸�:" + strName);
		System.out.println("����:" + strAuth);
		System.out.println("���ǻ�:" + strComp);
		System.out.println("����:" + intPrice);
		System.out.println("����:" + intDC);
	}
}

package com.biz.method.classes.oop01;

public class BookExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookVO book1 = new BookVO();
		book1.strName = "�����ڹ�";
		book1.strAuth = "������";
		book1.strComp = "������ �̵��";
        book1.intPrice = 30000;
        book1.intDC = 3000;
        
        BookDAO dao = new BookDAO();
        dao.vo = book1;
        dao.viewBook();
        
        BookDAO dao1 = new BookDAO();
        dao1.vo.strName = "�ڹپ� ����";
        dao1.vo.intPrice = 34000;
        dao1.vo.intDC = 3400;
        dao1.viewBook();

        BookDAO dao2 = new BookDAO();
        dao2.vo.strName = "�����ͺ��̽�";
        dao2.vo.intPrice = 45000;
        dao2.vo.intDC = 4500;
        dao2.viewBook();
        
        dao1.priceCacl(20);
        dao1.priceCacl(10);
        dao1.priceCacl(60);
        dao1.priceCacl(10);
        dao1.priceCacl(30);
	}

}

package com.biz.method.classes.dao;

import com.biz.method.classes.vo.MemberVO;

public class MemberDAO {
	
	public MemberVO memberVO; 
	/*
	 * DAO Ŭ������ ������
	 * �����ڴ� �ٸ� Ŭ�������� �� Ŭ������ �ν��Ͻ��� �����Ҷ� ���ʷ� ȣ��Ǵ� method
	 * 
	 * ��) MemberDAO dao = new MemberDAO()
	 * 
	 */

	public MemberDAO() {
		this.memberVO = new MemberVO() ;
		
		this.memberVO.strId = "000";
		this.memberVO.strName = "�̸��� �̷��ϼ���";
		this.memberVO.setStrTel("��ȭ��ȣ�� �̷��ϼ���.");
		this.memberVO.setStrAddr ("�ּҸ� �̷��ϼ���");
		this.memberVO.setIntAge(0);

		}
	
	public MemberDAO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	public void viewMember() {
		System.out.println("===========");
		System.out.println("ȸ������");
		System.out.println("-----------");
		System.out.println("ȸ���̸�: " + memberVO.strName);
		System.out.println("��ȭ��ȣ :" + memberVO.getStrTel());
		System.out.println("�ּ�: " + memberVO.getStrTel());
		System.out.println("����: " + memberVO.getIntAge());
		System.out.println("===========");
		
}
}

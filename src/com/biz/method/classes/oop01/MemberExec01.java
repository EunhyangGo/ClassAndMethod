package com.biz.method.classes.oop01;

import com.biz.method.classes.vo.MemberVO;
//�ٸ� Ŭ������ �ִ� memverVO�� ���ڴٴ� ��.
/*
 * ���� ���� �ִ� ���� classes.oop01��Ű���ε�
 * classes.vo ��Ű���� �ִ� memberVO Ŭ������ ����ϰ� �ʹ�. ��� ����
 * Crtl + shift + O : �ڵ� import
 */

public class MemberExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberVO member = new MemberVO();
		member.strId = "001";
		member.strName = "ȫ�浿";
        member.setStrTel("001-001-001");
        member.setIntAge(300);
        		
	}

}

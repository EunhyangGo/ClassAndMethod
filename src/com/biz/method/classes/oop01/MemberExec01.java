package com.biz.method.classes.oop01;

import com.biz.method.classes.vo.MemberVO;
//다른 클래스에 있는 memverVO를 쓰겠다는 말.
/*
 * 지금 내가 있는 곳은 classes.oop01패키지인데
 * classes.vo 패키지에 있는 memberVO 클래스를 사용하고 싶다. 라는 선언
 * Crtl + shift + O : 자동 import
 */

public class MemberExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberVO member = new MemberVO();
		member.strId = "001";
		member.strName = "홍길동";
        member.setStrTel("001-001-001");
        member.setIntAge(300);
        		
	}

}

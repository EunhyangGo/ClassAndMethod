package com.biz.method.classes.oop01;

import com.biz.method.classes.dao.MemberDAO;
import com.biz.method.classes.vo.MemberVO;

public class MemberExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO vo = new MemberVO();
		vo.setStrId("001");
		vo.setStrName("ÀÌ¸ù·æ");
		vo.setStrTel("010-123-1234");
		vo.setIntAge(16);
		
		MemberDAO dao = new MemberDAO(vo);
		dao.viewMember();
	}

}

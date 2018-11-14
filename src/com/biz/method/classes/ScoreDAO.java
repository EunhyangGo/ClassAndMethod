package com.biz.method.classes;

public class ScoreDAO {

	ScoreVO scoreVO;
	
	// 생성자 method, 반드시 클래스 이름과 같다. 앞에 public이 붙어야한다.
	public ScoreDAO() {
		this.scoreVO = new ScoreVO();
		
	}
	
	public int makeSum() {
		int intSum = scoreVO.intKor;
		intSum += scoreVO.intEng;
		intSum += scoreVO.intMath;
		intSum += scoreVO.intSci ;
		intSum += scoreVO.intHis;
		
		return intSum;
	}
}


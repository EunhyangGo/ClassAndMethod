package com.biz.method.classes;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum ;// =0; Ŭ�����Ҷ� ���̴°�
		String strNation; // = ""; Ŭ�����Ҷ�
		
		ScoreVO scoreVO; //Ŭ�����̸��ε� ����ó�� �����Ѱ�
		scoreVO = new ScoreVO();
		scoreVO.strName = "ȫ�浿";
		scoreVO.intKor = 90;
		scoreVO.intEng = 88;
		scoreVO.intMath = 77;
		scoreVO.intSci = 98;
		scoreVO.intHis = 88;
		
		makeSum(scoreVO);
		/*
		 * ���� ���� ScoreVO��� keyword�� �̿��ؼ� sVO��� ������ �����ϰ�
		 * ����ϱ� ���ؼ� clear(�ʱ�ȭ)�϶�.
		 */
		
		ScoreVO sVO = new ScoreVO();//ScoreVO Ű���带 �̿��ؼ� sVO������ ����� Ŭ���� ���Ѷ�
		sVO.strName = "�̸���";
		sVO.intKor = 90 ;
	
		scoreVO.strName = "ȫ�浿";
		scoreVO.intKor = 90;
		scoreVO.intEng = 88;
		scoreVO.intMath = 77;
		scoreVO.intSci = 98;
		scoreVO.intHis = 88;
		
		makeSum(scoreVO);
		
	}
	
	public static void makeSum(ScoreVO scoreVO) {
		
		System.out.println("�л��̸�: " + scoreVO.strName);
		System.out.println("��������: " + scoreVO.intKor);
		System.out.println("��������:  " + scoreVO.intEng);
		System.out.println("�������� : " + scoreVO.intMath);
		System.out.println("�������� : " + scoreVO.intSci);
	}

}

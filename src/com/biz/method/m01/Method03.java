package com.biz.method.m01;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���Ǽ��ڸ� �������� �����ϴ� ��ɹ����ִ�.
		
		Math.random();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		System.out.println("0���� 99���� ���� �����");
		for(int i = 0; i < 10; i++) {
			int intNum =(int)(Math.random()*100);
			System.out.println(intNum);
		}
			
		for(int i = 0; i < 10; i++) {
			int intNum =(int)(Math.random()*10);
			System.out.println("0���� 9���� ���� ����� " + intNum);
		}
		System.out.println("1���� 100���� ���� �����");
		for(int i = 0; i < 10; i++) {
			int intNum =(int)(Math.random()*100+1);
			System.out.println(intNum);
	}
	System.out.println("10���� 109���� ���� �����");
	for(int i = 0; i < 10; i++) {
		int intNum =(int)(Math.random()*100+10);
		System.out.println(intNum);
	}
	}
		public static void makeStars(int intStars) {
			//int intStars = 5;
			for(int i = 0; i < intStars ; i++) {
				for(int j = 0; j < intStars; j++) {
					System.out.print("* ");
				}
				System.out.println();
			
			}
			System.out.println("500���� 100���� ���� �����");
			for(int i = 0; i < 10; i++) {
		
				int intNum =(int)(Math.random()*100*50);
				System.out.println(intNum);
		}
	}
}
/*}

		System.out.println("50���� 100���� ���� �����");
		for(int i = 0; i < 10; i++) {
		int intNum =(int)((Math.random()*((100*50+1) + 50)));
		System.out.println(intNum);
		}
		int intStart = 50;
		int intEnd = 100;
		
		//5���� 10������ �����߻�
		int ran = (int)Math.random()
				*(intEnd - intStart + 1) + intStart;
		makeStars(intStars);
		int intStars = (int)Math.random() * (10-5+1) + 
}
}*/

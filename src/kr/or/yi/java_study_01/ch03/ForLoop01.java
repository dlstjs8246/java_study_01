package kr.or.yi.java_study_01.ch03;

public class ForLoop01 {
	public static void main(String[] args) {
		//hardcording();	
        //forLoop();
		//gugudan();
		oneToTenEven();
		oneToTenOdd();
		
	}

	private static void oneToTenOdd() {
		System.out.print("1~10������ Ȧ�� : ");
		for(int i=1;i<11;i=i+2) {
			System.out.printf("%d ",i);
		}
		System.out.println("");
	}

	private static void oneToTenEven() {
		System.out.print("1~10������ ¦�� : ");
		for(int i=2;i<11;i=i+2) {
			System.out.printf("%d ",i);//i++ ��� �����Ŀ� ���� ���������� ������ ����!(2�� ����,3�� ���� �����ŭ ������ ����)
		}
		System.out.println("");
	}

	private static void gugudan() {
		for(int j=1;j<10;j++) {
			for(int i=2;i<10;i++) {
				System.out.printf("%d * %d = %2d ",i,j,i*j);
			}
			System.out.println("");
		}
	}

	private static void forLoop() {
		System.out.println("forloop");
		for(int i=0;i<10;i++) {
			System.out.println("Hello Java " + i);
		}
		System.out.println("done");
	}

	private static void hardcording() {
		System.out.println("Hard Cording");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
	}
}

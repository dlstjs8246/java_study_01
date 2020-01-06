package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȣ�� �Է��ϼ��� 1.for�� 2.while 3.���� >>");
		int res = sc.nextInt();
		while(res<3) {
			if (res==1) {
				System.out.println("for");
				ex_for(sc);
			}else {
				System.out.println("while");
				ex_while(sc);
			}
			System.out.print("��ȣ�� �Է��ϼ��� 1.for�� 2.while 3.���� >>");
			res = sc.nextInt();
		}
		System.out.println("���α׷� ����.");
		
		sc.close();
	}

	private static void ex_while(Scanner sc) {
		int res = 1;
		System.out.print("��ȣ�� �Է��ϼ��� 1. gugudan 2. factorial 3.fibonacci 4.���� >>");
		res = sc.nextInt();
		switch(res) {
		case 1: gugudan_while(); break;
		case 2: factorial_while(sc); break;
		case 3: fibonacci_while(sc); break;
		default : 
			break;
		}
		//while���� switch���� �̿��Ͽ� 1. gugudan 2. factorial 3.fibonacci 4.���� ����
	}

	private static void fibonacci_while(Scanner sc) {
		System.out.printf("���ϰ��� �ϴ� �Ǻ���ġ ������ �Է��ϼ��� ");
		int pibo = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		int cnt = 1;
		int isZero = 0;
		System.out.printf("�Ǻ���ġ ���� %d��°�� ���� ",pibo);
		if(isZero == 0) {
			System.out.printf("%d%s",a,cnt!=pibo?",":"");
			isZero++;
		}
		while(cnt<pibo) {
				sum = a + b;
				a = b;
				b = sum;
				System.out.printf("%d%s",a,cnt!=(pibo-1)?",":"");
				cnt++;
		}
		System.out.printf("�߿��� %d�Դϴ�.%n",a);		
	}

	private static void factorial_while(Scanner sc) {
		
		System.out.printf("���ϰ��� �ϴ� ���丮�� ���� �Է��ϼ��� ");
		int fac = sc.nextInt();
		int cnt = 0;
		int res = 1;
		System.out.printf("%d!",fac);
		while(cnt<fac) {
			System.out.printf(" %d %s ",(cnt+1),cnt!=(fac-1)?"*":"=");
			res =  res * (cnt+1);
			cnt++;
		}
		System.out.printf("%d�Դϴ�.%n",res);
	}

	private static void gugudan_while() {
		int dan = 2;
		int cnt = 1;
		while(cnt<10) {
			while(dan<10) {
				System.out.printf("%d * %d = %2d ",dan,cnt,dan*cnt);
				dan++;
			}
			System.out.println();
			dan = 2;
			cnt++;
		}
		
	}

	private static void ex_for(Scanner sc) {
		int res=1;
		for(int i=0;res!=4;i++) {
			System.out.print("��ȣ�� �Է��ϼ��� 1. gugudan 2. factorial 3.fibonacci 4.���� >>");
			res = sc.nextInt();
			switch(res) {
			case 1: gugudan_for(); break;
			case 2: factorial_for(sc);break;
			case 3 :fibonacci_for(sc);break;
			default :System.out.println("for �� ����");
			}
		}
		//for���� switch���� �̿��Ͽ� 1. gugudan 2. factorial 3.fibonacci 4.���� ����
	}

	private static void fibonacci_for(Scanner sc) {
		System.out.println("fibonacci_for()");
		System.out.print("���ϰ� ���� �Ǻ���ġ ��°�� �Է��ϼ��� ");
		int fibo = sc.nextInt();
		int n = 0;
		int m = 1;
		int sum = 0;
		int f = 0;
		System.out.printf("�Ǻ���ġ���� %d��°�� ",fibo);
		for(int i=0;i<fibo;i++) {
			if(f==0) {
				System.out.printf("%d%s",n,i!=(fibo-1)?",":"");
				f++;
			}
			else {
				sum = n + m;
				n = m;
				m = sum;
				System.out.printf("%d%s",n,i!=(fibo-1)?",":"");
			}
		}
		System.out.printf("�߿��� %d�Դϴ�.%n",n);
	}

	private static void factorial_for(Scanner sc) {
		System.out.println("factorial_for()");
		System.out.print("���ϰ� ���� ���丮���� �Է��ϼ��� ");
		int n = sc.nextInt();
		int fac = 1;
		System.out.printf("%d! ",n);
		for(int i=1;i<n+1;i++) {
			fac = fac * i;
			System.out.printf("%d %s ",i,i!=n?'*':'=');
		}
		System.out.printf("%d�Դϴ�.%n",fac);
	}

	private static void gugudan_for() {
		System.out.println("gugudan_for()");
		for(int i=1;i<10;i++) {
			int j;
			for(j=2;j<10;j++) {
				System.out.printf("%d * %d = %2d ",j,i,j*i);
			}
			j=2;
			System.out.println();
		}
	}

}

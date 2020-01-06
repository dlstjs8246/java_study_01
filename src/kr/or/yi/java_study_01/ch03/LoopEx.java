package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
		int res = sc.nextInt();
		while(res<3) {
			if (res==1) {
				System.out.println("for");
				ex_for(sc);
			}else {
				System.out.println("while");
				ex_while(sc);
			}
			System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
			res = sc.nextInt();
		}
		System.out.println("프로그램 종료.");
		
		sc.close();
	}

	private static void ex_while(Scanner sc) {
		int res = 1;
		System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
		res = sc.nextInt();
		switch(res) {
		case 1: gugudan_while(); break;
		case 2: factorial_while(sc); break;
		case 3: fibonacci_while(sc); break;
		default : 
			break;
		}
		//while문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacci_while(Scanner sc) {
		System.out.printf("구하고자 하는 피보나치 순번을 입력하세요 ");
		int pibo = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		int cnt = 1;
		int isZero = 0;
		System.out.printf("피보나치 수열 %d번째의 값은 ",pibo);
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
		System.out.printf("중에서 %d입니다.%n",a);		
	}

	private static void factorial_while(Scanner sc) {
		
		System.out.printf("구하고자 하는 팩토리얼 값을 입력하세요 ");
		int fac = sc.nextInt();
		int cnt = 0;
		int res = 1;
		System.out.printf("%d!",fac);
		while(cnt<fac) {
			System.out.printf(" %d %s ",(cnt+1),cnt!=(fac-1)?"*":"=");
			res =  res * (cnt+1);
			cnt++;
		}
		System.out.printf("%d입니다.%n",res);
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
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch(res) {
			case 1: gugudan_for(); break;
			case 2: factorial_for(sc);break;
			case 3 :fibonacci_for(sc);break;
			default :System.out.println("for 문 종료");
			}
		}
		//for문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacci_for(Scanner sc) {
		System.out.println("fibonacci_for()");
		System.out.print("구하고 싶은 피보나치 번째를 입력하세요 ");
		int fibo = sc.nextInt();
		int n = 0;
		int m = 1;
		int sum = 0;
		int f = 0;
		System.out.printf("피보나치수열 %d번째는 ",fibo);
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
		System.out.printf("중에서 %d입니다.%n",n);
	}

	private static void factorial_for(Scanner sc) {
		System.out.println("factorial_for()");
		System.out.print("구하고 싶은 팩토리얼을 입력하세요 ");
		int n = sc.nextInt();
		int fac = 1;
		System.out.printf("%d! ",n);
		for(int i=1;i<n+1;i++) {
			fac = fac * i;
			System.out.printf("%d %s ",i,i!=n?'*':'=');
		}
		System.out.printf("%d입니다.%n",fac);
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

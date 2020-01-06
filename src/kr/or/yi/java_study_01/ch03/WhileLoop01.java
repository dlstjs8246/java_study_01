package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class WhileLoop01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		exam3_while(sc);
//		exam3_for(sc);
//		gugudan_while(9);
//		gugudan_while_full();
//		gugudan_while_full_land();
//		factorial_while(7);
//		fibonacci_while(10);	
		sc.close();
	}

	private static void gugudan_while(int dan) {
		int cnt = 1;
		while(cnt < 10) {
			System.out.printf("%d * %d = %2d%n",dan,cnt,dan*cnt);
			cnt++;
		}
	}
	private static void gugudan_while_full() {
		int dan = 2;
		int cnt = 1;
		while(cnt<10 && dan<10) {
			System.out.printf("%d * %d = %2d%n",dan,cnt,dan*cnt);
			cnt++;
			if(cnt>9) {
				cnt = 1;
				dan++;
			}
		}
	}
	private static void gugudan_while_full_land() {
		int dan = 2;
		int cnt = 1;
		while(cnt<10) {
			System.out.printf("%d * %d = %2d ",dan,cnt,dan*cnt);
			dan++;
			if(dan>9) {
				dan = 2;
				cnt++;
				System.out.println("");
			}
		}
	}
	private static void factorial_while(int n) {
		int cnt = 0;
		int sum = 1;
		System.out.printf("%d! ",n);
		while(cnt<n) {
			cnt++;
			sum = sum * cnt;
			System.out.printf("%d %s ",cnt,cnt!=n?'*':'=');
		}
		System.out.printf("%d입니다.",sum);
	}
	private static void fibonacci_while(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;
		int cnt = 0;
		int isZero = 0;
		System.out.printf("피보나치 수열 %d번째 수는 ",n);
		while(cnt<n) {
			if(isZero == 0) {
				System.out.printf("%d%s",a,cnt!=(n-1)?',':'=');
				isZero = 1;
			}
			else {
				sum = a + b;
				a = b;
				b = sum;
				System.out.printf("%d%s",a,cnt!=(n-1)?',':' ');
			}
			cnt++;
		}
		System.out.printf("중에 %d입니다",a);
	}
	private static void exam3_while(Scanner sc) {
		System.out.printf("정수를 입력하세요 ");
		int num = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		
		while(num != -1) {
			sum = sum + num;
			cnt++;
			num = sc.nextInt();
		}
		if(cnt == 0) {
			System.out.println("입력된 정수가 없습니다.");
		}
		else {
			System.out.printf("입력된 수의 합은 %d이며, 평균은 %.1f이다%n",sum,(double)sum/cnt);
		}
	}

	private static void exam3_for(Scanner sc) {
		int sum = 0;
		int cnt = 0;
		System.out.print("정수를 입력하세요 ");
		for(int num = sc.nextInt();num!=-1;) { //while문을 for문으로 바꿀때 증감식을 습관처럼 쓰지 말것!
			sum = sum + num;
			cnt++;
			num = sc.nextInt();
		}
		if(cnt==0) {
			System.out.println("입력받은 정수가 없습니다.");
		}
		else {
			System.out.printf("입력받은 정수들의 합은 %d이며 평균은 %.1f입니다%n",sum,(double)sum/cnt);
		}
	}
}

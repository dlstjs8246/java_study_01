package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class ForLoop02 {
	public static void main(String[] args) {
//		sum();
//		star();
		Scanner sc = new Scanner(System.in);
//		factorialDesc(sc);
//		factorialAsc(sc);
		pibo(10);
		sc.close();
		
	}
	private static void pibo(int a) {
		int first = 0;
		int second = 1;
		int res = 0;
		int isRes = 0;
	
		System.out.printf("피보나치수열의 %d번째 값은 ",a);
		for(int i=0;i<a;i++) {
			if(isRes != 0) {
				res = first + second;
				first = second;
				second = res;
				System.out.printf("%d%s",first,i==(a-1)?" = ":",");
			}
			else {
				System.out.printf(" %d%s",first,i==(a-1)?" = ":",");
				isRes = 1;
			}
		}
		System.out.printf("%d입니다",first);
	}
		
	
	private static void factorialAsc(Scanner sc) {
		System.out.print("구하고 싶은 factorial을 입력하세요 ");
		int value = sc.nextInt();
		int fact = 1;
		if(value <= 0) {
			System.out.print("음수 및 0을 넣지 마세요");
		}
		else {
			int i;
			System.out.printf("%d!의 값은 ",value);
			for(i=1;i<=value;i++) {
				fact = fact * i;
				System.out.printf("%d",i);
				if(i>=value) {
					System.out.printf(" = ");
				}
				else {
					System.out.printf(" * ");
				}
			}
			System.out.printf("%d 입니다.",fact);
		}	
		
	}
	private static void factorialDesc(Scanner sc) {
		System.out.print("구하고 싶은 factorial을 입력하세요 ");
		int value = sc.nextInt();
		int fact = 1;
		if(value <= 0) {
			System.out.print("음수 및 0을 넣지 마세요");
		}
		else {
			int i;
			int cnt = 0;
			for(i=value;i>0;i--) {
				fact = fact * i;
				cnt++;
			}
			System.out.printf("%d!의 값은 ",cnt);
			for(int j=cnt;j>0;j--) {
				System.out.printf("%d",j);
				if(j==1) {
					System.out.printf(" = %d 입니다.",fact);
				}
				else {
					System.out.print(" * ");
				}
			}
			System.out.println("");
		}	
	}
	private static void star() {	
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-(i+1);j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.
				out.print("*");
			}
			System.out.println();
		}
		System.out.println("");
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<5-(i+1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void sum() {
		//1부터 100까지의 짝수 합과 홀수 합, 전체 합을 구하는 반복문을 작성하시오
		int sum = 0;
		int even = 0;
		int odd = 0;
		for(int i=1;i<101;i++) {
			if(i % 2 == 1) {
				odd = odd + i;
			}
			else {
				even = even + i;
			}
			sum = sum + i;
		}
		System.out.printf("홀수 합 : %d,  짝수 합 : %d,  전체 합 : %d%n",odd,even,sum);
	}
}

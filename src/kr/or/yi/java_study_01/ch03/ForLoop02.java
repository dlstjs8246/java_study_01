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
	
		System.out.printf("�Ǻ���ġ������ %d��° ���� ",a);
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
		System.out.printf("%d�Դϴ�",first);
	}
		
	
	private static void factorialAsc(Scanner sc) {
		System.out.print("���ϰ� ���� factorial�� �Է��ϼ��� ");
		int value = sc.nextInt();
		int fact = 1;
		if(value <= 0) {
			System.out.print("���� �� 0�� ���� ������");
		}
		else {
			int i;
			System.out.printf("%d!�� ���� ",value);
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
			System.out.printf("%d �Դϴ�.",fact);
		}	
		
	}
	private static void factorialDesc(Scanner sc) {
		System.out.print("���ϰ� ���� factorial�� �Է��ϼ��� ");
		int value = sc.nextInt();
		int fact = 1;
		if(value <= 0) {
			System.out.print("���� �� 0�� ���� ������");
		}
		else {
			int i;
			int cnt = 0;
			for(i=value;i>0;i--) {
				fact = fact * i;
				cnt++;
			}
			System.out.printf("%d!�� ���� ",cnt);
			for(int j=cnt;j>0;j--) {
				System.out.printf("%d",j);
				if(j==1) {
					System.out.printf(" = %d �Դϴ�.",fact);
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
		//1���� 100������ ¦�� �հ� Ȧ�� ��, ��ü ���� ���ϴ� �ݺ����� �ۼ��Ͻÿ�
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
		System.out.printf("Ȧ�� �� : %d,  ¦�� �� : %d,  ��ü �� : %d%n",odd,even,sum);
	}
}

package kr.or.yi.java_study_01.ch03;

import java.util.Random;
import java.util.Scanner;

public class Subject2 {
	public static void main(String[] args) {
//		sum1(); //1-1
//		sum2(); //1-2
//		sum3(); //1-3
//		swap(); //2
//		digitGame(); //3
//		star(); //4
	}

	private static void star() {
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<7;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<7;i++) {
			for(int j=0;j<7-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void digitGame() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("��ǻ�Ͱ� ���� ������Դϴ�(1~100)");
		int com = rd.nextInt(100) + 1;
		System.out.println("��ǻ�� ���� ���Ǿ����ϴ�. ������� ���� �Է��ϼ���");
		int user = 0;
		if(user<0) {
			while(com!=user) {
				if(user>100) {
					System.out.println("1���� 100������ �Է��ϼ���.");
				}
				else {
					user = sc.nextInt();
					System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �õ��ϼ���.");
				}
			}
			System.out.println("������ ���߼̽��ϴ�. Computer = " + com + " user = " + user);
		}
		else {
			System.out.println("����� �Է��ϼ���");
		}	
			
		sc.close();
	}

	private static void swap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� ");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("����� �Է��ϼ���");
		}
		else {
			int numValue = num;
			int [] intArr = new int[50];
			int cntPosition = 1;
			int cnt = 0;
			int i =0;
			do {
				numValue = numValue/10;
				cntPosition++;
			}while(numValue>=10);
			System.out.print("�Է��� ���� " + num + "�� �ڸ��� ��ü�� ��� ");
			do {
				intArr[cnt] = (int)(num/Math.pow(10,(cntPosition-1)));
				num = (int)(num%Math.pow(10,(cntPosition-1)));
				cntPosition--;
				cnt++;
			}while(cntPosition>0);
			do {
				System.out.print(intArr[(cnt-1)-i]);
				i++;
			}while(cnt-i>0);
			System.out.println("�Դϴ�.");
			sc.close();
		}
	}

	private static void sum3() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 1;
		int cnt = 0;
		int[] input = new int[100];
		System.out.print("������ �Է��ϼ���(100�� ������ ����� �˴ϴ�.)");
		for(int i=0;num!=0;i++) {
			num = sc.nextInt();
			input[i]=num;
			cnt++;
		}
		System.out.print("���� ");
		for(int i=0;i<cnt-1;i++) {
			if(i!=cnt-2) {
				System.out.print(input[i] + " + ");
				sum+=input[i];
			}
			else {
				System.out.print(input[i] + " = ");
				sum+=input[i];
			}
		}
		System.out.print(sum + "�Դϴ�.");
		sc.close();
	}

	private static void sum2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��� ���� ������ �Է��ϼ��� ");
		int cnt = sc.nextInt();
		int [] intArr = new int[cnt];
		int sum = 0;
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = sc.nextInt();
			sum += intArr[i];
		}
		System.out.print("���� ");
		for(int i=0;i<intArr.length;i++) {
			if(i!=intArr.length-1) {
				System.out.print(intArr[i] + " + ");
			}
			else {
				System.out.print(intArr[i] + " = ");
			}
		}
		System.out.print(sum + "�Դϴ�.");
		sc.close();
	}

	private static void sum1() {
		int sum = 0;
		for(int i=1;i<101;i++) {
			sum += i;
		}
		System.out.println("���� " + sum);
	}
}

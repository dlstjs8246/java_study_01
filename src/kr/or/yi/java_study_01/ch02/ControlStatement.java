package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ControlStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		multipleTree(sc);
//		ternaryTree(sc);
//		grade(sc);
		nestedIf(sc);
		sc.close();
	}

	private static void nestedIf(Scanner sc) {
		System.out.print("������ �Է��ϼ��� ");
		int score = sc.nextInt();
		System.out.print("�г��� �Է��ϼ���(1~4�г������ �Է�) ");
		int year = sc.nextInt();
		
		if (year > 4) {
			System.out.printf("�߸��� �г��� �Է��ϼ̽��ϴ�. �Է��г� : %d%n",year);
		}
		else {
			if(score >= 60) {
				if (year != 4) {
					System.out.println("�հ��Դϴ�.");
				}
				else  {
					if (score >= 70) {
						System.out.println("�հ��Դϴ�.");
					}
					else {
						System.out.println("���հ��Դϴ�.");
					}
				}
			}
			else  {
				System.out.println("���հ��Դϴ�.");
			}
		}
	}

	private static void grade(Scanner sc) {
		System.out.print("������ �Է��ϼ��� ");
		char grade;
		int score = sc.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.printf("�Է��� ������ %d, ����� ����� %c�Դϴ�.",score,grade);
	}

	private static void ternaryTree(Scanner sc) {
		System.out.print("���� �Է��ϼ��� [3�� ������ ���] ");
		int number = sc.nextInt();
		System.out.println(number % 3 == 0 ? "3�� ����Դϴ�." : "3�� ����� �ƴմϴ�.");
	}

	private static void multipleTree(Scanner sc) {
		System.out.print("���� �Է��ϼ��� [if-else�� ���] ");
		int number = sc.nextInt();
		
		if (number % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}
		else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
	}
}

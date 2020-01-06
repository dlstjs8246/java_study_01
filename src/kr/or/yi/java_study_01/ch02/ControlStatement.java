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
		System.out.print("점수를 입력하세요 ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4학년까지만 입력) ");
		int year = sc.nextInt();
		
		if (year > 4) {
			System.out.printf("잘못된 학년을 입력하셨습니다. 입력학년 : %d%n",year);
		}
		else {
			if(score >= 60) {
				if (year != 4) {
					System.out.println("합격입니다.");
				}
				else  {
					if (score >= 70) {
						System.out.println("합격입니다.");
					}
					else {
						System.out.println("불합격입니다.");
					}
				}
			}
			else  {
				System.out.println("불합격입니다.");
			}
		}
	}

	private static void grade(Scanner sc) {
		System.out.print("점수를 입력하세요 ");
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
		System.out.printf("입력한 점수는 %d, 당신의 등급은 %c입니다.",score,grade);
	}

	private static void ternaryTree(Scanner sc) {
		System.out.print("수를 입력하세요 [3항 연산자 사용] ");
		int number = sc.nextInt();
		System.out.println(number % 3 == 0 ? "3의 배수입니다." : "3의 배수가 아닙니다.");
	}

	private static void multipleTree(Scanner sc) {
		System.out.print("수를 입력하세요 [if-else문 사용] ");
		int number = sc.nextInt();
		
		if (number % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
	}
}

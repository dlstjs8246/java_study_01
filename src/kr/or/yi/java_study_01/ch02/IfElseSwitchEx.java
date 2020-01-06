package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class IfElseSwitchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		gradeSwitch(sc);
		coffeePrice(sc);
		sc.close();
	}

	private static void coffeePrice(Scanner sc) {
		int price = 0;
		System.out.print("커피를 입력하세요(아메리카노,카푸치노,카페라떼,카라멜마끼야또) ");
		String coffee = sc.next();
	
		switch (coffee) {
			case "아메리카노" :
				price = 2500;
				break;
			case "카푸치노" :
			case "카페라떼" :
				price = 3000;
				break;
			case "카라멜마끼야또" :
				price = 3500;
				break;
			default :
				System.out.printf("주문하신  %s는 존재하지 않는 커피입니다.%n",coffee);
		}
		if (price != 0) {
			System.out.printf("주문하신  %s의 값은 %d입니다.%n",coffee,price);
		}
	}

	private static void gradeSwitch(Scanner sc) {
		char grade = '\0';
		System.out.print("점수를 입력하세요 ");
		int score = sc.nextInt();
		switch (score/10) {
			case 10 :
				
			case 9 :
				grade = 'A';
				break;
			case 8 : 
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			case 6 :
				grade = 'D';
				break;
			default :
				grade = 'F';
		}
		System.out.printf("%d점은 %c등급입니다.%n",score,grade);
	}
}

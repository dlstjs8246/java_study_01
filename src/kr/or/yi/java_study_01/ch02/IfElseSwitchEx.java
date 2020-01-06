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
		System.out.print("Ŀ�Ǹ� �Է��ϼ���(�Ƹ޸�ī��,īǪġ��,ī���,ī��Ḷ���߶�) ");
		String coffee = sc.next();
	
		switch (coffee) {
			case "�Ƹ޸�ī��" :
				price = 2500;
				break;
			case "īǪġ��" :
			case "ī���" :
				price = 3000;
				break;
			case "ī��Ḷ���߶�" :
				price = 3500;
				break;
			default :
				System.out.printf("�ֹ��Ͻ�  %s�� �������� �ʴ� Ŀ���Դϴ�.%n",coffee);
		}
		if (price != 0) {
			System.out.printf("�ֹ��Ͻ�  %s�� ���� %d�Դϴ�.%n",coffee,price);
		}
	}

	private static void gradeSwitch(Scanner sc) {
		char grade = '\0';
		System.out.print("������ �Է��ϼ��� ");
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
		System.out.printf("%d���� %c����Դϴ�.%n",score,grade);
	}
}

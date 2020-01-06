package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		getHourMinuteSecond(sc);
//		getPayCount(sc);
		sc.close();
		
		postfix();
		prefix();	
	}

	private static void prefix() {
		int a = 10;
		int b = ++a; //전위증감
		System.out.printf("a=%d b=%d 전위 증감이라 a의 값이 1 증가한다음 b에 할당%n",a,b);
	}

	private static void postfix() {
		int a = 10;
		int b = a++; //후위증감
		System.out.printf("a=%d b=%d 후위 증감이라 a의 값이 b에 할당되고 a의 값이 1증가됨%n",a,b);
	}

	private static void getPayCount(Scanner sc) {
		System.out.print("금액을 입력하세요 ");
		int pay = sc.nextInt(); //97,870원
		//5만원 1장 1만원 4장 오천원 1장 천원 2장 오백원 1개 백원3개 오십원 1개 십원 2개
		int 오만원권 = pay / 50000;
		int 일만원권 = (pay % 50000) /10000;
		int 오천원권 = ((pay % 50000) % 10000) /5000;
		int 일천원권 = (((pay % 50000) % 10000) % 5000) / 1000;
		int 오백원 = ((((pay % 50000) % 10000) % 5000) % 1000) / 500;
		int 백원 = (((((pay % 50000) % 10000) % 5000) % 1000) % 500) / 100;
		int 오십원 = ((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		int 십원 = (((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;
		
		System.out.printf("%d원은 5만원 %d장, 1만원 %d장, 5천원 %d장, 천원 %d장, 500원 %d개, 100원 %d개, 50원 %d개, 10원 %d개 입니다"
				,pay,오만원권,일만원권,오천원권,일천원권,오백원,백원,오십원,십원);
	}

	private static void getHourMinuteSecond(Scanner sc) {
		System.out.print("정수를 입력하세요 ");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = ( time / 60 ) % 60;
		int hour = (time / 60) / 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초%n",time,second,minute,hour);
		
	}
}

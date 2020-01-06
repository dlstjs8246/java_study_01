package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;
import java.util.concurrent.Delayed;

public class Subject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		gaweBaweBo(sc); // 가위바위보 게임
//		wonToDollar(sc); //실습문제 1번
//		intCheck(sc); //실습문제 2번
//		wonCalculator(sc); //실습문제 3번
//		intThree(sc); // 실습문제 4번
//		triangle(sc); // 실습문제 5번
//		threeSixNine(sc); // 실습문제 6번
//		isSquare(sc); // 실습문제 7번
//		squareIsCollide(sc); // 실습문제 8번
//		isInCircle(sc); // 실습문제 9번
		circleIsCollide(sc); //실습문제 10번
//		isSeason(sc); //실습문제 11번
//		arithmetic(sc); // 실습문제 12번
		sc.close();
	}

	private static void arithmetic(Scanner sc) {
		System.out.print("연산>>");
		double a = sc.nextInt();
		String operator = sc.next();
		double b = sc.nextInt();
		double res;
		// if-else문 사용
		if(operator.equals("+")) {
			res = a + b;
			System.out.printf("%.1f %s %.1f 계산 결과는 %.1f",a,operator,b,res);
		}
		else if(operator.equals("-")) {
			res = a - b;
			System.out.printf("%.1f %s %.1f 계산 결과는 %.1f",a,operator,b,res);
		}
		else if(operator.equals("*")) {
			res = a * b;
			System.out.printf("%.1f %s %.1f 계산 결과는 %.1f",a,operator,b,res);
		}
		else if(operator.equals("/")) {
			res = a / b;
			if(a == 0 || b == 0) {
					System.out.println("0으로 나눌 순 없습니다.");
				}
				else {
					System.out.printf("%.1f %s %.1f 계산 결과는 %.1f",a,operator,b,res);
				}
				
			}
			else if(operator.equals("%")) {
				res = a % b;
				System.out.printf("%.1f %s %.1f 계산 결과는 %.1f",a,operator,b,res);
			}
			else {
				System.out.println("그런 연산자는 없습니다.");
			}
	}

	private static void isSeason(Scanner sc) {
		System.out.printf("달을 입력하세요(1~12) ");
		int season = sc.nextInt();
		//if-else문 이용
		if (season == 12 || season == 1 || season == 2) {
			System.out.println("겨울");
		}
		else if(season == 3 || season == 4 || season == 5) {
			System.out.println("봄");
		}
		else if(season == 6 || season == 7 || season == 8) {
			System.out.println("여름");
		}
		else if(season == 9 || season == 10 || season == 11) {
			System.out.println("가을");
		}
		else {
			System.out.println("잘못입력");
		}
		//switch문 이용
		switch (season) {
			case 1:
				System.out.println("겨울");
				break;
			case 2:
				System.out.println("겨울");
				break;
			case 3:
				System.out.println("봄");
				break;
			case 4:
				System.out.println("봄");
				break;
			case 5:
				System.out.println("봄");
				break;
			case 6:
				System.out.println("여름");
				break;
			case 7:
				System.out.println("여름");
				break;
			case 8:
				System.out.println("여름");
				break;
			case 9:
				System.out.println("가을");
				break;
			case 10:
				System.out.println("가을");
				break;
			case 11:
				System.out.println("가을");
				break;
			case 12:
				System.out.println("겨울");
				break;
			default :
				System.out.println("잘못 입력");
		}		
	} 

	private static void circleIsCollide(Scanner sc) {
		/*
		 * 원의 내부와 외부를 나타내는 부등식 
		 * (x-a) + (y-b) > r 외부 
		 * (x-a) + (y-b) < r 내부
		 * 두 원 사이의 외접
		 * r + r' = d;
		 */
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		
		if(r1 + r2 >= (x2-x1) + (y2-y1)) {
			System.out.println("두 원은 겹친다.");
		}
		else {
			System.out.println("두 원은 겹치지 않는다.");
		}
		
	}

	private static void isInCircle(Scanner sc) {
		/*
		 * 원의 내부와 외부를 나타내는 부등식 
		 * (x-a) + (y-b) > r 외부 
		 * (x-a) + (y-b) < r 내부
		 */
		System.out.print("원의 중심과 반지름 입력 ");
		int centerX = sc.nextInt();
		int centerY = sc.nextInt();
		double r = sc.nextDouble();
		System.out.print("점 입력 ");
		double pointX = sc.nextDouble();
		double pointY = sc.nextDouble();
		int centerDiff = (centerX - centerY);
		double xDiff = (centerX - pointX);
		double yDiff = (centerY - pointY);
		
		if (centerDiff < 0) {
			centerDiff = -centerDiff;
		}
		else if (xDiff < 0) {
			xDiff = -xDiff;
		}
		else if (yDiff < 0) {
			yDiff = -yDiff;
		}
		
		
		if((centerX-centerY) <= r) {
			if(xDiff + yDiff <= r) {
				System.out.print("점이 원의 내부에 있습니다.");
			}
			else {
				System.out.print("점이 원의 외부에 있습니다.");
			}
		}	
	}

	private static void squareIsCollide(Scanner sc) {
		System.out.print("시작 좌표와 끝좌표를 입력하세요(시작좌표(x1,y1)),(끝좌표(x2,y2))==> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
			
		if(x2 < 100 && y2 < 100) {
			System.out.println("충돌하지 않습니다.");
		}
		else if(x2 == 100 && y2 == 100) {
			System.out.printf("충돌합니다.");
		}
		else if((x1>100 && x1<200) && (y1>100 && y1 <200)) {
			if(x2<200 && y2<200) {
				System.out.println("충돌하지 않습니다.");
			}
			else {
				System.out.printf("충돌합니다.");
			}
		}
		else if(x1 == 200 && y1 == 200) {
			System.out.printf("충돌합니다.");
		}
		else if(x1>200 && y1>200) {
			System.out.println("충돌하지 않습니다.");
		}
		else {
			System.out.printf("충돌합니다.");
		}
	}

	private static void isSquare(Scanner sc) {
		System.out.println("삼각형의 좌표 : (100,100) (200,200)");
		System.out.print("점 (x,y)의 좌표를 입력하시오 >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
			System.out.printf("(%d,%d)는 사각형 안에 있습니다.",x,y);
		}
		else {
			System.out.printf("(%d,%d)는 사각형 안에 없습니다.",x,y);
		}
	}

	private static void threeSixNine(Scanner sc) {
		System.out.print("3,6,9 3,6,9(1~99)==> ");
		int value = sc.nextInt();
		if(value < 10) {
			if(value%3 == 0) {
				System.out.println("박수 짝!");
			}
			else {
				System.out.printf("%d!",value);
			}
		}
		else if((value >= 10) && (value <=29)) {
			if(value % 3 == 0) {
				System.out.printf("%d!",value);
			} // 12,15,18,21,24,27
			else if((((value%10)%3) == 1) && (value < 20)) {
				System.out.printf("%d!",value);
			} //11,14,17
			else if (value == 20) {
				System.out.printf("%d!",value);
			}
			else if((((value%20)%3) == 2) && (value <= 29)) {
				System.out.printf("%d!",value);
			} //22,25,28
			else {
				System.out.println("박수 짝!");
			}
		}
		else if((value >= 30) && (value <=39)) {
			if (value == 30) {
				System.out.println("박수 짝!");
			}
			else if(value % 3 == 0) {
				System.out.println("박수 짝!");
				System.out.println("박수 짝!");
			}
			else {
				System.out.println("박수 짝!");
			}
		}
		else if((value >= 40) && (value <=59)) {
			if(value % 3 == 0) {
				System.out.printf("%d!",value);
			} // 42,45,48,51,54,57
			else if (value == 40) {
				System.out.printf("%d!",value);
			}
			else if((((value%40)%3) == 1) && (value <= 50)) {
				System.out.printf("%d!",value);
			} //41,44,47,50
			else if((((value%50)%3) == 2) && (value <= 59)) {
				System.out.printf("%d!",value);
			} //52,55,58
			else {
				System.out.println("박수 짝!");
			}
		}
		else if((value >= 60) && (value <= 69)) {
			if (value == 60) {
				System.out.println("박수 짝!");
			}
			else if(value % 3 == 0) {
				System.out.println("박수 짝!");
				System.out.println("박수 짝!");
			}
			else {
				System.out.println("박수 짝!");
			}
		}
		else if((value >= 70) && (value <=89)) {
			if(value % 3 == 0) {
				System.out.printf("%d!",value);
			} 
			else if (value == 70) {
				System.out.printf("%d!",value);
			}
			else if((((value%70)%3) == 1) && (value <= 80)) {
				System.out.printf("%d!",value);
			} 
			else if((((value%80)%3) == 2) && (value <= 89)) {
				System.out.printf("%d!",value);
			} 
			else {
				System.out.println("박수 짝!");
			}
		}
		else if((value >= 90) && (value <= 99)) {
			if (value == 90) {
				System.out.println("박수 짝!");
			}
			else if(value % 3 == 0) {
				System.out.println("박수 짝!");
				System.out.println("박수 짝!");
			}
			else {
				System.out.println("박수 짝!");
			}
		}
		else {
			System.out.println("1~99까지 입력하라고 했잖아");
		}
	}

	private static void triangle(Scanner sc) {
		System.out.print("정수 3개를 입력하시오==>");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		/*	삼각형이 되는 조건
		 * 1. 첫번째 값과 두번째 값의 합이 세번째 값보다 클 때 a + b > c
		 * 2. 첫번째 값과 세번째 값의 합이 두번쨰 값보다 클 때 a + c > b
		 * 3. 두번째 값과 세번째 값의 합이 첫번쨰 값보다 클 때 b + c > a
		 */
		if ((value1 + value2) > value3) {
			System.out.println("삼각형이 됩니다.");
		}
		else if((value1 + value3) > value2) {
			System.out.println("삼각형이 됩니다.");
		}
		else if((value2 + value3) > value1) {
			System.out.println("삼각형이 됩니다.");
		}
		else {
			System.out.println("삼각형이 안됩니다.");
		}
		// 첫번째 조건만 적용
	}	
	private static void intThree(Scanner sc) {
		System.out.print("정수 3개를 입력==>");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		
		if((value1 > value2) && (value1 < value3)) {
			System.out.printf("중간값은 %d",value1);
		}
		else if ((value2 > value1) && (value2 < value3)) {
			System.out.printf("중간값은 %d",value2);
		}
		else {
			System.out.printf("중간값은 %d",value3);
		}
	}
	private static void wonCalculator(Scanner sc) {
		System.out.print("금액을 입력하세요==>");
		int money = sc.nextInt();
		System.out.printf("오만원권 %d매 %n 만원권 %d매 %n 오천원권 %d매 %n 천원권 %d매 %n 백원 %d개 %n 오십원 %d개 %n 십원 %d개 %n 일원 %d개 %n",
				(money / 50000),
				((money % 50000) / 10000),
				(((money % 50000) % 10000) / 5000),
				((((money % 50000) % 10000) % 5000) / 1000),
				(((((money % 50000) % 10000) % 5000) % 1000) / 100),
				((((((money % 50000) % 10000) % 5000) % 1000) % 100) / 50),
				((((((((money) % 50000) % 10000) %5000 ) %1000 ) %100) %50) / 10),
				((((((((money) % 50000) % 10000) %5000) %1000) %100) %50) %10) / 1);			
	}

	private static void intCheck(Scanner sc) {
		System.out.print("2자리 정수 입력(10~99)>>");
		int check = sc.nextInt();
		/* 77 = 7,7로 분리하려면.. 
		 * (77 % 10) = 일의 자리로 분리
		 * (77 / 10) = 십의 자리로 분리*/
		if((check % 10) == (check / 10)) {
			System.out.printf("Yes! 10의 자리와 1의 자리가 같습니다. 십의 자리 = %d,   일의 자리 = %d", (check/10), (check%10));
		}
		else {
			System.out.printf("No! 10의 자리와 1의 자리가 다릅니다. 십의 자리 = %d,   일의 자리=%d", (check/10), (check%10));
		}
		
	}

	private static void wonToDollar(Scanner sc) {
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = sc.nextInt();
		float doller = won / 1100;
		System.out.printf("%d원은 $%.1f입니다.",won,doller);
	}

	private static void gaweBaweBo(Scanner sc) {
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 ==> ");
		String action1 = sc.next();
		System.out.print("영희 ==> ");
		String action2 = sc.next();
		
		if (action1.equals("가위")) {
			if (action2.equals("가위")) {
				System.out.printf("비겼습니다. 철수 : %s   영희 : %s",action1,action2);
			}
			else if(action2.equals("바위")) {
				System.out.printf("영희가 이겼습니다. 철수 : %s   영희 : %s",action1,action2);
			}
			else {
				System.out.printf("철수가 이겼습니다. 철수 : %s   영희 : %s",action1,action2);
			}
		}
		else if (action1.equals("바위")) {
			if (action2.equals("가위")) {
				System.out.printf("철수가 이겼습니다. 철수 : %s   영희 : %s",action1,action2);
			}
			else if (action2.equals("바위")) {
				System.out.printf("비겼습니다. 철수 : %s   영희 : %s",action1,action2);
			}
			else {
				System.out.printf("영희가 이겼습니다. 철수 : %s   영희 : %s",action1,action2);
			}
		}
		else if (action1.equals("보")) {
			if (action2.equals("가위")) {
				System.out.printf("영희가 이겼습니다. 철수 : %s   영희 : %s",action1,action2);
			}
			else if (action2.equals("바위")) {
				System.out.printf("철수가 이겼습니다. 철수 : %s   영희 : %s",action1,action2);
			}
			else {
				System.out.printf("비겼습니다. 철수 : %s   영희 : %s",action1,action2);
			}
		}
		else {
			System.out.printf("가위바위보만 입력하세요. 철수 : %s   영희 : %s",action1,action2);
		}
		
		/* 가위 < 바위  , 가위 = 가위, 가위 > 보,
		 * 바위 > 가위 , 바위 = 바위, 바위 < 보,
		 * 보 < 가위 , 보 = 보 , 보 > 바위
		 */
	}
}

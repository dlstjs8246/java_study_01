package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;
import java.util.concurrent.Delayed;

public class Subject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		gaweBaweBo(sc); // ���������� ����
//		wonToDollar(sc); //�ǽ����� 1��
//		intCheck(sc); //�ǽ����� 2��
//		wonCalculator(sc); //�ǽ����� 3��
//		intThree(sc); // �ǽ����� 4��
//		triangle(sc); // �ǽ����� 5��
//		threeSixNine(sc); // �ǽ����� 6��
//		isSquare(sc); // �ǽ����� 7��
//		squareIsCollide(sc); // �ǽ����� 8��
//		isInCircle(sc); // �ǽ����� 9��
		circleIsCollide(sc); //�ǽ����� 10��
//		isSeason(sc); //�ǽ����� 11��
//		arithmetic(sc); // �ǽ����� 12��
		sc.close();
	}

	private static void arithmetic(Scanner sc) {
		System.out.print("����>>");
		double a = sc.nextInt();
		String operator = sc.next();
		double b = sc.nextInt();
		double res;
		// if-else�� ���
		if(operator.equals("+")) {
			res = a + b;
			System.out.printf("%.1f %s %.1f ��� ����� %.1f",a,operator,b,res);
		}
		else if(operator.equals("-")) {
			res = a - b;
			System.out.printf("%.1f %s %.1f ��� ����� %.1f",a,operator,b,res);
		}
		else if(operator.equals("*")) {
			res = a * b;
			System.out.printf("%.1f %s %.1f ��� ����� %.1f",a,operator,b,res);
		}
		else if(operator.equals("/")) {
			res = a / b;
			if(a == 0 || b == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
				}
				else {
					System.out.printf("%.1f %s %.1f ��� ����� %.1f",a,operator,b,res);
				}
				
			}
			else if(operator.equals("%")) {
				res = a % b;
				System.out.printf("%.1f %s %.1f ��� ����� %.1f",a,operator,b,res);
			}
			else {
				System.out.println("�׷� �����ڴ� �����ϴ�.");
			}
	}

	private static void isSeason(Scanner sc) {
		System.out.printf("���� �Է��ϼ���(1~12) ");
		int season = sc.nextInt();
		//if-else�� �̿�
		if (season == 12 || season == 1 || season == 2) {
			System.out.println("�ܿ�");
		}
		else if(season == 3 || season == 4 || season == 5) {
			System.out.println("��");
		}
		else if(season == 6 || season == 7 || season == 8) {
			System.out.println("����");
		}
		else if(season == 9 || season == 10 || season == 11) {
			System.out.println("����");
		}
		else {
			System.out.println("�߸��Է�");
		}
		//switch�� �̿�
		switch (season) {
			case 1:
				System.out.println("�ܿ�");
				break;
			case 2:
				System.out.println("�ܿ�");
				break;
			case 3:
				System.out.println("��");
				break;
			case 4:
				System.out.println("��");
				break;
			case 5:
				System.out.println("��");
				break;
			case 6:
				System.out.println("����");
				break;
			case 7:
				System.out.println("����");
				break;
			case 8:
				System.out.println("����");
				break;
			case 9:
				System.out.println("����");
				break;
			case 10:
				System.out.println("����");
				break;
			case 11:
				System.out.println("����");
				break;
			case 12:
				System.out.println("�ܿ�");
				break;
			default :
				System.out.println("�߸� �Է�");
		}		
	} 

	private static void circleIsCollide(Scanner sc) {
		/*
		 * ���� ���ο� �ܺθ� ��Ÿ���� �ε�� 
		 * (x-a) + (y-b) > r �ܺ� 
		 * (x-a) + (y-b) < r ����
		 * �� �� ������ ����
		 * r + r' = d;
		 */
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		
		if(r1 + r2 >= (x2-x1) + (y2-y1)) {
			System.out.println("�� ���� ��ģ��.");
		}
		else {
			System.out.println("�� ���� ��ġ�� �ʴ´�.");
		}
		
	}

	private static void isInCircle(Scanner sc) {
		/*
		 * ���� ���ο� �ܺθ� ��Ÿ���� �ε�� 
		 * (x-a) + (y-b) > r �ܺ� 
		 * (x-a) + (y-b) < r ����
		 */
		System.out.print("���� �߽ɰ� ������ �Է� ");
		int centerX = sc.nextInt();
		int centerY = sc.nextInt();
		double r = sc.nextDouble();
		System.out.print("�� �Է� ");
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
				System.out.print("���� ���� ���ο� �ֽ��ϴ�.");
			}
			else {
				System.out.print("���� ���� �ܺο� �ֽ��ϴ�.");
			}
		}	
	}

	private static void squareIsCollide(Scanner sc) {
		System.out.print("���� ��ǥ�� ����ǥ�� �Է��ϼ���(������ǥ(x1,y1)),(����ǥ(x2,y2))==> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
			
		if(x2 < 100 && y2 < 100) {
			System.out.println("�浹���� �ʽ��ϴ�.");
		}
		else if(x2 == 100 && y2 == 100) {
			System.out.printf("�浹�մϴ�.");
		}
		else if((x1>100 && x1<200) && (y1>100 && y1 <200)) {
			if(x2<200 && y2<200) {
				System.out.println("�浹���� �ʽ��ϴ�.");
			}
			else {
				System.out.printf("�浹�մϴ�.");
			}
		}
		else if(x1 == 200 && y1 == 200) {
			System.out.printf("�浹�մϴ�.");
		}
		else if(x1>200 && y1>200) {
			System.out.println("�浹���� �ʽ��ϴ�.");
		}
		else {
			System.out.printf("�浹�մϴ�.");
		}
	}

	private static void isSquare(Scanner sc) {
		System.out.println("�ﰢ���� ��ǥ : (100,100) (200,200)");
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �ֽ��ϴ�.",x,y);
		}
		else {
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �����ϴ�.",x,y);
		}
	}

	private static void threeSixNine(Scanner sc) {
		System.out.print("3,6,9 3,6,9(1~99)==> ");
		int value = sc.nextInt();
		if(value < 10) {
			if(value%3 == 0) {
				System.out.println("�ڼ� ¦!");
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
				System.out.println("�ڼ� ¦!");
			}
		}
		else if((value >= 30) && (value <=39)) {
			if (value == 30) {
				System.out.println("�ڼ� ¦!");
			}
			else if(value % 3 == 0) {
				System.out.println("�ڼ� ¦!");
				System.out.println("�ڼ� ¦!");
			}
			else {
				System.out.println("�ڼ� ¦!");
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
				System.out.println("�ڼ� ¦!");
			}
		}
		else if((value >= 60) && (value <= 69)) {
			if (value == 60) {
				System.out.println("�ڼ� ¦!");
			}
			else if(value % 3 == 0) {
				System.out.println("�ڼ� ¦!");
				System.out.println("�ڼ� ¦!");
			}
			else {
				System.out.println("�ڼ� ¦!");
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
				System.out.println("�ڼ� ¦!");
			}
		}
		else if((value >= 90) && (value <= 99)) {
			if (value == 90) {
				System.out.println("�ڼ� ¦!");
			}
			else if(value % 3 == 0) {
				System.out.println("�ڼ� ¦!");
				System.out.println("�ڼ� ¦!");
			}
			else {
				System.out.println("�ڼ� ¦!");
			}
		}
		else {
			System.out.println("1~99���� �Է��϶�� ���ݾ�");
		}
	}

	private static void triangle(Scanner sc) {
		System.out.print("���� 3���� �Է��Ͻÿ�==>");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		/*	�ﰢ���� �Ǵ� ����
		 * 1. ù��° ���� �ι�° ���� ���� ����° ������ Ŭ �� a + b > c
		 * 2. ù��° ���� ����° ���� ���� �ι��� ������ Ŭ �� a + c > b
		 * 3. �ι�° ���� ����° ���� ���� ù���� ������ Ŭ �� b + c > a
		 */
		if ((value1 + value2) > value3) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
		else if((value1 + value3) > value2) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
		else if((value2 + value3) > value1) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
		else {
			System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		}
		// ù��° ���Ǹ� ����
	}	
	private static void intThree(Scanner sc) {
		System.out.print("���� 3���� �Է�==>");
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		
		if((value1 > value2) && (value1 < value3)) {
			System.out.printf("�߰����� %d",value1);
		}
		else if ((value2 > value1) && (value2 < value3)) {
			System.out.printf("�߰����� %d",value2);
		}
		else {
			System.out.printf("�߰����� %d",value3);
		}
	}
	private static void wonCalculator(Scanner sc) {
		System.out.print("�ݾ��� �Է��ϼ���==>");
		int money = sc.nextInt();
		System.out.printf("�������� %d�� %n ������ %d�� %n ��õ���� %d�� %n õ���� %d�� %n ��� %d�� %n ���ʿ� %d�� %n �ʿ� %d�� %n �Ͽ� %d�� %n",
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
		System.out.print("2�ڸ� ���� �Է�(10~99)>>");
		int check = sc.nextInt();
		/* 77 = 7,7�� �и��Ϸ���.. 
		 * (77 % 10) = ���� �ڸ��� �и�
		 * (77 / 10) = ���� �ڸ��� �и�*/
		if((check % 10) == (check / 10)) {
			System.out.printf("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�. ���� �ڸ� = %d,   ���� �ڸ� = %d", (check/10), (check%10));
		}
		else {
			System.out.printf("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�. ���� �ڸ� = %d,   ���� �ڸ�=%d", (check/10), (check%10));
		}
		
	}

	private static void wonToDollar(Scanner sc) {
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won = sc.nextInt();
		float doller = won / 1100;
		System.out.printf("%d���� $%.1f�Դϴ�.",won,doller);
	}

	private static void gaweBaweBo(Scanner sc) {
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� ==> ");
		String action1 = sc.next();
		System.out.print("���� ==> ");
		String action2 = sc.next();
		
		if (action1.equals("����")) {
			if (action2.equals("����")) {
				System.out.printf("�����ϴ�. ö�� : %s   ���� : %s",action1,action2);
			}
			else if(action2.equals("����")) {
				System.out.printf("���� �̰���ϴ�. ö�� : %s   ���� : %s",action1,action2);
			}
			else {
				System.out.printf("ö���� �̰���ϴ�. ö�� : %s   ���� : %s",action1,action2);
			}
		}
		else if (action1.equals("����")) {
			if (action2.equals("����")) {
				System.out.printf("ö���� �̰���ϴ�. ö�� : %s   ���� : %s",action1,action2);
			}
			else if (action2.equals("����")) {
				System.out.printf("�����ϴ�. ö�� : %s   ���� : %s",action1,action2);
			}
			else {
				System.out.printf("���� �̰���ϴ�. ö�� : %s   ���� : %s",action1,action2);
			}
		}
		else if (action1.equals("��")) {
			if (action2.equals("����")) {
				System.out.printf("���� �̰���ϴ�. ö�� : %s   ���� : %s",action1,action2);
			}
			else if (action2.equals("����")) {
				System.out.printf("ö���� �̰���ϴ�. ö�� : %s   ���� : %s",action1,action2);
			}
			else {
				System.out.printf("�����ϴ�. ö�� : %s   ���� : %s",action1,action2);
			}
		}
		else {
			System.out.printf("������������ �Է��ϼ���. ö�� : %s   ���� : %s",action1,action2);
		}
		
		/* ���� < ����  , ���� = ����, ���� > ��,
		 * ���� > ���� , ���� = ����, ���� < ��,
		 * �� < ���� , �� = �� , �� > ����
		 */
	}
}

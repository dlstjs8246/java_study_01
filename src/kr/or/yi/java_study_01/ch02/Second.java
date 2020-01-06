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
		int b = ++a; //��������
		System.out.printf("a=%d b=%d ���� �����̶� a�� ���� 1 �����Ѵ��� b�� �Ҵ�%n",a,b);
	}

	private static void postfix() {
		int a = 10;
		int b = a++; //��������
		System.out.printf("a=%d b=%d ���� �����̶� a�� ���� b�� �Ҵ�ǰ� a�� ���� 1������%n",a,b);
	}

	private static void getPayCount(Scanner sc) {
		System.out.print("�ݾ��� �Է��ϼ��� ");
		int pay = sc.nextInt(); //97,870��
		//5���� 1�� 1���� 4�� ��õ�� 1�� õ�� 2�� ����� 1�� ���3�� ���ʿ� 1�� �ʿ� 2��
		int �������� = pay / 50000;
		int �ϸ����� = (pay % 50000) /10000;
		int ��õ���� = ((pay % 50000) % 10000) /5000;
		int ��õ���� = (((pay % 50000) % 10000) % 5000) / 1000;
		int ����� = ((((pay % 50000) % 10000) % 5000) % 1000) / 500;
		int ��� = (((((pay % 50000) % 10000) % 5000) % 1000) % 500) / 100;
		int ���ʿ� = ((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		int �ʿ� = (((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;
		
		System.out.printf("%d���� 5���� %d��, 1���� %d��, 5õ�� %d��, õ�� %d��, 500�� %d��, 100�� %d��, 50�� %d��, 10�� %d�� �Դϴ�"
				,pay,��������,�ϸ�����,��õ����,��õ����,�����,���,���ʿ�,�ʿ�);
	}

	private static void getHourMinuteSecond(Scanner sc) {
		System.out.print("������ �Է��ϼ��� ");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = ( time / 60 ) % 60;
		int hour = (time / 60) / 60;
		
		System.out.printf("%d�ʴ� %d�ð� %d�� %d��%n",time,second,minute,hour);
		
	}
}

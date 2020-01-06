package kr.or.yi.java_study_01.ch04exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthSchedule {
	private int dayOfLast;
	
	public MonthSchedule(int dayOflast) {
		this.dayOfLast = dayOflast;
	}
	void input(Scanner sc,Day[] day) {
		System.out.print("��¥(1~" + dayOfLast + ")" + "?");
		int num = sc.nextInt();
		if(num<0 || num>dayOfLast) {
			System.out.println("�׷� ���� �������� �ʽ��ϴ�.");
			return;
		}
		day[num] = new Day();
		System.out.print("����(��ĭ���� �Է�)?");
		day[num].set(sc.next());
		
	}
	void view(Scanner sc,Day[] day) {
		System.out.print("��¥(1~" + dayOfLast + ")" + "?");
		int num = sc.nextInt();
		if(num>dayOfLast) {
			System.out.println("�׷� ���� �������� �ʽ��ϴ�.");
		}
		else {
			if(day[num]!=null) {
				System.out.print(num+"���� �� ���� ");
				day[num].show();
			}
			else {
				System.out.println("���ǵ��� ���� ��¥�� ��ȸ�ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			}
		}
		
	}
	void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	void run() {
		Scanner sc = new Scanner(System.in);
		Day[] day = new Day[dayOfLast];
		while(true) {
			try {
				System.out.println("�̹��� ������ ���� ���α׷�");
				System.out.print("����(�Է�:1, ����:2, ������:3) >>");
				int cnt = sc.nextInt();
				switch(cnt) {
				case 1:
					input(sc,day);
					break;
				case 2:
					view(sc,day);
					break;
				}
				if(cnt==3) {
					finish();
					break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("���� �̿��� �ٸ� ���ڸ� �Է����� ������");
				sc.nextLine();
			}
		}
		sc.close();
	}
}

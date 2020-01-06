package kr.or.yi.java_study_01.ch04exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthSchedule {
	private int dayOfLast;
	
	public MonthSchedule(int dayOflast) {
		this.dayOfLast = dayOflast;
	}
	void input(Scanner sc,Day[] day) {
		System.out.print("날짜(1~" + dayOfLast + ")" + "?");
		int num = sc.nextInt();
		if(num<0 || num>dayOfLast) {
			System.out.println("그런 날은 존재하지 않습니다.");
			return;
		}
		day[num] = new Day();
		System.out.print("할일(빈칸없이 입력)?");
		day[num].set(sc.next());
		
	}
	void view(Scanner sc,Day[] day) {
		System.out.print("날짜(1~" + dayOfLast + ")" + "?");
		int num = sc.nextInt();
		if(num>dayOfLast) {
			System.out.println("그런 날은 존재하지 않습니다.");
		}
		else {
			if(day[num]!=null) {
				System.out.print(num+"일의 할 일은 ");
				day[num].show();
			}
			else {
				System.out.println("정의되지 않은 날짜를 조회하셨습니다. 다시 입력하세요");
			}
		}
		
	}
	void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	void run() {
		Scanner sc = new Scanner(System.in);
		Day[] day = new Day[dayOfLast];
		while(true) {
			try {
				System.out.println("이번달 스케쥴 관리 프로그램");
				System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
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
				System.out.println("숫자 이외의 다른 문자를 입력하지 마세요");
				sc.nextLine();
			}
		}
		sc.close();
	}
}

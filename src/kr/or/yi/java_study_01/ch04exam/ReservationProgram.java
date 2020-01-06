package kr.or.yi.java_study_01.ch04exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReservationProgram {
	private Scanner sc;
	private Reservation reservation;
	public ReservationProgram() {
		sc = new Scanner(System.in);
		reservation = new Reservation();
		reservation.setS(new String[10]);
		reservation.setA(new String[10]);
		reservation.setB(new String[10]);
		reservation.setRemainSeatS(reservation.getS().length);
		reservation.setRemainSeatA(reservation.getA().length);
		reservation.setRemainSeatB(reservation.getB().length);
		for(int i=0;i<reservation.getS().length;i++) {
			reservation.getS()[i] = " --- ";
		}
		for(int i=0;i<reservation.getA().length;i++) {
			reservation.getA()[i] = " --- ";
		}
		for(int i=0;i<reservation.getB().length;i++) {
			reservation.getB()[i] = " --- ";
		}
	}
	void run() {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		int cnt = 0;
		do {
			try {
				System.out.print("예약:1, 조회:2, 취소:3, 잔여좌석조회:4, 끝내기:5>>");
				cnt = sc.nextInt();
				switch(cnt) {
				case 1: 
					reservate();
					break;		
				case 2:
					 view();
					 break;
				case 3:
					cancel();
					break;
				case 4:
					remainSeat();
					break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("숫자 이외의 다른 문자를 입력하지 마세요");
				sc.nextLine();
			}
		}while(cnt<5);
		finish();
	}
	void reservate() {
		System.out.print("좌석 구분 S(1), A(2), B(3)>>");
		int seatNum = sc.nextInt();
		if(seatNum<0 || seatNum>3) {
			System.out.println("그런 좌석은 없습니다. 다시 입력하세요");
			return;
		}
		int remainSeat = reservation.checkSeat();
		if(remainSeat==-1) {
			System.out.println("남은 좌석이 없습니다.");
			return;
		}
		checkSeat(seatNum);
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("번호>>");
		int num = sc.nextInt();
		switch(seatNum) {
		case 1:
			if(num>reservation.getS().length) {
				System.out.println(num + "번은 없는 좌석입니다. 다시 입력하세요");
				return;
			}
			if(!reservation.getS()[num-1].equals(" --- ")) {
				System.out.println(num + "번은 예약석입니다. 다시 입력하세요");
				return;
			}
			reservation.getS()[num-1] = " " + name + " ";
			reservation.remainSeatS--;
			break;
		case 2:
			if(num>reservation.getA().length) {
				System.out.println(num + "번은 없는 좌석입니다. 다시 입력하세요");
				return;
			}
			if(!reservation.getA()[num-1].equals(" --- ")) {
				System.out.println(num + "번은 예약석입니다. 다시 입력하세요");
				return;
			}
			reservation.getA()[num-1] = " " + name + " ";
			reservation.remainSeatA--;
			break;
		case 3:
			if(num>reservation.getB().length) {
				System.out.println(num + "번은 없는 좌석입니다. 다시 입력하세요");
				return;
			}
			if(!reservation.getB()[num-1].equals(" --- ")) {
				System.out.println(num + "번은 예약석입니다. 다시 입력하세요");
				return;
			}
			reservation.getB()[num-1] = " " + name + " ";
			reservation.remainSeatB--;
			break;
		}	
	}
	void view() {
		reservation.showSeat(reservation.getS(),"S");
		reservation.showSeat(reservation.getA(),"A");
		reservation.showSeat(reservation.getB(),"B");
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	void cancel() {
		System.out.print("좌석 구분 S(1), A(2), B(3)>>");
		int seatNum = sc.nextInt();
		if(seatNum<0 || seatNum>3) {
			System.out.println("그런 좌석은 없습니다. 다시 입력하세요");
			return;
		}
		checkSeat(seatNum);
		int remainSeat = reservation.checkSeat();
		if(remainSeat==-1) {
			System.out.println("남은 좌석이 없습니다.");
			return;
		}
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("번호>>");
		int num = sc.nextInt();
		switch(seatNum) {
		case 1:
			if(!reservation.getS()[num-1].equals(" " + name + " ")) {
				System.out.println(num + "번 좌석의 " + name + "은 존재하지 않습니다. 다시 입력해주세요");
				return;
			}	
			reservation.getS()[num-1] = " --- ";
			reservation.remainSeatS++;
			break;
		case 2:
			if(!reservation.getA()[num-1].equals(" " + name + " ")) {
				System.out.println(num + "번 좌석의 " + name + "은 존재하지 않습니다. 다시 입력해주세요");
				return;
			}	
			reservation.getA()[num-1] = " --- ";
			reservation.remainSeatA++;
			break;
		case 3:
			if(!reservation.getB()[num-1].equals(" " + name + " ")) {
				System.out.println(num + "번 좌석의 " + name + "은 존재하지 않습니다. 다시 입력해주세요");
				return;
			}	
			reservation.getB()[num-1] = " --- ";
			reservation.remainSeatB++;
			break;
		}	
	}
	void checkSeat(int seatNum) {
		switch(seatNum) {
		case 1: 
			reservation.showSeat(reservation.getS(),"S");
			break;
		case 2:
			reservation.showSeat(reservation.getS(),"A");
			break;
		case 3:
			reservation.showSeat(reservation.getS(),"B");
			break;
		}
	}
	void remainSeat() {
		System.out.println("잔여좌석은 S:" + reservation.getRemainSeatS() + "석, A:" + reservation.getRemainSeatA() + "석, B:" + reservation.getRemainSeatB() + "석입니다.");
	}
	void finish() {
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}
}

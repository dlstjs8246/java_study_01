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
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		int cnt = 0;
		do {
			try {
				System.out.print("����:1, ��ȸ:2, ���:3, �ܿ��¼���ȸ:4, ������:5>>");
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
				System.out.println("���� �̿��� �ٸ� ���ڸ� �Է����� ������");
				sc.nextLine();
			}
		}while(cnt<5);
		finish();
	}
	void reservate() {
		System.out.print("�¼� ���� S(1), A(2), B(3)>>");
		int seatNum = sc.nextInt();
		if(seatNum<0 || seatNum>3) {
			System.out.println("�׷� �¼��� �����ϴ�. �ٽ� �Է��ϼ���");
			return;
		}
		int remainSeat = reservation.checkSeat();
		if(remainSeat==-1) {
			System.out.println("���� �¼��� �����ϴ�.");
			return;
		}
		checkSeat(seatNum);
		System.out.print("�̸�>>");
		String name = sc.next();
		System.out.print("��ȣ>>");
		int num = sc.nextInt();
		switch(seatNum) {
		case 1:
			if(num>reservation.getS().length) {
				System.out.println(num + "���� ���� �¼��Դϴ�. �ٽ� �Է��ϼ���");
				return;
			}
			if(!reservation.getS()[num-1].equals(" --- ")) {
				System.out.println(num + "���� ���༮�Դϴ�. �ٽ� �Է��ϼ���");
				return;
			}
			reservation.getS()[num-1] = " " + name + " ";
			reservation.remainSeatS--;
			break;
		case 2:
			if(num>reservation.getA().length) {
				System.out.println(num + "���� ���� �¼��Դϴ�. �ٽ� �Է��ϼ���");
				return;
			}
			if(!reservation.getA()[num-1].equals(" --- ")) {
				System.out.println(num + "���� ���༮�Դϴ�. �ٽ� �Է��ϼ���");
				return;
			}
			reservation.getA()[num-1] = " " + name + " ";
			reservation.remainSeatA--;
			break;
		case 3:
			if(num>reservation.getB().length) {
				System.out.println(num + "���� ���� �¼��Դϴ�. �ٽ� �Է��ϼ���");
				return;
			}
			if(!reservation.getB()[num-1].equals(" --- ")) {
				System.out.println(num + "���� ���༮�Դϴ�. �ٽ� �Է��ϼ���");
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
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	void cancel() {
		System.out.print("�¼� ���� S(1), A(2), B(3)>>");
		int seatNum = sc.nextInt();
		if(seatNum<0 || seatNum>3) {
			System.out.println("�׷� �¼��� �����ϴ�. �ٽ� �Է��ϼ���");
			return;
		}
		checkSeat(seatNum);
		int remainSeat = reservation.checkSeat();
		if(remainSeat==-1) {
			System.out.println("���� �¼��� �����ϴ�.");
			return;
		}
		System.out.print("�̸�>>");
		String name = sc.next();
		System.out.print("��ȣ>>");
		int num = sc.nextInt();
		switch(seatNum) {
		case 1:
			if(!reservation.getS()[num-1].equals(" " + name + " ")) {
				System.out.println(num + "�� �¼��� " + name + "�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
				return;
			}	
			reservation.getS()[num-1] = " --- ";
			reservation.remainSeatS++;
			break;
		case 2:
			if(!reservation.getA()[num-1].equals(" " + name + " ")) {
				System.out.println(num + "�� �¼��� " + name + "�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
				return;
			}	
			reservation.getA()[num-1] = " --- ";
			reservation.remainSeatA++;
			break;
		case 3:
			if(!reservation.getB()[num-1].equals(" " + name + " ")) {
				System.out.println(num + "�� �¼��� " + name + "�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���");
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
		System.out.println("�ܿ��¼��� S:" + reservation.getRemainSeatS() + "��, A:" + reservation.getRemainSeatA() + "��, B:" + reservation.getRemainSeatB() + "���Դϴ�.");
	}
	void finish() {
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
}

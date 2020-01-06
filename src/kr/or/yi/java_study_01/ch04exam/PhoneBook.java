package kr.or.yi.java_study_01.ch04exam;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBook {
	void run() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("�ο���>>");
			int num = sc.nextInt();
			ArrayList<Phone> phone = new ArrayList<Phone>();
			for(int i=0;i<num;i++) {
				System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
				phone.add(new Phone(sc.next(),sc.next()));
			}
			System.out.println("����Ǿ����ϴ�...");
			search(sc,phone);
		}
		catch(InputMismatchException e) {
			System.out.println("���ڸ� ������ �ٸ� ���ڸ� �Է����� ������");
		}
	}
	void search(Scanner sc, ArrayList<Phone> phone) {
		while(true) {
			int cnt = 0;
			System.out.print("�˻��� �̸�>>");
			String name = sc.next();
			if(name.equals("�׸�")) {
				break;
			}
			for(int i=0;i<phone.size();i++) {
				if(name.equals(phone.get(i).getName())) {
					System.out.println(phone.get(i).getName() + "�� ��ȣ�� " + phone.get(i).getTel());
					cnt++;
				}
			}
			if(cnt==0) {
				System.out.println("�׷� �̸��� �������� �ʽ��ϴ�.");
			}
		}	
	}
}

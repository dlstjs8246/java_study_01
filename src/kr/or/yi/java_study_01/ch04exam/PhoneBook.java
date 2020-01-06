package kr.or.yi.java_study_01.ch04exam;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBook {
	void run() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("인원수>>");
			int num = sc.nextInt();
			ArrayList<Phone> phone = new ArrayList<Phone>();
			for(int i=0;i<num;i++) {
				System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
				phone.add(new Phone(sc.next(),sc.next()));
			}
			System.out.println("저장되었습니다...");
			search(sc,phone);
		}
		catch(InputMismatchException e) {
			System.out.println("숫자를 제외한 다른 문자를 입력하지 마세요");
		}
	}
	void search(Scanner sc, ArrayList<Phone> phone) {
		while(true) {
			int cnt = 0;
			System.out.print("검색할 이름>>");
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			for(int i=0;i<phone.size();i++) {
				if(name.equals(phone.get(i).getName())) {
					System.out.println(phone.get(i).getName() + "의 번호는 " + phone.get(i).getTel());
					cnt++;
				}
			}
			if(cnt==0) {
				System.out.println("그런 이름은 존재하지 않습니다.");
			}
		}	
	}
}

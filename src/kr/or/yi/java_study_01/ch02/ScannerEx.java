package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름,도시,나이,체중,독신 여부를 빈칸으로 분리하여 입력하세요. >>");
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println(scanner.nextLine()); nextline으로 쓰게 되면 한줄씩 읽으므로 토큰 단위로 가져오지 못함
		
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean isSingle = scanner.nextBoolean();
		
		System.out.printf("이름 %s 도시 %s 나이 %d 체중 %.1f 독신여부 %b %n",
				           name,city,age,weight,isSingle);
		
		scanner.close();
		
	}

}

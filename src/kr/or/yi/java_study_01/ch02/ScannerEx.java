package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�,����,����,ü��,���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���. >>");
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println(scanner.nextLine()); nextline���� ���� �Ǹ� ���پ� �����Ƿ� ��ū ������ �������� ����
		
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean isSingle = scanner.nextBoolean();
		
		System.out.printf("�̸� %s ���� %s ���� %d ü�� %.1f ���ſ��� %b %n",
				           name,city,age,weight,isSingle);
		
		scanner.close();
		
	}

}

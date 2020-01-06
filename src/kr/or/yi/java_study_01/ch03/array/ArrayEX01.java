package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class ArrayEX01 {
	public static void main(String[] args) {
//		array01();
//		array02();
//		array03();
		Scanner sc = new Scanner(System.in);
		array04(sc);
	}

	private static void array04(Scanner sc) {
		int[] intArr = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("������(int) ������ " + max + " ~ " + min);
		System.out.print("���� 5���� �Է��ϼ��� ");
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = sc.nextInt();
			if(intArr[i]>max) {
				max = intArr[i];
			}
			if(intArr[i]<min) {
				min = intArr[i];
			}
		}
		System.out.println("�Է��� ���� ���� ���� ���� " + min + " ���� ū���� " + max + "�Դϴ�.");
		
		System.out.print("ã�����ϴ� �������� �Է��ϼ��� ");
		int searchKey = sc.nextInt();
		//intArr�� searchKey�� �����ϸ� "��ġ�ϰ� �ִ� �ε����� ����ϰ� ã�� ���ϸ� -1�� ����ϵ��� �ۼ��Ͻÿ�
		for(int i=0;i<intArr.length;i++) {
			if(searchKey==intArr[i]) {
				System.out.printf("ã���� �ϴ� ���� ���� �ε����� %d�Դϴ�",i<intArr.length?i:-1);
			}
			
			if(searchKey!=intArr[i]) {
				System.out.printf("ã���� �ϴ� ���� ���� �ε����� %d�Դϴ�",-1);
				break;
			}
		}
	}

	private static void array03() {
		char[] chArr = new char[26];
		char ch = 'a';
		for(int i=0;i<chArr.length;i++) {
			chArr[i] = ch++; 
		}
		for(int i=0;i<chArr.length;i++) {
			System.out.print(chArr[i] + " ");
		}
	}

	private static void array02() {
		int[] intArray = {5,4,3,2,1};
		System.out.println("�迭�� ũ�� " + intArray.length);
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i] + " ");
		}
		intArray[2] = 10;
		System.out.println();
		int[] myArray = intArray;
		for(int i=0;i<myArray.length;i++) {
			System.out.print(myArray[i] + " ");
		}
	}

	private static void array01() {
		int[] intArray01 = null; // ������ �迭 ���� 
		intArray01 = new int[5];
		System.out.println("�迭�� ũ�� " + intArray01.length);
		for(int i=0;i<intArray01.length;i++) {
			System.out.print(intArray01[i]);
		}
	}
}

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
		System.out.println("정수형(int) 범위는 " + max + " ~ " + min);
		System.out.print("정수 5개를 입력하세요 ");
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = sc.nextInt();
			if(intArr[i]>max) {
				max = intArr[i];
			}
			if(intArr[i]<min) {
				min = intArr[i];
			}
		}
		System.out.println("입력한 수는 가장 작은 수는 " + min + " 가장 큰수는 " + max + "입니다.");
		
		System.out.print("찾고자하는 정수값을 입력하세요 ");
		int searchKey = sc.nextInt();
		//intArr에 searchKey가 존재하면 "위치하고 있는 인덱스를 출력하고 찾지 못하면 -1을 출력하도록 작성하시오
		for(int i=0;i<intArr.length;i++) {
			if(searchKey==intArr[i]) {
				System.out.printf("찾고자 하는 정수 값의 인덱스는 %d입니다",i<intArr.length?i:-1);
			}
			
			if(searchKey!=intArr[i]) {
				System.out.printf("찾고자 하는 정수 값의 인덱스는 %d입니다",-1);
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
		System.out.println("배열의 크기 " + intArray.length);
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
		int[] intArray01 = null; // 정수형 배열 선언 
		intArray01 = new int[5];
		System.out.println("배열의 크기 " + intArray01.length);
		for(int i=0;i<intArray01.length;i++) {
			System.out.print(intArray01[i]);
		}
	}
}

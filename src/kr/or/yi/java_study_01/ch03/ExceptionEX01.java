package kr.or.yi.java_study_01.ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEX01 {
	public static void main(String[] args) {
//		arithmeticException();
		arrayIndexOutOfBoundException();
	}

	private static void arrayIndexOutOfBoundException() {
		try {
			/*
			 * System.out.println(5/0); int[] intArr = new int[5]; intArr[5] = 0;
			 */
			/*
			 * Scanner sc = new Scanner(System.in); int b = sc.nextInt(); sc.close();
			 */
			int c = Integer.parseInt("a");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("intArr[5]는 존재하지 않는 인덱스입니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch(InputMismatchException e) {
			System.out.println("다른 타입을 입력할 수 없습니다.");
		}
		catch(NumberFormatException e) {
			System.out.println("문자화 된 숫자만 입력하세요");
		}
		/*catch(Exception e) {
			System.out.println("그 외 다른 예외 발생");
		}*/
	}

	private static void arithmeticException() {
		Scanner sc = new Scanner(System.in);
		int divdend;
		int divisor;
		while(true) {
			System.out.print("나뉨수를 입력하세요. ");
			divdend = sc.nextInt();
			System.out.print("나눗수를 입력하세요. ");
			divisor = sc.nextInt();
			try {
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다.",divdend,divisor,divdend/divisor);
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
		sc.close();
	}
}

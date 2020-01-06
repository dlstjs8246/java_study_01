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
			System.out.println("intArr[5]�� �������� �ʴ� �ε����Դϴ�.");
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		catch(InputMismatchException e) {
			System.out.println("�ٸ� Ÿ���� �Է��� �� �����ϴ�.");
		}
		catch(NumberFormatException e) {
			System.out.println("����ȭ �� ���ڸ� �Է��ϼ���");
		}
		/*catch(Exception e) {
			System.out.println("�� �� �ٸ� ���� �߻�");
		}*/
	}

	private static void arithmeticException() {
		Scanner sc = new Scanner(System.in);
		int divdend;
		int divisor;
		while(true) {
			System.out.print("�������� �Է��ϼ���. ");
			divdend = sc.nextInt();
			System.out.print("�������� �Է��ϼ���. ");
			divisor = sc.nextInt();
			try {
				System.out.printf("%d�� %d�� ������ ���� %d�Դϴ�.",divdend,divisor,divdend/divisor);
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
			}
		}
		sc.close();
	}
}

package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.print("�� ������ �Է��Ͻÿ�. �������� �и� >> ");
		
		Scanner sc = new Scanner(System.in); // ctrl + shift + o <-- �ڵ����� import
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res = sum(a,b);
		System.out.printf("�� ��(%d %d)�� ���� %d%n",a,b,res);
		
		res = sub(a,b); //�� ���� ��
		System.out.printf("�� ��(%d %d)�� ���� %d%n",a,b,res);
		
		res = mul(a,b); //�� ���� ��
		System.out.printf("�� ��(%d %d)�� ���� %d%n",a,b,res);
		
		res = (int)div(a,b); //�� ���� ������
		System.out.printf("�� ��(%d %d)�� ������� %.2f%n",a,b,div(a,b));
		sc.close();
	}

	private static int sum(int a, int b) {
		return a + b;
	}
	private static int sub(int a, int b) {
		return a - b;
	}
	private static int mul(int a, int b) {
		return a * b;
	}
	private static float div(int a, int b) {
		return (float)a / (float)b;
	}

}

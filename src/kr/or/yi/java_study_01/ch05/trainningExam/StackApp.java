package kr.or.yi.java_study_01.ch05.trainningExam;

import java.util.Scanner;

public class StackApp implements Stack {
	int length;
	int capacity;
	String[] stack;
	@Override
	public int length() { //������ ����
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public int capacity() { //������ �뷮
		// TODO Auto-generated method stub
		return capacity;
	}

	@Override
	public String pop() { //������ ������ ���
		if(capacity<0) {
			System.out.println("���ڿ��� ��� �� �Ұ�!");
			return null;
		}
		return stack[--capacity];
	}

	@Override
	public boolean push(String val) { //���ÿ� ������ �Է�
		if(capacity==length) {
			System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			return false;
		}
		stack[capacity++] = val;
		return true;
	}
}
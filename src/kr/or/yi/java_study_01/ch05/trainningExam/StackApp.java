package kr.or.yi.java_study_01.ch05.trainningExam;

import java.util.Scanner;

public class StackApp implements Stack {
	int length;
	int capacity;
	String[] stack;
	@Override
	public int length() { //스택의 길이
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public int capacity() { //스택의 용량
		// TODO Auto-generated method stub
		return capacity;
	}

	@Override
	public String pop() { //스택의 데이터 출력
		if(capacity<0) {
			System.out.println("문자열이 없어서 팝 불가!");
			return null;
		}
		return stack[--capacity];
	}

	@Override
	public boolean push(String val) { //스택에 데이터 입력
		if(capacity==length) {
			System.out.println("스택이 꽉 차서 푸시 불가!");
			return false;
		}
		stack[capacity++] = val;
		return true;
	}
}
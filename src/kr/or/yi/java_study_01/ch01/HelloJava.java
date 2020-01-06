package kr.or.yi.java_study_01.ch01;

public class Test {

} // 파일명과 동일한 class만 public을 붙일수 있음. 파일 안에는 하나의 클래스만 사용하는게 원칙임

public class HelloJava {

	public static void main(String[] args) {
		// 함수 내에서 선언된 변수는 지역변수(public value)
		String name = "이상원";
		// 문자열 + 변수 => 문자열 + 문자열 => 하나의 문자열(문자열 결합연산자(+))
		// 하나의 열 주석(ctrl + /) 주석 해제(ctrl + /)
		/* 블럭주석 (ctrl + shift + /) 블록주석해제 (ctrl + shift + \ ) */
		// 자동 들여쓰기 ctrl + shift + f 
		System.out.println("힘들지 " + name);
	}

}

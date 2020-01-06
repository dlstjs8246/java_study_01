package kr.or.yi.java_study_01.ch02;

/**
 * 소스 파일 : Hello.java
 * 작성일 : 2019.11.20
 * 아래 클래스에 대한 설명을 적음.
 * 문서화 주석 : alt + shift + j
 */
public class Hello {
	final double PI = 3.141592;
	public static void main(String[] args) {
		//지역 변수(함수 내 선언된 변수)
		// 할당 연산자(배정연산자) -> l-value(저장소) = r-value(값)
		int i = 20; // 선언과 초기화
		int s; // 정수형 변수 선언
		char a; // 문자형 변수 선언
		
		s = sum(i,10);
		a = '?';
		PI = 3.14; // 상수형은 값 변경이 불가능함
		
		System.out.println(a + "hello" + (s + 10));
		System.out.printf("%c %-10s %d %5.2f\n",a,"Hello",s,55/3.0);
		System.out.printf("n = %d, m = %d\n",n,m); // n,m은 sum 내의 지역변수라 j가 선언이 안되어 있어 안됨
		// '?' + "Hello" + 30
		// "?" + "Hello" + 30
		// "?Hello" + 30
		// "?Hello" + "30"
		// "?Hello30"
		// 숫자 + 숫자 : + ->더하기 연산자
		// 숫자 + 문자 : + ->문자열 결합 연산자
	}

	private static int sum(int n, int m) { //alt + shift + r 블럭지정하여 모두 변경
		return n + m;
	}
}

/*
 * 카멜 표기식 = 클래스 : 첫번째 문자는 대문자 시작 각 단어 첫번째 문자만 대문자 
 * 변수 : 첫 단어 이후 각 단어의 첫번째는 대문자로 시작
 * 헝가라인 표기식 = 타입과 문자를 같이 선언
 */


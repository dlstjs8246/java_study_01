package kr.or.yi.java_study_01.ch05.inter;

public interface PhoneInterface {
	//상수, 추상 메소드, 디폴드 메소드만 선언 가능
	public static final int TIMEOUT = 1000; // 상수(public static final 생략 가능)
	public abstract void sendCall(); //추상메서드(public abstract 생략 가능)
	public abstract void receiveCall(); //추상메서드(public abstract 생략 가능)
	public default void prnLogo() { //디폴드 메서드(public default 생략 가능)
		System.out.println("** phone **");
	}
}

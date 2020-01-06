package kr.or.yi.java_study_01.ch04;

public class TestMain {

	public static void main(String[] args) {
//		prnTest(); 
		TestMain tm = new TestMain();
		tm.prnTest();
	}
	public static void prn() {
		System.out.println("ㅎㅎㅎ");
	}
	public void prnTest() {
		System.out.println("HaHa");
		TestMain.prn(); // 객체(인스턴스)에서는 그 객체의 static method 호출 가능
	}
}

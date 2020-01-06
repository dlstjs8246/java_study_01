package kr.or.yi.java_study_01.ch05;

public class Ch05Main {
	public static void main(String[] args) {
//		point();
//		point2();
		test();
	}
	private static void test() {
//		A a = new A();
//		B b = (B) a; //Runtime시 error발생(CastException 발생 - B객체가 존재하지 않음)
		
		//Down Casting
		B bb = new B();
		A ab = bb;
		B bbb = (B)ab;
		bbb.prn();
		
		//Up Casting
		A a = new B();
		a.prn();
	}
	private static void point2() {
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();
		
	}

	private static void point() {
		Point p = new Point();
		p.setXY(1, 2);
		p.showPoint();
		ColorPoint cp = new ColorPoint();
		cp.setColor("red");
		cp.setXY(3,4);
		cp.showColorPoint();
	}
}

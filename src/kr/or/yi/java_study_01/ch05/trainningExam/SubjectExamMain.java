package kr.or.yi.java_study_01.ch05.trainningExam;

import java.util.Arrays;

import kr.or.yi.java_study_01.ch05.trainningExam.Outer1.Inner1;
import kr.or.yi.java_study_01.ch05.trainningExam.Outer2.Inner2;

class Outer1 {
	class Inner1 {
		int iv = 100;
	}
}
class Outer2 {
	static class Inner2 {
		int iv = 100;	
	}
}

public class SubjectExamMain {
	public static void main(String[] args) {
//		student(); //클래스 문제1,2
//		testTv(); //클래스 문제3
//		max(); //클래스 문제4
//		buyer(); //클래스 문제8
//		test(); //클래스 문제9,10
	}

	private static void test() {
		Outer1 o = new Outer1();
		Inner1 i = o.new Inner1();
		Inner2 i2 = new Outer2.Inner2(); 
		System.out.println("Inner1 iv " + i.iv);
		System.out.println("Inner2 iv " + i2.iv);
	}

	private static void buyer() {
		Buyer b = new Buyer();
		b.buy(new CurvedTv());
		b.buy(new Computer());
		b.buy(new CurvedTv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summany();
	}

	private static void max() {
		int[] data = {3,2,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값:" + Max.max(data));
		System.out.println("최대값:" + Max.max(null));
		System.out.println("최대값:" + Max.max(new int[]{}));
	}

	private static void testTv() {
		MyTv tv = new MyTv();
		tv.setChannel(100);
		tv.setVolume(0);
		System.out.println("CH: " + tv.getChannel() + ", VOL :" + tv.getVolume());
		
		tv.channelDown();
		tv.volumeDown();
		System.out.println("CH: " + tv.getChannel() + ", VOL :" + tv.getVolume());
		
		tv.setVolume(100);
		tv.channelUp();
		tv.volumeUp();
		System.out.println("CH: " + tv.getChannel() + ", VOL :" + tv.getVolume());
	}

	private static void student() {
		Student2 stu = new Student2("박인선",1,78,85,41);
		System.out.println(stu.getName() + "의 총점은 " + stu.getTotal() + "점, 평균은 " + stu.getAverage() + "점 입니다.");
	}
}

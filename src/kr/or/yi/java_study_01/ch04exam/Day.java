package kr.or.yi.java_study_01.ch04exam;

public class Day {
	private String work;
	void set(String work) {
		this.work = work;
	}
	void show() {
		if(work==null) {
			System.out.println("없습니다.");
		}
		else {
			System.out.println(work + "입니다.");
		}
	}
}

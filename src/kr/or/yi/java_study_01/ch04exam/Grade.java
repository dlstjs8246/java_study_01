package kr.or.yi.java_study_01.ch04exam;

public class Grade {
	private int math;
	private int science;
	private int english;
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	double average() {
		return Math.round(((math+science+english)/3));
	}
}

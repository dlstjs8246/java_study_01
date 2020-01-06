package kr.or.yi.java_study_01.ch05.trainningExam;

abstract class Calc {
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract double calculate();
}

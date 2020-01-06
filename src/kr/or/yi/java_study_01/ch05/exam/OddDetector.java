package kr.or.yi.java_study_01.ch05.exam;

abstract class OddDetector {
	protected int n;
	public OddDetector(int n) {
		this.n = n;
	}
	public abstract boolean isOdd();
}

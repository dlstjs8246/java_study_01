package kr.or.yi.java_study_01.ch05.exam;

public class B extends OddDetector {

	public B(int n) {
		super(n);
	}

	@Override
	public boolean isOdd() {
		if(n%2==1) {
			return true;
		}
		return false;
	}
}

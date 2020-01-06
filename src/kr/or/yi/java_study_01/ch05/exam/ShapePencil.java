package kr.or.yi.java_study_01.ch05.exam;

public class ShapePencil extends Pen implements Refill {
	private int width;

	@Override
	public void refill(int n) {
		setAmount(n);
	}
	
}

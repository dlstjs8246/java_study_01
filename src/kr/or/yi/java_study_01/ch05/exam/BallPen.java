package kr.or.yi.java_study_01.ch05.exam;

public class BallPen extends Pen implements Refill {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void refill(int n) {
		setAmount(n); 
	}
	
}

package kr.or.yi.java_study_01.ch05.trainningExam;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		setXY(0, 0);
		color = "BLACK";
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return String.format("%s색의 (%d,%d)의 점",color,getX(),getY());
	}
}

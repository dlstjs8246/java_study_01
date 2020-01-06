package kr.or.yi.java_study_01.ch04;

public class Rectancle {
	int width;
	int height;
	
	
	
	public Rectancle() {
		
	}

	public Rectancle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return String.format("Rectancle [width=%s, height=%s, getArea()=%s]", width, height, getArea());
	}

	public int getArea() {
		return width * height;
	}
}

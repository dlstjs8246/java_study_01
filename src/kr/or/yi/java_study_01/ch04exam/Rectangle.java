package kr.or.yi.java_study_01.ch04exam;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	int square() {
		return (width * height);
	}
	void show() {
		System.out.println("(" + x + "," + y + ")" + "에서 크기가 " + width + "x" + height + "인 사격형");
	}
	boolean contains(Rectangle r) {
		if(x<r.x && y<r.y) {
			if(x+width > r.x+r.width && y+height > r.y + r.width) {
				return true;
			}
		}
		return false;
	}
}

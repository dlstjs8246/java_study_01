package kr.or.yi.java_study_01.ch04exam;

public class Circle {
	private double x;
	private double y;
	private int radius;
	private double area;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double getX() {
		return x;
	}

	double getY() {
		return y;
	}

	int getRadius() {
		return radius;
	}
	
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	void show() {
		System.out.println("(" + x +"," + y + ")" + radius);
	}
	void showBig() {
		System.out.println("가장 면적이 큰 원은 " + "(" + x +"," + y + ")" + radius);
	}
	double getArea() {
		area = radius * radius * Math.PI;
		return area;
	}
	boolean isBig(Circle c) {
		if(getArea() > c.getArea()) {
			return true;
		}
		return false;
	}
}

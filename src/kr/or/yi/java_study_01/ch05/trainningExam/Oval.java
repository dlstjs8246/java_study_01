package kr.or.yi.java_study_01.ch05.trainningExam;

public class Oval implements ShapeInterface {
	private int radiusX;
	private int radiusY;
	
	public Oval(int radiusX, int radiusY) {
		this.radiusX = radiusX;
		this.radiusY = radiusY;
	}

	@Override
	public void draw() {
		System.out.println(radiusX + "x" + radiusY + "에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		return PI*radiusX*radiusY;
	}

}

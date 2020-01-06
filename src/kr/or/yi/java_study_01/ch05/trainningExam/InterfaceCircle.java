package kr.or.yi.java_study_01.ch05.trainningExam;

public class InterfaceCircle implements ShapeInterface {
	private int radius;
	public InterfaceCircle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}

	@Override
	public double getArea() {
		return PI*radius*radius;
	}

}

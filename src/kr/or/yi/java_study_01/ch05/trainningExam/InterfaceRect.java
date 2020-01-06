package kr.or.yi.java_study_01.ch05.trainningExam;

public class InterfaceRect implements ShapeInterface {
	private int width;
	private int height;
	
	public InterfaceRect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println(width + "x" + height + "크기의 사각형입니다.");
	}

	@Override
	public double getArea() {
		return width*height;
	}

}

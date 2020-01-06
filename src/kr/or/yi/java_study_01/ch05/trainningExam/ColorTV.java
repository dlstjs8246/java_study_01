package kr.or.yi.java_study_01.ch05.trainningExam;

public class ColorTV extends TV {
	private int color; 
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	public int getColor() {
		return color;
	}
	void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
	
}

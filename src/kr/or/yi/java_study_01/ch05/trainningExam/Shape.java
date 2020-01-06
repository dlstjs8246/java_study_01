package kr.or.yi.java_study_01.ch05.trainningExam;

public abstract class Shape {
	private Shape next;

	public Shape getNext() {
		return next;
	}

	public void setNext(Shape next) {
		this.next = next;
	}
	public abstract void draw();
}

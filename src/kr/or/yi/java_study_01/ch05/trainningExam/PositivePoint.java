package kr.or.yi.java_study_01.ch05.trainningExam;

public class PositivePoint extends Point {
	public PositivePoint() {
		
	}
public PositivePoint(int x,int y) {
		if(x<0 || y<0) {
			return;
		}
		setXY(x,y);
	}
	@Override
	public void move(int x,int y) {
		if(x<0 || y<0) {
			return;
		}
		setXY(x,y);
	}
	
	@Override
	public String toString() {
		return String.format("(%d,%d)ÀÇ Á¡",getX(),getY());
	}
}

package kr.or.yi.java_study_01.ch05.trainningExam;

class Point {
	private int x;
	private int y;
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

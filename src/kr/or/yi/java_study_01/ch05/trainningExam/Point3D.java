package kr.or.yi.java_study_01.ch05.trainningExam;

public class Point3D extends Point {
	private int z;

	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}

	public int getZ() {
		return z;
		
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void moveUp() {
		z++;
	}
	public void moveDown() {
		z--;
	}
	public void move(int x, int y, int z) {
		setXY(x,y);
		this.z = z;
	}

	@Override
	public String toString() {
		return String.format("(%d,%d,%d)ÀÇ Á¡",getX(),getY(),z);
	}
	
}

package kr.or.yi.java_study_01.ch04exam;

public class Reservation {
	private String[] s;
	private String[] a;
	private String[] b;
	int remainSeatS;
	int remainSeatA;
	int remainSeatB;
	public Reservation() {
		
	}
	public String[] getS() {
		return s;
	}
	public void setS(String[] s) {
		this.s = s;
	}
	public String[] getA() {
		return a;
	}
	public void setA(String[] a) {
		this.a = a;
	}
	public String[] getB() {
		return b;
	}
	public void setB(String[] b) {
		this.b = b;
	}
	
	public int getRemainSeatS() {
		return remainSeatS;
	}
	public void setRemainSeatS(int length) {
		this.remainSeatS = length;
	}
	public int getRemainSeatA() {
		return remainSeatA;
	}
	public void setRemainSeatA(int length) {
		this.remainSeatA = length;
	}
	public int getRemainSeatB() {
		return remainSeatB;
	}
	public void setRemainSeatB(int length) {
		this.remainSeatB = length;
	}
	void showSeat(String[] seat,String seatName) {
		System.out.print(seatName + ">> ");
		for(String s : seat) {
			System.out.print(s);
		}
		System.out.println();
	}
	int checkSeat() {
		if(remainSeatS==0 || remainSeatA==0 || remainSeatB==0) {
			return -1;
		}
		return 0;
	}
	
}


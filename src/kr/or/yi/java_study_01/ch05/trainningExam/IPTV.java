package kr.or.yi.java_study_01.ch05.trainningExam;

public class IPTV extends ColorTV {
	private String ip;
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
		// TODO Auto-generated constructor stub
	}
	void printProperty() {
		System.out.println("���� IPTV�� " + ip + " �ּ��� " + getSize() + "��ġ " + getColor() + "�÷�");
	}
	
}

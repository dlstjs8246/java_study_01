package kr.or.yi.java_study_01.ch04exam;

public class TV {
	private String name;
	private int year;
	private int inch;
	
	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.println(name + "���� ���� " + year + "����" + inch + "��ġ TV");
	}
	
}


package kr.or.yi.java_study_01.ch05.trainningExam;

public class Student2 {
	private String name;
	private int ban;
	private int kor;
	private int eng;
	private int math;

	public Student2(String name, int ban, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		return (float)getTotal()/3;
	}
	
}

package kr.or.yi.java_study_01.ch04exam;

public class Student {
	private int stdNo;
	private String stdName;
	private int kor;
	private int eng;
	private int math;
	public Student() {
		
	}
	public Student(int stdNo, String stdName, int kor, int eng, int math) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student(int stdNo) {
		this.stdNo = stdNo;
	}
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getStdName() {
		return stdName;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public double total() {
		return kor + eng + math;
	}
	public double avg() {
		return total()/3.0;
	}
	@Override
	public String toString() {
		return String.format("[%2d %-5s %3d %3d %3d %.0f %.2f]", stdNo,
				stdName, kor, eng, math, total(), avg());
	}
	
}

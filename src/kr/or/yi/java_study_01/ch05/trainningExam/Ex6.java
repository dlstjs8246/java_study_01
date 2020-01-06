package kr.or.yi.java_study_01.ch05.trainningExam;
class Unit{};
class AirUnit extends Unit{};
class GroundUnit extends Unit{};
class Tank extends GroundUnit{};
class AirCraft extends AirUnit{};
public class Ex6 {
	public static void main(String[] args) {
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		u = (Unit)ac;
		u = ac;
		GroundUnit gu = (GroundUnit)u;
		AirUnit au = ac;
		t = (Tank)u;
		GroundUnit gu1 = t;
	}
}

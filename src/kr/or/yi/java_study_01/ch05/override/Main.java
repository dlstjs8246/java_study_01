package kr.or.yi.java_study_01.ch05.override;

public class Main {
	public static void main(String[] args) {
//		draw();
//		travel();
		weapon();
	}

	private static void weapon() {
		Weapon weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		Weapon cannon = new Cannon();
		System.out.println("대포 무기의 살상 능력은 " + cannon.fire());
		
	}

	private static void travel() { //LinkedList를 통하여 연결하여 출력 
		Shape start;
		Shape last;
		Shape obj;
		start = new Line();
		last = start;
		obj = new Rect();
		last.next = obj;
		last = obj;
		obj = new Line();
		last.next = obj;
		last = obj;
		obj = new Circle();
		last.next = obj;
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}

	private static void draw() {
		Line line = new Line();
		MethodOverridingEX.paint(line);
		MethodOverridingEX.paint(new Shape());
		MethodOverridingEX.paint(new Line());
		MethodOverridingEX.paint(new Rect());
		MethodOverridingEX.paint(new Circle());
	}
}

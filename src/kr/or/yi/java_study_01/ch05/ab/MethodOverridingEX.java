package kr.or.yi.java_study_01.ch05.ab;

public class MethodOverridingEX {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		array_to();
	}
	private static void array_to() {
		Line line = new Line();
		
		Shape[] shapes = {line, new Rect(), new Circle()};
		
		for(Shape s : shapes) {
			s.draw();
		}
	}
}

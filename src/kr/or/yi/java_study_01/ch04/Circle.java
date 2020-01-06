package kr.or.yi.java_study_01.ch04;

public class Circle extends Object {
	public int radius;
	public String name;
	
	public Circle() {
		super(); // 부모 생성자 호출
	};
	
	public Circle(String name) {
		this.name = name;
	} // 생성자 Overroading(중복 정의)
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(int radius, String name) {
		super();
		this.radius = radius;
		this.name = name;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return String.format("Circle [radius=%s, name=%s, getArea()=%.2f]%n", radius, name, getArea());
	} //메소드 Overriding(재정의)
	
}

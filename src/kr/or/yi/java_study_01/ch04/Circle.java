package kr.or.yi.java_study_01.ch04;

public class Circle extends Object {
	public int radius;
	public String name;
	
	public Circle() {
		super(); // �θ� ������ ȣ��
	};
	
	public Circle(String name) {
		this.name = name;
	} // ������ Overroading(�ߺ� ����)
	
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
	} //�޼ҵ� Overriding(������)
	
}

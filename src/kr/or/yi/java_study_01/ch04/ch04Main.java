package kr.or.yi.java_study_01.ch04;

public class ch04Main {
	public static void main(String[] args) {
//		circle();
//		rectancle();
//		book();
//		circle2();
//		book2();
		
	}

	private static void book2() {
		Book book1 = new Book();
		System.out.println(book1);
	}

	private static void circle2() {
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(2);
		Circle ob3 = new Circle(3);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		ob1.setRadius(4);
		ob2.setRadius(5);
		ob3.setRadius(6);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}

	private static void book() {
		Book littlePrince = new Book("�����", "�����㺣��");
		Book loveStory = new Book("������");
		Book book2 = new Book();
		System.out.println(littlePrince);
		System.out.println(loveStory);
	}

	private static void rectancle() {
		Rectancle rect = new Rectancle();
		rect.width = 5;
		rect.height = 6;
		System.out.println(rect);
		Rectancle rect2 = new Rectancle(4,5);
		System.out.println(rect2);
	}

	private static void circle() {
		Circle c1 = new Circle();
		System.out.println(c1.name + " " + c1.radius);
		Object c2 = new Circle();
		System.out.println(c1.name + " " + c1.radius);
		c1.name = "��������";
		c1.radius = 100;
//		System.out.println(c1.name + " " + c1.radius + " " + c1.getArea());
		System.out.println(c1);
		((Circle)c2).name = "���۷δ�";
		
		((Circle)c2).radius = 50;
//		System.out.println(((Circle)c2).name + " " + ((Circle)c2).radius + " " + ((Circle)c2).getArea());
		System.out.println(c2);
		
		Circle c3 = new Circle(30, "��ī������");
		System.out.println(c3);
		Circle c4 = new Circle("�Ͽ��̾�����");
		c4.radius = 50;
		System.out.println(c4);
	}
}

package kr.or.yi.java_study_01.ch05.trainningExam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		colorTV(); //�ǽ�����1
//	    iptv(); //�ǽ�����2
//		wonToDollar(); //�ǽ�����3
//		kmToMile(); //�ǽ�����4
//	    colorPoint(); //�ǽ�����5
//		colorPoint2(); //�ǽ�����6
//		point3D(); //�ǽ�����7
//		positivePoint(); //�ǽ�����8
//		stackApp(); //�ǽ�����9
//		dicApp(); //�ǽ�����10
//		calApp(); //�ǽ�����11
//		beauty(); //�ǽ�����12
//		donut(); //�ǽ�����13
//		shapeList(); //�ǽ�����14
	}

	private static void beauty() {
		Beauty b = new Beauty();
		Shape p = null;
		Shape prev = b.getStart();
		Shape cur = b.getStart();
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		while(menu<4) {
			System.out.println("�׷��� ������ Beauty�� �����մϴ�.");
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				makeList(sc,b);
				break;
			case 2:
				deleteList(sc,b,prev,cur);
				break;
			case 3:
				showLists(b,p);
				break;
			}
		}
		System.out.println("�׷��� ������ Beauty�� �����մϴ�.");
		sc.close();
	}

	private static void showLists(Beauty b, Shape p) {
		p = b.getStart();
		while(p!=null) { 
			p.draw();
			p = p.getNext();	
		}	
	}

	private static void deleteList(Scanner sc, Beauty b, Shape prev, Shape cur) {
		System.out.print("������ ������ ��ġ>> ");
		int postion = sc.nextInt(); //�ε��� �� �Է�
		Shape p=b.getStart(); //����Ʈ�� �ε��� üũ
		if(b.getStart()==null) {
			System.out.println("����Ʈ�� �������� �ʽ��ϴ�.");
			return;
		}
		for(int i=0;i<postion && p!=null;i++) {
			prev = cur;
			cur = prev.getNext();
			p = p.getNext();
		}
		if(p==null) { //������ ��ġ�� �ε��� ������ �ʰ��� ���
			System.out.println("����Ʈ�� �ε��� ������ �ʰ��Ͽ����ϴ�.");
			return;
		}
		if(b.getStart()==b.getEnd()) { //�ϳ��� ��常 �ִ� ���
			b.setStart(null);
			b.setEnd(null);
			b.setCheckStart(false);
			return;
		}
		else {
			if(prev==cur) {//ù��° ����Ʈ �ε����� �Է�
				cur = prev.getNext();
				b.setStart(cur);
			}
			else if(cur.getNext()==null) { //cur�� ������ ��带 ����ų��
				prev.setNext(null);
				b.setEnd(prev);
			}
			else { //ù��°�� ������ ����� �ε����� �Է����� ���� ���
				prev.setNext(cur.getNext());
				b.setStart(prev);
			}
		}
	}

	private static void makeList(Scanner sc, Beauty b) {
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		int menu = sc.nextInt();
		Shape tmp = null;
		if(menu>3) {
			System.out.println("�׷� �޴��� �����ϴ�. �ٽ� �Է��ϼ���");
			return;
		}
		switch(menu) {
		case 1:
			if(b.isCheckStart()==false) {
				tmp = new Line();
				b.setStart(tmp);
				b.setEnd(tmp);
				b.setCheckStart(true);
				return;
			}
			tmp = new Line();
			break;
		case 2:
			if(b.isCheckStart()==false) {
				tmp = new Rect();
				b.setStart(tmp);
				b.setEnd(tmp);
				b.setCheckStart(true);
				return;
			}
			tmp = new Rect();
			break;
		case 3:
			if(b.isCheckStart()==false) {
				tmp = new Circle();
				b.setStart(tmp);
				b.setEnd(tmp);
				b.setCheckStart(true);
				return;
			}
			tmp = new Circle();
			break;
		}
		b.getEnd().setNext(tmp);
		b.setEnd(tmp);
	}

	private static void calApp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String oper = sc.next();
		switch(oper) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println((int)add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println((int)sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println((int)mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.printf("%.2f",div.calculate());
			break;
		}	
		sc.close();
	}

	private static void dicApp() {
		PairMap dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}

	private static void stackApp() {
		Scanner sc = new Scanner(System.in);
		StackApp s = new StackApp();
		String val = "";
		System.out.print("�� ���� ���� ������ ũ�� �Է� >>");
		s.length = sc.nextInt();
		s.stack = new String[s.length()];
		while(true) {
			System.out.print("���ڿ� �Է� >>");
			val = sc.next();
			if(val.equals("�׸�")) {
				break;
			}
			s.push(val);
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		for(int i=s.capacity;i>0;i--) {
			System.out.print(s.pop() + " ");
		}
		System.out.println();
		sc.close();
		
	}

	private static void shapeList() {
		ShapeInterface[] list = new ShapeInterface[3];
		list[0] = new InterfaceCircle(10);
		list[1] = new Oval(20,30);
		list[2] = new InterfaceRect(10,40);
		
		for(int i=0;i<list.length;i++) {
			list[i].redraw();
		}
		for(int i=0;i<list.length;i++) {
			System.out.println("������ " + list[i].getArea());
		}
	}

	private static void donut() {
		ShapeInterface donut = new InterfaceCircle(10);
		donut.redraw();
		System.out.println("������ " + donut.getArea());
	}
	private static void positivePoint() {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "�Դϴ�.");
	}

	private static void point3D() {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveUp();
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveDown();
		p.move(10,10);
		
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(100,200,300);
		System.out.println(p.toString() + "�Դϴ�.");
	}

	private static void colorPoint2() {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		ColorPoint cp = new ColorPoint(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
	}

	private static void colorPoint() {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");
	}

	private static void kmToMile() {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

	private static void wonToDollar() {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

	private static void iptv() {
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}

	private static void colorTV() {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}
}

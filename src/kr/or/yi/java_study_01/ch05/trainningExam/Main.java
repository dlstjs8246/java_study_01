package kr.or.yi.java_study_01.ch05.trainningExam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		colorTV(); //실습문제1
//	    iptv(); //실습문제2
//		wonToDollar(); //실습문제3
//		kmToMile(); //실습문제4
//	    colorPoint(); //실습문제5
//		colorPoint2(); //실습문제6
//		point3D(); //실습문제7
//		positivePoint(); //실습문제8
//		stackApp(); //실습문제9
//		dicApp(); //실습문제10
//		calApp(); //실습문제11
//		beauty(); //실습문제12
//		donut(); //실습문제13
//		shapeList(); //실습문제14
	}

	private static void beauty() {
		Beauty b = new Beauty();
		Shape p = null;
		Shape prev = b.getStart();
		Shape cur = b.getStart();
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		while(menu<4) {
			System.out.println("그래픽 에디터 Beauty를 실행합니다.");
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
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
		System.out.println("그래픽 에디터 Beauty를 종료합니다.");
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
		System.out.print("삭제할 도형의 위치>> ");
		int postion = sc.nextInt(); //인덱스 값 입력
		Shape p=b.getStart(); //리스트의 인덱스 체크
		if(b.getStart()==null) {
			System.out.println("리스트가 존재하지 않습니다.");
			return;
		}
		for(int i=0;i<postion && p!=null;i++) {
			prev = cur;
			cur = prev.getNext();
			p = p.getNext();
		}
		if(p==null) { //도형의 위치가 인덱스 범위를 초과한 경우
			System.out.println("리스트의 인덱스 범위를 초과하였습니다.");
			return;
		}
		if(b.getStart()==b.getEnd()) { //하나의 노드만 있는 경우
			b.setStart(null);
			b.setEnd(null);
			b.setCheckStart(false);
			return;
		}
		else {
			if(prev==cur) {//첫번째 리스트 인덱스를 입력
				cur = prev.getNext();
				b.setStart(cur);
			}
			else if(cur.getNext()==null) { //cur이 마지막 노드를 가르킬때
				prev.setNext(null);
				b.setEnd(prev);
			}
			else { //첫번째와 마지막 노드의 인덱스를 입력하지 않은 경우
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
			System.out.println("그런 메뉴는 없습니다. 다시 입력하세요");
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
		System.out.print("두 정수와 연산자를 입력하시오>>");
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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}

	private static void stackApp() {
		Scanner sc = new Scanner(System.in);
		StackApp s = new StackApp();
		String val = "";
		System.out.print("총 스택 저장 공간의 크기 입력 >>");
		s.length = sc.nextInt();
		s.stack = new String[s.length()];
		while(true) {
			System.out.print("문자열 입력 >>");
			val = sc.next();
			if(val.equals("그만")) {
				break;
			}
			s.push(val);
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
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
			System.out.println("면적은 " + list[i].getArea());
		}
	}

	private static void donut() {
		ShapeInterface donut = new InterfaceCircle(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
	private static void positivePoint() {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "입니다.");
	}

	private static void point3D() {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();
		p.move(10,10);
		
		System.out.println(p.toString() + "입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString() + "입니다.");
	}

	private static void colorPoint2() {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

	private static void colorPoint() {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
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

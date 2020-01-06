package kr.or.yi.java_study_01.ch04exam;

import java.util.Scanner;

public class ExamMain2 {
	public static void main(String[] args) {
//		tv(); //실습문제 1번
//		grade(); //실습문제 2번
//		song(); //실습문제 3번
//		rectangle(); //실습문제 4번
//		circle(); //실습문제 5번
//		circle2(); //실습문제 6번
//		monthSchedule(); //실습문제 7번	
//		phoneBook(); //실습문제 8번
//		staticEX(); //실습문제 9번
//		dicApp(); //실습문제 10번
//		operator(); //실습문제 11번
//		concertReservation(); //실습문제 12번
		
	}
	private static void concertReservation() {
		ReservationProgram rp = new ReservationProgram();
		rp.run();
	}

	private static void operator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String operand = sc.next();
		if(operand.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			int res = add.calculate();
			System.out.println(res);
		}
		else if(operand.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			int res = sub.calculate();
			System.out.println(res);
		}
		else if(operand.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			int res = mul.calculate();
			System.out.println(res);
		}
		else if(operand.equals("/")) {
			Div div = new Div();
			div.setVaule(a, b);
			double res = div.calculate();
			System.out.println(res);
		}
		else {
			System.out.println("+,-,*,/만 입력하세요");
		}
		sc.close();
	}

	private static void dicApp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			String word = sc.next();
			if(word.equals("그만")) {
				break;
			}
			String search = Dictionary.kor2Eng(word);
			if(search.equals(word)) {
				System.out.println(search + "는 저의 사전에 없습니다.");
				sc.nextLine();
			}
			else {
				System.out.println(word + "는 " + search);
				sc.nextLine();
			}	
		}
		sc.close();	
	}

	private static void staticEX() {
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,77};
		int[] array3 = ArrayUtil.concat(array1,array2);
		ArrayUtil.print(array3);
	}

	private static void phoneBook() {
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.run();
		
	}

	private static void monthSchedule() {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

	private static void circle2() {
		Scanner sc = new Scanner(System.in);
		Circle[] c = new Circle[3];
		for(int i=0;i<c.length;i++) {
			System.out.print("x,y,radius >>");
			c[i] = new Circle(sc.nextDouble(),sc.nextDouble(),sc.nextInt());
		}
		if(c[0].isBig(c[1]) && c[0].isBig(c[2])) {
			c[0].showBig();
		}
		else if(c[1].isBig(c[0]) && c[1].isBig(c[2])) {
			c[1].showBig();
		}
		else {
			c[2].showBig();
		}
		sc.close();
	}

	private static void circle() {
		Scanner sc = new Scanner(System.in);
		Circle[] c = new Circle[3];
		for(int i=0;i<c.length;i++) {
			System.out.print("x,y,radius >>");
			c[i] = new Circle(sc.nextDouble(),sc.nextDouble(),sc.nextInt()); 
		}
		for(int i=0;i<c.length;i++) {
			c[i].show();
		}
		sc.close();
	}

	private static void rectangle() {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) {
			System.out.println("t는 r을 포함합니다.");
		}
		if(t.contains(s)) {
			System.out.println("t는 s를 포함합니다.");
		}
		
	}

	private static void song() {
		Song song = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		song.show();
		
	}

	private static void grade() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학,과학,영어 순으로 3개의 점수 입력>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("평균은 " + me.average());
		sc.close();
	}

	private static void tv() {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
	}
}

package kr.or.yi.java_study_01.ch05;

class A {
	void prn() {
		System.out.println("a");
	}
}
class B extends A {
	void prn() {
		System.out.println("b");
	}
}
class C extends B {
	void prn() {
		System.out.println("c");
	}
}

public class InstanceOfEx {
	public static void main(String[] args) {
//		instanceEx01();
		instanceEx02();
	}

	private static void instanceEx02() {
		A a = new A();
		B b = new B();
		C c = new C();
		
		prnObj(a);
		prnObj(b);
		prnObj(c);
	}

	private static void prnObj(A a) {
		if(a instanceof C) {
			C cc= (C)a;
			cc.prn();
		}
		else if(a instanceof B) {
			B bb = (B)a;
			bb.prn();
		}
		else if(a instanceof A) {
			a.prn();
		}
		
	}

	private static void instanceEx01() {
		A a = new C();
		//부모는 자식을 참조할 수 있으나, 자식은 부모를 참조할 수 없다.
		if(a instanceof A) {
			System.out.println("a는 A의 객체를 가지고 있음");
		}
		if(a instanceof B) {
			System.out.println("a는 B의 객체를 가지고 있음");
		}
		if(a instanceof C) {
			System.out.println("a는 C의 객체를 가지고 있음");
		}
		
		A ab = new B();
		if(ab instanceof A) {
			System.out.println("ab는 A의 객체를 가지고 있음");
		}
		if(ab instanceof B) {
			System.out.println("ab는 B의 객체를 가지고 있음");
		}
		if(ab instanceof C) {
			System.out.println("ab는 C의 객체를 가지고 있음");
		}
		
		A abc = new A();
		if(abc instanceof A) {
			System.out.println("abc는 A의 객체를 가지고 있음");
		}
		if(abc instanceof B) {
			System.out.println("abc는 B의 객체를 가지고 있음");
		}
		if(abc instanceof C) {
			System.out.println("abc는 C의 객체를 가지고 있음");
		}
	}
}

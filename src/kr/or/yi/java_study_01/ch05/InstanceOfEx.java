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
		//�θ�� �ڽ��� ������ �� ������, �ڽ��� �θ� ������ �� ����.
		if(a instanceof A) {
			System.out.println("a�� A�� ��ü�� ������ ����");
		}
		if(a instanceof B) {
			System.out.println("a�� B�� ��ü�� ������ ����");
		}
		if(a instanceof C) {
			System.out.println("a�� C�� ��ü�� ������ ����");
		}
		
		A ab = new B();
		if(ab instanceof A) {
			System.out.println("ab�� A�� ��ü�� ������ ����");
		}
		if(ab instanceof B) {
			System.out.println("ab�� B�� ��ü�� ������ ����");
		}
		if(ab instanceof C) {
			System.out.println("ab�� C�� ��ü�� ������ ����");
		}
		
		A abc = new A();
		if(abc instanceof A) {
			System.out.println("abc�� A�� ��ü�� ������ ����");
		}
		if(abc instanceof B) {
			System.out.println("abc�� B�� ��ü�� ������ ����");
		}
		if(abc instanceof C) {
			System.out.println("abc�� C�� ��ü�� ������ ����");
		}
	}
}

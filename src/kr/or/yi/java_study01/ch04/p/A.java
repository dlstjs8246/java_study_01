package kr.or.yi.java_study01.ch04.p;

import kr.or.yi.java_study01.ch04.q.B;

class A {
	void f() {
		B b = new B(); //public이라 접근 가능하지만 다른 패키지므로 import 필요
		C c = new C(); //default(package)이기 때문에 같은 패키지에서만 접근 가능
		
	}
}

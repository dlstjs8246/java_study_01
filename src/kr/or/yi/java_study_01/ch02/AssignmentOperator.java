package kr.or.yi.java_study_01.ch02;

public class AssignmentOperator {
	public static void main(String[] args) {
//		assignmentIncDec();
//		logicalOperator();
//		ternaryOperator();
		bitOperator();
	}

	private static void bitOperator() {
		short a = 0x55ff;
		short b = 0x00ff;
		
		System.out.printf("%04x%n", (short)(a & b));
		System.out.printf("%04x%n", (short)(a | b));
		System.out.printf("%04x%n", (short)(a ^ b));
		System.out.printf("%04x%n", (short)(~a));
		
		byte c = 20;
		byte d = -8;
		
		System.out.println("시프트 연산 결과");
		System.out.println(c << 2);
		System.out.println(c >> 2);
		System.out.println(d >> 2);
		System.out.printf("%x\n", (d >>> 2));
	}

	private static void ternaryOperator() {
		int a = 5;
		int b = 3;
		
		int res = a > b ? a - b : b - a;
		System.out.printf("두 수의 차는 %d%n", res);
	}

	private static void logicalOperator() {
		//비교 연산
		System.out.println("비교 연산");
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		// 비교 연산과 논리 연산 복합
		System.out.println("비교 연산과 논리 연산 복합");
		System.out.println((3 > 2) && ( 3 > 4));
		System.out.println((3 != 2) || ( -1 > 0));
		System.out.println((3 != 2) ^ ( -1 > 0));
	}

	private static void assignmentIncDec() {
		int a = 3;
		int b = 3;
		int c = 3;
		
		a += 3;
		b *= 3;
		c %= 2;
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		int d = 3;
		a = d++;
		System.out.println("a = " + a + ", d = " + d);
		a = ++d;
		System.out.println("a = " + a + ", d = " + d);
		a = d--;
		System.out.println("a = " + a + ", d = " + d);
		a = --d;
		System.out.println("a = " + a + ", d = " + d);
	}
}

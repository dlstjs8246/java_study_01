package kr.or.yi.java_study_01.ch04;

import java.util.Arrays;

public class Ch04Main02 {
	public static void main(String[] args) {	
//		circle();
		arrayPassingEX();
		methodSample();
	}

	private static void methodSample() {
		MethodSample m = new MethodSample();
		int i = m.getSum(1, 2);
		int j = m.getSum(1, 2, 3);
		double k = Math.round(m.getSum(1.1, 2.2));
		System.out.println(i + " " + j + " " + k + " ");
	}

	private static void arrayPassingEX() {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

	private static void replaceSpace(char[] c) {
		for(int i=0;i<c.length;i++) {
			if(c[i]==' ') {
				c[i] = ',';
			}
		}
		
	}

	private static void printCharArray(char[] c) {
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		
	}

	private static void circle() {
		Circle[] cirArr = {new Circle(1,"�ڹ�"),new Circle(2,"����"), new Circle(3,"����"),null,null};
		System.out.println(Arrays.toString(cirArr));
		//�߰�
		System.out.println("==========�߰�==========");
		int idx = 2;
		cirArr[++idx] = new Circle(5,"������");
		System.out.println(Arrays.toString(cirArr));
		//����
		System.out.println("==========����==========");
		int delNum = 1;
		cirArr[delNum] = null;
		for(int i = delNum;i<cirArr.length-1;i++) {
			cirArr[i] = cirArr[i+1];
		}
		System.out.println(Arrays.toString(cirArr));
		//����
		System.out.println("==========����==========");
		// radius = 4 , name = "ġ������" index=0
		cirArr[0].setRadius(4);
		cirArr[0].setName("ġ������");
		System.out.println(Arrays.toString(cirArr));
	} 
}

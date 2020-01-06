package kr.or.yi.java_study_01.ch03;

import java.util.Arrays;
import java.util.Random;

public class ForEachEx {
	public static void main(String[] args) {
		Random rnd = new Random(12345);
		int [] intArr = new int[5];
		System.out.println(Arrays.toString(intArr));
		initArray(rnd,intArr);
		System.out.println(Arrays.toString(intArr));
		for(int i=0;i<intArr.length;i++) {
			System.out.printf("[%d]",intArr[i]);
		}
		System.out.println();
		for(int e : intArr) {
			System.out.printf("[%d]",e);
		}
		System.out.println();
		String[] strArr = {"�Ǽ���","���Ƹ�","Ȳ�¿�","������","�����","������","���μ�","�̻��","������","������","Ȳ�ϳ�","�̵���"};
		for(String e : strArr) {
			System.out.printf("[%s]",e);
		}
		System.out.println();
		for(Week w : Week.values()) {
			System.out.print(w.ordinal() + " " + w + "���� ");
		}
	}

	private static void initArray(Random rnd, int[] intArr) {
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = rnd.nextInt(50) + 1;
		}
	}
}

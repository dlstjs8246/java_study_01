package kr.or.yi.java_study_01.ch04exam;

import java.util.Arrays;

public class ArrayUtil {
	static int [] concat (int[] a, int[] b) {
		int [] c = new int [a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i] = a[i];
		}
		for(int i=a.length;i<c.length;i++) {
			c[i] = b[i-a.length];
		}
		return c;
	}
	static void print(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}

package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class MethodCall {
	public static void main(String[] args) {
		/*
		 * void_method(1); int res = return_method(5); System.out.println("size = " +
		 * res); int[] intArr = makeIntArray(5);
		 * System.out.println(Arrays.toString(intArr));
		 */
		/*
		 * int[] arr = {5,3}; System.out.println(Arrays.toString(arr)); swap(arr);
		 * System.out.println(Arrays.toString(arr));
		 */
		int[] intArr = new int[4];
		makeArray(intArr);
		System.out.println(Arrays.toString(intArr));
		
	}

	private static void makeArray(int[] intArr) {
		for(int i=0;i<intArr.length;i++) {
			intArr[i]=i;
		}
		System.out.println(Arrays.toString(intArr));
	}

	private static void swap(int[] arr) {
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1]= tmp;
	}


	private static void void_method(int size) {
		System.out.println("size = " + size);
		return;
	}
	private static int return_method(int size) {
		return size;
	}
	private static int[] makeIntArray(int size) {
		int[] intArray = new int[size];
		System.out.println(Arrays.toString(intArray));
		return intArray;
	}
}

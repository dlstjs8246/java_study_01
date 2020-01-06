package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEX04 {

	public static void main(String[] args) {
		Random rnd = new Random(1234567);
		int [] intArr = new int[10];
		System.out.println(Arrays.toString(intArr));
		
		init_lotto(rnd, intArr);
		//������ �迭 ���
//		select_sort(intArr); //õõ�� ������
//		insert_sort(intArr); //õõ�� ������
		System.out.println(Arrays.toString(intArr));
		quick_sort(intArr);
//		int searchKey = 15;
//		int findIdx = linearSearch(intArr, searchKey);
//		int findIdx = BinarySearch(intArr,searchKey);
//		System.out.printf("%s �迭���� %d�� ��ġ�� %d�Դϴ�.",Arrays.toString(intArr),searchKey,findIdx);
	}
	private static void quick_sort(int[] intArr) {
		// ���ͳݿ��� �����ִ� ���� �����ϰ� �����غ���
		
	}
	private static int BinarySearch(int[] intArr, int searchKey) {
		//������ �� �� ����;
		bubble_sort(intArr);
		int left = 0;
		int right = intArr.length-1;
		while(left<=right) {
			int mid = (left + right) / 2;
			if(intArr[mid]>searchKey) {
				right = mid - 1;
			}
			if(intArr[mid]<searchKey) {
				left = mid + 1;
			}
			if(intArr[mid]==searchKey) {
				return mid;
			}
		}
		return -1;
	}
	private static int linearSearch(int[] intArr, int searchKey) {
		int i;
		for(i=0;i<intArr.length;i++) {
			if(intArr[i]==searchKey) {
				return i;
			}
		}
		return -1;
	}
	
	private static void insert_sort(int[] intArr) {
		// ���� ���� ���� ã�� �� �κ��� ������ ������ ���� �о�� ����
		for(int i=0;i<intArr.length-1;i++) {
			int min = Integer.MAX_VALUE;
			for(int j=0+i;j<intArr.length;j++) {
				if(min>intArr[j]) {
					min = intArr[j];
				}
				else {
					continue;
				}
			}
			System.out.println(min);
			for(int k=0+i;k<intArr.length;k++) {
				if(intArr[k]==min) {
					for(int l=k;l>0+i;l--) {
						intArr[l] = intArr[l-1];
					}
					break;
				}
			}
			intArr[i] = min;
			
			System.out.println(Arrays.toString(intArr));
		}
	}
	private static void select_sort(int[] intArr) {
		// ���� ���� ���� ã�� �� ��ġ�� �ε��� ��ü
		for(int i=0;i<intArr.length-1;i++) {
			int min = Integer.MAX_VALUE;
			for(int j=0+i;j<intArr.length;j++) {
				if(min>intArr[j]) {
					min = intArr[j];
				}
				else {
					continue;	
				}
			}
			int tmp = intArr[i];
			intArr[i] = min;
			for(int k=0+i;k<intArr.length;k++) {
				if(intArr[k]==min) {
					intArr[k] = tmp;
					break;
				}
			}	
		}
	}

	private static void bubble_sort(int[] intArr) {
		for(int i=0;i<intArr.length-1;i++) {
			for(int j=0;j<intArr.length-1;j++) {
				if(intArr[j]>intArr[j+1]) {
					int tmp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = tmp;
				}
			}
		}
	}

	private static void init_lotto(Random rnd, int[] intArr) {
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = rnd.nextInt(46) + 1;
		}
	}

	private static void generate_number() {
		Random rnd = new Random();
		rnd.setSeed(1234);
		for(int i=0;i<6;i++) {
			System.out.print(rnd.nextInt(45) + 1 +" ");
		}
	}
	
}

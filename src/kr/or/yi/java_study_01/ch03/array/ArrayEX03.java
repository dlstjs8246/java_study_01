package kr.or.yi.java_study_01.ch03.array;

public class ArrayEX03 {
	public static void main(String[] args) {
		int[] intArr = {10,11,18,29,30,31,41,10,90,3}; 
		int[][] intArray = {{1,5,2},{6,3,4},{9,7,8}};
//		prnArray(intArr); //5,4,3,2,1
//		sort1(intArr); // 정렬 수행(bubble sort)
//		sort2(intArr); //정렬 수행(select sort)
//		prnArray(intArr); //1,2,3,4,5
		prnArray(intArray);
		sort3(intArray); // 정렬 수행(2차원 select sort)
		prnArray(intArray);
	}

	private static void prnArray(int[][] intArr) {
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr.length;j++) {
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");
	}

	private static void sort3(int[][] intArray) {
		for(int i=0;i<intArray.length;i++) {
			int min = Integer.MAX_VALUE;
			int j;
			for(j=0;j<intArray.length;j++) {
				if(min>intArray[i][j]) {
					int tmp = min;
					min = intArray[i][j];
					intArray[i][j] = tmp;
				}
			}
			intArray[i][intArray.length-j] = min;
		}
	}

	private static void sort2(int[] intArr) {
		int tmp = 0;
		for(int i=0;i<intArr.length;i++) {
			int min = Integer.MAX_VALUE;
			for(int j=0;i+j<intArr.length;j++) {
				if(min>intArr[i+j]) {
					tmp = min;
					min = intArr[i+j];
					intArr[i+j] = tmp;
				}
			}
			intArr[i] = min;
		}	
	}

	private static void sort1(int[] intArr) {
		int tmp = 0;
		for(int i=0;i<(intArr.length-1);i++) {
			for(int j=0;j<(intArr.length-1);j++) {
				if(intArr[j]>intArr[j+1]) {
					tmp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = tmp;
				}
			}
		}
	}

	private static void prnArray(int[] intArr) {
		for(int i=0;i<intArr.length;i++) {
			System.out.printf("%d ",intArr[i]);
		}
		System.out.println();
	}
}

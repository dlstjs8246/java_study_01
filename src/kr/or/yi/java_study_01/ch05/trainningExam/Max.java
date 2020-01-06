package kr.or.yi.java_study_01.ch05.trainningExam;

public class Max {
	public static int max(int[] arr) {
		int maxValue = Integer.MIN_VALUE;
		if(arr==null) {
			return -999999;
		}
		if(arr.length==0) {
			return -999999;
		}
		for(int i=0;i<arr.length;i++) {
			if(maxValue<arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
}

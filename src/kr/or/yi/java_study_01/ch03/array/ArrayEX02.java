package kr.or.yi.java_study_01.ch03.array;

public class ArrayEX02 {

	public static void main(String[] args) {
		char [] chArr = new char[26];
		prnArray(chArr);
		makeArray(chArr);
		prnArray(chArr); // z y x ... a
		//위치교환(swap)
		char temChArr = 0;
		temChArr = chArr[0];
		chArr[0] = chArr[1];
		chArr[1] = temChArr;
		prnArray(chArr); // y z x ... a
	}

	private static void prnArray(char[] chArr) {
		for(int i=0;i<chArr.length;i++) {
			System.out.printf("%c ",chArr[i]);
		}
		System.out.println();
	}

	private static void makeArray(char[] chArr) {
		char ch = 'a';
		for(int i=0;i<chArr.length;i++) {
			chArr[i] = ch++;
		}
	}

}

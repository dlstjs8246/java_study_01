package kr.or.yi.java_study_01.ch03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExampleProblem {

	public static void main(String[] args) {
//		intTwoArray(); //실습문제2
//		star(); //실습문제3
//		alpha(); //실습문제4
//		threeMultiArr(); //실습문제5
//		moneyCalculator(); //실습문제6
//		avg(); //실습문제7
//		InputCalculator(); //실습문제8
//		TwoArray(); //실습문제9
//		TwoArrayRandom(); //실습문제10
//		TwoArrayDiff(); //실습문제14
//		Multiply(); //실습문제15
//		rockScissorPaper(); //실습문제 16
//		decimalToBinary(); // 연습문제1
//		lottoGenerator(); //연습문제2
	}

	private static void lottoGenerator() {
			Scanner sc = new Scanner(System.in);
			int[] winNumber = null; 
			int[][] perchasedLotto = null;
			while(true) {
				try {
					System.out.println("로또 추첨기에 오신걸 환영합니다.");
					System.out.print("메뉴를 입력해주세요 1.1등번호 생성 2.로또 구입 3.로또 분석 4.종료 ");
					int menuSel = sc.nextInt();
					int sel = menuSel;
					switch(sel) {
						case 1 : 
							winNumber = initLotto();
							System.out.println("1등 당첨 번호 : " + Arrays.toString(winNumber) + " 서비스 번호 : " + winNumber[winNumber.length-1]);
							break;
						case 2 :
							perchasedLotto = buyLotto(sc);
							prnArray(perchasedLotto);
							break;
						case 3 :
							Lottodiff(perchasedLotto,winNumber);
							break;
						}
					if(menuSel>3) {
						break;
					}
				}
				catch(InputMismatchException e) {
					System.out.println("숫자 이외의 다른 문자를 입력하지마세요!");
					break;
				}
			}
			System.out.println("프로그램을 종료합니다.");
			sc.close();
	}

	private static void prnArray(int[][] intArr) {
		System.out.println("구입한 로또 번호");
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	private static void Lottodiff(int[][] intArr, int[] winNumber) {
		System.out.println("로또 번호 분석중입니다.");
		System.out.print("1등 당첨 번호 ");
		prnOneArray(winNumber);
		System.out.println(); 
		for(int i=0;i<intArr.length;i++) {
			int count = 0;
			int countService = 0;
			int serviceNum = winNumber[winNumber.length-1];
			for(int j=0;j<intArr[i].length;j++) {
				if(intArr[i][j]==winNumber[j]) {
					count++;
				}
				if(intArr[i][intArr[i].length-1]==serviceNum) {
					countService++;
				}
			}
			prnOneArray(intArr[i]);
			if(count==6) {
				System.out.println(" 1등!! 축하합니다. 맞춘개수 = " + count);
			}
			else if(count==5 && countService==1) {
				System.out.println(" 2등!! 축하합니다. 맞춘개수 = " + (count+countService));
			}
			else if(count==5) {
				System.out.println(" 3등!! 축하합니다. 맞춘개수 = " + count);
			}
			else if(count==4) {
				System.out.println(" 4등!! 축하합니다. 맞춘개수 = " + count);
			}
			else if(count==3) {
				System.out.println(" 5등!! 축하합니다. 맞춘개수 = " + count);
			}
			else {
				System.out.println(" 아쉽네요 다시 구입해주세요. 이용해주셔서 감사합니다.");
			}
			count = 0;
			countService = 0;
		}
	}

	private static void prnOneArray(int[] intArr) {
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i] + " ");
		}
		
	}


	private static int[][] buyLotto(Scanner sc) {
		Random rd = new Random();
		System.out.print("구입할 개수를 입력해주세요 ");
		int count = sc.nextInt();
		int [][] buyLotto = new int[count][7];
		for(int i=0;i<buyLotto.length;i++) {
			for(int j=0;j<buyLotto[i].length;j++) {
				buyLotto[i][j] = rd.nextInt(45) + 1;
				for(int k=0;k<j;k++) {
					if(buyLotto[i][j]==buyLotto[i][k]) {
						j--;
					}
				}
			}
		}
		bubbleSortTwoArray(buyLotto);
		return buyLotto;
	}

	private static void bubbleSortTwoArray(int[][] intArr) {
		for(int i=0;i<intArr.length;i++) {
			bubble_sort(intArr[i]);
		}
	}

	private static int[] initLotto() {
		Random init = new Random();
		int[] initLotto = new int[7];
		for(int i=0;i<initLotto.length;i++) {
			initLotto[i] = init.nextInt(45) + 1;
			for(int j=0;j<i;j++) {
				if(initLotto[i]==initLotto[j]) {
					i--;
				}
			}
		}
		bubble_sort(initLotto);
		return initLotto;
	}

	private static void bubble_sort(int[] intArr) {
		for(int i=0;i<intArr.length-1;i++) {
			for(int j=0;j<intArr.length-1;j++) {
				if(intArr[j]>intArr[j+1]) {
					int tmp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = tmp;
				}
				else {
					continue;
				}
			}
		}
	}

	private static void decimalToBinary() {
		Scanner sc = new Scanner(System.in);
		System.out.print("10진수를 입력하세요 ");
		int num = sc.nextInt();
		int decimal = num;
		int[] binary = new int[50];
		int cnt = 0;
		for(int i=0;decimal!=0;i++) {
			 binary[i] = decimal%2;
			 decimal = decimal/2;
			 cnt++;
		}
		System.out.print("10진수 " + num + "은 2진수 ");
		for(int i=cnt-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		System.out.print("입니다.");
		sc.close();
	}

	private static void rockScissorPaper() {
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터랑 가위바위보 게임을 합니다.");
		String[] com = {"가위","바위","보"};
		System.out.print("가위 바위 보!>>");
		String user = sc.next();
		Random rd = new Random();
		int rdNumber = rd.nextInt(3);
		if(com[rdNumber].equals(user)) {
			System.out.println("비겼습니다 " + "컴퓨터 : " + com[rdNumber] + "   유저 : " + user);
		}
		else if(com[rdNumber].equals("가위")) {
			if(user.equals("바위")) {
				System.out.println("유저가 이겼습니다 " + "컴퓨터 : " + com[rdNumber] + "   유저 : " + user);
			}
			else if(user.equals("보")) {
				System.out.println("컴퓨터가 이겼습니다 " + "컴퓨터 : " + com[rdNumber] + "   유저 : " + user);
			}
		}
		else if(com[rdNumber].equals("바위")) {
			if(user.equals("가위")) {
				System.out.println("컴퓨터가 이겼습니다 " + "컴퓨터 : " + com[rdNumber] + "   유저 : " + user);
			}
			else if(user.equals("보")) {
				System.out.println("유저가 이겼습니다 " + "컴퓨터 : " + com[rdNumber] + "   유저 : " + user);
			}
		}
		else if(com[rdNumber].equals("보")) {
			if(user.equals("가위")) {
				System.out.println("유저가 이겼습니다 " + "컴퓨터 : " + com[rdNumber] + "   유저 : " + user);
			}
			else if(user.equals("바위")) {
				System.out.println("컴퓨터가 이겼습니다 " + "컴퓨터 : " + com[rdNumber] + "   유저 : " + user);
			}
		}
	}

	private static void Multiply() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곱하고자 하는 두 수 입력>>");
		try {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(n + "x" + m + "=" + n*m);
			
		}
		catch(InputMismatchException e) {
			System.out.println("실수는 입력하면 안됩니다.");
		}
		sc.close();
	}

	private static void TwoArrayDiff() {
		String [] course = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int [] score = {95,88,76,62,55};
		Scanner sc = new Scanner(System.in);
		System.out.print("과목을 입력해주세요 ");
		String subject = sc.next();
		int cnt = 0;
		for(int i=0;i<course.length;i++) {
			if(subject.equals("그만")) {
				break;
			}
			if(course[i].equals(subject)) {
				System.out.println(course[i] + "의 점수는 " + score[i]);
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("그런 과목은 없습니다.");
		}
		sc.close();
		
	}

	private static void TwoArrayRandom() {
		int[][] intArr = new int[4][4];
		Random rd = new Random();
		for(int i=0;i<10;i++) {
			int a = rd.nextInt(4); //0~3까지의 수 랜덤
			int b = rd.nextInt(4); //0~3까지의 수 랜덤
			intArr[a][b] = rd.nextInt(10) + 1;
		}
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				System.out.printf("%3d ",intArr[i][j]);
			}
			System.out.println();
		}
	}

	private static void TwoArray() {
		int[][] intArr = new int[4][4];
		Random rd = new Random();
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				intArr[i][j] = rd.nextInt(10) + 1;
			}
		}
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void InputCalculator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int input = sc.nextInt();
		int[] intArr = new int[input];
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = (int)(Math.random()*100) + 1;
		}
		System.out.println(Arrays.toString(intArr));
		for(int i=0;i<intArr.length;i++) {
			int searchKey = intArr[i];
			for(int j=1+i;j<intArr.length-1;j++) {
				for(int k=0;k<intArr.length;k++) {
					if(searchKey==intArr[j]) {
						intArr[j] = (int)(Math.random()*100) + 1;
					}
				}
			}	
		}
		
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i] + " ");
			if((i+1)%10==0) {
				System.out.println();
			}
		}
		sc.close();
		
	}

	private static void avg() {
		Random rd = new Random();
		int[] intArr = new int[10];
		double sum = 0;
		double avg = 0;
		System.out.print("랜덤한 정수들 ");
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = rd.nextInt(10) + 1;
			sum+=intArr[i];
			System.out.print(intArr[i] + " ");
		}
		avg = sum/intArr.length;
		System.out.println();
		System.out.println("평균은 " + avg);
	}

	private static void moneyCalculator() {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		System.out.print("금액을 입력하세요>>");
		int money = sc.nextInt();
		for(int i=0;i<unit.length;i++) {
			System.out.println(unit[i] + "원 짜리 " +money/unit[i] + "개");
			money = money%unit[i];
		}
		sc.close();
	}

	private static void threeMultiArr() {
		int[] intArr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = sc.nextInt();
		}
		for(int j=0;j<intArr.length;j++) {
			if(intArr[j]%3==0) {
				System.out.print(intArr[j] + " ");
			}
		}
		sc.close();
	}

	private static void alpha() {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char a = sc.next().charAt(0);
		if(a>=97 && a<=122) {
			for(int i=0;i<(a-'a')+1;i++) {
				for(int j=0;j<((a-'a')+1)-i;j++) {
					System.out.print((char)('a'+j));
				}
				for(int k=0;k<(a-'a');k++) {
					System.out.print(" ");
				}
				System.out.println();
				sc.close();
			}
		}
		else {
			System.out.println("소문자만 입력하세요  입력받은 값 : " + a);
		}
	}

	private static void star() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 ");
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=0;j<a-i;j++) {
				System.out.print("*");
			}
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		sc.close();
	}

	private static void intTwoArray() {
		int[][] intArr = new int[5][];
		intArr[0] = new int[1];
		intArr[1] = new int[3];
		intArr[2] = new int[1];
		intArr[3] = new int[4];
		intArr[4] = new int[2];
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				if(i==0) {
					intArr[i][j] = (i+1) + j;
				}
				else if(i==1) {
					intArr[i][j] = i + j;
				}
				else if(i==2) {
					intArr[i][j] = i-1 + j;
				}
				else if(i==3) {
					intArr[i][j] = i-2 + j;
				}
				else {
					intArr[i][j] = i-3 + j;
				}
			}
		}
		System.out.println(Arrays.deepToString(intArr));
	}

}

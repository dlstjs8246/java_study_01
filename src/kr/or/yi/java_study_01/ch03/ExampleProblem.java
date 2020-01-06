package kr.or.yi.java_study_01.ch03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExampleProblem {

	public static void main(String[] args) {
//		intTwoArray(); //�ǽ�����2
//		star(); //�ǽ�����3
//		alpha(); //�ǽ�����4
//		threeMultiArr(); //�ǽ�����5
//		moneyCalculator(); //�ǽ�����6
//		avg(); //�ǽ�����7
//		InputCalculator(); //�ǽ�����8
//		TwoArray(); //�ǽ�����9
//		TwoArrayRandom(); //�ǽ�����10
//		TwoArrayDiff(); //�ǽ�����14
//		Multiply(); //�ǽ�����15
//		rockScissorPaper(); //�ǽ����� 16
//		decimalToBinary(); // ��������1
//		lottoGenerator(); //��������2
	}

	private static void lottoGenerator() {
			Scanner sc = new Scanner(System.in);
			int[] winNumber = null; 
			int[][] perchasedLotto = null;
			while(true) {
				try {
					System.out.println("�ζ� ��÷�⿡ ���Ű� ȯ���մϴ�.");
					System.out.print("�޴��� �Է����ּ��� 1.1���ȣ ���� 2.�ζ� ���� 3.�ζ� �м� 4.���� ");
					int menuSel = sc.nextInt();
					int sel = menuSel;
					switch(sel) {
						case 1 : 
							winNumber = initLotto();
							System.out.println("1�� ��÷ ��ȣ : " + Arrays.toString(winNumber) + " ���� ��ȣ : " + winNumber[winNumber.length-1]);
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
					System.out.println("���� �̿��� �ٸ� ���ڸ� �Է�����������!");
					break;
				}
			}
			System.out.println("���α׷��� �����մϴ�.");
			sc.close();
	}

	private static void prnArray(int[][] intArr) {
		System.out.println("������ �ζ� ��ȣ");
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	private static void Lottodiff(int[][] intArr, int[] winNumber) {
		System.out.println("�ζ� ��ȣ �м����Դϴ�.");
		System.out.print("1�� ��÷ ��ȣ ");
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
				System.out.println(" 1��!! �����մϴ�. ���ᰳ�� = " + count);
			}
			else if(count==5 && countService==1) {
				System.out.println(" 2��!! �����մϴ�. ���ᰳ�� = " + (count+countService));
			}
			else if(count==5) {
				System.out.println(" 3��!! �����մϴ�. ���ᰳ�� = " + count);
			}
			else if(count==4) {
				System.out.println(" 4��!! �����մϴ�. ���ᰳ�� = " + count);
			}
			else if(count==3) {
				System.out.println(" 5��!! �����մϴ�. ���ᰳ�� = " + count);
			}
			else {
				System.out.println(" �ƽ��׿� �ٽ� �������ּ���. �̿����ּż� �����մϴ�.");
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
		System.out.print("������ ������ �Է����ּ��� ");
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
		System.out.print("10������ �Է��ϼ��� ");
		int num = sc.nextInt();
		int decimal = num;
		int[] binary = new int[50];
		int cnt = 0;
		for(int i=0;decimal!=0;i++) {
			 binary[i] = decimal%2;
			 decimal = decimal/2;
			 cnt++;
		}
		System.out.print("10���� " + num + "�� 2���� ");
		for(int i=cnt-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		System.out.print("�Դϴ�.");
		sc.close();
	}

	private static void rockScissorPaper() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ͷ� ���������� ������ �մϴ�.");
		String[] com = {"����","����","��"};
		System.out.print("���� ���� ��!>>");
		String user = sc.next();
		Random rd = new Random();
		int rdNumber = rd.nextInt(3);
		if(com[rdNumber].equals(user)) {
			System.out.println("�����ϴ� " + "��ǻ�� : " + com[rdNumber] + "   ���� : " + user);
		}
		else if(com[rdNumber].equals("����")) {
			if(user.equals("����")) {
				System.out.println("������ �̰���ϴ� " + "��ǻ�� : " + com[rdNumber] + "   ���� : " + user);
			}
			else if(user.equals("��")) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ� " + "��ǻ�� : " + com[rdNumber] + "   ���� : " + user);
			}
		}
		else if(com[rdNumber].equals("����")) {
			if(user.equals("����")) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ� " + "��ǻ�� : " + com[rdNumber] + "   ���� : " + user);
			}
			else if(user.equals("��")) {
				System.out.println("������ �̰���ϴ� " + "��ǻ�� : " + com[rdNumber] + "   ���� : " + user);
			}
		}
		else if(com[rdNumber].equals("��")) {
			if(user.equals("����")) {
				System.out.println("������ �̰���ϴ� " + "��ǻ�� : " + com[rdNumber] + "   ���� : " + user);
			}
			else if(user.equals("����")) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ� " + "��ǻ�� : " + com[rdNumber] + "   ���� : " + user);
			}
		}
	}

	private static void Multiply() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
		try {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(n + "x" + m + "=" + n*m);
			
		}
		catch(InputMismatchException e) {
			System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
		}
		sc.close();
	}

	private static void TwoArrayDiff() {
		String [] course = {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int [] score = {95,88,76,62,55};
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� ");
		String subject = sc.next();
		int cnt = 0;
		for(int i=0;i<course.length;i++) {
			if(subject.equals("�׸�")) {
				break;
			}
			if(course[i].equals(subject)) {
				System.out.println(course[i] + "�� ������ " + score[i]);
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("�׷� ������ �����ϴ�.");
		}
		sc.close();
		
	}

	private static void TwoArrayRandom() {
		int[][] intArr = new int[4][4];
		Random rd = new Random();
		for(int i=0;i<10;i++) {
			int a = rd.nextInt(4); //0~3������ �� ����
			int b = rd.nextInt(4); //0~3������ �� ����
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
		System.out.print("���� �?");
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
		System.out.print("������ ������ ");
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = rd.nextInt(10) + 1;
			sum+=intArr[i];
			System.out.print(intArr[i] + " ");
		}
		avg = sum/intArr.length;
		System.out.println();
		System.out.println("����� " + avg);
	}

	private static void moneyCalculator() {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		System.out.print("�ݾ��� �Է��ϼ���>>");
		int money = sc.nextInt();
		for(int i=0;i<unit.length;i++) {
			System.out.println(unit[i] + "�� ¥�� " +money/unit[i] + "��");
			money = money%unit[i];
		}
		sc.close();
	}

	private static void threeMultiArr() {
		int[] intArr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
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
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
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
			System.out.println("�ҹ��ڸ� �Է��ϼ���  �Է¹��� �� : " + a);
		}
	}

	private static void star() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� ");
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

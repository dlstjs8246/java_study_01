package kr.or.yi.java_study_01.ch04exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		/* 1. �л� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ� (15��)
		 * 2. �л� Ŭ������ ����(��ȣ,����,����,����,����,����(�޼ҵ�),���(�޼ҵ�))
		 * 3. �޴��ۼ�(1.�л���� 2.�л��߰� 3.�л� ���� 4.�л� ���� 5.�л��˻� 6.����)
		 */
		Scanner sc = new Scanner(System.in);
		Student[] stdArr = new Student[11];
		initArr(stdArr);
		while(true) {	
			try {
				System.out.println("�ȳ��ϼ��� �л� ���� ���� ���α׷��Դϴ�.");
				System.out.print("�޴��� �Է����ּ��� 1.�л���� 2.�л��߰� 3.�л����� 4.�л����� 5.�л��˻� 6.���� ");
				int menu = sc.nextInt();
				switch(menu) {
				case 1 :
					prnStdArr(stdArr);
					break;
				case 2 :
					addStdArr(stdArr,sc);
					break;
				case 3 :
					reStdArr(stdArr,sc);
					break;
				case 4 :
					delStdArr(stdArr,sc);
					break;
				
				case 5 :
					findStd(stdArr,sc);
					break;
				}
				if(menu==6) {
					break;
				}
					
			}
			catch(InputMismatchException e) {
				System.out.println("���Ŀ� �°� �ٽ� �Է��ϼ���");
				sc.nextLine();
			}
		}
		System.out.println("�л� ���� ���α׷��� �����մϴ�.");
		sc.close();
	}
	
	private static int findStd(Student[] stdArr,Scanner sc) {
		try {
			System.out.print("�л� ��ȣ�� �Է��ϼ��� ");
			int stdNo = sc.nextInt();
			Student findStd = new Student(stdNo);
			int idx = indexOf(stdArr,findStd);
			System.out.println(stdArr[idx]);
			return idx;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�׷� �ε����� �������� �ʽ��ϴ�. �ٽ� �Է��ϼ���");
			return -1;
		}
		catch(NullPointerException e) {
			System.out.println("�׷� �ε����� �������� �ʽ��ϴ�. �ٽ� �Է��ϼ���");
			return -1;
		}
	}

	private static int indexOf(Student[] stdArr, Student findStd) {
		for(int i=0;i<stdArr.length;i++) {
			if(stdArr[i].getStdNo()==findStd.getStdNo()) {
				return i;
			}
		}
		return -1;
	}

	private static void delStdArr(Student[] stdArr, Scanner sc) {
		try {
			System.out.println("�л� ���� ���� ���α׷��Դϴ�.");
			int idx = findStd(stdArr,sc);
			for(int i=idx;i<stdArr.length-1;i++) {
				stdArr[i] = stdArr[i+1];
				stdArr[i].setStdNo(i+1);
			}
			stdArr[stdArr.length-1] = null;
			
		}	
		catch(NullPointerException e) {
			
		}
	}

	private static void reStdArr(Student[] stdArr, Scanner sc) {
		System.out.println("�л� ���� ���� ���α׷��Դϴ�.");
		int idx = findStd(stdArr,sc);
		System.out.print(idx+1 + "�� �л��� ������ �����Ͻðڽ��ϱ�? 1.�̸� 2.�������� 3.�������� 4.��������");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.print("������ �̸��� �Է��ϼ��� ");
			String reStdName = sc.next();
			stdArr[idx].setStdName(reStdName);
			break;
		case 2:
			System.out.print("������ ���� ������ �Է��ϼ��� ");
			int reKor = sc.nextInt();
			if(reKor<=100) {
				stdArr[idx].setKor(reKor);
				break;
			}
			else {
				System.out.println("������ 0~100������ �Դϴ�.");
				break;
			}
		case 3:
			System.out.print("������ ���� ������ �Է��ϼ��� ");
			int reEng = sc.nextInt();
			if(reEng<=100) {
				stdArr[idx].setEng(reEng);
				break;				
			}
			else {
				System.out.println("������ 0~100������ �Դϴ�.");
				break;
			}
		case 4:
			System.out.print("������ ���� ������ �Է��ϼ��� ");
			int reMath = sc.nextInt();
			if(reMath<=100) {
				stdArr[idx].setMath(reMath);
				break;
			}
			else {
				System.out.println("������ 0~100������ �Դϴ�.");
				break;
			}
		
		}
	}

	private static void addStdArr(Student[] stdArr, Scanner sc) {
		//�߰��Ǿ��� ���� : ���� ���� ���� �Ǿ�����, 
		//1.�� ������ �ߺ��Ǵ� �л���ȣ�� �Է��� ��� �ԷµǱ� �� �ߺ��Ǵ� ���� �������� �л�
		//��ȣ�� +1�Ұ�
		//2.�迭�� ������ �Ѿ�� ���� �Է��ϰ��� �ϴ� ���(����ó�� ��)
		try {
			System.out.println("�л� ���� �߰� ���α׷��Դϴ�.");
			int idx = findStd(stdArr,sc);
			if(idx==-1) {
				return;
			}
			System.out.print("�̸�,��������,���������� �Է��ϼ��� ");
			String stdName = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			int DupIdx = getDupIdx(stdArr, idx);
			if(DupIdx==-1) {
				stdArr[idx] = new Student(idx+1,stdName,kor,eng,math);
				return;
			}
			for(int i=stdArr.length-1;i>DupIdx;i--) {
				stdArr[i] = stdArr[i-1];
				stdArr[i].setStdNo(i+1);
			}
			stdArr[idx] = new Student(idx+1,stdName,kor,eng,math);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�л� ������ 11�� ������ �Է��� �����մϴ�. Ȯ�� �� �ٽ� �Է��ϼ���");
			return;
		}
		
			
	}

	private static int getDupIdx(Student[] stdArr, int idx) {
		for(int i=0;i<stdArr.length;i++) {
			if(stdArr[i].getStdNo()==stdArr[idx].getStdNo()) {
				return idx;
			}
		}
		return -1;
	}

	private static void prnStdArr(Student[] stdArr) {
		for(Student std : stdArr) {
			System.out.println(std);
		}
	}
	private static void initArr(Student[] stdArr) {
		String[] names = {"�Ǽ���","���Ƹ�","������","Ȳ�¿�","������","�����","�̵���","Ȳ�ϳ�","������","�̻��","���μ�"};
		for(int i=0;i<stdArr.length;i++) {
			stdArr[i]= new Student(i+1,names[i],((int)(Math.random()*60)+41),((int)(Math.random()*60)+41),((int)(Math.random()*60)+41));
		}
	}

}

package kr.or.yi.java_study_01.ch04exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		/* 1. 학생 정보를 관리하는 프로그램을 작성하시오 (15개)
		 * 2. 학생 클래스를 정의(번호,성명,국어,영어,수학,총점(메소드),평균(메소드))
		 * 3. 메뉴작성(1.학생목록 2.학생추가 3.학생 수정 4.학생 삭제 5.학생검색 6.종료)
		 */
		Scanner sc = new Scanner(System.in);
		Student[] stdArr = new Student[11];
		initArr(stdArr);
		while(true) {	
			try {
				System.out.println("안녕하세요 학생 정보 관리 프로그램입니다.");
				System.out.print("메뉴를 입력해주세요 1.학생목록 2.학생추가 3.학생수정 4.학생삭제 5.학생검색 6.종료 ");
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
				System.out.println("형식에 맞게 다시 입력하세요");
				sc.nextLine();
			}
		}
		System.out.println("학생 관리 프로그램을 종료합니다.");
		sc.close();
	}
	
	private static int findStd(Student[] stdArr,Scanner sc) {
		try {
			System.out.print("학생 번호를 입력하세요 ");
			int stdNo = sc.nextInt();
			Student findStd = new Student(stdNo);
			int idx = indexOf(stdArr,findStd);
			System.out.println(stdArr[idx]);
			return idx;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("그런 인덱스는 존재하지 않습니다. 다시 입력하세요");
			return -1;
		}
		catch(NullPointerException e) {
			System.out.println("그런 인덱스는 존재하지 않습니다. 다시 입력하세요");
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
			System.out.println("학생 정보 삭제 프로그램입니다.");
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
		System.out.println("학생 정보 수정 프로그램입니다.");
		int idx = findStd(stdArr,sc);
		System.out.print(idx+1 + "번 학생의 무엇을 수정하시겠습니까? 1.이름 2.국어점수 3.영어점수 4.수학점수");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.print("수정할 이름을 입력하세요 ");
			String reStdName = sc.next();
			stdArr[idx].setStdName(reStdName);
			break;
		case 2:
			System.out.print("수정할 국어 점수를 입력하세요 ");
			int reKor = sc.nextInt();
			if(reKor<=100) {
				stdArr[idx].setKor(reKor);
				break;
			}
			else {
				System.out.println("점수는 0~100점까지 입니다.");
				break;
			}
		case 3:
			System.out.print("수정할 영어 점수를 입력하세요 ");
			int reEng = sc.nextInt();
			if(reEng<=100) {
				stdArr[idx].setEng(reEng);
				break;				
			}
			else {
				System.out.println("점수는 0~100점까지 입니다.");
				break;
			}
		case 4:
			System.out.print("수정할 영어 점수를 입력하세요 ");
			int reMath = sc.nextInt();
			if(reMath<=100) {
				stdArr[idx].setMath(reMath);
				break;
			}
			else {
				System.out.println("점수는 0~100점까지 입니다.");
				break;
			}
		
		}
	}

	private static void addStdArr(Student[] stdArr, Scanner sc) {
		//추가되어할 로직 : 만약 값이 삭제 되었을때, 
		//1.빈 공간에 중복되는 학생번호를 입력할 경우 입력되기 전 중복되는 값을 기준으로 학생
		//번호를 +1할것
		//2.배열의 범위를 넘어서는 값을 입력하고자 하는 경우(예외처리 함)
		try {
			System.out.println("학생 정보 추가 프로그램입니다.");
			int idx = findStd(stdArr,sc);
			if(idx==-1) {
				return;
			}
			System.out.print("이름,국어점수,수학점수를 입력하세요 ");
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
			System.out.println("학생 정보는 11개 까지만 입력이 가능합니다. 확인 후 다시 입력하세요");
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
		String[] names = {"권수진","정아름","장현서","황태원","배진우","현재승","이동주","황하나","유경진","이상원","박인선"};
		for(int i=0;i<stdArr.length;i++) {
			stdArr[i]= new Student(i+1,names[i],((int)(Math.random()*60)+41),((int)(Math.random()*60)+41),((int)(Math.random()*60)+41));
		}
	}

}

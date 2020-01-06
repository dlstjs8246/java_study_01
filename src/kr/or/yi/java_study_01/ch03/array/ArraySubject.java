package kr.or.yi.java_study_01.ch03.array;

import java.util.Random;

public class ArraySubject {
	public static void main(String[] args) {
		/*
		 * 1. 12명의 국어, 영어, 수학 점수를 담는 2차원 배열 선언
		 * 2. 12명의 이름을 담은 배열 선언 
		 * 3. 60~100 사이에 랜덤한 값을 국어, 영어, 수학 점수로 입력 
		 * 4. 이름, 국어, 영어, 수학, 총점, 평균을 각각 출력 
		 * 5. 이름을 제외한 나머지의 평균을 전체로출력하시오. 
		 * 6. scoreAverage
		 */
		int[][] intArr = new int[12][3];
		String[] stdName = {"권수진","정아름","황태원","장현서","현재승","배진우","박인선","이상원","유경진","권태헌","황하나","이동주"};
		Random rd = new Random(123);
		initArray(rd,intArr);
		scoreAverage(intArr,stdName);
		
	}

	private static void scoreAverage(int[][] intArr, String[] stdName) {
		System.out.print(" 번호 ");
		System.out.print("이름 ");
		System.out.print(" 국어  ");
		System.out.print("영어  ");
		System.out.print("수학  ");
		System.out.print("평균  ");
		System.out.println();
		int koreanSum = 0;
		int englishSum = 0;
		int mathSum = 0;
		int scoreSum = 0;
		int avg = 0;
		for(int stu=0;stu<intArr.length;stu++) {
			int scoreLength = intArr[stu].length;
			int sum = 0;
			System.out.printf("%2d ",stu+1);
			System.out.printf("%3s",stdName[stu]);
			for(int score=0;score<intArr[stu].length;score++) {
				sum += intArr[stu][score];
				scoreSum += sum;
				System.out.printf(" %3d",intArr[stu][score]);
				if(score==0) {
					koreanSum += sum;
					sum = 0;
				}
				else if(score==1) {
					englishSum += sum;
					sum = 0;
				}
				else {
					mathSum += sum;
					sum = 0;
				}
			}
			avg = (scoreSum)/scoreLength;
			System.out.printf("  %d",avg);
			System.out.println();
			scoreSum = 0;
		}
		System.out.print("전체 학생  ");
		System.out.printf("%3d ",koreanSum);
		System.out.printf("%3d ",englishSum);
		System.out.printf("%3d ",mathSum);
		System.out.println((koreanSum + englishSum + mathSum)/(intArr.length * intArr[0].length));
	}

	private static void initArray(Random rd, int[][] intArr) {
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				intArr[i][j] = rd.nextInt(40) + 60;
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

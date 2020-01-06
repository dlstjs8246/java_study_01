package kr.or.yi.java_study_01.ch03.array;

import java.util.Random;

public class ArraySubject {
	public static void main(String[] args) {
		/*
		 * 1. 12���� ����, ����, ���� ������ ��� 2���� �迭 ����
		 * 2. 12���� �̸��� ���� �迭 ���� 
		 * 3. 60~100 ���̿� ������ ���� ����, ����, ���� ������ �Է� 
		 * 4. �̸�, ����, ����, ����, ����, ����� ���� ��� 
		 * 5. �̸��� ������ �������� ����� ��ü������Ͻÿ�. 
		 * 6. scoreAverage
		 */
		int[][] intArr = new int[12][3];
		String[] stdName = {"�Ǽ���","���Ƹ�","Ȳ�¿�","������","�����","������","���μ�","�̻��","������","������","Ȳ�ϳ�","�̵���"};
		Random rd = new Random(123);
		initArray(rd,intArr);
		scoreAverage(intArr,stdName);
		
	}

	private static void scoreAverage(int[][] intArr, String[] stdName) {
		System.out.print(" ��ȣ ");
		System.out.print("�̸� ");
		System.out.print(" ����  ");
		System.out.print("����  ");
		System.out.print("����  ");
		System.out.print("���  ");
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
		System.out.print("��ü �л�  ");
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

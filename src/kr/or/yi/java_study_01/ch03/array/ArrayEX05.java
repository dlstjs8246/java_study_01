package kr.or.yi.java_study_01.ch03.array;

public class ArrayEX05 {

	public static void main(String[] args) {
		double[][] score = {{3.3,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};
		ScoreAverage(score);
	}

	private static void ScoreAverage(double[][] score) {
		double totalSum = 0;
		double sum = 0;
		double termSum = 0;
		double term1Sum = 0;
		double term2Sum = 0;
		double yearSum = 0;
		int yearLength = 0;
		int termLength = 0;
		for(int year=0;year<score.length;year++) {
			yearLength = score.length;
			termLength = score[year].length;
			System.out.print(year+1 + "학년 ");
			for(int term=0;term<score[year].length;term++) {
				sum += score[year][term];
				System.out.print(term+1 + "학기 ");
				System.out.print(score[year][term] + " ");
				if(term!=termLength-term) {
					termSum += sum;
					yearSum += termSum;
					term1Sum += termSum;
					sum = 0;
					termSum = 0;
				}
				else {
					termSum += sum;
					yearSum += termSum;
					term2Sum += termSum;
					sum = 0;
					termSum = 0;
				}
			}
			totalSum += yearSum;
			System.out.print(String.format("%.2f", yearSum/termLength) + " ");
			System.out.println();
			yearSum = 0;
		}
		System.out.print("전체 학년  ");
		System.out.print(String.format(" %.2f ", term1Sum/yearLength) + " ");
		System.out.print(String.format(" %.2f ", term2Sum/yearLength)  + " ");
		System.out.println(String.format("%.2f", totalSum/(yearLength * termLength)));
	}


}

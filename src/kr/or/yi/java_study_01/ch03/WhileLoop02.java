package kr.or.yi.java_study_01.ch03;

public class WhileLoop02 {
	public static void main(String[] args) {
//		doWhileSample();
//		gugudan();
//		sum();
	}

	private static void sum() {
		int odd = 0;
		int even = 0;
		int sum = 0;
		int triplesum = 0;
		int cnt = 0;
		System.out.println("for문");
		for(int i=1;i<101;i++) {
			if(i%3==0) {
				triplesum = triplesum + i;
			}
			if(i%2==1) {
				odd = odd + i;
			}
			else {
				even = even + i;	
			}
		}
		sum = even + odd;
		System.out.println("3의배수 합 " + triplesum);
		System.out.println("짝수의 합 " + even);
		System.out.println("홀수의 합 " + odd);
		System.out.println("전체의 합 " + sum);
		odd = 0;
		even = 0;
		sum = 0;
		triplesum = 0;
		cnt = 0;
		System.out.println("while문");
		while(cnt<101) {
			if(cnt%3==0) {
				triplesum = triplesum + cnt;
			}
			if(cnt%2==1) {
				odd = odd + cnt;
			}
			else {
				even = even + cnt;	
			}
			cnt++;
		}
		sum = even + odd;
		System.out.println("3의배수 합 " + triplesum);
		System.out.println("짝수의 합 " + even);
		System.out.println("홀수의 합 " + odd);
		System.out.println("전체의 합 " + sum);
		odd = 0;
		even = 0;
		sum = 0;
		triplesum = 0;
		
		cnt = 0;
		System.out.println("do-while문");
		do {
			if(cnt%3==0) {
				triplesum = triplesum + cnt;
			}
			if(cnt%2==1) {
				odd = odd + cnt;
			}
			else {
				even = even + cnt;	
			}
			cnt++;
		}
		while(cnt<101);
		sum = even + odd;
		System.out.println("3의배수 합 " + triplesum);
		System.out.println("짝수의 합 " + even);
		System.out.println("홀수의 합 " + odd);
		System.out.println("전체의 합 " + sum);
	}

	private static void gugudan() {
		int i;
		int j;
		for(i=1;i<10;i++) {
			if(i==6) break;
			for(j=2;j<10;j++) {
				System.out.printf("%d * %d = %2d ",j,i,j*i);
				if(j==5) break;
			}
			j=2;
			System.out.println();
		}
		
	}

	private static void doWhileSample() {
		char c = 'A';
		
		do {
			if(c>=91 && c<97) {
				System.out.print("");
			}
			else {
				System.out.print(c);
			}
			c=(char)(c+1);
		} 
		while(c<='z');
	}
}

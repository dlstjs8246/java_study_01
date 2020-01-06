package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Subject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sale(sc); // 조건문 과제1
//		lowerUpperTranslater(sc); // 조건문 과제2
//		ticketProgram(sc); //조건문 과제3
//		bmiCalculater(sc); //조건문 과제4
//	    minCalculater(sc); //조건문 과제5
		sc.close();
	}

	private static void minCalculater(Scanner sc) {
		System.out.print("정수 3자리를 입력하세요 ");
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < b && a < c) {
			System.out.printf("가장 작은 수는 %d입니다.",a);
		}
		else if(b < a && b < c) {
			System.out.printf("가장 작은 수는 %d입니다.",b);
		}
		else if(c < a && c < b) {
			System.out.printf("가장 작은 수는 %d입니다.",c);
		}
		else {
			System.out.println("동일한 값을 입력하지마세요");
		}
	}

	private static void bmiCalculater(Scanner sc) {
		System.out.println("bmi를 계산하는 프로그램입니다.");
		System.out.print("나이,키,몸무게를 입력해주세요 ");
		int age = sc.nextInt();
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		double bmi = weight / ((height / 100) * (height / 100));
		System.out.printf("현재 bmi 지수 = %f%n",bmi);
		if(age>=20 && age<30) {
			if(bmi <= 17.9) {
				System.out.printf("비만도가 %.1f이므로 저체중입니다. 저체중 : 17.9 이하",bmi);
			}
			else if(bmi >= 18 && bmi < 24) {
				System.out.printf("비만도가 %.1f이므로 표준체중입니다. 표준체중 : 18.0~23.0",bmi);
			}
			else if(bmi >=24 && bmi <=30) {
				System.out.printf("비만도가 %.1f이므로 과체중입니다. 과체중 : 24.0~30.0",bmi);
			}
			else {
				System.out.printf("비만도가 %.1f이므로 비만입니다. 비만 : 30초과",bmi);
			}
		}
		else {
			if(bmi <= 17.9) {
				System.out.printf("비만도가 %.1f이므로 저체중입니다. 저체중 : 18.4 이하",bmi);
			}
			else if(bmi >= 18 && bmi < 24) {
				System.out.printf("비만도가 %.1f이므로 표준체중입니다. 표준체중 : 18.5~24.0",bmi);
			}
			else if(bmi >=24 && bmi <=30) {
				System.out.printf("비만도가 %.1f이므로 과체중입니다. 과체중 : 25.0~30.0",bmi);
			}
			else {
				System.out.printf("비만도가 %.1f이므로 비만입니다. 비만 : 30.0초과",bmi);
			}
		}
		
	}

	private static void ticketProgram(Scanner sc) {
		System.out.println("놀이공원에 오신걸 환영합니다. 들어가기에 앞서 조건을 체크하고 있습니다");
		System.out.print("자유입장권입니까? 입장권입니까? ");
		String ticket = sc.next();
		if(ticket.contentEquals("자유입장권")) {
			System.out.print("나이,현재시각을 입력하세요(1~24)");
			int age = sc.nextInt();
			int date = sc.nextInt();
			if((age>=3 && age<=12) || age>=65) {
				if(date>=9 && date<17) {
					System.out.println("요금은 25000원입니다.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("요금은 21000원입니다.");
				}
				else {
					System.out.printf("놀이공원 폐장 시간입니다. 아쉽습니다 다음에 다시 놀러오세요 현재 시간 : %d시%n",date);
				}
			}
			else if(age>=0 && age<=2) {
				if(date>=9 && date<17) {
					System.out.println("영아는 무료입니다.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("영아는 무료입니다.");
				}
				else {
					System.out.printf("놀이공원 폐장 시간입니다. 아쉽습니다 다음에 다시 놀러오세요 현재 시간 : %d시%n",date);
				}
			}
			else {
				if(date>=9 && date<17) {
					System.out.println("요금은 34000원입니다.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("요금은 29000원입니다.");
				}
				else {
					System.out.printf("놀이공원 폐장 시간입니다. 아쉽습니다 다음에 다시 놀러오세요 현재 시간 : %d시%n",date);
				}
			}
		}
		else if(ticket.contentEquals("입장권")) {
			System.out.print("나이,현재시각을 입력하세요(1~24) ");
			int age = sc.nextInt();
			int date = sc.nextInt();
			if((age>=3 && age<=12) && age>=65) {
				if(date>=9 && date<17) {
					System.out.println("요금은 20000원입니다.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("요금은 17000원입니다.");
				}
				else {
					System.out.printf("놀이공원 폐장 시간입니다. 아쉽습니다 다음에 다시 놀러오세요 현재 시간 : %d시%n",date);
				}
			}
			else if(age>=0 && age<=2) {
				if(date>=9 && date<17) {
					System.out.println("영아는 무료입니다.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("영아는 무료입니다.");
				}
				else {
					System.out.printf("놀이공원 폐장 시간입니다. 아쉽습니다 다음에 다시 놀러오세요 현재 시간 : %d시%n",date);
				}
			}
			else {
				if(date>=9 && date<17) {
					System.out.println("요금은 27000원입니다.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("요금은 23000원입니다.");
				}
				else {
					System.out.printf("놀이공원 폐장 시간입니다. 아쉽습니다 다음에 다시 놀러오세요 현재 시간 : %d시%n",date);
				}
			}
		}
		else {
			System.out.println("그런 입장권은 없습니다.");
		}
	}

	private static void lowerUpperTranslater(Scanner sc) {
		System.out.print("문자를 하나 입력하세요 ");
		char a = sc.next().charAt(0);
		if(a >= 65 && a <= 90) {
			a = (char)(a + 32);
			System.out.println(a);
		}
		else if(a >= 97 && a <= 122) {
			a = (char)(a - 32);
			System.out.println(a);
		}
		else {
			System.out.printf("알파벳을 입력해주세요. 입력하신 문자값 %c",a);
		}
	}

	private static void sale(Scanner sc) {
		double price = 100;
		System.out.print("구매하실 수량을 입력하세요 ");
		double count = sc.nextInt();
		double res = price * count;
		double marginRate = 0;
		double rate = 1;
		if(count>=10 && count<20) {
			marginRate = 0.1;
			System.out.printf("원래 가격은 %.0f원이나, %.0f퍼센트 할인되어 %.0f원입니다.%n",res,marginRate*100,res*(rate-marginRate));
		}
		else if(count>=20) {
			marginRate = 0.15;
			System.out.printf("원래 가격은 %.0f원이나, %.0f퍼센트 할인되어 %.0f원입니다.%n",res,marginRate*100,res*(rate-marginRate));
		}
		else if(count>=100) {
			marginRate = 0.20;
			System.out.printf("원래 가격은 %.0f원이나, %.0f퍼센트 할인되어 %.0f원입니다.%n",res,marginRate*100,res*(rate-marginRate));
		}
		else {
			System.out.printf("가격은 %.0f원입니다.%n",res);
		}
	}
	
}

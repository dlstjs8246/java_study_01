package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class Subject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sale(sc); // ���ǹ� ����1
//		lowerUpperTranslater(sc); // ���ǹ� ����2
//		ticketProgram(sc); //���ǹ� ����3
//		bmiCalculater(sc); //���ǹ� ����4
//	    minCalculater(sc); //���ǹ� ����5
		sc.close();
	}

	private static void minCalculater(Scanner sc) {
		System.out.print("���� 3�ڸ��� �Է��ϼ��� ");
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < b && a < c) {
			System.out.printf("���� ���� ���� %d�Դϴ�.",a);
		}
		else if(b < a && b < c) {
			System.out.printf("���� ���� ���� %d�Դϴ�.",b);
		}
		else if(c < a && c < b) {
			System.out.printf("���� ���� ���� %d�Դϴ�.",c);
		}
		else {
			System.out.println("������ ���� �Է�����������");
		}
	}

	private static void bmiCalculater(Scanner sc) {
		System.out.println("bmi�� ����ϴ� ���α׷��Դϴ�.");
		System.out.print("����,Ű,�����Ը� �Է����ּ��� ");
		int age = sc.nextInt();
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		double bmi = weight / ((height / 100) * (height / 100));
		System.out.printf("���� bmi ���� = %f%n",bmi);
		if(age>=20 && age<30) {
			if(bmi <= 17.9) {
				System.out.printf("�񸸵��� %.1f�̹Ƿ� ��ü���Դϴ�. ��ü�� : 17.9 ����",bmi);
			}
			else if(bmi >= 18 && bmi < 24) {
				System.out.printf("�񸸵��� %.1f�̹Ƿ� ǥ��ü���Դϴ�. ǥ��ü�� : 18.0~23.0",bmi);
			}
			else if(bmi >=24 && bmi <=30) {
				System.out.printf("�񸸵��� %.1f�̹Ƿ� ��ü���Դϴ�. ��ü�� : 24.0~30.0",bmi);
			}
			else {
				System.out.printf("�񸸵��� %.1f�̹Ƿ� ���Դϴ�. �� : 30�ʰ�",bmi);
			}
		}
		else {
			if(bmi <= 17.9) {
				System.out.printf("�񸸵��� %.1f�̹Ƿ� ��ü���Դϴ�. ��ü�� : 18.4 ����",bmi);
			}
			else if(bmi >= 18 && bmi < 24) {
				System.out.printf("�񸸵��� %.1f�̹Ƿ� ǥ��ü���Դϴ�. ǥ��ü�� : 18.5~24.0",bmi);
			}
			else if(bmi >=24 && bmi <=30) {
				System.out.printf("�񸸵��� %.1f�̹Ƿ� ��ü���Դϴ�. ��ü�� : 25.0~30.0",bmi);
			}
			else {
				System.out.printf("�񸸵��� %.1f�̹Ƿ� ���Դϴ�. �� : 30.0�ʰ�",bmi);
			}
		}
		
	}

	private static void ticketProgram(Scanner sc) {
		System.out.println("���̰����� ���Ű� ȯ���մϴ�. ���⿡ �ռ� ������ üũ�ϰ� �ֽ��ϴ�");
		System.out.print("����������Դϱ�? ������Դϱ�? ");
		String ticket = sc.next();
		if(ticket.contentEquals("���������")) {
			System.out.print("����,����ð��� �Է��ϼ���(1~24)");
			int age = sc.nextInt();
			int date = sc.nextInt();
			if((age>=3 && age<=12) || age>=65) {
				if(date>=9 && date<17) {
					System.out.println("����� 25000���Դϴ�.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("����� 21000���Դϴ�.");
				}
				else {
					System.out.printf("���̰��� ���� �ð��Դϴ�. �ƽ����ϴ� ������ �ٽ� ������� ���� �ð� : %d��%n",date);
				}
			}
			else if(age>=0 && age<=2) {
				if(date>=9 && date<17) {
					System.out.println("���ƴ� �����Դϴ�.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("���ƴ� �����Դϴ�.");
				}
				else {
					System.out.printf("���̰��� ���� �ð��Դϴ�. �ƽ����ϴ� ������ �ٽ� ������� ���� �ð� : %d��%n",date);
				}
			}
			else {
				if(date>=9 && date<17) {
					System.out.println("����� 34000���Դϴ�.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("����� 29000���Դϴ�.");
				}
				else {
					System.out.printf("���̰��� ���� �ð��Դϴ�. �ƽ����ϴ� ������ �ٽ� ������� ���� �ð� : %d��%n",date);
				}
			}
		}
		else if(ticket.contentEquals("�����")) {
			System.out.print("����,����ð��� �Է��ϼ���(1~24) ");
			int age = sc.nextInt();
			int date = sc.nextInt();
			if((age>=3 && age<=12) && age>=65) {
				if(date>=9 && date<17) {
					System.out.println("����� 20000���Դϴ�.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("����� 17000���Դϴ�.");
				}
				else {
					System.out.printf("���̰��� ���� �ð��Դϴ�. �ƽ����ϴ� ������ �ٽ� ������� ���� �ð� : %d��%n",date);
				}
			}
			else if(age>=0 && age<=2) {
				if(date>=9 && date<17) {
					System.out.println("���ƴ� �����Դϴ�.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("���ƴ� �����Դϴ�.");
				}
				else {
					System.out.printf("���̰��� ���� �ð��Դϴ�. �ƽ����ϴ� ������ �ٽ� ������� ���� �ð� : %d��%n",date);
				}
			}
			else {
				if(date>=9 && date<17) {
					System.out.println("����� 27000���Դϴ�.");
				}
				else if(date>=17 && date <= 24) {
					System.out.println("����� 23000���Դϴ�.");
				}
				else {
					System.out.printf("���̰��� ���� �ð��Դϴ�. �ƽ����ϴ� ������ �ٽ� ������� ���� �ð� : %d��%n",date);
				}
			}
		}
		else {
			System.out.println("�׷� ������� �����ϴ�.");
		}
	}

	private static void lowerUpperTranslater(Scanner sc) {
		System.out.print("���ڸ� �ϳ� �Է��ϼ��� ");
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
			System.out.printf("���ĺ��� �Է����ּ���. �Է��Ͻ� ���ڰ� %c",a);
		}
	}

	private static void sale(Scanner sc) {
		double price = 100;
		System.out.print("�����Ͻ� ������ �Է��ϼ��� ");
		double count = sc.nextInt();
		double res = price * count;
		double marginRate = 0;
		double rate = 1;
		if(count>=10 && count<20) {
			marginRate = 0.1;
			System.out.printf("���� ������ %.0f���̳�, %.0f�ۼ�Ʈ ���εǾ� %.0f���Դϴ�.%n",res,marginRate*100,res*(rate-marginRate));
		}
		else if(count>=20) {
			marginRate = 0.15;
			System.out.printf("���� ������ %.0f���̳�, %.0f�ۼ�Ʈ ���εǾ� %.0f���Դϴ�.%n",res,marginRate*100,res*(rate-marginRate));
		}
		else if(count>=100) {
			marginRate = 0.20;
			System.out.printf("���� ������ %.0f���̳�, %.0f�ۼ�Ʈ ���εǾ� %.0f���Դϴ�.%n",res,marginRate*100,res*(rate-marginRate));
		}
		else {
			System.out.printf("������ %.0f���Դϴ�.%n",res);
		}
	}
	
}

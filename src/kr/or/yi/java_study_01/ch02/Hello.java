package kr.or.yi.java_study_01.ch02;

/**
 * �ҽ� ���� : Hello.java
 * �ۼ��� : 2019.11.20
 * �Ʒ� Ŭ������ ���� ������ ����.
 * ����ȭ �ּ� : alt + shift + j
 */
public class Hello {
	final double PI = 3.141592;
	public static void main(String[] args) {
		//���� ����(�Լ� �� ����� ����)
		// �Ҵ� ������(����������) -> l-value(�����) = r-value(��)
		int i = 20; // ����� �ʱ�ȭ
		int s; // ������ ���� ����
		char a; // ������ ���� ����
		
		s = sum(i,10);
		a = '?';
		PI = 3.14; // ������� �� ������ �Ұ�����
		
		System.out.println(a + "hello" + (s + 10));
		System.out.printf("%c %-10s %d %5.2f\n",a,"Hello",s,55/3.0);
		System.out.printf("n = %d, m = %d\n",n,m); // n,m�� sum ���� ���������� j�� ������ �ȵǾ� �־� �ȵ�
		// '?' + "Hello" + 30
		// "?" + "Hello" + 30
		// "?Hello" + 30
		// "?Hello" + "30"
		// "?Hello30"
		// ���� + ���� : + ->���ϱ� ������
		// ���� + ���� : + ->���ڿ� ���� ������
	}

	private static int sum(int n, int m) { //alt + shift + r �������Ͽ� ��� ����
		return n + m;
	}
}

/*
 * ī�� ǥ��� = Ŭ���� : ù��° ���ڴ� �빮�� ���� �� �ܾ� ù��° ���ڸ� �빮�� 
 * ���� : ù �ܾ� ���� �� �ܾ��� ù��°�� �빮�ڷ� ����
 * �밡���� ǥ��� = Ÿ�԰� ���ڸ� ���� ����
 */


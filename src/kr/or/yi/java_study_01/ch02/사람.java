package kr.or.yi.java_study_01.ch02;

public class ��� {
	private int age;
	private String name;
	
	public ���(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	} // alt+shift+s ����ϸ� ���� ���� �� ����
	
	
	@Override
	public String toString() {
		return String.format("��� [age=%s, name=%s]", age, name);
	}

	public static void main(String[] args) {
		��� lsw = new ���(30, "�̻��");
		System.out.println(lsw);
		��� bjw = new ���(40, "������");
		System.out.println(bjw);
		System.out.println("\"java's ��ƴ�\""); // \ -> escape character
		
	}
}

package kr.or.yi.java_study_01.ch04;

public class Book {
	String title;
	String author;

	public Book(String title) {
		this.title = title;
		this.author = "���ڹ̻�";
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book() {
//		super();
		this("å�̸�","�۰��̸�");
		System.out.println("�Ű������� ���� ������");
	}

	@Override
	public String toString() {
		return String.format("Book [title=%s, author=%s]", title, author);
	}
}

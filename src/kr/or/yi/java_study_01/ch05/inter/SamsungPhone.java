package kr.or.yi.java_study_01.ch05.inter;

public class SamsungPhone implements PhoneInterface {
	private String pName;
	private int pYear;
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpYear() {
		return pYear;
	}

	public void setpYear(int pYear) {
		this.pYear = pYear;
	}

	@Override
	public void sendCall() {
		System.out.println("�츮������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	public void init() {
		prnLogo();
		receiveCall();
		sendCall();
		flash();
	}
	public void showInfo() {
		System.out.println(pYear + "�⿡ ����� " + pName);
	}
}
package kr.or.yi.java_study_01.ch05.inter;

public interface PhoneInterface {
	//���, �߻� �޼ҵ�, ������ �޼ҵ常 ���� ����
	public static final int TIMEOUT = 1000; // ���(public static final ���� ����)
	public abstract void sendCall(); //�߻�޼���(public abstract ���� ����)
	public abstract void receiveCall(); //�߻�޼���(public abstract ���� ����)
	public default void prnLogo() { //������ �޼���(public default ���� ����)
		System.out.println("** phone **");
	}
}

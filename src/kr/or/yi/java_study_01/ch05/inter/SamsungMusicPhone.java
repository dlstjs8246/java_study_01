package kr.or.yi.java_study_01.ch05.inter;

public class SamsungMusicPhone extends SamsungPhone implements MusicPhoneInterface {
	
	@Override
	public void sendSMS() {
		System.out.println("���ڸ� �����ϴ�.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("���ڸ� �޽��ϴ�.");
	}

	@Override
	public void play() {
		System.out.println("������ ����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ �����մϴ�.");
	}

	@Override
	public void playMP3Ringtone() {
		System.out.println("RingRing~~");
	}
	public void musicPhoneinit() {
		init();
		showInfo();
	}
	public void excute() {
		sendSMS();
		receiveSMS();
		play();
		stop();
		playMP3Ringtone();
	}

}

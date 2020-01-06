package kr.or.yi.java_study_01.ch05.inter;

public class SamsungMusicPhone extends SamsungPhone implements MusicPhoneInterface {
	
	@Override
	public void sendSMS() {
		System.out.println("문자를 보냅니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자를 받습니다.");
	}

	@Override
	public void play() {
		System.out.println("음악을 재생합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악을 종료합니다.");
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

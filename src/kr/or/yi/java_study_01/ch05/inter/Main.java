package kr.or.yi.java_study_01.ch05.inter;

public class Main {
	public static void main(String[] args) {
//		phone();
		samsungMusicPhone();
	}

	private static void samsungMusicPhone() {
		SamsungMusicPhone phone = new SamsungMusicPhone();
		phone.setpName("multiPhone");
		phone.setpYear(2019);
		phone.musicPhoneinit();
		phone.excute();
	}

	private static void phone() {
		SamsungPhone phone = new SamsungPhone();
		phone.setpName("GalaxyS10");
		phone.setpYear(2019);
		phone.init();
		phone.showInfo();
	}
}

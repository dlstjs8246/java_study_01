package kr.or.yi.java_study_01.ch05.trainningExam;

public class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	void turnOnOff() {
		if(isPowerOn==true) {
			isPowerOn=false;
			return;
		}
		if(isPowerOn==false) {
			isPowerOn=true;
			return;
		}
	}
	void volumeUp() {
		if(volume<MAX_VOLUME) {
			volume++;
			return;
		}
	}
	void volumeDown() {
		if(volume>MIN_VOLUME) {
			volume--;
			return;
		}
	}
	void channelUp() {
		channel++;
		if(channel>MAX_CHANNEL) {
			channel = MIN_CHANNEL;
			return;
		}
	}
	void channelDown() {
		channel--;
		if(channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
			return;
		}
	}
}

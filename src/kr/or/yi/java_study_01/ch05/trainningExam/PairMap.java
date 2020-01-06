package kr.or.yi.java_study_01.ch05.trainningExam;

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String Key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

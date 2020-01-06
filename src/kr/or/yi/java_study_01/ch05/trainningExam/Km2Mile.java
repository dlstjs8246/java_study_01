package kr.or.yi.java_study_01.ch05.trainningExam;

public class Km2Mile extends Converter {
	public Km2Mile(double radio) {
		setRatio(radio);
	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/getRatio();
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}

}

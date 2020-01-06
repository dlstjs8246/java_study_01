package kr.or.yi.java_study_01.ch05.trainningExam;

public class Won2Dollar extends Converter {
	public Won2Dollar(int radio) {
		setRatio(radio);
	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/getRatio();
	}

	@Override
	protected String getSrcString() {
		return "¿ø";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "´Þ·¯";
	}

}

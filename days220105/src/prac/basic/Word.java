package prac.basic;

public class Word {
	private String English;
	private String Korean;

	public Word(String english, String korean) {
		English = english;
		Korean = korean;
	}

	public String getEnglish() {
		return English;
	}

	public void setEnglish(String english) {
		English = english;
	}

	public String getKorean() {
		return Korean;
	}

	public void setKorean(String korean) {
		Korean = korean;
	}

}

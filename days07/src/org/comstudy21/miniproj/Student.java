package org.comstudy21.miniproj;

public class Student {
	public int no; // 번호
	public String name; // 이름
	public int kor, eng, mat;
	public int sum; // 국영수 총점
	public double avg; // 국영수 총점의 평균
	public String grade; // 학점
	public int rank; // 등수

	public Student() {
		// 디폴트 생성자 - 인자가 없다. 아무일도 하지 않는다.
	}

	// 객체를 사용하면 toString()이 자동 호출된다.
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + avg + "\t" + grade + "\t"
				+ rank;
	}

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

		this.sum = kor + eng + mat;
		this.avg = sum / 3;

		if (avg <= 100 && avg >= 90) {
			this.grade = "A";
		} else if (avg < 90 && avg >= 80) {
			this.grade = "B";
		} else if (avg < 80 && avg >= 70) {
			this.grade = "C";
		} else {
			this.grade = "D";
		}

	}

}
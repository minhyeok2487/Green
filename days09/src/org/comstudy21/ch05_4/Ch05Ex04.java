package org.comstudy21.ch05_4;

class 사람 {
	private String name;
	public 사람(String name) {
		this.name = name;
		System.out.println("사람 생성자 호출 >> "+name);
	}
}

class 학생 extends 사람{
	public 학생() {
		// 부모의 디폴트 생성자 (매개변수 없는 생성자) 자동으로 호출한다.
		// 만약 부모의 디폴트 생성자가 없다면 명시적으로 매개변수있는 생성자를 호출해야한다.
		super("no-name");
		System.out.println("사람을 상속받은 학생 생성자 호출");
	}
}

class 근로학생 extends 학생 {
	public 근로학생() {
		System.out.println("학생을 상속받은 근로학생 생성자 호출");
	}
}

public class Ch05Ex04 {

	public static void main(String[] args) {
		근로학생 studentWorker = new 근로학생();

	}

}

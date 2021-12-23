package org.comstudy21.ch05;

class People {
	private String name;
	private int age;
	private String job;
	
	// 개발자가 매개변수 있는 생성자를 직접 구현하면
	// 매개변수 없는 디폴트 생성자도 반드시 구현 해주어야 한다.
	
	public People() {
		this("",0,"");
	}
	// 생성자 오버로딩
	public People(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public void showInfo() {
		System.out.println("People [name=" + name + ", "
				+ "age=" + age + ", job=" + job + "]");
	}
	
	public void setInfo(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
}

public class Ch05Ex05 {

	public static void main(String[] args) {
		People people1 = new People("홍길동",23,"의적");
		people1.showInfo(); // 필드를 출력한다.
		
		People people2 = new People();
		people2.setInfo("이순신", 23, "장군");
		people2.showInfo();
		
	}

}

package prac04;

import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

class MonthScheedule {
	Scanner scanner = new Scanner(System.in);
	int num;
	
	public MonthScheedule(int num) {
		this.num = num;
	}

	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3 >> ");
			int num = scanner.nextInt();
			if(num == 1) {
				input();
			} else if (num == 2) {
				view();
			} else if (num == 3) {
				finish();
			}
		}
	}
	
	public void input() {
		
	}
	
	public void view() {
		
	}
}


public class DayMain {

	public static void main(String[] args) {
		MonthScheedule april = new MonthScheedule(30); //4월달의 할 일
		april.run();
	}

}

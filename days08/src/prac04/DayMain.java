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
	int[] Narr;
	String[] Sarr;
	
	public MonthScheedule(int num) {
		this.num = num;
		this.Narr = new int[num];
		this.Sarr = new String[num];
	}

	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
			int num = scanner.nextInt();
			if(num == 1) {
				input();
			} else if (num == 2) {
				view();
			} else if (num == 3) {
				finish();
				break;
			}
		}
	}
	
	public void input() {
		System.out.print("날짜(1~30)?");
		int in = scanner.nextInt();
		Narr[in-1] = in;
		System.out.print("할일(빈칸없이입력)?");
		String in2 = scanner.next();
		Sarr[in-1] = in2;
		
	}
	
	public void view() {
		System.out.print("날짜(1~30)?");
		int in = scanner.nextInt();
		System.out.printf("%d일의 할 일은 %s 입니다.\n",Narr[in-1], Sarr[in-1]);
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다");
	}
}


public class DayMain {

	public static void main(String[] args) {
		MonthScheedule april = new MonthScheedule(30); //4월달의 할 일
		april.run();
	}

}

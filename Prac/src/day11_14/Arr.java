package day11_14;

import java.util.Scanner;

public class Arr {
	public static Scanner scan = new Scanner(System.in);
	public static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// 과제 1 : 유효성체크후 입력된 월의 날짜가 몇일까지인지 출력
	public static void check1() {
		while (true) {
			System.out.print("월 입력>>> ");
			int month = scan.nextInt();
			System.out.print("일 입력>>> ");
			int day = scan.nextInt();
			if (month <= days.length) {
				if (day <= days[month - 1]) {
					int total = day;
					for (int i = 0; i < month - 1; i++) {
						total += days[i];
					}
					System.out.printf("1월 1일 부터 %d월 %d일까지는 %d일이 지났다.\n", month, day, total);
					break;
				} else if (day > days[month - 1]) {
					System.out.printf("%d월에는 %d일까지밖에 없습니다. 다시 입력해주십시오.\n", month, days[month - 1]);
				}
			} else {
				System.out.println("해당월은 없습니다. 다시 입력해주십시오.");
			}
		}
	}

	// 과제 2 : 유효성체크후 입력된 월의 날짜가 1년까지 몇일 남았는지 출력
	public static int TO() {
		int TO = 0;
		for(int i=0; i<days.length; i++) {
			TO = TO + days[i];
		}
		return TO;
	}
	public static void check2() {
		while (true) {
			System.out.print("월 입력>>> ");
			int month = scan.nextInt();
			System.out.print("일 입력>>> ");
			int day = scan.nextInt();
			if (month <= days.length) {
				if (day <= days[month - 1]) {
					int total = day;
					for (int i = 0; i < month - 1; i++) {
						total += days[i];
					}
					int res = TO()-total;
					System.out.printf("%d월 %d일은 %d일이 남났다.\n", month, day, res);
					break;
				} else if (day > days[month - 1]) {
					System.out.printf("%d월에는 %d일까지밖에 없습니다. 다시 입력해주십시오.\n", month, days[month - 1]);
				}
			} else {
				System.out.println("해당월은 없습니다. 다시 입력해주십시오.");
			}
		}
	}

	//과제3 : 입력 월/일의 100일 후의 날짜 출력
	//과제4 : 확장 해보기 - 100일 후의 날짜를 200일 300일 특정 날수 적용되게
	//과제3 + 과제4 => 입력 월/일의 입력 일 후의 날짜 출력
	public static void check3() {
		while (true) {
			System.out.print("월 입력>>> ");
			int month = scan.nextInt();
			System.out.print("일 입력>>> ");
			int day = scan.nextInt();
			System.out.print("숫자 입력>>> ");
			int NUM = scan.nextInt();
			if (month <= days.length) {
				if (day <= days[month - 1]) {
					int total = day;
					for (int i = 0; i < month - 1; i++) {
						total += days[i];
					}
					break;
				} else if (day > days[month - 1]) {
					System.out.printf("%d월에는 %d일까지밖에 없습니다. 다시 입력해주십시오.\n", month, days[month - 1]);
				}
			} else {
				System.out.println("해당월은 없습니다. 다시 입력해주십시오.");
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		check1();
	}

}

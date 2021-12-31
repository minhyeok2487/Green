package day13;

import java.util.Scanner;

public class ChEx04 {

	public static Scanner scan = new Scanner(System.in);
	
	public static void rowGugu() {
		for(int title=2; title<=9; title++) {
			System.out.printf("---%d단---\t", title);
		}
		System.out.println();
		for (int dan = 1; dan <= 9; dan++) {
			for (int cnt = 2; cnt <= 9; cnt++) {
				System.out.printf("%d * %d = %d\t", cnt, dan, dan * cnt);
			}
			System.out.println();
		}
	}
	
	public static void BasicGugu() {
		// 구구단 출력 프로그램.
		// 2단~9단까지 출력하는 프로그램 구현.
		for (int dan = 2; dan <= 9; dan++) {
			System.out.printf("---%d단---\n", dan);
			for (int cnt = 1; cnt <= 9; cnt++) {
				System.out.printf("%d * %d = %d\n", dan, cnt, dan * cnt);
			}
			System.out.println();
		}
	}

	
	public static void Plactice() {
		int startDan = 2;
		int endDan= 9;
		
		//시작단이 종료단 보다 큰 숫자여도 정상 출력 되도록 완성하시오.
		System.out.printf("시작단 입력>> ");
		startDan = scan.nextInt();
		System.out.printf("끝단 입력>> ");
		endDan = scan.nextInt();
		
		if(startDan>endDan) {
			int num = startDan;
			startDan = endDan;
			endDan = num;
		}
		
		for(int dan=startDan; dan<=endDan; dan++) {
			System.out.printf("---%d단---\n", dan);
			for (int cnt = 1; cnt <= 9; cnt++) {
				System.out.printf("%d * %d = %d\n", dan, cnt, dan * cnt);
			}
			System.out.println();
		}
	}
	
	
	public static void Plactice2() {
		// 과제1 : 3행 3열로 구구단 출력
		// 과제2 : 시작단, 종료단 기능과 합체
		for(int dan=2; dan<=9; dan=dan+3) {
			System.out.printf("---%d---\t",dan+0);
			System.out.printf("---%d---\t",dan+1);
			System.out.printf("---%d---\t\n",dan+2);
		}
	}
	
	
	public static void main(String[] args) {
		Plactice();
	}

}

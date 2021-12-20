package day11_14;

import java.util.Scanner;

public class Star {
	public static Scanner scan = new Scanner(System.in);

	public static void diagonal(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (j == i || i == 0 || j == 0 || j == a - 1 || i == a - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void Dia(int a) {
		int b = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (i == 0 || j == 0 || j == a - 1 || i == a - 1 || (j == a / 2 - b) || (j == a / 2 + b)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			b = i < a / 2 ? b + 1 : b - 1;
		}
	}

	public static void check() {
		while(true) {
			System.out.println("-1입력시 중단");
			System.out.print("크기를 입력하세요(홀수만 가능합니다)>> ");
			int a = scan.nextInt();
			if (a == -1) {
				System.out.println("끝!");
				break;
			} else if (a%2 == 0){
				System.out.println("홀수를 입력하세요");
			} else if (a%2 == 1){
				diagonal(a);
				System.out.println();
				Dia(a);
			}
		}
	}

	public static void main(String[] args) {
		check();
	}

}

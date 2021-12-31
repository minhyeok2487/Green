package day13;

import java.util.Scanner;

public class GuguDan {
	public static Scanner scan = new Scanner(System.in);

	// 시작단 입력 함수
	public static int SDan() {
		final int MIN = 2;
		final int MAX = 9;
		System.out.printf("시작단 입력>> ");
		int startDan = scan.nextInt();
		while (startDan < MIN || startDan > MAX) {
			System.out.println("다시 입력(" + MIN + "~" + MAX + ")>>>");
			startDan = scan.nextInt();
		}
		return startDan;
	}

	// 끝단 입력 함수
	public static int EDan(int startDan) {
		final int MIN = 2;
		final int MAX = 9;
		System.out.printf("끝단 입력>> ");
		int endDan = scan.nextInt();
		while (startDan < MIN || startDan > MAX) {
			System.out.println("다시 입력(" + MIN + "~" + MAX + ")>>>");
			startDan = scan.nextInt();
		}

		return endDan;
	}

	// 구구단 함수
	public static void Gugu(int StartDan, int EndDan) {

		// 입력시 시작단이 더 커도 가능할 수 있게 구현
		if (StartDan > EndDan) {
			int num = StartDan;
			StartDan = EndDan;
			EndDan = num;
		}

		// 3행 3열로 구구단 출력
		for (int dan = StartDan; dan <= EndDan; dan += 3) {
			for (int i = 0; i < 3; i++) {
				if (dan + i < 10 && dan + i <= EndDan) {
					System.out.printf("<%d단>\t", dan + i);
				} else {
					System.out.print("");
				}

			}
			System.out.println();
			for (int i = 1; i <= 9; i++) {
				for (int j = 0; j < 3; j++) {
					if(dan + j < 10 && dan + j <= (EndDan)) {
						System.out.printf("%d*%d=%d\t", dan + j, i, (dan + j)*i);
					} else {
						System.out.print("");
					}
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int startDan = SDan();
		int endDan = EDan(startDan);
		Gugu(startDan, endDan);

	}

}

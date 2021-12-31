package day13;

import java.util.Scanner;

public class Ch03Ex03 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("---반복분 Break---");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (j % 3 == 0)
					break; // 20번 실행됨
				System.out.print(i * j + " ");
			}
			System.out.println();
		}

		System.out.println("\n---Break Label---");
		aaa: for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (j % 3 == 0)
					break aaa; // break label
				System.out.print(i * j + " ");
			}
			System.out.println();
		}

		System.out.println("\n\n---Break Continue응용---");
		int age = 0;

		while (true) {
			try {
				System.out.print("나이 입력: ");
				age = scan.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("입력 실패");
				scan.next(); //scan의 버퍼를 제거한다.
				continue;
			}
		}

		if (age < 20) {
			System.out.println("미성년자에게는 술을 팔지 않습니다.");
		} else {
			System.out.println("맛있게 드세요!");
		}
	}

}

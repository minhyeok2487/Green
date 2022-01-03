package ch07.prac;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("나라 이름과 인굴르 입력하세요.(예: Korea 5000)");
		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		while (true) {
			System.out.print("나라 이름, 인구 >> ");
			String nation = scan.next();
			if (nation.equals("그만")) {
				break;
			}
			int num = scan.nextInt();
			nations.put(nation, num);
		}

		while (true) {
			System.out.print("인구 검색 >> ");
			String nat = scan.next();
			if (nat.equals("그만")) {
				break;
			}
			Integer N = nations.get(nat);
			if (N == null) {
				System.out.println(nat + " 나라는 없습니다.");
			} else {
				System.out.println(nat + "의 인구는 " + N);
			}
		}
	}
}

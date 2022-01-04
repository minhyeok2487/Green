package ch07.prac;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

class Nation {
	String country;
	String capital;

	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}

}

public class Ex11_1 {
	public static Scanner scan = new Scanner(System.in);
	public static Vector<Nation> N = new Vector<Nation>();
	public static void main(String[] args) {
		System.out.println("수도 맞추기 게임을 시작합니다.");
		N.add(new Nation("그리스", "아테네"));
		N.add(new Nation("멕시코", "멕시코시티"));
		N.add(new Nation("영국", "런던"));
		N.add(new Nation("이탈리아", "로마"));
		boolean a = true;
		while (a) {
			System.out.print("입력(1), 퀴즈(2), 종료(3) >> ");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				//insert();
				break;
			case 2:
				quiz();
				break;
			case 3:
				System.out.println("게임을 종료합니다");
				a = false;
				break;
			}
		}
	}

	private static void quiz() {
		while (true) {
			String[] keys2 = N.toArray(new String[N.size()]);
			String randomKey = keys2[new Random().nextInt(keys2.length)];
			System.out.printf("%s의 수도는?", randomKey);
	
			String ans = scan.next();
			if (ans.equals("그만")) {
				break;
			}
			if (ans.equals(N.get(randomKey))) {
				System.out.println("정답!");
			} else {
				System.out.println("아닙니다!");
			}

		}

	}

	private static void insert() {
		System.out.printf("현재 %d개 나라와 수도가 입력되어 있습니다.\n", Q.size());
		while (true) {
			System.out.printf("나라와 수도 입력%d>> ", Q.size() + 1);
			String nation = scan.next();
			if (nation.equals("그만")) {
				break;
			}
			String city = scan.next();

			Set<String> keySet = N.keySet();
			int count = 0;
			for (String key : keySet) {
				if (nation.equals(key)) {
					System.out.printf("%s는 이미 있습니다!\n", nation);
					count++;
					break;
				}
			}
			if (count == 0) {
				Q.put(nation, city);
			}
		}
	}
	
}

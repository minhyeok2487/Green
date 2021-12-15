package pratice_3;

import java.util.Scanner;

public class Ex14 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		
		while (true) {
			int n = 9999;
			System.out.print("과목 이름>>");
			String name = scan.nextLine();
			if (name.equals("그만")) {
				break;
			}
			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					n = score[i];
					System.out.printf("%s의 점수는 %d\n", course[i], n);
					break;
				}
			}
			if(n==9999) {
				System.out.println("없는 과목입니다.");
			}
			

		}

	}

}

package day13;

import java.util.Scanner;

public class Ch03Ex02 {
	public static Scanner scan = new Scanner(System.in);

	public static void Navg() {
		// 여러개의 정수를 입력한다. 끝내려면 -1을 입력한다.
		// -1이 입력 되기 전까지 숫자를 계속 입력 받는 프로그램.
		// 입력 받은 숫자 중 -1을 제외한 숫자의 평균을 출력한다.
		// 총점, count 필요
		// 평균 = 총점 / count

		int total = 0;
		int count = 0;
		double avg = 0.0;

		System.out.println("-1이 입력 될때까지 연속적으로 숫자 입력 받기.");
		System.out.print("입력 >> ");
		int number = scan.nextInt();
		while (number != -1) {
			count++;
			total += number;
			number = scan.nextInt();
		}

		System.out.println("입력 끝!");
		avg = (double) total / (double) count;
		System.out.printf("정수의 개수는 %d개이며 평균은 %.1f입니다.\n", count, avg);
	}

	public static void InputS() {
		// 단어를 입력 받는 프로그램 구현.
		// "끝"이 입력 될때까지 단어를 계속 입력받는다.
		// 입력된 단어들 중에서 가장 긴 단어를 출력한 프로그램을 만든다.
		
		int max = 0;
		String maxword = "";
		System.out.println("끝이 입력 될때까지 연속적으로 단어 입력 받기.");
		System.out.print("입력 >> ");
		String word = scan.next();
		while (!word.equals("끝")) {
			if(max < word.length()) {
				max = word.length();
				maxword = word;
			}
			word = scan.next();
		}
		System.out.println("입력 끝!");
		System.out.printf("가장 긴 단어는 %s",maxword);
	}
	
	
	public static void main(String[] args) {
		InputS();
	}

}

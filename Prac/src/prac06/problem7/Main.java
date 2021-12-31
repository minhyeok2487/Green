package prac06.problem7;

import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.print(">>");
			String sentence = scan.nextLine();
			if(sentence.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			String[] sLen = sentence.split(" ");
			System.out.println("어절 개수는 "+sLen.length);
		}
	}

}

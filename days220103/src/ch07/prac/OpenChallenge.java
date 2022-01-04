package ch07.prac;

import java.util.Scanner;
import java.util.Vector;

public class OpenChallenge {
	public static Scanner scan = new Scanner(System.in);
	public static Vector<Word> v = new Vector<Word>();

	public static void main(String[] args) {
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
		SaveWord.insert(v);
		while (true) {
			System.out.println("단어 테스트:1, 단어 삽입:2, 종료:3>>");
			int num = scan.nextInt();
			switch (num) {
			case 1: {
				Run.run(v);
				break;
			}
			case 2: {
				Insert.insertWord(v);
				break;
			}
			case 3: {
				System.out.println("\"명품영어\"를 종료합니다...");
				break;
			}
			}

		}
	}
}

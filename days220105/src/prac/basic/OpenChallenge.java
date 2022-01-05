package prac.basic;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import prac.ch08.SaveTXT;

public class OpenChallenge {
	public static Scanner scan = new Scanner(System.in);
	public static Vector<Word> v = new Vector<Word>();

	public static void main(String[] args) throws IOException {
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
		SaveWord.insert(v);
		loop1 : while (true) {
			System.out.print("단어 테스트:1, 단어 삽입:2, 단어장 저장:3, 종료:4>>");
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
				SaveTXT.savetxt(v);
				break;
			}
			case 4: {
				System.out.println("\"명품영어\"를 종료합니다...");
				break loop1;
			}
			}

		}
	}
}

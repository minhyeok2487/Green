package prac.basic;

import java.util.Scanner;
import java.util.Vector;

public class Insert {
	public static Scanner scan = new Scanner(System.in);
	public static void insertWord(Vector<Word> v) {
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		while(true) {
			System.out.print("영어 한글 입력 >> ");
			String English = scan.next();
			if(English.equals("그만")) {
				break;
			}
			String Korean = scan.next();
			v.add(new Word(English, Korean));
		}
	}
}

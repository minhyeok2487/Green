package prac06.problem8;

import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String sentence = scan.nextLine();
		String longsen = sentence.concat(sentence);
		for(int i =1; i<sentence.length()+1;i++) {
			String str = longsen.substring(i,i+sentence.length());
			System.out.println(str);
		}
	}
}

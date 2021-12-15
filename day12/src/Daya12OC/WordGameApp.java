package Daya12OC;

import java.util.Scanner;


public class WordGameApp {
	public static Scanner scan = new Scanner(System.in);

	static String[] run(int number) {
		String[] arr = new String[number];
		for(int i = 0; i<number; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			arr[i] = scan.next();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int number = scan.nextInt();
		String[] arr = run(number);
		
		String word = "아버지";
		System.out.printf("시작하는 단어는 %s입니다.\n",word);
		
		Player p = new Player();
		p.getWordFromUser(arr);
	}

}

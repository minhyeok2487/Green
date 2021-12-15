package Daya12OC;

import java.util.Scanner;

public class Player {
	
	public static Scanner scan = new Scanner(System.in);
	
	public void getWordFromUser(String[] arr) {
		String word = "아버지";
		boolean res = true;
		while(res) {
			for(int i = 0; i<arr.length; i++) {
				System.out.printf("%s>>",arr[i]);
				String nextword = scan.next();
				if(!checkSuccess(word, nextword)) {
					System.out.printf("%s이 졌습니다.",arr[i]);
					res = false;
					i = arr.length+1;
				}
				word = nextword;
			}
		}
	}
	
	public static boolean checkSuccess(String word, String Nextword) {
		int lastIndex = word.length()-1; // 마지막 문자에 대한 인덱스
		char lastChar = word.charAt(lastIndex); // 마지막 문자
		char firstChar = Nextword.charAt(0); // 첫 번째 문자
		boolean res = true;
		
		if(lastChar == firstChar) {
			res = true;
		} else if(lastChar != firstChar) {
			res = false;
		}
		
		return res;
	}

	



	

	
}

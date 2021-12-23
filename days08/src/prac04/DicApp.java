package prac04;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		String res = word+"는 저의 사전에 없습니다.";
		for(int i =0; i<kor.length; i++) {
			if (word.equals(kor[i])) {
				res = word + "은 " + eng[i]; 
				break;
			}
		}
		
		return res;
	}
}

public class DicApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램 입니다.");
		while(true) {
			System.out.print("한글 단어?");
			String Ename = scanner.next();
			if (Ename.equals("그만")) {
				break;
			}
			Dictionary Dic = new Dictionary();
			String res = Dic.kor2Eng(Ename);
			System.out.println(res);
		}
	}

}

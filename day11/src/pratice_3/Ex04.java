package pratice_3;

import java.util.Scanner;

public class Ex04 {
	public static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("소문자 알파벳 하나를 입력하시오 >>>");
		String s = scan.next();
		char c = s.charAt(0);
		char c2 = (char) (c-1);
		for(int i = (int)(c+1);i>96;i--) {
			for(char j = (char)97; j<i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}

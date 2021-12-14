package org.comstudy21.exam01;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	public static final Scanner scan = new Scanner(System.in);
	
	public static int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while(((ch = System.in.read())!='\n')) {
				if(ch>='0' && ch<='9') {
					num = num * 10 + ch - '0'; //문자가 숫자로 바뀌어서 저장이 됨
				}
			}
		} catch (IOException e) {
		} return num;
	}
	
	public static int getRand() {
		Random r = new Random();
		int Rand = r.nextInt(100);
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		System.out.println("0~99");
		return Rand;
	}
	
	public static void game() {
		while(true) {
			int rand = getRand();
			int num;
			int i = 1;
			while(true) {
				System.out.print(i + " >> ");
				i += 1;
				num = getNum();
				if(num > rand) {
					System.out.println("더 낮게");
				} else if(num < rand) {
					System.out.println("더 높게");
				} else {
					System.out.println("맞았습니다.");
					break;
				}
			}
			System.out.print("다시하시겠습니까?(y/n) >>");
			String text = scan.next();
			if(text.equals("n")) {
				break;
			}
		} 

	}
	
	public static void main(String[] args) {
		game();
	}

}

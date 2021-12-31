package prac06.problem9;

import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			int num1 = scan.nextInt();
			if(num1 == 4) {
				break;
			}
			int num2 = (int) (1 + Math.random() * 3);
			if (num2 == 1) {
				switch (num1) {
				case 1: 
					System.out.println("비겼습니다.");
					break;
				case 2: 
					System.out.println("철수(바위) : 컴퓨터(가위)");
					System.out.println("철수가 이겼습니다.");
					break;
				case 3: 
					System.out.println("철수(보) : 컴퓨터(가위)");
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				}
			} else if (num2 == 2) {
				switch (num1) {
				case 1: 
					System.out.println("철수(가위) : 컴퓨터(바위)");
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				case 2: 
					System.out.println("비겼습니다.");
					break;
				case 3: 
					System.out.println("철수(보) : 컴퓨터(바위)");
					System.out.println("철수가 이겼습니다.");
					break;
				}
			} else if (num2 == 3) {
				switch (num1) {
				case 1: 
					System.out.println("철수(가위) : 컴퓨터(보)");
					System.out.println("철수가 이겼습니다.");
					break;
				case 2: 
					System.out.println("철수(바위) : 컴퓨터(보)");
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				case 3: 
					System.out.println("비겼습니다.");
					break;
				}
			}
		}

	}
}
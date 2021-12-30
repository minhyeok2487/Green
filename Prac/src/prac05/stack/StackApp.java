package prac05.stack;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int capacity = scan.nextInt();
		StringStack SS = new StringStack(capacity);
		SS.run();
	}

}

package prac05.stack;

import java.util.Scanner;

public class StringStack implements Stack {
	
	Scanner scan = new Scanner(System.in);
	
	@Override
	public int length() {
		int num = 0;
		return num;
	}

	@Override
	public int capacity() {
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int num = scan.nextInt();
		return num;
	}

	@Override
	public String pop() {
		System.out.print("문자열 입력 >> ");
		String res = scan.next();
		return res;
	}

	@Override
	public boolean push(String val) {
		if(val.equals("그만")) {
			return false;
		}
		return true;
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}

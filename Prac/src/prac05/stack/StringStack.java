package prac05.stack;

import java.util.Scanner;

public class StringStack implements Stack {
	private String[] stack;
	private int top;
	
	public StringStack(int capacity) {
		stack = new String[capacity];
		top = 0;
	}
	
	@Override
	public int length() {
		return top;
	}

	@Override
	public int capacity() {
		return stack.length;	
		
	}

	@Override
	public String pop() {
		if(top-1 < 0) {
			return null;
		}
		
		return stack[--top];
	}

	@Override
	public boolean push(String val) {
		if(top >= capacity()) {
			return false;
		}
		stack[top++] = val;
		return true;
	}

	public void run() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = scan.next();
			if(!push(str)) {
				System.out.println("스텍이 꽉 차서 푸시 불가!");
				break;
			}
		}
		scan.close();
		
		System.out.print("스택에 저장된 모든 문자열 팝 ");
		while(true) {
			String str = pop();
			if(str == null) break;
			System.out.print(str+" ");
		}
		System.out.println();
	}
}

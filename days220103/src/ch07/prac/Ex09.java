package ch07.prac;

import java.util.Vector;

interface IStack<T> {
	T pop();

	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {

	Vector<Integer> num = new Vector<Integer>();

	@Override
	public T pop() {
		return null;

	}

	@Override
	public boolean push(T ob) {
		// TODO Auto-generated method stub
		return false;
	}
}

public class Ex09 {

	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i = 0; i < 10; i++)
			stack.push(i); // 10개의 정수 푸시
		while (true) {
			Integer n = stack.pop();
			if (n == null)
				break;
			System.out.println(n + " ");
		}
	}
}

package prac04_CAL;

import java.util.Scanner;

class Number {
	int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class Add extends Number {

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void calculate() {
		System.out.println(a + b);
	}

}

class Sub extends Number {

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void calculate() {
		System.out.println(a - b);
	}
}

class Mul extends Number {

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void calculate() {
		System.out.println(a * b);
	}

}

class Div extends Number {

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void calculate() {
		System.out.println(a / b);
	}

}

public class CAL_Main {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("두 정수와 연산자를 입력하시오 >>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		String c = scan.next();

		if (c.equals("+")) {
			Add res = new Add();
			res.setValue(a, b);
			res.calculate();
		} else if (c.equals("-")) {
			Sub res = new Sub();
			res.setValue(a, b);
			res.calculate();
		} else if (c.equals("*")) {
			Mul res = new Mul();
			res.setValue(a, b);
			res.calculate();
		} else if (c.equals("/")) {
			Div res = new Div();
			res.setValue(a, b);
			res.calculate();
		}
	}
}

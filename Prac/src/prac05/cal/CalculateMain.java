package prac05.cal;

import java.util.Scanner;

public class CalculateMain {

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

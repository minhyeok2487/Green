package ch07.prac;

import java.util.Scanner;
import java.util.Vector;

abstract class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}


public class Ex10 {
	public static Scanner scan = new Scanner(System.in);
	static Vector<Shape> S = new Vector<Shape>();
	public static void main(String[] args) {
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		boolean a = true;
		while(a)  {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int num = scan.nextInt();
			switch (num) {
			case 1: insert(); break;
			case 2: delete(); break;
			case 3: show(); break;
			case 4: 
				System.out.println("beauty을 종료합니다");
				a = false;
				break;
			}
		}
	}
	
	private static void delete() {
		System.out.print("삭제할 도형의 위치 >> ");
		int num = scan.nextInt();
		if(num>S.size()) {
			System.out.println("삭제할 수 없습니다.");
		} else {
			System.out.println("아래 도형을 삭제합니다");
			S.elementAt(num-1).draw();
			S.remove(num-1);
		}
	}

	private static void show() {
		for(Shape s : S) {
			s.draw();
		}
	}
	private static void insert() {
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		int num = scan.nextInt();
		switch (num) {
		case 1: S.add(new Line()); break;
		case 2: S.add(new Rect()); break;
		case 3: S.add(new Circle()); break;
		}
	}

}

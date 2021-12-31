package prac04;

import java.util.Scanner;

class Circle {
	public double x, y;
	public int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public void show2() {
		System.out.println("가장 면적인 큰 원은 ("+x+","+y+")"+radius);
	}
	
	
	
}

public class CircleManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle[3];
		for(int i=0; i<c.length;i++) {
			System.out.print("x, y, radius >>");
			Double x = scanner.nextDouble();
			Double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		//for(int i=0; i<c.length;i++) c[i].show();
		int max = 0;
		double x=0;
		double y=0;
		for(int i=0; i<c.length;i++) {
			if (max < c[i].radius) {
				max = c[i].radius;
				x = c[i].x;
				y = c[i].y;
			}
		}
		Circle a = new Circle(x, y, max);
		a.show();
		scanner.close();
	}

}

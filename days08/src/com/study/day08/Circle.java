package com.study.day08;

public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius = 1; name = " "; //초기값
	}
	
	public Circle(int r, String n) {
		radius = r; name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

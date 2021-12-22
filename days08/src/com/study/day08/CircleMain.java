package com.study.day08;

public class CircleMain {

	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "JavaPizza";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut = new Circle(2, "JavaDonut");
		double area2 = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area2);
	}

}

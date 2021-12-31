package prac05.shape13;

public class Circle implements Shape {

	int num;
	
	public Circle(int num) {
		this.num = num;
	}
	
	@Override
	public void draw() {
		System.out.print("반지름이 "+num+"인 원입니다.\n");
	}

	@Override
	public double getArea() {
		return this.num*this.num* Pi;
	}
		
}

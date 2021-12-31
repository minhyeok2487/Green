package prac05.shape13;

public class Rect implements Shape{
	
	int num1, num2;
	
	public Rect(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void draw() {
		System.out.printf("%dx%d크기에 사각형 입니다.\n",num1, num2);
		
		
	}

	@Override
	public double getArea() {
		return num1*num2;
	}

}

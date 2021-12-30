package prac05.shape13;

public class Oval implements Shape{

	int num1, num2;
	
	public Oval(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void draw() {
		System.out.printf("%dx%d에 내접하는 타원입니다.\n",num1, num2);
		
	}

	@Override
	public double getArea() {
		return Pi*num1*num2;
	}

}

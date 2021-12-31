package prac05.cal;

class Sub extends Calc {

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void calculate() {
		System.out.println(a - b);
	}
}

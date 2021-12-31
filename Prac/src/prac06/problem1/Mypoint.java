package prac06.problem1;

public class Mypoint {
	int i,j;
	public Mypoint(int i, int j) {
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "point (" + i + ", " + j + ")";
	}

	public static void main(String[] args) {
		Mypoint p = new Mypoint(3,50);
		Mypoint q = new Mypoint(4,50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}
}

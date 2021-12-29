package prac05.point;

public class Point3D extends Point {
	private int x, y, z;

	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.x = getX();
		this.y = getY();
		this.z = z;
	}

	public void moveUp() {
		++this.z;
	}
	
	public void moveDown() {
		--this.z;
	}
	
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.x = getX();
		this.y = getY();
		this.z = z;
	}
	
	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x +","+y+","+z+")의 점";
	}
}

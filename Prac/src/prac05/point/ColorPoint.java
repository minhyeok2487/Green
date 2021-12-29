package prac05.point;

public class ColorPoint extends Point {
	private String color;
	private int x, y;
	
	public ColorPoint() {
		super(0,0);
		color = "BLACK";
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public ColorPoint(int x, int y) {
		super(x,y);
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setColor(String string) {
		this.color = string;
	}

	@Override
	public String toString() {
		return color+"색의 " + "(" + x +","+y+")의 점";
	}
}

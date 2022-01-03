package ch07.ex01;

import java.util.Objects;
import java.util.Vector;

class Point{
	private int x, y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

}

public class Ch07Ex02Point {
	
	public static void main(String[] args) {
		System.out.println(">> Point 객체를 요소로만 가지는 벡터 생성");
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		// equals(), hashCode() 재정의
		int findIdx = v.indexOf(new Point(-5,20));
		v.remove(findIdx); 
		System.out.println(v);
	}

}

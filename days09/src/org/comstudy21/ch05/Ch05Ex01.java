package org.comstudy21.ch05;

// 한 점을 구성하는 x,y좌표를 저장하는 객체의 클래스
class Point {
	int x, y;
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.printf("x의 좌표는 %d, y의 좌표는 %d\n",x,y);
	}
}

// Point를 확장한 ColorPoint 클래스 선언
class ColorPoint extends Point{
	String color;

	public void setColor(String string) {
		this.color = string;
	}

	public void showColorPoint() {
		super.showPoint();
		System.out.printf("색깔은 %s\n",color);
	}
}

class Point3D extends Point{
	int z;
	
	public void set(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void showPoint() {
		System.out.printf("x의 좌표는 %d, y의 좌표는 %d, z의 좌표는 %d",x,y,z);
	}
	
}


public class Ch05Ex01 {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1,2);
		p.showPoint();
		System.out.println();
		ColorPoint cp = new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
		System.out.println();
		Point3D p3d = new Point3D();
		p3d.set(5, 6, 7);
		p3d.showPoint();
	}

}

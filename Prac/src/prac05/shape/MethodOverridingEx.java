package prac05.shape;

public class MethodOverridingEx {
	public static void main(String[] args) {
		Shape start, last, node;
		start = new Line();
		last = start;
		node = new Rect();
		last.next = node;
		last = node;
		node = new Line();
		last.next = node;
		last = node;
		node = new Circle();
		last.next = node;
		last = node;
		
		Shape cur = start;
		while(cur != null) {
			cur.draw();
			cur = cur.next;
		}
	}
	
	
	static void paint(Shape p) {
		p.draw();
	}
	
	static void paint(String[] args) {
		Line line = new Line();
		paint(line);
	    paint(new Shape());
	    paint(new Line());
	    paint(new Rect());
	    paint(new Circle());
	}
}

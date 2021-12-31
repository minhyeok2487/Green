package prac04;

class TV {
	String name;
	int year;
	int inch;
	
	public TV(String name, int year, int inch) {
		this.name = name; 
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV",name, year, inch);
	}
}

public class TVmain {
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}

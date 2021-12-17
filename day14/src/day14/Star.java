package day14;

public class Star {

	public static void Star(int MAX, int END) {
		int NUM = MAX + END;
		for(int i=0; i<NUM; i++) {
			for(int j=0; j<NUM; j++) {
				System.out.print(j>=MAX && j<NUM-MAX? " " : "*");
			}
			System.out.println();
			MAX = i<END ? MAX-1 : MAX+1;
		}
	}

	public static void main(String[] args) {
		int MAX = 5;
		int END = MAX - 1;
		
		Star(MAX, END);

	}

}

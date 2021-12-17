package day14;

public class Sandglass {
	public static void RTri(int MAX) {
		for (int i = 0; i < MAX-1; i++) {
			for (int j = 0; j < MAX; j++) {
				System.out.print(j < i ? " " : "*");
			}
			for (int j = 0; j < MAX - 1 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void Tri(int MAX, int END) {
		for (int i = 0; i < MAX + END; i++) {
			END = i < MAX ? END - 1 : END + 1;
			for (int j = 0; j < MAX; j++) {
				System.out.print(j > END ? "*" : " ");
			}
			for (int j = 0; j < MAX - 1; j++) {
				System.out.print(j > MAX - 3 - END ? " " : "*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int MAX = 5;
		int END = MAX - 1;

		RTri(MAX);
		Tri(MAX, END);
	}

}

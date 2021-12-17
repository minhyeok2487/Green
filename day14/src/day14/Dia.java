package day14;

public class Dia {

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

	public static void RTri(int MAX) {
		MAX = MAX - 1;
		for (int i = 0; i < MAX; i++) {
			System.out.print(" ");
			for (int j = 0; j < MAX; j++) {
				System.out.print(j < i ? " " : "*");
			}
			for (int j = 0; j < MAX - 1 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int MAX = 5;
		int END = MAX - 1;

		// 삼각형 별찍기
		Tri(MAX, END);
		// 역삼각형 별찍기
		RTri(MAX);

	}

}

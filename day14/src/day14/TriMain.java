package day14;

import java.util.Scanner;

public class TriMain {
	public static Scanner scan = new Scanner(System.in);

	public static int Number() {
		while (true) {
			System.out.print("크기(홀수)를 입력하여 주십시오 >>");
			int a = scan.nextInt();
			if ((a % 2 == 1)&&(a >= 5 && a<= 15)) {
				return a;
			} else if (a % 2 == 0) {
				System.out.println("홀수만 입력하여주십시오.");
			} else if (!(a > 5 && a< 15)) {
				System.out.println("5~15사이의 숫자만 입력하여주십시오.");
			}
		}
	}
	
	public static void DiaTri(int MAX, int END) {
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

	public static void DiaRTri(int MAX) {
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
	
	public static void SandRTri(int MAX) {
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

	public static void SandTri(int MAX, int END) {
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
		System.out.println("무엇을 그리시겠습니까?");
		System.out.println("1.마름모 2.모래시계 3.빈마름모");
		int C = scan.nextInt();
		
		int a = Number();
		int MAX = a/2+1;
		int END = MAX - 1;
		
		if(C==1) {
			DiaTri(MAX, END);
			DiaRTri(MAX);
		} else if(C==2) {
			SandRTri(MAX);
			SandTri(MAX, END);
		} else if(C==3) {
			Star(MAX, END);
		}

	}

}

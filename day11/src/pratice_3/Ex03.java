package pratice_3;

import java.util.Scanner;

public class Ex03 {
	public static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오 >>>");
		int num = scan.nextInt();
		for(int i = num+1;i>0;i--) {
			for(int j = 1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

package pratice_3;

import java.util.Scanner;

public class Ex05 {
	public static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("양의 정수 10개를 입력하시오 >>>");
		
		int[] n = new int[10];
		for(int i = 0; i<n.length; i++) {
			n[i] = scan.nextInt();
		}
		
		
		System.out.print("3의 배수는 ");
		for (int i = 0; i < n.length; i++) {
			if(n[i]%3 == 0) {
				System.out.print(n[i]+" ");
			}
		}		
		
	}

}

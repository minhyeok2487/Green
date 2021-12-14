package pratice_3;

import java.util.Scanner;

public class Ex06 {
	
	public static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		
		System.out.print("금액을 입력하시오 >> ");
		int num = scan.nextInt();
		
		for(int i = 0; i < unit.length;i++) {
			int a = num/unit[i];
			if(a != 0) {
				System.out.printf("%d원 짜리 : %d개\n",unit[i],a);
			}
			num = num%unit[i];
		}
		
	}

}

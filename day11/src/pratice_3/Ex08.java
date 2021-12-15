package pratice_3;

import java.util.Scanner;

public class Ex08 {
	public static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("정수 몇개?");
		int num = scan.nextInt();
		
		int[] arr = new int[num];
		
		arr[0] = (int)(Math.random()*100+1);
		
		for(int j = 1; j<arr.length;j++) {
			arr[j] = (int)(Math.random()*100+1);
			for(int i = j-1; i>=0; i--) {
				if(arr[j]==arr[i]) {
					arr[j] = 0;
					--j;
					break;
				}
			}
		}
		
		for(int j = 0; j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		
		
	}

}

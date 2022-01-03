package ch07.prac;

import java.util.Scanner;
import java.util.Vector;

public class Ex04 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		int sum = 0;
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int num = scan.nextInt();
			if(num == 0) {
				break;
			}
			v.add(num);
			
			for(Integer i : v) {
				System.out.print(i+" ");
			}
			
			sum += num;
			int avr = sum/v.size();
			System.out.println("\n현재 평균 "+avr);
		}
	}
}

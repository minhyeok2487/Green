package ch07.prac;

import java.util.Scanner;
import java.util.Vector;

public class Ex01 {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("정수(-1이 입력될 때까지) >> ");
		Vector<Integer> v = new Vector<Integer>();
		
		while(true) {
			int num = scan.nextInt();
			if(num == -1) {
				break;
			}
			v.add(num);
		}
		
		int longIndex = 0;
		for(int i=0; i<v.size();i++) {
			if(v.elementAt(i)>v.elementAt(longIndex)) {
				longIndex=i;
			}
		}
		System.out.println("가장 큰 수는 "+v.elementAt(longIndex));
		
	}

}

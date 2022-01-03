package ch07.prac;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		
		ArrayList<Double> score = new ArrayList<Double>();
		for(int i =0; i<6; i++) {
			String num = scan.next();
			if(num.equals("A")) {
				score.add(4.0);
			} else if(num.equals("B")) {
				score.add(3.0);
			} else if(num.equals("C")) {
				score.add(2.0);
			} else if(num.equals("D")) {
				score.add(1.0);
			} else if(num.equals("F")) {
				score.add(0.0);
			}
		}
		
		Double sum = 0.0;
		for(int i=0; i< score.size();i++) {
			sum += score.get(i);
		}
		
		double avr = sum/score.size();
		System.out.println(avr);
	}

}

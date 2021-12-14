package org.comstudy21.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Day11Ex01 {

	//public static Scanner scan = new Scanner(System.in);
	
	public static int getNum() {
		int num = 0;
		int ch = 0;
		try {
			while(((ch = System.in.read())!='\n')) {
				if(ch>='0' && ch<='9') {
					num = num * 10 + ch - '0'; //문자가 숫자로 바뀌어서 저장이 됨
				}
			}
		} catch (IOException e) {
		} return num;
	}
	
	public static void MaxMidMin1(int a, int b, int c) {
		int max=0, mid=0, min=0;
		if(a>b) {
			if(a>c) {
				max = a;
				if(b>c) {
					mid = b;
					min = c;
				} else {
					mid = c;
					min = b;
				}
				
			} else {
				max = c;
				mid = a;
				min = b;
			}
		} else {
			if(b>c) {
				max = b;
				if(a>c){
					mid = a;
					min = c;
				} else {
					mid = c;
					min = a;
				}
				
			} else {
				max = c;
				mid = b;
				min = a;
			}
		}
		
		System.out.println("제일 큰 수는 " + max);
		System.out.println("중간 수는 " + mid);
		System.out.println("제일 작은 수는 " + min);
	}
	
	public static void MaxMidMin2(int a, int b, int c) {
		int max=0, mid=0, min=0;
		
		if(a>b) {
			if(a>c) {
				max = a;
				if(b>c) {
					min = c;
				} else {
					min = b;
				}
			} else {
				max = c;
				min = b;
			}
		} else {
			if(b>c) {
				max = b;
				if(a>c) {
					min = c;
				} else {
					min = a;
				}
			} else {
				max = c;
				min = a;
			}
		}
		
		mid = (a+b+c)-(min+max);

		System.out.println("제일 큰 수는 " + max);
		System.out.println("중간 수는 " + mid);
		System.out.println("제일 작은 수는 " + min);
	}
	
	public static void MaxMidMin3(int a, int b, int c) {
		int max=0, mid=0, min=0;
		
		max = (a>b)&&(a>c)?a:(c>b?c:b);
		min = (b>a)&&(c>a)?a:(b>c?c:b);
		mid = (a>b)?((a>c)?((b>c)?b:c):a):((b>c)?((a>c)?a:c):b);
		
		System.out.println("제일 큰 수는 " + max);
		System.out.println("중간 수는 " + mid);
		System.out.println("제일 작은 수는 " + min);
	}
	
	
	
	public static void main(String[] args) {
		// 정수 3개를 입력 받아서 큰수, 중간, 작은 수를 판별하는 프로그램.
		int a, b, c;
		
		
		System.out.print("정수1 입력 >>> ");
		a = getNum();
		System.out.print("정수2 입력 >>> ");
		b = getNum();
		System.out.print("정수3 입력 >>> ");
		c = getNum();
		
		System.out.printf("%d, %d, %d\n",a,b,c);
		
		System.out.println("1번 함수");
		MaxMidMin1(a, b, c);
		System.out.println("--------------------");
		
		System.out.println("2번 함수");
		MaxMidMin2(a, b, c);
		System.out.println("--------------------");
		
		System.out.println("3번 함수");
		MaxMidMin2(a, b, c);
		System.out.println("--------------------");
		
		
	}

}

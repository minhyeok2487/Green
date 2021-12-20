package com.study.days06;

public class Ch03Ex21 {

	public static void main(String[] args) {
		int[] arr = {10, 30, 40, 90, 120, 50};
		
		for(int number : arr) {
			System.out.printf("number => %d\n",number);
		}
		System.out.println("-------------------");
		for(int i=0; i<arr.length; i++) {
			int number = arr[i];
			System.out.printf("number => %d\n",number);
		}
	}

}

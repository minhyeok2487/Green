package com.study.days06;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03Ex23 {
	public static Scanner scan = new Scanner(System.in);
	
	public static int[] score = {95,70,85,90,100,45,35,85,70,75};
	
	public static void check(int num) {
		int len = score.length;
		for(int i =0; i<score.length;i++) {
			if(score[i]!=num) {
				len--;
			} if(score[i]==num) {
				len = score.length;
				break;
			}
		}
		if(len == score.length) {
			System.out.printf("결과 >> %d는 배열에 있습니다.\n",num);
		} else {
			System.out.printf("결과 >> %d는 배열에 없습니다.\n",num);
		}
	}
	
	public static void MinMax() {
		// 배열에 점수를 입력 받아서 제일 큰 점수와 제일 작은 점수 출력
		int[] score = new int[5];
		int max = 0, min = 100;
		
		for(int i=0; i<score.length; i++) {
			System.out.printf("점수 입력 %d >>",i);
		}
	}
	
	public static void Rank() {
		int[] score = {65,100,75,80,35,90};
		int[] rank = new int[score.length];
		
		for(int i =0; i<rank.length; i++) {
			rank[i] = 1;
		}
		
		for(int i =0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i]<score[j]) {
					rank[i] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(rank));
	}
	
	public static void main(String[] args) {
		// 65를 입력받아서 65가 있으면 true를 아니면 false출력.
		// 검색 할 점수 >> 65
		// 결과 >> 65는 배열에 없습니다!
		
		/*
		System.out.print("검색 할 점수 >>");
		int num = scan.nextInt();
		check(num);
		*/
		Rank();
	}

}

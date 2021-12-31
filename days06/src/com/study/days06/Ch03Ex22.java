package com.study.days06;

import java.util.Arrays;

public class Ch03Ex22 {

	public static void main00(String[] args) {
		String[] names = {"오징어", "꼴뚜기", "대구", "명태","거북이"};
		int[] price = {9000, 3000, 5000, 6000, 20000};
		
		for(int i =0; i<names.length; i++) {
			System.out.printf("%s의 가격은 %d원입니다.\n",names[i], price[i]);
		}
	}
	
	public static void main01(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		//Arrays를 이용해서 순서대로 출력하기
		System.out.println(Arrays.toString(arr));

		//반복문을 이용해서 arr배열의 요소값의 위치를 reverse한다.
		for(int i = 0; i<arr.length/2; i++) {
			int num = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = num;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main02(String[] args) {
		int[] arr = {7,3,2,8,1,9,4,5,6};
		//오름차순 정렬
		for(int i=1; i < arr.length; i++){
            for(int j=i ; j >= 1; j--){
                
                if(arr[j] < arr[j-1]){  
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else break;  
                
            }
        }
        System.out.println(Arrays.toString(arr));
	}
	
	public static void SelectSort() {
		int[] arr = {7,3,2,8,1,9,4,5,6};
		//오름차순 정렬 [선택정렬]
		for(int i=0; i < arr.length-1; i++){
			int min = i;
            for(int j=i+1 ; j <arr.length; j++){
            	if(arr[i]>arr[j]) {
            		int temp = arr[i];
            		arr[i] = arr[j];
            		arr[j] = temp;
            	}
            }
        }
        System.out.println(Arrays.toString(arr));
	}
	
	
	public static void lotto1(int SIZE) {
		int[] lotto = new int[SIZE];
		lotto[0] = (int)(1+Math.random()*45);
		for(int i=1; i<SIZE; i++) {
			int num = (int)(1+Math.random()*45);
			for(int j=0; j<i; j++) {
				if(num!=lotto[j]) {
					lotto[i] = num;
				} else {
					--i;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void lotto2(int SIZE) {
		int[] lotto = new int[SIZE];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(1+Math.random()*45);
			// 새로 생성한 num의 값과 lotto배열에 만들어진 요소를 비교한다.
			// num과 같은 값이 이미 있다면 다시 num을 생성한다.
			// 다시 새로 생성한 num과 lotto의 요소를 비교한다.(계속 반복)
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void lotto3() {
		final int MAX = 45;
		int[] lotto = new int[MAX];
		int[] balls = new int[45];
		for(int i=1; i<=45; i++) {
			balls[i-1] = i;
		}
		System.out.println("1~45까지의 공이 준비되었다.");
		// 1. balls의 index를 랜덤하게 선택한다.
		// 2. 그 index 위치의 번호가 0이 아니면 lotto배열에 저장
		// 3. 뽑아온 index 위치의 요소 값을 0으로 변경.
		// 4. index위치의 값이 0이면 다른 랜덤한 index 선택.(끝까지반복)
		
		for(int i=0; i<lotto.length;i++) {
			int index = (int)(Math.random()*45);//0~44난수발생
			if(balls[index] != 0) {
				lotto[i] = balls[index];
				balls[index] = 0;
				i++;
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	
	
	public static void main(String[] args) {
		SelectSort();
	}
	

}

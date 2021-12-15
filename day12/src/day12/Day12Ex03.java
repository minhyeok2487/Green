package day12;

public class Day12Ex03 {

	//1+2-3+4-5+6-7+8-9+10=7
	public static void pratice() {
		final int MAX = 10;
		// 누적하는 변수는 0으로 초기화
		int sum = 1; // 1부터 10까지 누적하는 용도
		int num = 2; // 2부터 10까지 하나씩 증가 용도
		System.out.print("1+");
		while(num<=10) {
			System.out.print(num);
			if(num%2==1) {
				System.out.print(num!=MAX ? "+" : "=");
				sum -= num;
			} else if(num%2==0) {
				System.out.print(num!=MAX ? "-" : "=");
				sum += num;
			}
			num++;
		}
		System.out.print(sum);
	}
	
	
	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10 = 55
		// while문으로 구현하기
		final int MAX = 10;
		// 누적하는 변수는 0으로 초기화
		int sum = 0; // 1부터 10까지 누적하는 용도
		int num = 1; // 1부터 10까지 하나씩 증가 용도
		
		while(num<=10) {
			System.out.print(num);
			System.out.print(num!=MAX ? "+" : "=");
			sum += num;
			num++;
		}
		System.out.print(sum);
		System.out.println();
		pratice();
	}

}

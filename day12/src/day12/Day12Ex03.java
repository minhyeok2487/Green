package day12;

public class Day12Ex03 {

	//1+2-3+4-5+6-7+8-9+10=7 구하는 함수
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
	
	//선생님 코드
	public static void pratice2() {
		//1+2-3+4-5+6-7+8-9+10=7 구하는 함수
		final int MAX = 10;
		int sum = 0;
		int num = 1;
		
		// 1. 1~10까지 출력 (num을 증가하면서 출력)
		while(num<=MAX) {
			System.out.print(num);
			if(num%2 == 1) {
				sum = num==1? num : sum - num;
				System.out.print("+");
			} else {
				sum += num;
				System.out.print(num==MAX?"=":"-");
			}
			num = num +1;
		}
		System.out.println(sum);
	}
	
	
	//피보나치 수열
	//1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54 
	public static void Fibo() {
		int prev = 0; //이전항
		int curr = 1; //현재항
		int next = 0; //다음항
		int sum = 0;
		while(curr <= 21) {
			System.out.print(curr);
			System.out.print(curr!=21 ? "+" : "=");
			sum += curr;
			next = curr + prev;
			prev = curr;
			curr = next;
			// 치환해서 증가하기
			// 다음항은 이전항 + 현재항
			// 현재항은 이전항으로 치환
			// 다음항은 현재항으로 치환(새로운 현재항)
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
		System.out.println();
		pratice2();
		System.out.println();
		Fibo();
	}

}

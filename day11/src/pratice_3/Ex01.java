package pratice_3;

public class Ex01 {
	//1~99 짝수의 합을 구하는 코드
	public static void ForTest() {
		int sum = 0, i =0;
		for(i = 0 ; i < 100 ; i += 2)
			sum = sum + i;
		System.out.println(sum);
	}
	public static void WhileTest() {
		int sum = 0, i =0;
		while (i < 100) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
	}
	public static void DoWhileTest() {
		int sum = 0, i =0;
		do {
			sum = sum + i;
			i += 2;
		} while (i < 100);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		WhileTest();
		ForTest();
		DoWhileTest();
	}
}

package fibo;
//flag알고리즘
public class flag {

	public static void FlagFibo(){
		final int MAX = 21;
		int prev = 0; //이전항
		int curr = 1; //현재항
		int next = 0; //다음항
		int sum = 0;
		
		boolean flag = true;
		while(curr<=21) {
			System.out.print(curr);
			if(flag) {
				sum = curr ==1 ? curr: sum - curr;
				System.out.print("+");
				flag = false;
			} else {
				sum += curr;
				System.out.print(curr == MAX ? "=" :"-");
				flag = true;
			}
			next = curr + prev;
			prev = curr;
			curr = next;
		}
		System.out.println(sum);
		
		
	}
	public static void main(String[] args) {
		FlagFibo();

	}

}

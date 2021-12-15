package pratice_3;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		for(int j = 0; j<num.length;j++) {
			num[j] = (int)(Math.random()*10+1);
		}
		
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}	
		
		System.out.println();
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}	
		
		System.out.print("평균은 "+(sum/num.length));
		
		
	}

}

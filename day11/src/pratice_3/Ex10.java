package pratice_3;

public class Ex10 {

	public static void main(String[] args) {
		int[][] array = new int[4][4];

		int[] arr = new int[6];
		
		arr[0] = (int)(Math.random()*16+1);
		
		for(int j = 1; j<arr.length;j++) {
			arr[j] = (int)(Math.random()*16+1);
			for(int i = j-1; i>=0; i--) {
				if(arr[j]==arr[i]) {
					arr[j] = 0;
					--j;
					break;
				}
			}
		}
		
		for(int i = 0; i<arr.length;i++) {
			array[arr[i/4]][arr[i%4]]=0;
		}
		
		
		/*
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
		*/
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		
	}

}

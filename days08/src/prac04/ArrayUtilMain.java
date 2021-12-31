package prac04;

import java.util.Arrays;

class ArrayUtil {
	public static int [] concat(int[] a, int[] b) {
		int number = a.length+b.length;
		int [] c = new int[number];
		for(int i = 0; i<a.length; i++) {
			c[i] = a[i];
		}
		for(int i = 0; i<b.length; i++) {
			c[i+a.length] = b[i];
		}
		return c;
		
	}
	public static void print(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}

public class ArrayUtilMain {

	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);

	}

}

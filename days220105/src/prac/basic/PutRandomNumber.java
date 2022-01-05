package prac.basic;

public class PutRandomNumber {
	public static boolean exists(int n[], int index) {
		for (int i = 0; i < n.length; i++) {
			if (n[i] == index)
				return true;
		}
		return false;
	}

	public int[] Ran() {
		int n[] = new int[4];
		int index = 0;
		for (int i = 0; i < n.length; i++) {
			do {
				index = (int) (Math.random() * 4) + 1;
			} while (exists(n, index));
			n[i] = index;
		}

		return n;
	}
}

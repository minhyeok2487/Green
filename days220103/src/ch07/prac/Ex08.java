package ch07.prac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex08 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("** 포인트 관리 프로그램입니다 **");
		HashMap<String, Integer> PointProgram = new HashMap<String, Integer>();
		while (true) {
			System.out.print("이름과 포인트 입력>> ");
			String name = scan.next();
			int point = scan.nextInt();
			if (name.equals("그만")) {
				break;
			}
			Set<String> keySet = PointProgram.keySet();
			int count = 0;
			for (String key : keySet) {
				if (name.equals(key)) {
					point = point + PointProgram.get(key);
					PointProgram.put(name, point);
					count++;
					break;
				} 
			}
			
			if(count == 0) {
				PointProgram.put(name, point);
			}
		
			Iterator<String> it = keySet.iterator();
			while (it.hasNext()) {
				String N = it.next();
				int P = PointProgram.get(N);
				System.out.print("(" + N + "," + P + ")");
			}
			System.out.println();
		}

	}

}

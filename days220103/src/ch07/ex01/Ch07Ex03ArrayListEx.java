package ch07.ex01;

import java.util.ArrayList;
import java.util.Scanner;

class AL {
	public void run() {
		System.out.println("문자열만 삽입가능한 ArrayList 컬렉션 생성");
		ArrayList<String> a = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		for(int i =0; i<4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			a.add(scan.next());
		}
		System.out.println("저장완료!");
		
		int longIndex = 0;
		for(int i=0; i<a.size();i++) {
			String name = a.get(i);
			System.out.println("name : "+ name);
			if(name.length()>a.get(longIndex).length()) {
				longIndex=i;
			}
		}
		System.out.println();
		System.out.println("제일 긴 이름 => "+a.get(longIndex));
	}
	
}

public class Ch07Ex03ArrayListEx {
	
	public static void main(String[] args) {
		AL a = new AL();
		a.run();
	}
}

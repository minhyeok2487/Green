package ch07.ex01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Ex06 {
	
	HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
	
	public void model() {
		System.out.println("사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성");
		System.out.println("5개의 점수 저장");
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		System.out.println("HashMap의 요소 개수 : " + javaScore.size());
	}
	
	public void run() {
		System.out.println("모든 사람의 점수를 모든 (key, value)으로 출력.");
		Set<String> keys = javaScore.keySet();
		
		// key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> it = keys.iterator(); 

		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : " + score);
		}

	}
}

public class Ch07Ex06HashMapScoreEx {

	public static void main(String[] args) {
		Ex06 ex = new Ex06();
		ex.model();
		ex.run();	
	}

}

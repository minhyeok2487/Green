package ch07.prac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex07 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("미래장학금관리시스템입니다.");
		HashMap<String, Double> javaScore = new HashMap<String, Double>();

		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점>> ");
			String name = scan.next();
			Double score = scan.nextDouble();
			javaScore.put(name, score);
		}
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		Double num = scan.nextDouble();
		System.out.print("장학생 명단 : ");
		Set<String> keys = javaScore.keySet();
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String name = it.next();
			Double score = javaScore.get(name);
			if(score>num) {
				System.out.print(name+" ");
			}
		}
	}

}

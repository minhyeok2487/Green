package ch07.prac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Student {
	String name;
	String subject;
	int number;
	double avr;

	public Student(String name, String subject, int number, double avr) {
		this.name = name;
		this.subject = subject;
		this.number = number;
		this.avr = avr;
	}

}

class AL {
	public static Scanner scan = new Scanner(System.in);
	public static void run() {
		ArrayList<Student> score = new ArrayList<>();
		for(int i = 0; i<4; i++) {
			System.out.print(">> ");
			String full = scan.nextLine();
			String[] fullArray = full.split(", ");
			String name = fullArray[0];
			String subject = fullArray[1];
			int number = Integer.parseInt(fullArray[2]);
			double avr = Double.parseDouble(fullArray[3]);
			score.add(new Student(name, subject, number, avr));
		}
		System.out.println("----------------------------");
		for(int i = 0; i<score.size();i++) {
			System.out.println("이름 : "+score.get(i).name);
			System.out.println("학과 : "+score.get(i).subject);
			System.out.println("학번 : "+score.get(i).number);
			System.out.println("학점 평균 : "+score.get(i).avr);
			System.out.println("----------------------------");
		}
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scan.next();
			if(name.equals("그만")) {
				break;
			}
			for(int i = 0; i<score.size();i++) {
				if(name.equals(score.get(i).name)) {
					System.out.println(score.get(i).name+", "+
									score.get(i).subject+", "+
									score.get(i).number+", "+
									score.get(i).avr);
				}
			}
			
		}
	}
}

class HM {
	public static Scanner scan = new Scanner(System.in);
	public static void run() {
		HashMap<String, Student> score = new HashMap<String, Student>();
		for(int i = 0; i<4; i++) {
			System.out.print(">> ");
			String full = scan.nextLine();
			String[] fullArray = full.split(", ");
			String name = fullArray[0];
			String subject = fullArray[1];
			int number = Integer.parseInt(fullArray[2]);
			double avr = Double.parseDouble(fullArray[3]);
			score.put(name,new Student(name, subject, number, avr));
		}
		System.out.println("----------------------------");
		
		Set<String> keySet = score.keySet();
		for (String key : keySet) {
			System.out.println("이름 : "+score.get(key).name);
			System.out.println("학과 : "+score.get(key).subject);
			System.out.println("학번 : "+score.get(key).number);
			System.out.println("학점 평균 : "+score.get(key).avr);
			System.out.println("----------------------------");
		}

		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scan.next();
			if(name.equals("그만")) {
				break;
			}
			for(String key : keySet) {
				if(name.equals(score.get(key).name)) {
					System.out.println(score.get(key).name+", "+
									score.get(key).subject+", "+
									score.get(key).number+", "+
									score.get(key).avr);
				}
			}
			
		}
	}
}

public class Ex05 {
	public static void main(String[] args) {
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		HM hm = new HM();
		hm.run();
	}

}

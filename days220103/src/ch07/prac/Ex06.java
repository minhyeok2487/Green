package ch07.prac;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Location {
	String name;
	int latitude;
	int longitude;

	public Location(String name, int latitude, int longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}
}

public class Ex06 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("도시, 경도, 위도를 입력하세요");
		HashMap<String, Location> city = new HashMap<String, Location>();
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String full = scan.nextLine();
			String[] fullArray = full.split(", ");
			String name = fullArray[0];
			int latitude = Integer.parseInt(fullArray[1]);
			int longitude = Integer.parseInt(fullArray[2]);
			city.put(name, new Location(name, latitude, longitude));
		}
		System.out.println("----------------------------");

		Set<String> keySet = city.keySet();
		for (String key : keySet) {
			System.out.print(city.get(key).name + " ");
			System.out.print(city.get(key).latitude + " ");
			System.out.println(city.get(key).longitude);
		}
		System.out.println("----------------------------");
		
		while (true) {
			System.out.print("도시 이름 >> ");
			String name = scan.next();
			if (name.equals("그만")) {
				break;
			}
			int count = 0;
			for (String key : keySet) {
				if (name.equals(city.get(key).name)) {
					System.out.println(
							city.get(key).name + " " + city.get(key).latitude + " " + city.get(key).longitude);
					count++;
				}
			}
			if(count==0) {
				System.out.println(name+"는 없습니다.");
			}

		}
	}

}

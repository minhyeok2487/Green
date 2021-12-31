package prac04;

import java.util.Scanner;

class phone {
	String name, tel;

	public phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
}

class PhoneBook{
	int num;

	Scanner scanner = new Scanner(System.in);

	
	public PhoneBook(int num) {
		this.num = num;
	}

	public void run() {
		System.out.print("인원수 >> ");
		int number = scanner.nextInt();
		phone P [] = new phone[number];
		for(int i=0; i<number; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			P[i] = new phone(name, tel);
		}
		System.out.println("저장되었습니다..");
		while(true) {
			System.out.print("검색할 이름>>");
			String Ename = scanner.next();
			if(Ename.equals("그만")) {
				break;
			}
			for(int i=0; i<number; i++) {
				if(P[i].name.equals(Ename)) {
					System.out.printf("%s의 번호는 %s 입니다\n",P[i].name, P[i].tel);
					break;
				}
			}
			System.out.printf("%s 이 없습니다.\n", Ename);
		}
	}
}


public class PhoneBookMain {

	public static void main(String[] args) {
		PhoneBook M = new PhoneBook(3);
		M.run();

	}

}

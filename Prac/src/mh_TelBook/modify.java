package mh_TelBook;

import java.util.Scanner;

public class modify {
	public static Scanner scan = new Scanner(System.in);
	public static void Modify() {
		System.out.println("::::::::::::::: 수정 :::::::::::::::");
		// 이름으로 검색 후 수정 
		int count = 0;
		System.out.print("검색할 이름을 입력하여주십시오 >> ");
		String name = scan.next();
		int i = 0;
		for(i=0; i<save.top; i++) {
			if(name.equals(save.sArr[i].name)) {
				save.Basic();
				System.out.println(save.sArr[i]);
				count++;
				break;
			} 
		}
		if(count == 0) {
			System.out.println("그 이름의 데이터는 존재하지 않습니다.");
		} else {
			System.out.println("수정할 데이터를 입력해주십시오.");
			String number = " ";
			while (true) {
				System.out.print("전화번호 >> ");
				number = scan.next();
				if (number.length() > 13) {
					System.out.println("글자수 초과! 13글자 이하로 입력하여 주십시오.");
				} else if (name.length() <= 13) {
					break;
				}
			}

			// 그룹 유효성 검사 - 기본 그룹 혹은 그룹 따로 지정
			String group = " ";
			while (true) {
				//System.out.printf("입력하지 않을시 %s 그룹으로 설정됩니다.\n","기본");
				System.out.print("그룹 >> ");
				group = scan.next();
				if (group.length()<1) {
					group = "기본";
					System.out.println("기본 그룹으로 설정되었습니다");
					break;
				} else {
					System.out.printf("%s 그룹으로 설정되었습니다\n",group);
					break;
				}
			}

			save.sArr[i] = new Number(save.sArr[i].no, name, number, group);
		}
	}
}

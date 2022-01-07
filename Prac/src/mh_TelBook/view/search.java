package mh_TelBook.view;

import java.util.Scanner;

import mh_TelBook.model.save;

public class search {
	public static Scanner scan = new Scanner(System.in);
	public static void Search() {
		System.out.println("::::::::::::::: 검색 :::::::::::::::");
		// 이름으로 검색
		int count = 0;
		System.out.print("검색할 이름을 입력하여주십시오 >> ");
		String name = scan.next();
		save.Basic();
		for(int i=0; i<save.top; i++) {
			if(name.equals(save.sArr[i].name)) {
				System.out.println(save.sArr[i]);
				count++;
			} 
		}
		if(count == 0) {
			System.out.println("이 이름의 데이터는 존재하지 않습니다.");
		}
		Controlfile.AutoSave();
	}
}

package mh_TelBook.view;

import java.util.Scanner;

import mh_TelBook.model.save;
import mh_TelBook.model.Number;
public class delete {
	public static Scanner scan = new Scanner(System.in);
	public static void Delete() {
		System.out.println("::::::::::::::: 삭제 :::::::::::::::");
		//이름으로 검색 후 삭제
		int count = 0;
		System.out.print("검색할 이름을 입력하여주십시오 >> ");
		String name = scan.next();
		int i = 0;
		for(i = 0; i<save.top; i++) {
			if(name.equals(save.sArr[i].name)) {
				save.Basic();
				System.out.println(save.sArr[i]);
				count++;
				System.out.print("위 데이터를 삭제하시려면 1, 그렇지 않다면 2 입력 >> ");
				int check = scan.nextInt();
				if(check == 1) {
					save.sArr[i] = new Number();
					System.out.println("데이터를 삭제하였습니다.");
				} else if (check == 2){
					System.out.println("데이터 삭제를 취소합니다");
				}
			} 
		}
		if(count == 0) {
			System.out.println("그 이름의 데이터는 존재하지 않습니다.");
		}
	}
}

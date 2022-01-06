package mh_TelBook.view;

import java.util.Scanner;

import mh_TelBook.model.save;

public class delete {
	public static Scanner scan = new Scanner(System.in);
	public static void Delete() {
		System.out.println("::::::::::::::: 삭제 :::::::::::::::");
		//이름으로 검색 후 삭제
		System.out.print("검색할 이름을 입력하여주십시오 >> ");
		String name = scan.next();
		int i = 0;
		for(;i<save.top;i++) {
			if(name.equals(save.sArr[i].name)) {
				System.out.println(save.sArr[i].toString());
				break;
			}
		}
		int num = i;
		if(i==save.top) {
			System.out.println("검색 결과가 없습니다.");
		}
		while(true) {
			System.out.print("위 데이터를 삭제하시려면 1, 그렇지 않다면 2 입력 >> ");
			int check = scan.nextInt();
			if(check==2) {
				System.out.println("데이터 삭제를 취소합니다");
				break;
			}
			else if(check==1) {
				for(;i<save.top;i++) {
					save.sArr[i]=save.sArr[i+1];
				}
				System.out.println("데이터를 삭제하였습니다.");
				save.top--;
				for(int j = num; j<save.top;j++) {
					save.sArr[j].no=j+1;
				}
				save.sequence = save.top+1;
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}
}

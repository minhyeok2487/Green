package mh_TelBook.view;

import mh_TelBook.model.save;
import mh_TelBook.model.Number;

public class cut {
	public static void Cut() {
		System.out.println("::::::::::::::: 중복 제거 :::::::::::::::");
		System.out.println(":::: 전화번호 중복값 입니다. ::::");
		for(int i = 0; i<save.top-1; i++) {
			for(int j = i+1; j<save.top; j++) {
				if(save.sArr[i].name.equals(save.sArr[j].name)) {
					save.Basic();
					System.out.println(save.sArr[i]);
					save.sArr[i] = new Number();
					break;
				}
			}
		}
		System.out.println("중복값 제거를 완료하였습니다.");

	}
}

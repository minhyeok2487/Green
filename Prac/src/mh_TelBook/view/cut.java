package mh_TelBook.view;

import mh_TelBook.model.save;

public class cut {
	public static void Cut() {
		int count = check();//중복값이 있는지 먼저 체크
		if (count == 0) {
			System.out.println("중복값이 없습니다.");
		} else if(count == 1) {
			System.out.println("::::::::::::::: 중복 제거 :::::::::::::::");
			int i = 0;
			for (; i < save.top - 1; i++) {
				for (int j = i + 1; j < save.top; j++) {
					if (save.sArr[i].number.equals(save.sArr[j].number)) {
						System.out.println(":::: 전화번호 중복값 입니다. ::::");
						save.Basic();
						System.out.println(save.sArr[i]);
						int num = i;
						for (; i < save.top; i++) {
							save.sArr[i] = save.sArr[i + 1];
						}
						save.top--;
						for (int k = num; k < save.top; k++) {
							save.sArr[k].no = k + 1;
						}
						save.sequence = save.top + 1;
						i = 0;
						count++;
						break;
					}
				}
			}
			if (i == save.top - 1) {
				System.out.println("중복값 제거를 완료하였습니다.");
			}
		}
	}

	private static int check() {
		int i = 0;
		for (; i < save.top - 1; i++) {
			for (int j = i + 1; j < save.top; j++) {
				if (save.sArr[i].number.equals(save.sArr[j].number)) {
					return 1;
				}
			}
		}
		if (i == save.top - 1) {
			return 0;
		}
		return 1; 	
	}
}

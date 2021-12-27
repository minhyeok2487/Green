package mh_TelBook.view;

import java.util.Scanner;

import mh_TelBook.model.save;
import mh_TelBook.model.Number;

public class input {
	public static Scanner scan = new Scanner(System.in);

	public static void Input() {
		System.out.println("::::::::::::::: 입력 :::::::::::::::");
		// 이름, 전화번호, 그룹을 입력받는다.

		// 이름 유효성 검사 - 4글자 이하입력받기(틀 맞추기위함)
		String name = " ";
		while (true) {
			System.out.print("이름 >> ");
			name = scan.next();
			if (name.length() > 4) {
				System.out.println("글자수 초과! 4글자 이하로 입력하여 주십시오.");
			} else if (name.length() <= 4) {
				break;
			}
		}

		// 전화번호 유효성 검사 - 13글자 이하입력받기("-" 포함, 전화번호는 13글자)
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

		save.sArr[save.top++] = new Number(save.sequence++, name, number, group);
	}
}

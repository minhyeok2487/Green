package mh_TelBook.controller;

import mh_TelBook.view.Controlfile;
import mh_TelBook.view.cut;
import mh_TelBook.view.delete;
import mh_TelBook.view.end;
import mh_TelBook.view.input;
import mh_TelBook.view.modify;
import mh_TelBook.view.search;
import mh_TelBook.view.output;

public class telbookMain {
	
	public static void run() {
		switch(menu.Num()) { // 메뉴를 숫자로 입력받기
		case 1 : input.Input(); break; // 새로운 전화번호 객체 생성
		case 2 : output.Output(); break; // 전화번호 출력(전체 or 그룹별)
		case 3 : search.Search(); break; // 검색(이름으로 검색)
		case 4 : modify.Modify(); break; // 수정(이름으로 검색 후 번호와 그룹수정)
		case 5 : delete.Delete(); break; // 삭제(이름으로 검색 후 삭제)
		case 6 : cut.Cut(); break; // 중복제거(동일한 번호를 가진 사람 중 먼저 등록된 사람 제거)
		case 7 : Controlfile.SaveAll(); break; // txt 파일로 전화번호 저장
		case 8 : Controlfile.LoadAll(); break; // txt 파일로 전화번호 불러오기
		case 9 : end.End(); break;
		default : System.out.println("--- 해당 사항 없습니다. ---");
		}
		System.out.println("---------------------------------");
	}
	
	public static void main(String[] args) {
		System.out.println("-------전화번호부 입니다-------");
		while(true) {
			run();
		}
	}

}

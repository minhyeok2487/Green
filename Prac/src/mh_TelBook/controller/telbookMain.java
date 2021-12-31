package mh_TelBook.controller;

import mh_TelBook.view.cut;
import mh_TelBook.view.delete;
import mh_TelBook.view.end;
import mh_TelBook.view.input;
import mh_TelBook.view.modify;
import mh_TelBook.view.search;
import mh_TelBook.view.output;

public class telbookMain {
	
	public static void run() {
		//menu Menu = new menu();
		switch(menu.Num()) {
		case 1 : input.Input(); break;
		case 2 : output.Output(); break;
		case 3 : search.Search(); break;
		case 4 : modify.Modify(); break;
		case 5 : delete.Delete(); break;
		case 6 : cut.Cut(); break;
		case 7 : end.End(); break;
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

package org.comstudy21.notice.view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.comstudy21.notice.controller.R;
import org.comstudy21.notice.model.NoticeVo;

public class InsertView extends NoticeView{
	@Override
	public void display() {
		System.out.println("::::: 입력 기능 :::::");
		System.out.print("성명 입력>> ");
		String user = scan.next();
		scan.nextLine();
		System.out.print("메모 입력>> ");
		String message = scan.nextLine();
		
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String regDate = myDateObj.format(myFormatObj);
	    System.out.println("오늘 날짜는 " + regDate + " 입니다");
		R.noticeVo = new NoticeVo(0, user, message, regDate);
		System.out.println("입력 완료!");
	}
}

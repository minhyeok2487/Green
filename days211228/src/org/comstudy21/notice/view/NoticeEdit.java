package org.comstudy21.notice.view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.comstudy21.notice.controller.R;

public class NoticeEdit extends NoticeView{
	@Override
	public void display() {
		System.out.println("::::::::: 사람 정보 수정 :::::::::");
		if(R.noticeVo == null) {
			System.out.println("검색 결과 없습니다");
			return;
		}
		System.out.println(R.noticeVo);
		
		System.out.print("작성자를 수정 하시겠습니까?(y/n)");
		char yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 작성자 이름>> ");
			R.noticeVo.setUser(scan.next());
		}
		System.out.print("메세지를 수정 하시겠습니까?(y/n)");
		yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.print("새 메세지>> ");
			scan.nextLine();
			R.noticeVo.setMessage(scan.nextLine());
		}

		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String regDate = myDateObj.format(myFormatObj);
	    System.out.printf("입력날짜가 %s로 교체됩니다.\n", regDate);
	    R.noticeVo.setRegDate(regDate);
		
			
	}
}

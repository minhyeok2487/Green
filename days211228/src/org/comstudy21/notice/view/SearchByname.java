package org.comstudy21.notice.view;

import org.comstudy21.notice.controller.R;
import org.comstudy21.notice.model.NoticeVo;

public class SearchByname extends NoticeView{
	@Override
	public void display() {
		System.out.println("::::::::: 작성자 정보 검색 :::::::::");
		System.out.print("검색 할 작성자 이름 >>> ");
		String user = scan.next();
		R.noticeVo = new NoticeVo(0, user, null, null);
	}
}

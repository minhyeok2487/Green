package org.comstudy21.notice.view;

import org.comstudy21.notice.controller.R;

public class NoticeDetail extends NoticeView{
	@Override
	public void display() {
		System.out.println("::::::::: 작성자 정보 상세보기 :::::::::");
		System.out.println(R.noticeVo);
	}
}

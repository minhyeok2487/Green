package org.comstudy21.notice.view;

import org.comstudy21.notice.controller.R;
import org.comstudy21.notice.model.NoticeVo;

public class NoticeListView extends NoticeView{
	@Override
	public void display() {
		System.out.println("::::: 사람 목록 :::::");
		// R.saramArr 출력
		for(NoticeVo notice : R.noticeArr) {
			System.out.println(notice);
		}
	}
}

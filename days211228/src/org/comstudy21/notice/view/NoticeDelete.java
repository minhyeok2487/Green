package org.comstudy21.notice.view;

import org.comstudy21.notice.controller.R;

public class NoticeDelete extends NoticeView{
	@Override
	public void display() {
		System.out.println("::::: 작성자 메모 삭제 :::::");
		if(R.noticeVo == null) {
			System.out.println("검색 결과 없습니다");
			return;
		}
		System.out.println(R.noticeVo);
		System.out.print("정말로 삭제 하시겠습니까?[y/n]");
		char yn = scan.next().charAt(0);
		if(yn == 'Y' || yn == 'y') {
			System.out.println("삭제를 완료합니다.");
			return;
		} else if(yn == 'N' || yn == 'n') {
			System.out.println("삭제를 취소합니다.");
			R.noticeVo = null;
		}
	}
	
}

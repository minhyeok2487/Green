package org.comstudy21.notice.controller;

import org.comstudy21.notice.model.NoticeDao;
import org.comstudy21.notice.view.ViewContainer;

public class NoticeController {
	private ViewContainer vc = new ViewContainer();
	private NoticeDao dao = new NoticeDao();
	
	public void action() {
		if(R.no == 0) {
			vc.run(R.menuView);
		}
		switch(R.no) {
		case 1 : 
			vc.run(R.insertView);
			dao.insert(R.noticeVo);
			break;
		case 2 :
			R.noticeArr = dao.selectAll();
			vc.run(R.noticeListView);
			break;
		case 3 : 
			vc.run(R.searchByname);
			R.noticeVo = dao.selectOne(R.noticeVo);
			vc.run(R.noticeDetail);
			break;
		case 4 : 
			vc.run(R.searchByname);
			R.noticeVo = dao.selectOne(R.noticeVo);
			vc.run(R.noticeEdit);
			if(R.noticeVo != null) {
				dao.update(R.noticeVo);
			}
			break;
		case 5 : 
			vc.run(R.searchByname);
			R.noticeVo = dao.selectOne(R.noticeVo);
			vc.run(R.noticeDelete);
			if(R.noticeVo != null) {
				dao.delete(R.noticeVo);
			}
			break;
		case 6 : System.out.println("프로그램 종료"); System.exit(0); break;
		default : System.out.println("해당 기능이 없습니다!");
		}
		
		R.no = 0;
		action();
	}
}
